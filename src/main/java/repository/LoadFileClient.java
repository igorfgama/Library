package repository;

import model.Client;

import java.io.*;
import java.util.Scanner;

import static java.lang.System.exit;
import static repository.RecordService.clients;

public class LoadFileClient implements LoadFIle {
    public void readFile() throws FileNotFoundException {
        Scanner scannerFile = new Scanner(new File("clients.csv"));
        while (scannerFile.hasNextLine()) {
            String line = scannerFile.nextLine();
            Scanner readLine = new Scanner(line);
            readLine.useDelimiter(",");

            String name = readLine.next();
            String id = readLine.next();
            String email = readLine.next();
            String phone = readLine.next();

            new Client(name, id, email, phone);

            readLine.close();
        }
    }

    public void writeFile() throws IOException {

        OutputStream fos = new FileOutputStream("clients.csv");
        Writer osw = new OutputStreamWriter(fos);
        BufferedWriter bw = new BufferedWriter(osw);

        for(Client client : clients){
            bw.write(client.getName() + "," + client.getId() + "," + client.getEmail() + "," + client.getPhone());
            bw.newLine();
        }

        bw.close();
        exit(0);
    }
}

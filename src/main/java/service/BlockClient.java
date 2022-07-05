package service;

import model.Client;
import model.Loan;

import java.util.List;

public class BlockClient {
    private static List<Client> clientsBlocked;

    public static void blockUser(Client client){
        clientsBlocked.add(client);
    }

    public static boolean isBlocked(Client client){
        return clientsBlocked.contains(client);
    }

    public static void removeBlock(Client client){
        clientsBlocked.remove(client);
    }
}

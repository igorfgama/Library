package service;

import static repository.RecordService.clients;

public class ShowAllService {
    public void listAllClients(){
        System.out.print("[");
        clients.stream()
                .forEach(c -> System.out.print(c.getName() + ","));
        System.out.print("]");
    }
}

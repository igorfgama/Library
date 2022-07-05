package service;

import model.Book;
import model.Client;
import model.Fine;
import model.Loan;

import java.time.LocalDate;

import static repository.RecordService.fines;
import static repository.RecordService.loans;

public class LoanService {

    public static void doLoan(Client client, Book book) {
        loans.add(new Loan(client, book));
        System.out.println("Empréstimo do livro '"
                + book.getTitle() + "' a "
                + client.getName() + " realizada com sucesso em " +
                LocalDate.now() + ".");
    }

    public static void removeLoan(Loan loan){
        loans.remove(loan);
    }

    public static boolean verifyBlock(Loan loan){
        if(fines.contains(loan.getClient())){
            Fine fine = fines.stream()
                    .filter(f -> f.getClient().equals(loan.getClient()))
                    .findFirst().get();
            if(fine.getFinesApplieds() > 2){
                BlockClient.blockUser(loan.getClient());
                System.out.println("Mais de 2 atrasos: usuário bloqueado.");
                return true;
            } else {
                System.out.println("Cliente " + loan.getClient().getName() + " em dia.");
                return false;
            }
        } else {
            return false;
        }
    }
}
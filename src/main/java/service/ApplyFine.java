package service;

import model.Fine;
import model.Loan;

import java.math.BigDecimal;
import java.time.LocalDate;

public interface ApplyFine {
    default void applyFineToClient(Loan loan){
        if(loan.getLoanBegin().compareTo(LocalDate.now()) > 20){
            if((loan.getLoanBegin().compareTo(LocalDate.now()) * 0.05) >
                    (Long.parseLong(String.valueOf(loan.getBook().getTypeBook())) * 0.2)){
                new Fine(loan.getClient(),
                        loan.getBook()
                        .getTypeBook()
                        .multiply(new BigDecimal("0.2")));
            } else {
                new Fine(loan.getClient(),
                        loan.getBook()
                        .getTypeBook()
                        .multiply(
                                new BigDecimal(String.valueOf(loan.getLoanBegin().compareTo(LocalDate.now())))
                        ));
            }
        } else {
            System.out.println("Não há multa a se aplicar.");
        }
    }
}
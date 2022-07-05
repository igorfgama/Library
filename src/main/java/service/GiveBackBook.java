package service;

import model.Loan;

import static repository.RecordService.loans;

public class GiveBackBook implements ApplyFine {
    public void giveBackBookToLibrary(Loan loan){
        if(loans.contains(loan)){
            if(!LoanService.verifyBlock(loan))
                applyFineToClient(loan);
        }
    }
}
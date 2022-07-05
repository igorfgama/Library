package service;

import model.Book;
import model.Client;

import validation.Validation;

public class BorrowBook implements Validation {
    public void borrowBookToClient(Client client, Book book){
        nullableValidateEntry(client);
        nullableValidateEntry(book);
        LoanService.doLoan(client, book);
    }
}
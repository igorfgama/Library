package model;

import service.BorrowBook;

import java.time.LocalDate;

public class Loan {
    private final Client client;
    private final Book book;
    private final LocalDate loanBegin;

    public Loan(Client client, Book book){
        this.client = client;
        this.book = book;
        this.loanBegin = LocalDate.now();
    }

    public Client getClient() {
        return client;
    }

    public LocalDate getLoanBegin() {
        return loanBegin;
    }

    public Book getBook() {
        return book;
    }
}

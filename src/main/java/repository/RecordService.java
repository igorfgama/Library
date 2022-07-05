package repository;

import model.Book;
import model.Client;
import model.Fine;
import model.Loan;

import java.util.ArrayList;
import java.util.List;

public class RecordService {
    public static List<Client> clients = new ArrayList<>();
    static List<Book> books = new ArrayList<>();
    public static List<Loan> loans = new ArrayList<>();
    public static List<Fine> fines = new ArrayList<>();
}

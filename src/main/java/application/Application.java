/**
 * Enunciado
 *
 * Criar um programa para administrar o empréstimo de livros de uma biblioteca.
 *
 *     Possíveis entidades: Cliente, Livro, Emprestimo.
 *     Funcionalidades previstas: realizarEmprestimo e devolverLivros
 *     Cada tipo de livro possui um valor diário de empréstimo.
 *     O cliente so pode ter no máximo 2 livros em empréstimo ao mesmo tempo.
 *     No momento do empréstimo todos os dados do cliente devem estar preenchidos: nome, email, telefone.
 *     O prazo máximo para devolução é de 20 dias.
 *     No momento da entrega prever multa em caso de atraso: 0,5% por dia e no máximo 20% do valor total.
 *     Se o cliente atrasar 3 vezes a entrega prever um bloqueio por 1 mes sem poder realizar um novo emprestimo.
 *
 * Obrigatório utilizar:
 *
 *     Polimorfismo (Classes abstratas e/ou interfaces)
 *     SOLID (S-Responsabilidade unica e O-Aberto/Fechado)
 *
 * ** Criar uma classe com o metodo main para testar o programa, nao é preciso criar um menu de navegaçao para input.
 *
 * ** Entrega em arquivo .zip ou link do github.
 * Data de entrega: 04/07/2022
 */

package application;

import enums.TypeBook;
import model.Book;
import model.Client;
import service.BorrowBook;
import service.GiveBackBook;

import static repository.RecordService.loans;

public class Application {

    public static void main(String[] args) {
        Client client = new Client("Jao", "123456", "jao@email.com", "61988663344");
        Book book = new Book("Veias Abertas", "Galeano", 1971, TypeBook.DRAMA);
        Book book1 = new Book("1984", "Orwell", 1949, TypeBook.DRAMA);
        Book book2 = new Book("... E O Vento Levou", "Mitchel", 1936, TypeBook.ROMANCE);

        BorrowBook borrowBook = new BorrowBook();
        borrowBook.borrowBookToClient(client, book);

        GiveBackBook giveBackBook = new GiveBackBook();
        giveBackBook.giveBackBookToLibrary(loans.stream()
                .filter(c -> c.getClient().equals(client))
                .findFirst()
                .get());
    }
}

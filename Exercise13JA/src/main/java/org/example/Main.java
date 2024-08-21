package org.example;

public class Main {
    public static void main(String[] args) {
        BookRepository repository = new BookRepository();

        Book book1 = new Book(1, "1984", "George Orwell", 1949);
        Book book2 = new Book(2, "To Kill a Mockingbird", "Harper Lee", 1960);

        repository.addBook(book1);
        repository.addBook(book2);

        try {
            Book foundBook = repository.searchByName("1984");
            System.out.println("Found Book: " + foundBook.getTitle());
        } catch (NoBookFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            repository.removeById(1);
            System.out.println("Book with ID 1 removed.");
        } catch (NoBookFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
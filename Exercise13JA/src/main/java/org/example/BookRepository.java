package org.example;
import java.util.ArrayList;
import java.util.List;

class BookRepository {
    private List<Book> books;

    public BookRepository() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public Book searchByName(String name) throws NoBookFoundException {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(name)) {
                return book;
            }
        }
        throw new NoBookFoundException("No book found with the title: " + name);
    }

    public Book searchById(int id) throws NoBookFoundException {
        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }
        throw new NoBookFoundException("No book found with the ID: " + id);
    }

    public void removeById(int id) throws NoBookFoundException {
        Book bookToRemove = null;
        for (Book book : books) {
            if (book.getId() == id) {
                bookToRemove = book;
                break;
            }
        }
        if (bookToRemove != null) {
            books.remove(bookToRemove);
        } else {
            throw new NoBookFoundException("No book found with the ID: " + id);
        }
    }
}
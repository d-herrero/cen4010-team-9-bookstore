package bookstore.service;

import bookstore.model.Author;
import bookstore.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {
    public Book createBook(Book book);
    public String updateBook(Book book);
    public String deleteBook(String bookId);
    public Optional<Book> getBook(Long bookId);
    public List<Book> getAllCBooks();
    public List<Book> findByISBN(String isbn);
    public List<Book> findByAuthor(String author);

}

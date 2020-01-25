package pl.gomulka.pp5.produccatalog;

import java.util.List;

public class ProductCatalogFacade {
    private BookRepository repository;

    public ProductCatalogFacade(BookRepository repostory) {
        this.repository = repository;
    }

    public void addBook(Book book) {
        repository.save(book);
    }

    public List<Book> allBooks() {
        return repository.findAll();
    }
}

package pl.gomulka.pp5.produccatalog;

import static org.assertj.core.api.Assertions.assertThat;
import org.junit.Test;
import java.math.BigDecimal;
import java.util.List;

public class ProductCatalogFacadeTest {


    @Test
    public void itAllowAddBookToCatalog() {
        ProductCatalogFacade api = new ProductCatalogFacade();
        Book book = thereIsBookIWouldLIkeToHave();
        api.addBook(book);

        List<Book> books = api.allBooks();
        assertThat(books).hasSize(1);
    }

    private void allBooks() {
    }

    private Book thereIsBookIWouldLIkeToHave() {
        return Book.builder()
                .cover("https://picsum.photos/200/300")
                .title("Pragmatic programmer")
                .description("Journey from beginner to master")
                .price(BigDecimal.valueOf(120.00))
                .published(true)
                .build();
    }

}

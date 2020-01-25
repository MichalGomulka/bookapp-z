package pl.gomulka.pp5.ebook.produccatalog;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
public class CatalogConfiguration {

    @Bean
    ProductCatalogFacade facade(BookRepository repository) {
        ProductCatalogFacade productCatalogFacade = new ProductCatalogFacade(repository);
        
        productCatalogFacade.addBook(
                thereIsPublishedBook("Hobbit"));
        productCatalogFacade.addBook(
                thereIsPublishedBook("Lord of the ring"));

        return productCatalogFacade;

    }

    private Book thereIsPublishedBook(String title) {
        return Book.builder()
                .title(title)
                .description(title)
                .cover("http//:cover.dev")
                .price(BigDecimal.valueOf(20.20))
                .published(true)
                .build();
    }

}

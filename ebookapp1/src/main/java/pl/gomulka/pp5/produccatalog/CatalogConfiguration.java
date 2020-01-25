package pl.gomulka.pp5.produccatalog;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CatalogConfiguration {

    @Bean
    ProductCatalogFacade facade(BookRepository repository) {
        return new ProductCatalogFacade(repository);
    }

}

package pl.gomulka.pp5.produccatalog;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.dc.pr.PRError;

@RestController
@RequestMapping("/api")
public class CatalogController {
    @Autowired
    ProductCatalogFacade productCatalogFacade;


    @GetMapping("/products")
    Lisst<Books> listAllBooks() {
        return productCatalogFacade.allBooks();
    }
}

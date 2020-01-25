package pl.gomulka.pp5.ebook.produccatalog;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@AllArgsConstructor
@Getter
@Builder
@Entity
@NoArgsConstructor

public class Book {

    @Id
    @GeneratedValue
    Long id;

    String title;
    String description;
    String cover;
    Boolean published;
    BigDecimal price;
}

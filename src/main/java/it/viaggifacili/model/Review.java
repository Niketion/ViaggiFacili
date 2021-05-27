package it.viaggifacili.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long idUser;
    private String piva;
    private int stars;
    private String title;
    private String description;

    public Review() { }

    public Review(Long idUser, String piva, int stars, String title, String description) {
        this.idUser = idUser;
        this.piva = piva;
        this.stars = stars;
        this.title = title;
        this.description = description;
    }
}

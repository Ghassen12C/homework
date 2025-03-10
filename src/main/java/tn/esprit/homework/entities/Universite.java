package tn.esprit.homework.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversite;
    private String nomUniversite;
    private String adresse;

    @OneToOne(mappedBy = "universite")
    private Foyer foyer;

    public Long getIdUniversite() {
        return idUniversite;
    }
    // Manually added getter and setter for foyer
    public Foyer getFoyer() {
        return foyer;
    }

    public void setFoyer(Foyer foyer) {
        this.foyer = foyer;
    }
}

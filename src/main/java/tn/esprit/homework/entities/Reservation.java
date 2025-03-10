package tn.esprit.homework.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;
    private Date anneeUniversitaire;
    private boolean estValide;
    @ManyToOne
    private Chambre chambre;

    @ManyToMany
    private Set<Etudiant> etudiants;

    public Long getIdReservation() {
        return idReservation;
    }
}

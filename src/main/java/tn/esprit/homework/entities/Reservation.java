package tn.esprit.homework.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Reservation {
    @Id
    private String idReservation;

    private Date anneeUniversitaire;
    private Boolean estValide;

    private Long etudiantId; // Instead of @ManyToOne association
    private Long chambreId;
}

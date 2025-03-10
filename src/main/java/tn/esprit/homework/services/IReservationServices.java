package tn.esprit.homework.services;

import tn.esprit.homework.entities.Reservation;

import java.util.Date;
import java.util.List;

public interface IReservationServices {
    List<Reservation> retrieveAllReservation();
    Reservation updateReservation (Reservation res);
    Reservation retrieveReservation (Long idReservation);

    List<Reservation> getReservationParAnneeUniversitaireEtNomUniversite(Date anneeUniversite, String nomUniversite);
}
package tn.esprit.homework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.homework.entities.Reservation;

@Repository
public interface IReservationRepository extends JpaRepository<Reservation, Long> {
}

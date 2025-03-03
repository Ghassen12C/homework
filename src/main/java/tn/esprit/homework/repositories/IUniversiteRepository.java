package tn.esprit.homework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.homework.entities.Universite;

@Repository
public interface IUniversiteRepository extends JpaRepository<Universite, Long> {
}

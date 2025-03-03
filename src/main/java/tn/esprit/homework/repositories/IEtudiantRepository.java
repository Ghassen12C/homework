package tn.esprit.homework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.homework.entities.Etudiant;

@Repository
public interface IEtudiantRepository extends JpaRepository<Etudiant, Long> {
}

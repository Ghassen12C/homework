package tn.esprit.homework.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.homework.entities.Foyer;

@Repository
public interface IFoyerRepository extends JpaRepository<Foyer, Long> {

    public Foyer findByNomFoyerAndCapaciteFoyer(String nomFoyer, Long capaciteFoyer);

}

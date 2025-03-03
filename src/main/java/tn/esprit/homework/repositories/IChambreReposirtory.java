package tn.esprit.homework.repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.homework.entities.Chambre;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.homework.entities.Chambre;

@Repository
public interface IChambreReposirtory extends CrudRepository<Chambre, Long> {
}

package tn.esprit.homework.services;

import tn.esprit.homework.entities.Chambre;
import tn.esprit.homework.entities.TypeChambre;

import java.util.List;

public interface IChambreServices {
    List<Chambre> retrieveAllChambres();
    Chambre addChambre(Chambre c);
    Chambre updateChambre (Chambre c);
    Chambre retrieveChambre (long idChambre);
    List<Chambre> getChambresNonReserveParNomUniversiteEtTypeChambre(String nomUniversite, TypeChambre type);
    List<Chambre> getChambresParBlocEtType(Long idBloc, TypeChambre typeC);

}

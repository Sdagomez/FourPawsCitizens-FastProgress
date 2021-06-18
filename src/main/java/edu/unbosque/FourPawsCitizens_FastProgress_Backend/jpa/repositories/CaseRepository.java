package edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.repositories;

import edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.entities.PetCase;


import java.util.Date;
import java.util.List;

public interface CaseRepository {


    /**
     *
     * @param pPetCase
     * @return
     */
    String save(PetCase pPetCase);

    /**
     *
     * @return
     */
    List<PetCase> findAll();

}

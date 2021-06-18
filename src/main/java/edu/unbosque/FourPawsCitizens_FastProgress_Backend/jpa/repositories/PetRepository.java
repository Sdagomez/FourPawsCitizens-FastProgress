package edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.repositories;

import edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.entities.Pet;

import java.util.List;
import java.util.Optional;

public interface PetRepository {

    /**
     *
     * @param pet
     * @return
     */
    String save(Pet pet);

    /**
     *
     * @return
     */
    List<Pet> findAll();

    /**
     *
     * @param pet
     * @return
     */

    String modify(Pet pet);

    /**
     *
     * @param pet
     * @return
     */
    String modifyForVisit(Pet pet);

    /**
     *
     * @param petId
     * @return
     */
    Optional<Pet> findById(Pet petId);
}

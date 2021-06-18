package edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.repositories;

import edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.entities.Official;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.entities.Pet;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.entities.Vet;

import java.util.List;
import java.util.Optional;

public interface OfficialRepository {

    /**
     *
     * @param username
     * @return
     */
    Optional<Official> findById(String username);

    /**
     *
     * @return
     */
    List<Official> findAll();

    /**
     *
     * @return
     */
    List<String> findAllNeighborhoods();

    /**
     *
     * @return
     */
    List<String> findAllSpecies();

    /**
     *
     * @return
     */
    List<String> findAllRaces();

    /**
     *
     * @return
     */
    List<String> findAllSizes();

    /**
     *
     * @return
     */
    List<String> findAllSexes();

    /**
     *
     * @return
     */
    Long countPetsWithMicrochip();

    /**
     *
     * @return
     */
    List<String> findAllCasesType();

    /**
     *
     * @return
     */
    List<Vet> findAllVisitsVets();

    /**
     *
     * @return
     */
    List<String> findAllVisitsType();

    /**
     *
     * @param queryParts
     * @return
     */
    List<Pet> findPetsWithFilter(String queryParts);
}

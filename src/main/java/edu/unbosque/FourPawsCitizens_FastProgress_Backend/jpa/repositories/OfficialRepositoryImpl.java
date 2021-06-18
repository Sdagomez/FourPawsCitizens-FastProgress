package edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.repositories;


import edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.entities.Official;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.entities.Pet;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.entities.Vet;

import javax.persistence.EntityManager;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class OfficialRepositoryImpl implements OfficialRepository {

    private EntityManager entityManager;

    public OfficialRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    /**
     *
     * @param username
     * @return
     */
    @Override
    public Optional<Official> findById(String username) {
        Official official = entityManager.find(Official.class, username);
        return official != null ? Optional.of(official) : Optional.empty();
    }

    /**
     *
     * @return
     */
    @Override
    public List<Official> findAll() {
        return entityManager.createQuery("from Official ").getResultList();
    }

    /**
     *
     * @return
     */
    @Override
    public List<String> findAllNeighborhoods() {
        return entityManager.createQuery("select o.neighborhood from Owner o").getResultList();
    }

    /**
     *
     * @return
     */
    @Override
    public List<String> findAllSpecies() {
        return entityManager.createQuery("select p.species from Pet p").getResultList();
    }

    /**
     *
     * @return
     */
    @Override
    public List<String> findAllRaces() {
        return entityManager.createQuery("select p.race from Pet p").getResultList();
    }

    /**
     *
     * @return
     */
    @Override
    public List<String> findAllSizes() {
        return entityManager.createQuery("select p.size from Pet p").getResultList();
    }

    /**
     *
     * @return
     */
    @Override
    public List<String> findAllSexes() {
        return entityManager.createQuery("select p.sex from Pet p").getResultList();
    }

    /**
     *
     * @return
     */
    @Override
    public Long countPetsWithMicrochip() {
        return Collections.max((List<Long>) entityManager.createQuery("select count(p) from Pet p where p.microchip is not null").getResultList());
    }

    /**
     *
     * @return
     */
    @Override
    public List<String> findAllCasesType() {
        return entityManager.createQuery("select c.type from PetCase c").getResultList();
    }

    /**
     *
     * @return
     */
    @Override
    public List<Vet> findAllVisitsVets() {
        return null;
    }


    /**
     *
     * @return
     */
    @Override
    public List<String> findAllVisitsType() {
        return entityManager.createQuery("select v.type from Visit v").getResultList();
    }

    @Override
    public List<Pet> findPetsWithFilter(String queryParts) {
        return null;
    }


}

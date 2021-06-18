package edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.repositories;

import edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.entities.Pet;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class PetRepositoryImpl implements PetRepository {

    private EntityManager entityManager;

    public PetRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    /**
     *
     * @param pet
     * @return
     */
    @Override
    public String save(Pet pet) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(pet);
            entityManager.getTransaction().commit();
            return "sSuccessfully";
        } catch (Exception e) {
            return "no exist";
        }
    }
    /**
     *
     * @param petId
     * @return
     */
    @Override
    public Optional<Pet> findById(Pet petId) {
        Pet pet = entityManager.find(Pet.class, petId);
        return pet != null ? Optional.of(pet) : Optional.empty();
    }

    /**
     *
     * @return
     */
    @Override
    public List<Pet> findAll() {
        return entityManager.createQuery("from Pet").getResultList();
    }

    /**
     *
     * @param pets
     * @return
     */
    @Override
    public String modify(Pet pets) {
        entityManager.getTransaction().begin();

        Optional<Pet> pet = this.findById(pets.getPet_id());
        if (!pet.isPresent()) return "No exist!";
        pet.get().setMicrochip(pets.getMicrochip());
        pet.get().setName(pets.getName());
        pet.get().setSpecies(pets.getSpecies());
        pet.get().setRace(pets.getRace());
        pet.get().setSize(pets.getSize());
        pet.get().setSex(pets.getSex());
        pet.get().setPicture(pets.getPicture());

        entityManager.getTransaction().commit();

        return "Successfully";
    }

    /**
     *
     * @param pets
     * @return
     */
    @Override
    public String modifyForVisit(Pet pets) {
        entityManager.getTransaction().begin();

        Optional<Pet> pet = this.findById(pets.getPet_id());
        if (!pet.isPresent()) return "No exist!";

        pet.get().setMicrochip(pets.getMicrochip());
        entityManager.getTransaction().commit();

        return "successfully";
    }


}

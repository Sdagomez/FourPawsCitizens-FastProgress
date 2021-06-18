package edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.repositories;

import edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.entities.Vet;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class VetRepositoryImpl implements VetRepository {

    private EntityManager entityManager;

    public VetRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    /**
     *
     * @param vet
     * @return
     */
    @Override
    public String save(Vet vet) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(vet);
            entityManager.getTransaction().commit();
            return "Successfully";
        } catch (Exception e) {
            return "error";
        }
    }
    /**
     *
     * @param vet
     */
    @Override
    public void delete(Vet vet) {
        entityManager.getTransaction().begin();
        entityManager.remove(vet);
        entityManager.getTransaction().commit();
    }

    @Override
    public Optional<Vet> findById(String username) {
        return Optional.empty();
    }




    /**
     *
     * @return
     */
    @Override
    public List<Vet> findAll() {
        return entityManager.createQuery("from Vet ").getResultList();
    }

    @Override
    public String modify(Vet vet) {
        return null;
    }
}

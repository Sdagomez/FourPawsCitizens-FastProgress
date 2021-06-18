package edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.repositories;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.entities.Owner;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;
import java.util.Optional;

public class OwnerRepositoryImpl implements OwnerRepository {

    private EntityManager entityManager;

    public OwnerRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    /**
     *
     * @param owner
     * @return
     */
    @Override
    public String save(Owner owner) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(owner);
            entityManager.getTransaction().commit();
            return "Successfully";
        } catch (Exception e) {
            return "error";
        }
    }


    /**
     *
     * @param username
     * @return
     */
    @Override
    public Optional<Owner> findById(String username) {
        Owner owner = entityManager.find(Owner.class, username);
        return owner != null ? Optional.of(owner) : Optional.empty();
    }
    /**
     *
     * @param owners
     * @return
     */
    @Override
    public String modify(Owner owners) {
        entityManager.getTransaction().begin();
        Optional<Owner> owner = this.findById(owners.getUsername());
        if (!owner.isPresent()) return "No exist";
        owner.get().setAddress(owners.getAddress());
        owner.get().setNeighborhood(owners.getNeighborhood());
        entityManager.getTransaction().commit();
        return "Successfully";
    }

    /**
     *
     * @return
     */
    @Override
    public List<Owner> findAll() {
        return entityManager.createQuery("from Owner").getResultList();
    }

    /**
     *
     * @param neighborhood
     * @return
     */
    @Override
    public List<Owner> findByNeighborhood(String neighborhood) {
        Query ownerQ = entityManager.createQuery("SELECT o FROM Owner o WHERE o.neighborhood = :neighborhood");
        ownerQ.setParameter("neighborhood", neighborhood);
        List<Owner> owners = ownerQ.getResultList();
        return owners;
    }


}

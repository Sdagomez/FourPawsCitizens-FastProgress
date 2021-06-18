package edu.unbosque.FourPawsCitizens_FastProgress_Backend.services.services;


import edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.repositories.OwnerRepository;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.repositories.OwnerRepositoryImpl;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.resources.pojos.Owner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class OwnerService {

    private OwnerRepository ownerRepository;

    /**
     *
     * @param owners
     * @return
     */
    public String modifyOwner(Owner owners) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("FastProgress");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        ownerRepository = new OwnerRepositoryImpl(entityManager);
        //Save the data that arrive for ownerPojo
        String message = ownerRepository.modify(Owner);
        entityManager.close();
        entityManagerFactory.close();
        return message;
    }



}
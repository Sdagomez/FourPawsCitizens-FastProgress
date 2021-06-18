package edu.unbosque.FourPawsCitizens_FastProgress_Backend.services.services;

import edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.repositories.CaseRepository;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.repositories.CaseRepositoryImpl;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.repositories.PetRepository;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.repositories.PetRepositoryImpl;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.resources.pojos.Case;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CaseService {

    private CaseRepository caseRepository;
    private PetRepository petRepository;


    public void createCase(Case cases) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("FastProgress");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        caseRepository = new CaseRepositoryImpl(entityManager);
        petRepository = new PetRepositoryImpl(entityManager);


        //Creating a optional object pet, if exists the case is created.
        //Optional<Pet> pet = petRepository.findById(cases.getPet_id());
//        if (!pet.isPresent()) return "El id de la mascota ingresado no existe";
//        PetCase newcase = new PetCase(cases.getCase_id(), create_at, cases.getType(), cases.getDescription(), pet.get());
//        String message = caseRepository.save(newcase);

        entityManager.close();
        entityManagerFactory.close();
//        return message;

    }
}




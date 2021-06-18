package edu.unbosque.FourPawsCitizens_FastProgress_Backend.services.services;

import edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.entities.Pet;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.entities.Vet;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.entities.Visit;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.repositories.*;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class VisitService {

    VisitRepository visitRepository;
    VetRepository vetRepository;
    PetRepository petRepository;

    public List<Visit> listVisit(){

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("FastProgress");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        visitRepository = new VisitRepositoryImpl(entityManager);
        List<Visit> visits = visitRepository.findAll();

        entityManager.close();
        entityManagerFactory.close();

        List<Visit> visits1 = new ArrayList<>();
        for (Visit visit : visits){
            visits1.add(new Visit(visit.getCreatedId(),visit.getType(),visit.getDescription()));
        }
        return visits1;
    }


    public String saveVisit(Visit visit){

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("FastProgress");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        visitRepository = new VisitRepositoryImpl(entityManager);
        vetRepository = new VetRepositoryImpl(entityManager);
        petRepository = new PetRepositoryImpl(entityManager);

        Optional<Vet> vet = vetRepository.findByUserName(visit.getVet());
        Optional<Pet> pet = petRepository.findById(visit.getPet());

        if (!vet.isPresent()) return "The vet does not exist";
        if (!vet.isPresent()) return "The pet does not exist";
        Visit visit2 = new Visit(
                visit.getCreatedId(),
                visit.getType(),
                visit.getDescription()
        );
        vet.get().addVisit(visit2);
        pet.get().addVisits(visit2);
        vetRepository.save(vet.get());
        petRepository.save(pet.get());
        entityManager.close();
        entityManagerFactory.close();

        return "The visit was successfully created";
    }


    public String deleteVisit(Integer id){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("FastProgress");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        visitRepository = new VisitRepositoryImpl(entityManager);
        String reply = visitRepository.deleteById(id);

        entityManager.close();
        entityManagerFactory.close();
        return reply;
    }



    public String  editVisit(Integer visit_id, String created_id, String type, String description, Integer vet_id, Integer pet_id){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("FastProgress");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        visitRepository = new VisitRepositoryImpl(entityManager);
        String reply = visitRepository.editVisit( visit_id,  created_id,  type,  description,  vet_id,  pet_id);

        entityManager.close();
        entityManagerFactory.close();
        return reply;
    }

}
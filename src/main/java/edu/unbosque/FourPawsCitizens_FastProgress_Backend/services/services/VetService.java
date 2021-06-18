package edu.unbosque.FourPawsCitizens_FastProgress_Backend.services.services;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.repositories.VetRepository;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.repositories.VetRepositoryImpl;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.resources.pojos.Vet;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class VetService {

    private VetRepository vetRepository;

    /**
     *
     * @param vets
     * @return
     */
    public String modifyVet(Vet vets) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("FastProgress");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        vetRepository = new VetRepositoryImpl(entityManager);

        String message = vetRepository.modify(vets);
        entityManager.close();
        entityManagerFactory.close();
        return message;
    }

    /**
     *
     * @param vet
     * @return
     */
    public String saveVet(Vet vets) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("FastProgress");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        vetRepository = new VetRepositoryImpl(entityManager);

        Vet vet = new Vet(
                vets.getUserName(),
                vets.getName(),
                vets.getAddress(),
                vets.getNeighborhood()
        );
        String message = vetRepository.save(vet);

        entityManager.close();
        entityManagerFactory.close();
        return message;
    }

}

package edu.unbosque.FourPawsCitizens_FastProgress_Backend.services.services;


import edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.entities.UserApp;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.repositories.UserAppRepository;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.repositories.UserAppRepositoryImpl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Optional;

@Stateless
public class UserAppService {

    UserAppRepository userAppRepository;


    public Optional<String> validateUser(String username, String password) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("FastProgress");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        userAppRepository = new UserAppRepositoryImpl(entityManager);
        Optional<UserApp> user = userAppRepository.findByUsername(username);

        entityManager.close();
        entityManagerFactory.close();

        if (user.isPresent()) {
            if (user.get().getUsername().equals(username) && user.get().getPassword().equals(password)) {
                return Optional.of(user.get().getRole());
            }
        }

        return Optional.empty();

    }


}

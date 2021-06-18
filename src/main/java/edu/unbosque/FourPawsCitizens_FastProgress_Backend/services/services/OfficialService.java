package edu.unbosque.FourPawsCitizens_FastProgress_Backend.services.services;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.repositories.OfficialRepository;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.repositories.OfficialRepositoryImpl;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.repositories.UserAppRepository;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.repositories.UserAppRepositoryImpl;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.resources.filters.Logged;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.resources.pojos.*;

import edu.unbosque.FourPawsCitizens_FastProgress_Backend.services.services.VetService;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class OfficialService {

}
//
//    OfficialRepository officialRepository;
//    UserAppRepository userAppRepository;
//
//    public String saveOfficial(String username,Official officialPOJO) {
//
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("LazarusAES-256");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//        officialRepository = new OfficialRepositoryImpl(entityManager);
//        userAppRepository = new UserAppRepositoryImpl(entityManager);
//        System.out.println("entra crear offficial 1");
//        Optional<UserApp> user = userAppRepository.findByUsername(username);
//        officialPOJO.setUsername(username);
//
//
//        user.get().addOfficial(official);
//
//        String reply = userAppRepository.save(user.get());
//
//        entityManager.close();
//        entityManagerFactory.close();
//
//        return reply;
//    }
//
//    public List<OfficialPOJO> listOfficial() {
//
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("LazarusAES-256");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//        officialRepository = new OfficialRepositoryImpl(entityManager);
//
//        List<Official> official =  officialRepository.findAll();
//
//        entityManager.close();
//        entityManagerFactory.close();
//
//        List<OfficialPOJO> officialPOJOS = new ArrayList<>();
//        for (Official official1 : official) {
//            officialPOJOS.add(new OfficialPOJO(official1.getUserApp().getUsername(),official1.getName()));
//        }
//        return officialPOJOS;
//    }
package edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.repositories;

import edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.entities.UserApp;

import java.util.List;
import java.util.Optional;

public interface UserAppRepository {

    /**
     * @param userApp
     * @return
     */
    String save(UserApp userApp);

    /**
     * @param username
     * @return
     */
    Optional<UserApp> findByUsername(String username);
    /**
     * @param userApp
     */
    void delete(UserApp userApp);
    /**
     * @return
     */
    List<UserApp> findAll();

    /**
     * @param userApp
     * @return
     */
    String modify(UserApp userApp);



}

package edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.repositories;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.entities.UserApp;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class UserAppRepositoryImpl implements UserAppRepository {

    private EntityManager entityManager;

    public UserAppRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    /**
     * saves a new user to the db
     *
     * @param userApp the case to persist
     * @return a result message
     */
    @Override
    public String save(UserApp userApp) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(userApp);
            entityManager.getTransaction().commit();
            return "Successfully";
        } catch (Exception e) {
            return "Error";
        }
    }

    /**
     *
     * @param UserApps
     * @return
     */
    @Override
    public String modify(UserApp UserApps) {
        entityManager.getTransaction().begin();
        Optional<UserApp> userApp = this.findByUsername(UserApps.getUsername());
        if (!userApp.isPresent()) return "no exist";
        userApp.get().setPassword(UserApps.getPassword());
        userApp.get().setEmail(UserApps.getEmail());
        userApp.get().setRole(UserApps.getRole());
        entityManager.getTransaction().commit();
        return "Successfully";
    }
    /**
     *
     * @return
     */
    @Override
    public List<UserApp> findAll() {
        return entityManager.createQuery("from UserApp ").getResultList();
    }

    /**
     * Delete an user from the DB
     *
     * @param userApp the user to delete
     */
    @Override
    public void delete(UserApp userApp) {
        entityManager.getTransaction().begin();
        entityManager.remove(userApp);
        entityManager.getTransaction().commit();
    }

    /**
     *
     * @param username
     * @return
     */
    @Override
    public Optional<UserApp> findByUsername(String username) {
        UserApp userApp = entityManager.find(UserApp.class, username);
        return userApp != null ? Optional.of(userApp) : Optional.empty();
    }


}

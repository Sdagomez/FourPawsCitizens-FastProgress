package edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.repositories;

import edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.entities.Owner;

import java.util.List;
import java.util.Optional;

public interface OwnerRepository {

    /**
     *
     * @param owner
     * @return
     */
    String save(Owner owner);

    /**
     *
     * @param owner
     * @return
     */
    String modify(Owner owner);

    /**
     *
     * @return
     */
    List<Owner> findAll();

    /**
     *
     * @param neighborhood
     * @return
     */
    List<Owner> findByNeighborhood(String neighborhood);

    /**
     *
     * @param username
     * @return
     */
    Optional<Owner> findById(String username);
}

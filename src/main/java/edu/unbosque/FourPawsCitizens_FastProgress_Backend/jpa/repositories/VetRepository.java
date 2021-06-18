package edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.repositories;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.entities.Vet;

import java.util.List;
import java.util.Optional;

public interface VetRepository {

    /**
     *
     * @param vet
     * @return
     */
    String save(Vet vet);

    /**
     *
     * @return
     */
    List<Vet> findAll();

    /**
     *
     * @param vet
     * @return
     */
    String modify(Vet vet);

    /**
     *
     * @param vet
     */
    void delete(Vet vet);

    /**
     *
     * @param username
     * @return
     */
    Optional<Vet> findById(String username);

}

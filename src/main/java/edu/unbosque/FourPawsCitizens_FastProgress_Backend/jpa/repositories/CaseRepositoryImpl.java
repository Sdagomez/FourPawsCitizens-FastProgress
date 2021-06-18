package edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.repositories;

import edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.entities.PetCase;
import edu.unbosque.FourPawsCitizens_FastProgress_Backend.resources.pojos.Case;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class CaseRepositoryImpl implements CaseRepository {

    private EntityManager entityManager;

    public CaseRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    /**
     *
     * @param pPetCase
     * @return
     */
    @Override
    public String save(PetCase pPetCase) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(pPetCase);
            entityManager.getTransaction().commit();
            return "Correct register";
        } catch (Exception e) {
            return "Error";
        }
    }

    /**
     * Finds all the petCases of the db
     *
     * @return a list of petCases
     */
    @Override
    public List<PetCase> findAll() {
        return entityManager.createQuery("from PetCase").getResultList();
    }

    /**
     *
     * @param date1
     * @param date2
     * @param pet_id
     * @return
     */

    /**
     * Delete a Case by id
     * @param id
     */

    public String deleteById(Integer id) {
        Case aCase = entityManager.find(Case.class, id);
        if(aCase != null){
            try {
                entityManager.getTransaction().begin();
                entityManager.remove(aCase);
                entityManager.getTransaction().commit();
                return "successfully ";
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "error";
    }
}

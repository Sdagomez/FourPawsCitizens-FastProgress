package edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.repositories;

import edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.entities.Visit;

import java.util.Date;
import java.util.List;

public interface VisitRepository {

    String save(Visit visit);

    List<Visit> findAll();

}

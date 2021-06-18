package edu.unbosque.FourPawsCitizens_FastProgress_Backend.resources.pojos;

import java.util.ArrayList;
import java.util.List;

public class Owner {

    private String userName, name, addres, neighborhood;
    private Integer person_id;
    private List<Pet> pets =new ArrayList<Pet>();

    public Owner() {

    }
    public Owner(String userName, String name, String addres, String neighborhood, Integer person_id) {
        this.userName = userName;
        this.name = name;
        this.addres = addres;
        this.neighborhood = neighborhood;
        this.person_id = person_id;
    }
    public void addPet(Pet pet) {
        pets.add(pet);
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public String getNeighborhood() {
        return neighborhood;
    }

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    public Integer getPerson_id() {
        return person_id;
    }

    public void setPerson_id(Integer person_id) {
        this.person_id = person_id;
    }


}

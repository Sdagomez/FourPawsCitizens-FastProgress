package edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "Owner")

public class Owner implements Serializable {

    @Id
    @Column(name = "username", unique = true)
    private String username;

    @Column(name = "person", unique = true)
    private Integer person_id;

    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "neighborhood")
    private String neighborhood;

    @OneToMany(mappedBy = "owner", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Pet> pets = new ArrayList<>();

    /**
     * @param username     username user app
     * @param password     password user app
     * @param email        email user app
     * @param person_id    id person user app
     * @param name         name user app
     * @param address      address user app
     * @param neighborhood neighborhood user app
     */
    public Owner(String username, String password, String email, Integer person_id, String name, String address, String neighborhood) {
        this.username = username;
        this.person_id = person_id;
        this.name = name;
        this.address = address;
        this.neighborhood = neighborhood;
    }

    public Owner() {
    }


    /**
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return
     */
    public Integer getPerson_id() {
        return person_id;
    }

    /**
     * @param person_id
     */
    public void setPerson_id(Integer person_id) {
        this.person_id = person_id;
    }

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return
     */
    public String getNeighborhood() {
        return neighborhood;
    }

    /**
     * @param neighborhood
     */
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    /**
     * @return
     */
    public List<Pet> getPets() {
        return pets;
    }

    /**
     * @param pets
     */
    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    /**
     * add pet
     *
     * @param pet
     */
    public void addPet(Pet pet) {
        pets.add(pet);
        pet.setOwner(this);
    }

}

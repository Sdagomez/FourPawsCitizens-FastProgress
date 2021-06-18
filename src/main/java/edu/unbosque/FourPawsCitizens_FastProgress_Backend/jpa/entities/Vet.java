package edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "Vet")

/**
 * class vet users
 */
public class Vet extends UserApp {

    @Id
    @Column(name = "username", nullable = false)
    private String username;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "neighborhood", nullable = false)
    private String neighborhood;

    @OneToMany(mappedBy = "vet", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Visit> visits = new ArrayList<>();


    public Vet() {

    }
    /**
     *
     * @param username user app
     * @param password user app
     * @param email user app
     * @param name   user app
     * @param address user app
     * @param neighborhood user app
     */
    public Vet(String username, String password, String email, String name, String address, String neighborhood) {
        super(username, password, email, "vet");
        this.username = username;
        this.name = name;
        this.address = address;
        this.neighborhood = neighborhood;
    }


    /**
     *
     * @return
     */
    public String getUsername() {
        return username;
    }

    /**
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * @return
     */
    public String getNeighborhood() {
        return neighborhood;
    }

    /**
     *
     * @param neighborhood
     */
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    /**
     *
     * @return
     */
    public List<Visit> getVisits() {
        return visits;
    }

    /**
     *
     * @param visits
     */
    public void setVisits(List<Visit> visits) {
        this.visits = visits;
    }

    public void addVisit(Visit visit) {
        this.visits.add(visit);
    }


}
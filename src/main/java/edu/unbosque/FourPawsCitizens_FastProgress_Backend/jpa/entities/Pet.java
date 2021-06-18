package edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.entities;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@Table(name = "Pet")
@NamedQueries({
        @NamedQuery(name = "Pet.findAll",
                query = "SELECT p FROM Pet p")

})

public class Pet {

    @Id
    @GeneratedValue
    @Column(name = "pet_id")
    private Integer pet_id;

    @Column(name = "microchip", unique = true)
    private Long microchip;

    @Column(name = "name")
    private String name;

    @Column(name = "species")
    private String species;

    @Column(name = "race")
    private String race;

    @Column(name = "size")
    private String size;

    @Column(name = "sex")
    private String sex;

    @Column(name = "picture")
    private String picture;

    @ManyToOne
    @JoinColumn(name = "username")
    private Owner owner;

    @OneToMany(mappedBy = "pet", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<PetCase> petCases = new HashSet<>();

    @OneToMany(mappedBy = "pet", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Set<Visit> visits = new HashSet<>();

    public Pet() {
    }

    /**
     * @param microchip pet user app
     * @param name      pet user app
     * @param species   pet user app
     * @param race      pet user app
     * @param size      pet user app
     * @param sex       pet user app
     * @param picture   pet user app
     */
    public Pet(Long microchip, String name, String species, String race, String size, String sex, String picture) {
        this.microchip = microchip;
        this.name = name;
        this.species = species;
        this.race = race;
        this.size = size;
        this.sex = sex;
        this.picture = picture;
    }


    /**
     * @return
     */
    public Integer getPet_id() {
        return pet_id;
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
     * @param pet_id
     */
    public void setPet_id(Integer pet_id) {
        this.pet_id = pet_id;
    }

    /**
     * @return
     */
    public Long getMicrochip() {
        return microchip;
    }

    /**
     * @param microchip
     */
    public void setMicrochip(Long microchip) {
        this.microchip = microchip;
    }

    /**
     * @return
     */
    public String getSpecies() {
        return species;
    }

    /**
     * @param species
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     * @return
     */
    public String getRace() {
        return race;
    }

    /**
     * @param race
     */
    public void setRace(String race) {
        this.race = race;
    }

    /**
     * @return
     */
    public String getSize() {
        return size;
    }

    /**
     * @param size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     *
     */
    public String getSex() {
        return sex;
    }

    /**
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * @return
     */
    public String getPicture() {
        return picture;
    }

    /**
     * @param picture
     */
    public void setPicture(String picture) {
        this.picture = picture;
    }

    /**
     * @return
     */
    public Owner getOwner() {
        return owner;
    }

    /**
     * @return
     */
    public Set<Visit> getVisits() {
        return visits;
    }

    /**
     * @param visits
     */
    public void setVisits(Set<Visit> visits) {
        this.visits = visits;
    }

    /**
     * @param owner
     */
    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    /**
     * @return
     */
    public Set<PetCase> getCases() {
        return petCases;
    }

    /**
     * @param petCases
     */
    public void setCases(Set<PetCase> petCases) {
        this.petCases = petCases;
    }

    /**
     * @param visit
     */
    public void addVisit(Visit visit) {
        this.visits.add(visit);
    }

    public void addVisits(Visit visit2) {
    }
}

package edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.entities;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "Visit")

/**
 * class visits to vet
 */
public class Visit {



    @Id
    @GeneratedValue
    @Column(name = "visit_id")
    private Integer visitId;

    @Column(name = "created_id")
    private Date createdId;

    @Column(name = "type")
    private String type;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "username")
    private Vet vet;

    @ManyToOne
    @JoinColumn(name = "pet_id")
    private Pet pet;

    public Visit() {

    }

    /**
     *
     * @param createdId
     * @param type
     * @param description
     */
    public Visit(Date createdId, String type, String description) {
        this.visitId = visitId;
        this.createdId = createdId;
        this.type = type;
        this.description = description;
    }


    /**
     *
     * @return
     */
    public Integer getVisitId() {
        return visitId;
    }

    /**
     *
     * @param visitId
     */
    public void setVisitId(Integer visitId) {
        this.visitId = visitId;
    }

    /**
     *
     * @return
     */
    public Date getCreatedId() {
        return createdId;
    }

    /**
     *
     * @param createId
     */
    public void setCreatedAt(Date createId) {
        this.createdId = createdId;
    }

    /**
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     *
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     *
     * @return
     */
    public String getDescription() {
        return description;
    }

    /**
     *
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     *
     * @return
     */
    public Vet getVet() {
        return vet;
    }

    /**
     *
     * @param vet
     */
    public void setVet(Vet vet) {
        this.vet = vet;
    }

    /**
     *
     * @return
     */
    public Pet getPet() {
        return pet;
    }

    /**
     *
     * @param pet
     */
    public void setPet(Pet pet) {
        this.pet = pet;
    }



}
package edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.entities;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "PetCase")
/**
 * class pet cases
 */

public class PetCase {
    @Id
    @GeneratedValue
    @Column(name = "case_id", nullable = false)
    private Integer caseId;

    @Column(name = "created_at", nullable = false)
    private Date createdAt;

    @Column(name = "type", nullable = false)
    private String type;

    @Column(name = "description", nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "pet_id", nullable = false)
    private Pet pet;

    public PetCase() {

    }

    /**
     *
     * @param caseId id cases
     * @param createdAt create cases
     * @param type type cases
     * @param description frdcription cases
     * @param pet pet user
     */
    public PetCase(Integer caseId, Date createdAt, String type, String description, Pet pet) {
        this.caseId = caseId;
        this.createdAt = createdAt;
        this.type = type;
        this.description = description;
        this.pet = pet;
    }


    /**
     *
     * @return
     */
    public Integer getCaseId() {
        return caseId;
    }

    /**
     *
     * @param caseId
     */
    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    /**
     *
     * @return
     */
    public Date getCreatedAt() {
        return createdAt;
    }

    /**
     *
     * @param createdAt
     */
    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
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
     * @param type
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

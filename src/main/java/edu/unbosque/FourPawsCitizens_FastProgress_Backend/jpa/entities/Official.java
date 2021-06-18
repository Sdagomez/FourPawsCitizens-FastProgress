package edu.unbosque.FourPawsCitizens_FastProgress_Backend.jpa.entities;

import javax.persistence.*;
import java.io.Serializable;


@Entity
@Table(name = "Official")
@PrimaryKeyJoinColumn

/**
 * Class Official entity
 */
public class Official implements Serializable {


    @Id
    @GeneratedValue
    @Column(name = "username")
    private String username;

    @Column(name = "name")
    private String name;


    public Official() {

    }

    /**
     * @param username the official's username
     * @param name     the official's username
     */
    public Official(String username, String name) {
        this.username = username;
        this.name = name;

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

}
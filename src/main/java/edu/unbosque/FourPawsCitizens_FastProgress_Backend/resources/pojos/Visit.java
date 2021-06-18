package edu.unbosque.FourPawsCitizens_FastProgress_Backend.resources.pojos;

public class Visit {
    private Integer visit_id,vet_id,pet_id, total;
    private String created_at,type,description,microchip, UserName;

    public Visit() {

    }

    public Visit(Integer visit_id, Integer vet_id, Integer pet_id, String created_at, String type, String description, String microchip) {
        this.visit_id = visit_id;
        this.vet_id = vet_id;
        this.pet_id = pet_id;
        this.created_at = created_at;
        this.type = type;
        this.description = description;
        this.microchip = microchip;
    }
    public Visit(String userName, Integer total) {
        this.UserName = userName;
        this.total = total;
    }

    public Visit (  Integer total, String type){
        //este es para contar las visitas de type
        this.type = type;
        this.total = total;
    }

    public Integer getVisit_id() {
        return visit_id;
    }

    public void setVisit_id(Integer visit_id) {
        this.visit_id = visit_id;
    }

    public Integer getVet_id() {
        return vet_id;
    }

    public void setVet_id(Integer vet_id) {
        this.vet_id = vet_id;
    }

    public Integer getPet_id() {
        return pet_id;
    }

    public void setPet_id(Integer pet_id) {
        this.pet_id = pet_id;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public String getCreated_at() {
        return created_at;
    }

    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMicrochip() {
        return microchip;
    }

    public void setMicrochip(String microchip) {
        this.microchip = microchip;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }
}

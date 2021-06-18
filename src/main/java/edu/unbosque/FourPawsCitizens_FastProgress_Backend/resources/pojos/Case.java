package edu.unbosque.FourPawsCitizens_FastProgress_Backend.resources.pojos;

public class Case {

    private Integer case_id, pet_id,total;
    private String created_at,type,description;
    public Case() {

    }
    public Case(Integer case_id, Integer pet_id, String created_at, String type, String description) {
        this.case_id = case_id;
        this.pet_id = pet_id;
        this.created_at = created_at;
        this.type = type;
        this.description = description;
    }
    public Case(String type, Integer total) {
        this.type = type;
        this.total = total;
    }


    public Integer getCase_id() {
        return case_id;
    }

    public void setCase_id(Integer case_id) {
        this.case_id = case_id;
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
}

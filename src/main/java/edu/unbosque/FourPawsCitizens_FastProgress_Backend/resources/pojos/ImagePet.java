package edu.unbosque.FourPawsCitizens_FastProgress_Backend.resources.pojos;

public class ImagePet {
    private Integer pet_id;
    private String image_file,description;

    public ImagePet() {

    }
    public ImagePet(Integer pet_id, String image_file, String description) {
        this.pet_id = pet_id;
        this.image_file = image_file;
        this.description = description;
    }

    public Integer getPet_id() {
        return pet_id;
    }

    public void setPet_id(Integer pet_id) {
        this.pet_id = pet_id;
    }

    public String getImage_file() {
        return image_file;
    }

    public void setImage_file(String image_file) {
        this.image_file = image_file;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

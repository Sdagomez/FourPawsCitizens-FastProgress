package edu.unbosque.FourPawsCitizens_FastProgress_Backend.resources.pojos;

public class Official {
    private String userName, name;

    public Official(String username, String name) {
        this.userName = username;
        this.name = name;
    }

    public String getUsername() {
        return userName;
    }

    public void setUsername(String username) {
        this.userName = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

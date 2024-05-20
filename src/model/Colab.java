package model;

public class Colab{

    private String name;
    private String id;
    private String email;

    public Colab(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    public String getName() {
        return name;
    }
    public String getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }



    
}

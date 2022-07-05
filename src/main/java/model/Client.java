package model;

public class Client {
    private String name;
    private String id;
    private String email;
    private String phone;

    public Client(String name, String id, String email, String phone){
        this.name = name;
        this.id = id;
        this.email = email;
        this.phone = phone;
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

    public String getPhone() {
        return phone;
    }
}

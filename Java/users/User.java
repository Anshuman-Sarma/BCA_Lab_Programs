// AnshumanSarma_WAP to create a User class using encapsulation


package users;

public class User {
    private String name;
    private int ID;
    private String role;

    public User(String name, int ID, String role) {
        this.name = name;
        this.ID = ID;
        this.role = role;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
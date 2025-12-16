// AnshumanSarma_WAP to manage users using ArrayList in Java


package users;

import java.util.ArrayList;
import java.util.List;

public class UserManager {
    private List<User> users = new ArrayList<>();

    public void addUser(User user) {
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
    }

    public User searchByName(String name) {
        for (User user : users) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null; // User not found
    }

    public User searchByID(int ID) {
        for (User user : users) {
            if (user.getID() == ID) {
                return user;
            }
        }
        return null; // User not found
    }

    public List<User> getAllUsers() {
        return users;
    }
}
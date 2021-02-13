package dao;

import model.User;
import java.util.List;

public interface UserDao {
    List<User> getListUsers();
    void addUser(User user);
    void removeUser(User user);
    void createTable();
}

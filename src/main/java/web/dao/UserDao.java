package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getListUsers();
    void addUser(User user);
    void updateUser(User user);
    void removeUser(User user);
    User show(int id);
}

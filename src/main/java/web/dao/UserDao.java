package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getListUsers();
    void addUser(User user);
    void update(int id, User user);
    void remove(int id);
    User show(int id);
}

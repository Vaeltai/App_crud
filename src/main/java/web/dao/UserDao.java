package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {
    List<User> getListUsers();
    void addUser(User user);
    void update(long id, User user);
    void remove(long id);
    User show(long id);
}

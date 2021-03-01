package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    List<User> getListUsers();
    User show(int id);
    void update(int id, User user);
    void remove(int id);
}

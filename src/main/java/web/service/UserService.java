package web.service;

import web.model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    List<User> getListUsers();
    User show(long id);
    void update(long id, User user);
    void remove(long id);
}

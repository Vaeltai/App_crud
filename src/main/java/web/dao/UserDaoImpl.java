package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;
import javax.persistence.*;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public void addUser(User user) {
        em.persist(user);
    }

    @Override
    public void updateUser(User user) {
//        em.
    }

    @Override
    public List<User> getListUsers() {
        String sql = "SELECT * FROM users";
        Query query = em.createNativeQuery(sql, User.class);
        return query.getResultList();
    }

    @Override
    public void removeUser(User user) {

    }

    @Override
    public User show(int id) {
        Query query = em.createNativeQuery("SELECT * FROM users where id=" + id, User.class);
        return (User) query.getResultList().get(0);
    }
}

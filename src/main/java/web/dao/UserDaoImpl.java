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
    public void update(long id, User user) {
        User userForUpdate = show(id);
        userForUpdate.setName(user.getName());
        userForUpdate.setSurname(user.getSurname());
        userForUpdate.setAge(user.getAge());
    }

    @Override
    public List<User> getListUsers() {
        String hql = "FROM User";
        Query query = em.createQuery(hql, User.class);
        return query.getResultList();
    }

    @Override
    public void remove(long id) {
        em.remove(show(id));
    }

    @Override
    public User show(long id) {
        return em.find(User.class, id);
    }
}

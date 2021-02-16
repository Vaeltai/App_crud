package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;
import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {

    @PersistenceContext
    private EntityManager em;

    protected EntityManager getEntityManager(){
        return this.em;
    }

    @Transactional
    @Override
    public void addUser(User user) {
        em.persist(user);
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

}

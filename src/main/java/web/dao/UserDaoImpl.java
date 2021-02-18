package web.dao;

import com.mysql.cj.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;
import web.config.WebConfig;
import web.model.User;
import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager em;

    @Transactional
    @Override
    public void addUser(User user) {
        em.persist(user);
    }
    @Transactional
    @Override
    public void updateUser(User user) {
//        em.
    }
    @Transactional
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

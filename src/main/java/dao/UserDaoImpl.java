package dao;

import model.User;
import org.springframework.stereotype.Repository;
import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.List;

//@Repository
public class UserDaoImpl implements UserDao {
    private List<User> list = null;
    @PersistenceUnit
    private EntityManagerFactory entityManagerFactory;
    private EntityManager em = entityManagerFactory.createEntityManager();

    {
        //через аннотации, а не new
        list.add(new User("Anna", "Petrova", 23));
        list.add(new User("Oleg", "Ivanov", 21));
    }
    @Transactional
    @Override
    public void createTable() {
        em.createQuery("CREATE TABLE if NOT EXISTS Users " +
                "(id BIGINT AUTO_INCREMENT PRIMARY KEY, " +
                "name VARCHAR(255) NOT NULL, " +
                "surname VARCHAR(255) NOT NULL, " +
                "age int NOT NULL);");
    }

    @Transactional
    @Override
    public void addUser(User user) {
        em.persist(user);
    }

    @Override
    @Transactional
    public List<User> getListUsers() {

        return list;
    }

    @Override
    public void removeUser(User user) {

    }

}

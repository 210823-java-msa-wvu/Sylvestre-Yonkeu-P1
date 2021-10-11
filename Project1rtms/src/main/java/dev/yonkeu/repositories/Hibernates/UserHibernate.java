package dev.yonkeu.repositories.Hibernates;

import dev.yonkeu.models.Users;
import dev.yonkeu.repositories.UserRepo;
import dev.yonkeu.utils.HibernateUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

public class UserHibernate implements UserRepo {

    private Logger log = LogManager.getLogger(UserHibernate.class);

//    Transaction transaction;
//        try (Session session = HibernateUtil.getSessionFactory().openSession()) {
//        // start a transaction
//        transaction = session.beginTransaction();
//        // save the student object
//        session.save(user);
//        // commit transaction
//        transaction.commit();
//    } catch (Exception e) {
//        if (transaction != null) {
//            transaction.rollback();
//        }
//        e.printStackTrace();
//    }
//}
    @Override
    public Users add(Users users) {
        return null;
    }

    @Override
    public Users getByemp_id(Integer emp_id) {

        Session s = HibernateUtil.getSession();
        Users u = s.get(Users.class, emp_id);
        s.close();
        return null;
    }

    public Users getByUsername(String username) {

        Session s = HibernateUtil.getSession();
        Users u = null;

        try {

            // Get Criteria Builder from Session
            CriteriaBuilder criteriaBuilder = s.getCriteriaBuilder();

            // Create CriteriaQuery
            CriteriaQuery<Users> criteriaQuery = criteriaBuilder.createQuery(Users.class);

            // Create Root object
            Root<Users> root = criteriaQuery.from(Users.class);

            // Use Predicates to narrow down our query
            Predicate predicate = criteriaBuilder.equal(root.get("username"), username);
            // you can create multiple predicates (i.e. username AND password)

            // Bringing our Criteria Builder and our Criteria Query together...
            // select * from users where username = ?
            criteriaQuery.select(root).where(predicate); // if using multiple predicates -> .where(cb.and(pred1, pred2)

            // Save that result into an object
            u = s.createQuery(criteriaQuery).getSingleResult();

        } catch (HibernateException e) {
            e.printStackTrace();
        } finally {
            s.close();
        }

        return u;
    }

    @Override
    public List<Users> getAll() {

        List<Users> users;

        try (Session s = HibernateUtil.getSession()) {
            Query q = s.createQuery("from users", Users.class);
            users = q.getResultList();

            return users;
        } catch (HibernateException e) {
            log.error(e.getMessage());
        }
        return null;
    }

    @Override
    public void update(Users users) {

    }

    @Override
    public void delete(Integer emp_id) {

    }
//Native SQL template for complex queries
//String sql = "select * from users where id = :id";
//// We can still use native sql - but you shouldn't unless doing large updates or complicated queries.
//        NativeQuery<User> nq = s.createNativeQuery(sql);
//        nq.setParameter("id", id);
//        User u = nq.stream().findFirst().get();
//        return u;
}

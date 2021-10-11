package dev.yonkeu.repositories.Hibernates;

import dev.yonkeu.models.tr_status;
import dev.yonkeu.repositories.tr_statusRepo;
import dev.yonkeu.utils.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class tr_statusHibernate implements tr_statusRepo {
    @Override
    public tr_status add(tr_status trs) {
        return null;
    }

    @Override
    public tr_status getByemp_id(Integer emp_id) {

        //specific query
        Session s = HibernateUtil.getSession();
        String query = "from tr_status where emp_id = :emp_id";
        Query<tr_status> q = s.createQuery(query, tr_status.class);
        q.setParameter("emp_id", emp_id);

        tr_status trs = q.getSingleResult();
        s.close();
        return trs;

    }

    @Override
    public List<tr_status> getAll() {

        // normal Query Interface
        Session s = HibernateUtil.getSession();

        // Create a query object
        String query = "from tr_status";
        Query<tr_status> q = s.createQuery(query, tr_status.class);

        List<tr_status> trs = q.getResultList();

        s.close();

        return trs;
    }

    @Override
    public void update(tr_status trf) {

        //update transaction
        Transaction tx = null;
        try (Session s = HibernateUtil.getSession()) {
            tx = s.beginTransaction();
            s.update(trf);
            tx.commit();

        } catch (HibernateException e) {
            e.printStackTrace();
            if (tx != null)
                tx.rollback();
        }

    }

    @Override
    public void delete(Integer emp_id) {

        Transaction tx = null;

        try (Session s = HibernateUtil.getSession()) {
            tx = s.beginTransaction();
            s.delete(emp_id);
            tx.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            if (tx != null)
                tx.rollback();
        }

    }
}

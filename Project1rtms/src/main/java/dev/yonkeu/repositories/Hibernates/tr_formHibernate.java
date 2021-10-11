package dev.yonkeu.repositories.Hibernates;

import dev.yonkeu.models.tr_form;
import dev.yonkeu.models.tr_status;
import dev.yonkeu.repositories.tr_formRepo;
import dev.yonkeu.utils.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class tr_formHibernate implements tr_formRepo {

    @Override
    public tr_form add(tr_form trf) {

        Session s = HibernateUtil.getSession();

        // I'm going to use a try catch finally to make sure that our transaction only commits to the database
        // so long as there are no exceptions thrown.

        Transaction tx = null;

        try {
            tx = s.beginTransaction();
            s.save(trf);
            tx.commit();
        } catch (HibernateException e) {
            e.printStackTrace();
            if (tx != null)
                tx.rollback();
        } finally {
            s.close();
        }
        return trf;
    }

    @Override
    public tr_form getByemp_id(Integer emp_id) {


        return null;
    }

    @Override
    public tr_form getBytr_id(Integer tr_id) {

        Session s = HibernateUtil.getSession();
        String query = "from tr_status where tr_id = :tr_id";
        Query<tr_form> q = s.createQuery(query, tr_form.class);
        q.setParameter("tr_id", tr_id);

        tr_form trid = q.getSingleResult();
        s.close();
        return trid;
    }

    @Override
    public List<tr_form> getAll() {

        Session s = HibernateUtil.getSession();

        // Create a query object
        String query = "from tr_form";
        Query<tr_form> q = s.createQuery(query, tr_form.class);

        List<tr_form> trf = q.getResultList();

        s.close();

        return trf;
    }


    @Override
    public void update(tr_form trf) {

    }

    @Override
    public void delete(Integer emp_id) {

    }
}

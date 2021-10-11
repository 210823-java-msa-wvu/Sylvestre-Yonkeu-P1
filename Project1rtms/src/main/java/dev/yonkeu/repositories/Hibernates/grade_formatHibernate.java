package dev.yonkeu.repositories.Hibernates;

import dev.yonkeu.models.grade_format;
import dev.yonkeu.repositories.grade_formatRepo;
import dev.yonkeu.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

public class grade_formatHibernate implements grade_formatRepo {
    @Override
    public grade_format getByemp_id(Integer emp_id) {
        return null;
    }

    @Override
    public void delete(Integer emp_id) {

    }

    @Override
    public grade_format add(grade_format gf) {
        return null;
    }

    @Override
    public grade_format getByletter_grade(String letter_grade) {

        Session s = HibernateUtil.getSession();
        String query = "from grade_format where letter_grade = :letter_grade";
        Query<grade_format> q = s.createQuery(query, grade_format.class);
        q.setParameter("letter_grade", letter_grade);

        grade_format gf = q.getSingleResult();
        s.close();
        return gf;

    }

    @Override
    public void update(grade_format gf) {

    }

    @Override
    public void delete(grade_format gf) {

    }
}

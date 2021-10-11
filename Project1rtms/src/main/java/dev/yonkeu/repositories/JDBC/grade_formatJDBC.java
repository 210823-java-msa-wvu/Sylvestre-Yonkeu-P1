package dev.yonkeu.repositories.JDBC;

import dev.yonkeu.models.grade_format;
import dev.yonkeu.repositories.grade_formatRepo;

public class grade_formatJDBC implements grade_formatRepo {
    @Override
    public grade_format add(grade_format gf) {
        return null;
    }

    @Override
    public grade_format getByemp_id(Integer emp_id) {
        return null;
    }

    @Override
    public grade_format getByletter_grade(String letter_grade) {
        return null;
    }

    @Override
    public void update(grade_format gf) {

    }

    @Override
    public void delete(Integer emp_id) {

    }

    @Override
    public void delete(grade_format gf) {

    }
}

package dev.yonkeu.repositories;

import dev.yonkeu.models.grade_format;


public interface grade_formatRepo extends CrudRepo<grade_format> {

    grade_format add(grade_format gf);


    grade_format getByletter_grade(String letter_grade);


    void update(grade_format gf);


    void delete(grade_format gf);

}

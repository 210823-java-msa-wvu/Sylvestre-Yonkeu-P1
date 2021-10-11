package dev.yonkeu.repositories;

import dev.yonkeu.models.tr_form;

import java.util.List;

public interface tr_formRepo extends CrudRepo<tr_form>{


    tr_form add(tr_form trf);


    tr_form getByemp_id(Integer emp_id);


    tr_form getBytr_id(Integer tr_id);

    List<tr_form> getAll();


    void update(tr_form trf);


    void delete(Integer emp_id);

}

package dev.yonkeu.repositories;

import dev.yonkeu.models.tr_form;
import dev.yonkeu.models.tr_status;

import java.util.List;

public interface tr_statusRepo extends CrudRepo<tr_status>{

    tr_status add(tr_status trs);


    tr_status getByemp_id(Integer emp_id);

    List<tr_status> getAll();


    void update(tr_status trf);


    void delete(Integer emp_id);
}

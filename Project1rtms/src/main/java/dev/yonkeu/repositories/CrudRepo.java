package dev.yonkeu.repositories;

public interface CrudRepo<T> {

    //create

    T add(T t);

    //Read

    T getByemp_id(Integer emp_id);

    //update

    void update(T t);

    //Delete

    void delete(Integer emp_id);
}

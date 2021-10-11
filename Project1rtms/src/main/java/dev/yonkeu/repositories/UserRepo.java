package dev.yonkeu.repositories;

import dev.yonkeu.models.Users;

import java.util.List;


public interface UserRepo extends CrudRepo<Users>{



    Users add(Users users);


    Users getByemp_id(Integer emp_id);

    Users getByUsername(String username);

    List<Users> getAll();


    void update(Users users);


    void delete(Integer emp_id);
}


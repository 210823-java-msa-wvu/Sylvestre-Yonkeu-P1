package dev.yonkeu.services;

import dev.yonkeu.models.Users;
import dev.yonkeu.repositories.JDBC.UserJDBC;
import dev.yonkeu.repositories.UserRepo;

import java.util.List;

public class UsersServices {
//like P0 login
UserRepo userRepo = new UserJDBC();

    public boolean login(String username, String password) {

        Users u = userRepo.getByUsername(username); // more of the Sole Responsibility Principle at work

        // check to make sure User object is not null
        if (u != null) {
            // now check to make sure it matches
            if (username.equals(u.getUsername()) && password.equals(u.getPassword())) {
                return true;
            }

        }
        return false;
    }

    public List<Users> getAllUsers() {

        return userRepo.getAll();

    }
    public Integer Adminlevel(String username) {
        Users u = userRepo.getByUsername(username);
        if (u != null){
            return u.getAdmin_level();
        }else
            return null;
    }


}

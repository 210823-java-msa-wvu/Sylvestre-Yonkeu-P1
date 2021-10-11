package dev.yonkeu.repositories.JDBC;

import dev.yonkeu.models.Users;
import dev.yonkeu.repositories.UserRepo;

import java.util.List;

public class UserJDBC implements UserRepo {
    @Override
    public Users add(Users users) {
        return null;
    }

    @Override
    public Users getByemp_id(Integer emp_id) {
        return null;
    }

    @Override
    public Users getByUsername(String username) {
        return null;
    }

    @Override
    public List<Users> getAll() {
        return null;
    }

    @Override
    public void update(Users users) {

    }

    @Override
    public void delete(Integer emp_id) {

    }
}

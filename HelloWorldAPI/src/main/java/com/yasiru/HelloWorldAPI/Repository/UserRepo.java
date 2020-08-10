package com.yasiru.HelloWorldAPI.Repository;

import com.yasiru.HelloWorldAPI.DAO.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Integer> {
    User findByUserNic(String usrNic);
}

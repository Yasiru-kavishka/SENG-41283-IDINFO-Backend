package com.yasiru.HelloWorldAPI.Service;

import com.yasiru.HelloWorldAPI.DAO.User;

public interface UserService {
    String saveUser(User user);
    User findUserbyUserNic(String usrNic);
}

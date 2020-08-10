package com.yasiru.HelloWorldAPI.ServiceImpl;

import com.yasiru.HelloWorldAPI.DAO.User;
import com.yasiru.HelloWorldAPI.Repository.UserRepo;
import com.yasiru.HelloWorldAPI.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public String saveUser(User user) {
        userRepo.save(user);
        return "User Have Been Successfully saved";
    }

    @Override
    public User findUserbyUserNic(String usrNic) {
        User usr = new User();
        usr = userRepo.findByUserNic(usrNic);
        return usr;
    }
}

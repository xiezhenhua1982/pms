package com.yhyxzh.pms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.yhyxzh.pms.repository.UserRepository;

@Service
@Transactional
public class LoginService {
    
    @Autowired
    private UserRepository userRepository;

    @Transactional(readOnly = true)
    public boolean checkLogin(String userName , String password) {
        return userRepository.checkUserExists(userName, password) == 1 ? true : false;
    }
}

package com.JunitClasse.example;

import org.junit.platform.commons.util.StringUtils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class UserService {

    // login

    public boolean login (String userName, String password){
        if(StringUtils.isBlank(userName)|| StringUtils.isBlank(password)){
           // throw new IllegalAccessException("Username or Password must not be null or em[ty");
        }else if (userName.equals("admin") && password.equals("password123")){
            return true;
        }
        return false;
    }

    public boolean changePassword(long userId, String oldPassword, String newPassword){
        //if(userId == 1 && StringUtils.isNotBlank(newPassword)) &&
                 StringUtils.isNotBlank(newPassword) && !newPassword.equals(oldPassword)){
          return true;
        }
        return false;
    }

    public boolean resetPassword(long userId) {
    }

    public Object logout(long userId) {
    }

    /*public boolean resetPassword(long userId){
        //List<Long> existingUsers = new ArrayList<>(Array.asList(1L,2L, 3L));
        return password;
    }
}

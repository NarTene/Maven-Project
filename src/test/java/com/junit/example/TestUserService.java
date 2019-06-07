package com.junit.example;

import com.JunitClasse.example.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;

public class TestUserService {

    private UserService userService = null;

    @Before
    public void init(){
        userService = new UserService();
    }

    @Test
    public void logoutSucces(){
        long userId = 1L;
        Assertions.assertTrue(userService.logout(userId));
    }

    @Test
    public void resetPasswordNotExistinguser(){
        long userId = 2L;
        Assertions.assertFalse(userService.resetPassword(userId));
    }

    @Test
    public void (){

    }

    @Nested
    @DisplayName("Testcase or Login")
    class LoginFeature{

        @Test
        void loginUserNameCorrect(){
            boolean actual = userService.login("admin", "password123");
            Assertions.assertTrue(actual);
        }
    }
}

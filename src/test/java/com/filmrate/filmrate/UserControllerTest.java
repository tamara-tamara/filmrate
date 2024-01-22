package com.filmrate.filmrate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserControllerTest {
    private UserController userController;

    @BeforeEach
    public void setUp() {
        userController = new UserController();
    }

    @Test
    void createUser() {
        User createdUser = userController.createUser(new User());
        assertNotNull(createdUser.getId());

    }
    void createInvalidUser() {   // test of exception
        assertThrows(RuntimeException.class, ()->userController.createUser(new User()));

    }

    @Test
    void getAllUsers() {
    }
}
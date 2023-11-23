package com.gianneves.introductionoftestautomationinjava;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UserServiceTest {
    private final  UserService userService = new UserService();

    @Test
    public void createUser_ReturnUsers() {
        // AAA
        // Arrange
        User user = new User("Yca", "12345");

        // Act
        List<User> users = userService.create(user);

        // Assert
        // Junit
        assertEquals(1, users.size());
        assertEquals(user, users.get(0));
    }

    @Test
    public void createUser_ThrowsException() {
        User user = new User("yca", "12345");
        userService.create(user);

        assertThrows(RuntimeException.class,
                () -> userService.create(user));
    }
}

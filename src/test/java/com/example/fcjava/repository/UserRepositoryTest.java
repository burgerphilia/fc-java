package com.example.fcjava.repository;

import com.example.fcjava.FcJavaApplicationTests;
import com.example.fcjava.model.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Table;
import java.time.LocalDateTime;

public class UserRepositoryTest extends FcJavaApplicationTests {

    // Dependency Injection (DI)
    @Autowired
    private UserRepository userRepository;

    @Test
    public void create() {
        // String sql = insert into user(%s, $s, %d) value (account, email, age);
        User user = new User();
        user.setId(1L); // auto increment
        user.setAccount("TestUser03");
        user.setEmail("TestUser03@gmail.com");
        user.setPhoneNumber("010-1111-3333");
        user.setCreatedAt(LocalDateTime.now());
        user.setCreatedBy("TestUser3");

        User newUser = userRepository.save(user);
        System.out.println("newUser : " + newUser);

    }

    public void read() {

    }

    public void update() {

    }

    public void delete() {

    }
}

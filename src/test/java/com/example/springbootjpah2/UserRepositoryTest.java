package com.example.springbootjpah2;


import com.example.springbootjpah2.model.User;
import com.example.springbootjpah2.repository.UserRepository;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private User user;

    @BeforeEach
    public  void setup(){
        user = User.builder()
                .id(1009)
                .profession("CA")
                .age(35)
                .build();
    }
}

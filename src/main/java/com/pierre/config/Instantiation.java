package com.pierre.config;

import com.pierre.entities.User;
import com.pierre.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        userRepository.deleteAll();

        User pierre = new User(null, "Pierre Andre", "28-02-1980","08595570","Tesxt1");
        User katiana = new User(null, "Katina Pierre", "02-02-1986","08595570","Tesxt1");
        User andré = new User(null, "Andre", "25-02-1990","08595570","Tesxt1");

        userRepository.saveAll(Arrays.asList(pierre, katiana, andré));
    }
}

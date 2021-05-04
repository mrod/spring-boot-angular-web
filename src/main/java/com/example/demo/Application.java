package com.example.demo;

import java.util.stream.Stream;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.model.Doctor;
import com.example.demo.model.User;
import com.example.demo.persistence.DoctorRepository;
import com.example.demo.persistence.UserRepository;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    CommandLineRunner init(UserRepository userRepository, DoctorRepository doctorRepository) {
        return args -> {
            initUsers(userRepository);
            initDoctors(doctorRepository);
        };
    }

    private void initDoctors(DoctorRepository doctorRepository) {
        Stream.of("Daniel", "Luis").forEach(name -> {
            Doctor doctor = new Doctor(name);
            doctorRepository.save(doctor);
        });
        doctorRepository.findAll().forEach(System.out::println);        
    }

    private void initUsers(UserRepository userRepository) {
        Stream.of("John", "Julie", "Jennifer", "Helen", "Rachel").forEach(name -> {
            User user = new User(name, name.toLowerCase() + "@domain.com");
            userRepository.save(user);
        });
        userRepository.findAll().forEach(System.out::println);
    }

}

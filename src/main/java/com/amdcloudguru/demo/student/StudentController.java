package com.amdcloudguru.demo.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController // Tells Spring this is a REST API
@RequestMapping("students") // Defining the endpoint
public class StudentController {

    // Returns to the client a list of JSON

    @GetMapping
    public List<Student> getAllStudents() {
        return List.of(
                new Student(UUID.randomUUID(), "James", "Bond", "jamesbond@gmail.com", Student.Gender.MALE),
                new Student(UUID.randomUUID(), "Elisa", "Tamara", "elisatamara@hotmail.com", Student.Gender.FEMALE)

        );
    }

}

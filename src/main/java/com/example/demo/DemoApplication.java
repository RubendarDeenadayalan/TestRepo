package com.example.demo;

import com.example.demo.model.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);

        createStudentInfo();
    }


    public static List<Student> createStudentInfo() {
        Address address = new Address("116", "Thoppai Street", 1);
        Set<Subjects> subjects = Stream.of(Subjects.PHYSICS,Subjects.CHEMISTRY,Subjects.MATHS).collect(Collectors.toSet());
        Marks marks = new Marks(new BigDecimal(50), new BigDecimal(60), new BigDecimal(70), 1);
        Student student = new Student(1, "Rubendar", 27, address, subjects, marks);
        System.out.println(student);
        return Arrays.asList(student);

    }

}

package com.example.demo;

import com.example.demo.model.MyStudent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<MyStudent,Integer> {
}

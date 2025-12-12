package com.junit.pam.cicddemo.service;

import com.junit.pam.cicddemo.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    List<Student> findAll();
    Optional<Student> findById(int id);
}

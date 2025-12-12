package com.junit.pam.cicddemo.service;

import com.junit.pam.cicddemo.model.Student;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
public class StudentServiceImpl implements StudentService {
    List<Student> students = new ArrayList<>();

    @Override
    public List<Student> findAll() {
        Student student1 = new Student(1, "Charles", "Wilkenson");
        Student student2 = new Student(1, "Charles", "Wilnisha");
        Student student3 = new Student(1, "Charles", "Wildana");
        Student student4 = new Student(1, "Nguyen", "Thi Tu Trang");
        Student student5 = new Student(1, "Charles", "Hanna");
        students = List.of(student1, student2, student3, student4, student5);
        return students;
    }

    @Override
    public Optional<Student> findById(int id) {
        return students.stream().filter(student -> student.getId() == id).findFirst();
    }
}

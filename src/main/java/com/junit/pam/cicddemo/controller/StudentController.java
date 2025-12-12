package com.junit.pam.cicddemo.controller;

import com.junit.pam.cicddemo.model.Student;
import com.junit.pam.cicddemo.service.StudentService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/students")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService service;

    @GetMapping
    ResponseEntity<@NonNull List<Student>> findAll(){
        List<Student> students = service.findAll();
        return ResponseEntity.ok(students);
    }

    @GetMapping("/{id}")
    ResponseEntity<@NonNull Student> findById(@PathVariable int id){
        Optional<Student> studentOptional = service.findById(id);
        if(studentOptional.isPresent()){
            return ResponseEntity.ok(studentOptional.get());
        }
        else throw new RuntimeException("Student not found");
    }
}

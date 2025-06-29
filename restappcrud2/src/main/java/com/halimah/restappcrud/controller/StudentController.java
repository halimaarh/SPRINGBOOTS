package com.halimah.restappcrud.controller;

import com.halimah.restappcrud.Service.StudentService;
import com.halimah.restappcrud.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping
    @CrossOrigin(origins = "http://localhost:5173")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @PostMapping
    @CrossOrigin(origins = "http://localhost:5173")
    public Student addStudents(@RequestBody Student student){
        return studentService.addStudent(student);
    }

    @PutMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:5173")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student studentDetails){
        return studentService.updateStudent(id, studentDetails);
    }

    @DeleteMapping("/{id}")
    @CrossOrigin(origins = "http://localhost:5173")
    public void deleteStudent(@PathVariable Long id){
        studentService.deleteStudent(id);
    }
}

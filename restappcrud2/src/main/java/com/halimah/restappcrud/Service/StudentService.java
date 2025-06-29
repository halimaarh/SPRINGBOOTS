package com.halimah.restappcrud.Service;

import com.halimah.restappcrud.entity.Student;
import com.halimah.restappcrud.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    //Injecting student repository using field injection
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    public Student addStudent(Student student){
        return studentRepository.save(student);
    }

    public Student updateStudent(Long id, Student studentDetails){
        return studentRepository.findById(id).map(student -> {
            student.setStudentName(studentDetails.getStudentName());
            student.setDateOfBirth(studentDetails.getDateOfBirth());
            student.setStudentAddress(studentDetails.getStudentAddress());
            return studentRepository.save(student);
        }).orElseThrow(() -> new RuntimeException("Student not found with id" + id));
    }

    public void deleteStudent(Long id){
        studentRepository.deleteById(id);
    }
}

package io.risx0707.springbootsql.Service;

import io.risx0707.springbootsql.Entity.student;
import io.risx0707.springbootsql.Repository.studentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class studentService {
    @Autowired
    private studentRepository repo;

    public List<student> getAllStudent(){
        return (List<student>) repo.findAll();

    }

    public void addStudent(student student){
        repo.save(student);
    }

    public void deleteStudent(int studentId){
        repo.deleteById(studentId);
    }
}

package io.risx0707.springbootsql.Controller;

import io.risx0707.springbootsql.Entity.student;
import io.risx0707.springbootsql.Service.studentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class studentController {

    @Autowired
    private studentService studentService;

    @RequestMapping("/students")
    public List<student> getAllStudent(){
        return studentService.getAllStudent();
    }

    @RequestMapping(method= RequestMethod.POST,value="/students")
    public void addStudent(@RequestBody student student){
        studentService.addStudent(student);
    }

    @RequestMapping(method = RequestMethod.DELETE,value="/{studentId}")
    public void deleteStudent(@PathVariable int studentId){
        studentService.deleteStudent(studentId);
    }
}

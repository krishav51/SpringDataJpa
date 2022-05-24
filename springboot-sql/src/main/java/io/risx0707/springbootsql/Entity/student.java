package io.risx0707.springbootsql.Entity;

import com.sun.istack.NotNull;

import javax.persistence.*;


@Entity
@Table(name="studentsTable")
public class student {

    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentId;
    @NotNull
    private String studentName;

    private String studentClass;

    public student() {

    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public void setStudentClass(String studentClass) {
        this.studentClass = studentClass;
    }

    public student(String studentName, String studentClass) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentClass = studentClass;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

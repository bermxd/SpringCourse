package org.example.aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents(){
        Student st1 = new Student("Max Ber", 5, 9.1);
        Student st2 = new Student("Mix Bar", 3, 2.2);
        Student st3 = new Student("Mux Bur", 4, 7.5);

        students.add(st1);
        students.add(st2);
        students.add(st3);

    }

    public List<Student> getStudents(){
        System.out.println("Начало работы метода getStudents");
//        System.out.println(students.get(3));

        System.out.println("Information from method getStudents: " + students);
        return students;
    }


}

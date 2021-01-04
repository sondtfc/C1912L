/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1912l.adf2.tl11.mvc;

import c1912l.adf2.tl11.model.Student;
import java.util.List;

/**
 *
 * @author teacher
 */
public class StudentView {
    StudentController controller;

    public void setController(StudentController controller) {
        this.controller = controller;
    }    
    
    public void displayStudents(){
        List<Student> list = controller.getAllStudents();
        list.forEach(s -> System.out.println(s.name));
    }
    
    public void updateStudent(Student student){
        controller.updateStudent(student);    }
}

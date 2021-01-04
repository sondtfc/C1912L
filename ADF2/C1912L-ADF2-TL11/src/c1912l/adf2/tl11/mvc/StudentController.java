/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1912l.adf2.tl11.mvc;

import c1912l.adf2.tl11.dao.StudentDAOImp;
import c1912l.adf2.tl11.model.Student;
import java.util.ArrayList;
import java.util.List;
import c1912l.adf2.tl11.dao.DAO;

/**
 *
 * @author teacher
 */
public class StudentController {
    StudentView view;
    DAO dao;
    List<Student> list = new ArrayList<>();

    public StudentController() {
        list.add(new Student("Student 1", 1));
        list.add(new Student("Student 2", 2));
        dao = new StudentDAOImp();
    }
    
    public void setView(StudentView view) {
        this.view = view;
    }
        
    public List<Student> getAllStudents(){
        return list;
    }

    void updateStudent(Student student) {
        if(student == null) return;
        
       for(Student st : list){
           if(st.id == student.id){
               st.name = student.name;
           }
       }
    }
    
     void add(Student student) {
        if(student == null) return;
        list.add(student);
    }
}

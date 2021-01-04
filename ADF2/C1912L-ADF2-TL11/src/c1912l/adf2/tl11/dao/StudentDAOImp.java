/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1912l.adf2.tl11.dao;

import c1912l.adf2.tl11.model.Student;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author teacher
 */
public class StudentDAOImp implements DAO<Student>{

    @Override
    public List<Student> getAll() {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Student 1", 1));
        list.add(new Student("Student 2", 2));
        return list;
    }

    @Override
    public List<Student> findAll(String where) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Student 1", 1));
        list.add(new Student("Student 2", 2));
        return list;
    }

    @Override
    public Student findById(int id) {
       return null;
    }
    
}

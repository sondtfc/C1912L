/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1912l.adf2.tl11.mvc;

import c1912l.adf2.tl11.model.Student;
import c1912l.adf2.tl11.observer.StudentObserver;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author teacher
 */
public class MVCDemo {
    public static void main(String[] args) {
        StudentController controller= new StudentController();
        
        StudentView view = new StudentView();
        
        controller.setView(view);
        view.setController(controller);
        
        view.displayStudents();
        
        view.updateStudent(new Student("Student 100", 1));
        
        view.displayStudents();
        
        StudentObserver so = StudentObserver.getInstance();
        so.setController(controller);
        so.setView(view);
        so.start();
        
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                    controller.add(new Student("Student 3", 3));
                } catch (InterruptedException ex) {
                }
            }
        }).start();
        
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1912l.adf2.tl11.observer;

import c1912l.adf2.tl11.mvc.StudentController;
import c1912l.adf2.tl11.mvc.StudentView;
import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;

/**
 *
 * @author teacher
 */
public class StudentObserver {
    private static StudentObserver so;
    public static final StudentObserver getInstance(){
        if(so == null){
            so = new StudentObserver();
        }        
        return so;
    }

    private StudentObserver() {
    }
    
    StudentController controller;
    StudentView view;

    public void setController(StudentController controller) {
        this.controller = controller;
    }

    public void setView(StudentView view) {
        this.view = view;
    }
    
    
    Thread thread;
    boolean isStopped = false;
    int lastCount = 0;
    public void start(){
        isStopped = false;
        thread = new Thread(new Runnable() {
            @Override
            public void run() {
                lastCount = controller.getAllStudents().size();
                while(!isStopped){
                    int currentCount = controller.getAllStudents().size();
                    if(lastCount != currentCount){
                        view.displayStudents();
                        lastCount = currentCount;
                    }
                }
            }
        });
        
        thread.start();
    }
    
    public void stop(){
        isStopped = true;
    }
}

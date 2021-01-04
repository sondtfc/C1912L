/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package c1912l.adf2.tl11.dao;

import c1912l.adf2.tl11.model.Student;
import java.util.List;

/**
 *
 * @author teacher
 */
public interface DAO<T> {
    public List<T> getAll();
    public List<T> findAll(String where);
    public T findById(int id);
}

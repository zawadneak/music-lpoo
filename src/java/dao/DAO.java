/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.List;

/**
 *
 * @author lucas
 */
public interface DAO<T> {
    T find (String identifier) throws Exception;
    List<T> findPaginated() throws Exception;
    void insert(T t) throws Exception;
}
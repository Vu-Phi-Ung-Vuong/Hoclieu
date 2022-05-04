/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;

import java.util.List;

/**
 *
 * @author LENOVO-PC
 */
public abstract class edusysDAO <E,K>{
    abstract public void insert(E entity);
    abstract public void update(E entity);
    abstract public void delete(String id);
    abstract public List<E>selectALL();
    abstract public E selectByID(String id);
    abstract protected List<E>selectBySQL(String sql,Object...args);
}

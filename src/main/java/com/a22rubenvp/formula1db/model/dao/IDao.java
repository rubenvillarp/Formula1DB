package com.a22rubenvp.formula1db.model.dao;

import java.util.List;

public interface IDao<T> {
    public List<T> find();

    public T findById(Integer id);
}
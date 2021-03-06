package com.java.automation.lab.fall.antonyuk.core22.domain.dao.baseDao;

import java.lang.reflect.Method;
import java.util.*;

public abstract class Dao<T extends AbstractModel> {

    private Map<Integer, T> store = new HashMap<>();
    private int counter = 0;

    public T get(int id) {
        return store.get(id);
    }
    public Map<Integer, T> getAll() {
        return store;
    }
    public void update(int id, T t) {
        store.put(id, t);
    }
    public void delete(int id) {
        store.remove(id);
    }
    public void create(T value) {
        try {
            Method method = value.getClass().getDeclaredMethod("setId", int.class);
            method.setAccessible(true);
            method.invoke(value, counter++);
            store.put(counter, value);
        } catch (ReflectiveOperationException e) {
            e.printStackTrace();
        }
    }
}
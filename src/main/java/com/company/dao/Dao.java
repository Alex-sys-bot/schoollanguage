package com.company.dao;

import java.util.List;

public interface Dao<Entity, Key> {

    void create(Entity entity);
    void update(Entity entity);
    void delete(Entity entity);
    Entity readById(Key key);
    List readAll();

}

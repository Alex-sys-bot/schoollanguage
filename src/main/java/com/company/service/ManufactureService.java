package com.company.service;

import com.company.dao.Dao;
import com.company.model.Manufacturer;
import com.company.model.Product;
import com.company.model.Productsale;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class ManufactureService implements Dao<Manufacturer, Integer> {
    private final SessionFactory factory;

    public ManufactureService(SessionFactory factory){
        this.factory =  factory;
    }

    @Override
    public void create(Manufacturer manufacturer) {
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.save(manufacturer);
            session.getTransaction().commit();
        }
    }

    @Override
    public void update(Manufacturer manufacturer) {
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.update(manufacturer);
            session.getTransaction().commit();
        }
    }

    @Override
    public void delete(Manufacturer manufacturer) {
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.delete(manufacturer);
            session.getTransaction().commit();
        }
    }

    @Override
    public Manufacturer readById(Integer integer) {
        try (Session session = factory.openSession()){
            return session.get(Manufacturer.class,integer);
        }
    }

    @Override
    public List readAll() {
        try (Session session = factory.openSession()){
            Query<Product> query = session.createQuery("from Manufacturer ");
            return query.list();
        }
    }
}

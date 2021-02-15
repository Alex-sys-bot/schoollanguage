package com.company.service;

import com.company.dao.Dao;
import com.company.model.Product;
import com.company.model.Productsale;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

public class ProductSaleService implements Dao<Productsale, Integer> {

    private final SessionFactory factory;

    public ProductSaleService(SessionFactory factory){
        this.factory =  factory;
    }


    @Override
    public void create(Productsale productsale) {
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.save(productsale);
            session.getTransaction().commit();
        }
    }

    @Override
    public void update(Productsale productsale) {
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.update(productsale);
            session.getTransaction().commit();
        }
    }

    @Override
    public void delete(Productsale productsale) {
        try(Session session = factory.openSession()){
            session.beginTransaction();
            session.delete(productsale);
            session.getTransaction().commit();
        }
    }

    @Override
    public Productsale readById(Integer integer) {
        try (Session session = factory.openSession()){
            return session.get(Productsale.class,integer);
        }
    }

    @Override
    public List readAll() {
        try (Session session = factory.openSession()){
            Query<Product> query = session.createQuery("from Productsale ");
            return query.list();
        }
    }
}

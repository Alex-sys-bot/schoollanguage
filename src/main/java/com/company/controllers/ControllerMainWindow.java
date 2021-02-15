package com.company.controllers;

import com.company.dao.Dao;
import com.company.model.Product;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ControllerMainWindow {

    private final SessionFactory factory;

    public ControllerMainWindow(){
        factory = new Configuration().configure().buildSessionFactory();
    }

    ObservableList<Product> listProduct = FXCollections.observableArrayList();

    @FXML
    private TableView<Product> tableProduct;
    @FXML
    private TableColumn<Product, String> columnProduct;


    public void initialize(){

        tableProduct.setItems(listProduct);
    }
}

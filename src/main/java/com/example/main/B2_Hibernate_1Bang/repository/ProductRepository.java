package com.example.main.B2_Hibernate_1Bang.repository;

import com.example.main.B2_Hibernate_1Bang.entity.Product;
import com.example.main.B2_Hibernate_1Bang.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class ProductRepository {

    private Session s;

    public ProductRepository() {
        s = HibernateUtil.getFACTORY().openSession();
    }

    public List<Product> getAll() {
        return s.createQuery("FROM Product ").list();
    }

    public static void main(String[] args) {
        System.out.println(new ProductRepository().getAll());
    }
}

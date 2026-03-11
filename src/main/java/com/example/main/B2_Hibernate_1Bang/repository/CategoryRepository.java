package com.example.main.B2_Hibernate_1Bang.repository;

import com.example.main.B2_Hibernate_1Bang.entity.Category1;
import com.example.main.B2_Hibernate_1Bang.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class CategoryRepository {

    private Session s;

    public CategoryRepository(){
        // Mo 1 phien lam viec cua session
        s = HibernateUtil.getFACTORY().openSession();
    }

    public List<Category1>getAll(){
        // Truy van tren thuc the => class trong entity
        return s.createQuery("FROM Category1 ").list();
    }

    // getOne
    public Category1 getOne(Long id){
        return s.find(Category1.class,id);
    }

    // Category1 is not mapped
    // TH1: entity thieu @Entity
    // Th2: chua dang ky entity vs Hibernate
    public static void main(String[] args) {
        System.out.println(new CategoryRepository().getAll());
    }
}

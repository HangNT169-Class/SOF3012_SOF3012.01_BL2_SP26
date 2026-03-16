package com.example.main.B2_Hibernate_1Bang.repository;

import com.example.main.B2_Hibernate_1Bang.entity.Category1;
import com.example.main.B2_Hibernate_1Bang.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class CategoryRepository {

    private Session s;

    public CategoryRepository() {
        // Mo 1 phien lam viec cua session
        s = HibernateUtil.getFACTORY().openSession();
    }

    public List<Category1> getAll() {
        // Truy van tren thuc the => class trong entity
        return s.createQuery("FROM Category1 ").list();
    }

    // getOne
    public Category1 getOne(Long id) {
        return s.find(Category1.class, id);
    }

    // add/update/delete => transation
    public void add(Category1 cate) {
        try {
            // B1: bat dau 1 transation moi
            s.getTransaction().begin();
            // B2: Thuc hien chuc nang
            // add => persist
            s.persist(cate);
            // B3: commit day du lieu
            s.getTransaction().commit();
        } catch (Exception e) {
            // hien thi loi
            s.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void update(Category1 cate) {
        try {
            // B1: bat dau 1 transation moi
            s.getTransaction().begin();
            // B2: Thuc hien chuc nang
            // update => merge
            s.merge(cate);
            // B3: commit day du lieu
            s.getTransaction().commit();
        } catch (Exception e) {
            // hien thi loi
            s.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    public void delete(Category1 cate) {
        try {
            // B1: bat dau 1 transation moi
            s.getTransaction().begin();
            // B2: Thuc hien chuc nang
            // delete => delete
            s.delete(cate);
            // B3: commit day du lieu
            s.getTransaction().commit();
        } catch (Exception e) {
            // hien thi loi
            s.getTransaction().rollback();
            e.printStackTrace();
        }
    }

    // invalid colum => ten cot/bang
    // Category1 is not mapped
    // TH1: entity thieu @Entity
    // Th2: chua dang ky entity vs Hibernate
    public static void main(String[] args) {
        System.out.println(new CategoryRepository().getAll());
    }
}

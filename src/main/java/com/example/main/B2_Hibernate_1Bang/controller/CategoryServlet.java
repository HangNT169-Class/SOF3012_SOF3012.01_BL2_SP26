package com.example.main.B2_Hibernate_1Bang.controller;

import com.example.main.B2_Hibernate_1Bang.repository.CategoryRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "CategoryServlet", value = {
        // duong dan phai bat dau bang dau /
        // duong dan la duy nhat
        "/category/hien-thi", // GET
        "/category/detail",   // GET
        "/category/delete",   // GET
        "/category/add",      // POST
        "/category/update",   // POST
        "/category/view-add",  // GET
        "/category/view-update"  // GET
})
public class CategoryServlet extends HttpServlet {

    private CategoryRepository cateRepo = new CategoryRepository();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // B1: Lay ra uri tren duong dan
        String uri = request.getRequestURI();
        if (uri.contains("hien-thi")) {
            // lam chuc nang hien thi
            this.hienThiDanhSach(request, response);
        } else if (uri.contains("detail")) {
            // lam chuc nang detail
            this.detailCate(request, response);
        } else if (uri.contains("view-add")) {
            this.viewAddCate(request, response);
        } else if (uri.contains("view-update")) {
            this.viewUpdateCate(request, response);
        } else {
            this.deleteCate(request, response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("add")) {
            this.addCate(request, response);
        } else {
            this.updateCate(request, response);
        }
    }

    private void addCate(HttpServletRequest request, HttpServletResponse response) {
    }

    private void updateCate(HttpServletRequest request, HttpServletResponse response) {
    }

    private void deleteCate(HttpServletRequest request, HttpServletResponse response) {
    }

    private void viewUpdateCate(HttpServletRequest request, HttpServletResponse response) {
    }

    private void viewAddCate(HttpServletRequest request, HttpServletResponse response) {
    }

    private void detailCate(HttpServletRequest request, HttpServletResponse response) {
    }

    private void hienThiDanhSach(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("listCate", cateRepo.getAll());
        request.getRequestDispatcher("/category-view.jsp").forward(request, response);
    }
}

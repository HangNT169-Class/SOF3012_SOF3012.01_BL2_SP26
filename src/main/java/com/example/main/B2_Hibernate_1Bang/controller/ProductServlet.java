package com.example.main.B2_Hibernate_1Bang.controller;

import com.example.main.B2_Hibernate_1Bang.repository.CategoryRepository;
import com.example.main.B2_Hibernate_1Bang.repository.ProductRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "ProductServlet", value = "/product/hien-thi")
public class ProductServlet extends HttpServlet {

    private ProductRepository productRepository = new ProductRepository();

    private CategoryRepository categoryRepository = new CategoryRepository();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String uri = request.getRequestURI();
        if (uri.contains("hien-thi")) {
            this.hienThiDanhSach(request, response);
        }
    }

    private void hienThiDanhSach(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("listProduct", productRepository.getAll());
        request.setAttribute("listCate", categoryRepository.getAll());
        request.getRequestDispatcher("/product-view.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

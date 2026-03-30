package com.example.main.B10_Ajax.controller;

import com.example.main.B10_Ajax.entity.SinhVien;
import com.google.gson.Gson;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SinhVienServlet", value = "/api/sinh-vien/detail")
public class SinhVienServlet extends HttpServlet {
    // tao ra json => ben jsp nhan ve
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // B1: tao ra doi tuong
        SinhVien sv = new SinhVien("Ma 01", "Nguyen Van A", 10);
        // B2: Chuyen doi du lieu => gson
        Gson gson = new Gson();
        // Chuyen thanh ve json
        String responseData = gson.toJson(sv);
        // B3: Set content-type
        response.setContentType("application/json");
        // Neu muon hien thi len table: <=> J6: Test api bang postman
        // ajax  => giao dien
        PrintWriter out = response.getWriter();
        out.println(responseData);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}

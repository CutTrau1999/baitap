package com.example.baitap.controller;

import com.example.baitap.entity.Product;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CreateProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setContentType("text/html");
//        resp.getWriter().println("<html>");
//        resp.getWriter().println("<head>");
        req.getRequestDispatcher("/admin/product/form.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            int mamonan = Integer.parseInt(req.getParameter("mamonan"));
            String tenmonan = req.getParameter("tenmonan");
            int madanhmuc = Integer.parseInt(req.getParameter("madanhmuc"));
            String mota = req.getParameter("mota");
            String anhdaidien = req.getParameter("anhdaidien");
            double gia = Double.parseDouble(req.getParameter("gia"));

            String ngaybatdau = req.getParameter("ngaybatdau");
            String ngaysua = req.getParameter("ngaysua");
            int status = Integer.parseInt(req.getParameter("status"));
            Product product = new Product(mamonan,tenmonan,madanhmuc,mota,anhdaidien,gia,ngaybatdau,ngaysua,status);
            ListProductServlet.list.add(product);
            resp.sendRedirect("/admin/product/list");
        }catch (Exception ex) {
            resp.getWriter().println("Bad request");
        }
    }
}


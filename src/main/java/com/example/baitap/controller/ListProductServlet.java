package com.example.baitap.controller;

import com.example.baitap.entity.Product;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class ListProductServlet extends HttpServlet {

    public static ArrayList<Product> list = new ArrayList<>();
    {
        list.add(new Product(1,"Ga Ran",2,"Best","https://ameovat.com/wp-content/uploads/2016/05/cach-lam-ga-ran.jpg",2000,"20","29",1));

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("list", list);
        req.getRequestDispatcher("/admin/product/list.jsp").forward(req, resp);
    }
}

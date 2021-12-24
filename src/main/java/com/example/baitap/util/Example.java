//package com.example.baitap.util;
//
//import com.example.baitap.entity.Product;
//import com.example.baitap.repository.JpaRepository;
//
//import java.util.List;
//
//public class Example {
//    public static void main(String[] args) {
//        JpaRepository<Product> jpaRepository = new JpaRepository<>(Product.class);
//        List<Product> list = jpaRepository.where("price", ">=", 10000);
//        for (Product p :
//                list) {
//            System.out.println(p.toString());
//        }
//    }
//}

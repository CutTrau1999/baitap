package com.example.baitap.entity;

import com.example.baitap.annotation.Column;
import com.example.baitap.annotation.Entity;
import com.example.baitap.annotation.Id;
import com.example.baitap.util.SQLDataTypes;

@Entity(tableName = "products")
public class Product {
    private int mamonan;
    private String tenmonan;
    private int madanhmuc;
    private String mota;
    private String anhdaidien;
    private double gia;
    private String ngaybatdau;
    private String ngaysua;
    private int status;

    public Product(int mamonan, String tenmonan, int madanhmuc, String mota, String anhdaidien, double gia, String ngaybatdau, String ngaysua, int status) {
        this.mamonan = mamonan;
        this.tenmonan = tenmonan;
        this.madanhmuc = madanhmuc;
        this.mota = mota;
        this.anhdaidien = anhdaidien;
        this.gia = gia;
        this.ngaybatdau = ngaybatdau;
        this.ngaysua = ngaysua;
        this.status = status;
    }

    public int getMamonan() {
        return mamonan;
    }

    public void setMamonan(int mamonan) {
        this.mamonan = mamonan;
    }

    public String getTenmonan() {
        return tenmonan;
    }

    public void setTenmonan(String tenmonan) {
        this.tenmonan = tenmonan;
    }

    public int getMadanhmuc() {
        return madanhmuc;
    }

    public void setMadanhmuc(int madanhmuc) {
        this.madanhmuc = madanhmuc;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }

    public String getAnhdaidien() {
        return anhdaidien;
    }

    public void setAnhdaidien(String anhdaidien) {
        this.anhdaidien = anhdaidien;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getNgaybatdau() {
        return ngaybatdau;
    }

    public void setNgaybatdau(String ngaybatdau) {
        this.ngaybatdau = ngaybatdau;
    }

    public String getNgaysua() {
        return ngaysua;
    }

    public void setNgaysua(String ngaysua) {
        this.ngaysua = ngaysua;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}

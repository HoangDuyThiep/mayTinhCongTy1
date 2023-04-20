package com.example.awrSample;

import java.util.HashMap;

public class SinhVien {
    //thuoc tinh bien
    private String hoTen;
    private double diem;
    private HashMap<String, String> maTinh =new HashMap<String, String>();







    //constructor
//    public SinhVien() {
//        hoTen = "No name";
//        diem = 0.0;
//    }
    public SinhVien() {
        hoTen = "No name";
        diem = 0.0;
        maTinh.put("001", "ha loi");
    }

    //contructor co doi so


    public SinhVien(String hoTen, double diem) {
        this.hoTen = hoTen;
        this.diem = diem;
        maTinh.put("001", "ha loi");
        maTinh.put("002", "lao kai");
    }

    //phuong thuc
    public void hienThiThongTin() {
        System.out.println(hoTen + " : " + diem);
    }

    public double tinhDTB(double diemToan, double diemVan) {
        return (diemToan + diemVan) / 2;
    }

    public double tinhDTB(double diemToan, double diemVan, double diemAnh) {
        return (diemToan + diemVan + diemAnh) / 3;
    }

    //get & set

    public HashMap<String, String> getMaTinh() {
        return maTinh;
    }

    public String getHoTen() {
        return hoTen;
    }



    public double getDiem() {
        return diem;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    //toString, co the tuy chinh sua

    @Override
    public String toString() {
        return "SinhVien{" +
                "hoTen='" + hoTen + '\'' +
                ", diem=" + diem +
                '}';
    }


    //support method, chi su dung trong class
    private boolean checkDiem() {
        return this.diem >= 24;
    }

    //service method, co the public
    public void checkHopLeDiem() {
        if (checkDiem())
            System.out.println("diem hop le, tiep tuc nhap thong tin");
        else
            System.out.println("kiem tra lai diem dau vao cua sinh vien.");
    }

    //parametter list
    public double tongDiem(double ... arr) {
        double tong = 0;
        for (double x : arr) {
            tong += x;
        }
        return tong;
    }


}

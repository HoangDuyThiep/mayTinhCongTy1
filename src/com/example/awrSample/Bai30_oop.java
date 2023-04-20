package com.example.awrSample;

public class Bai30_oop {



    public static void main(String[] args) {


        //khoi tao doi tuong thuoc class sinh vien
        SinhVien sv1 = new SinhVien();
        sv1.hienThiThongTin();
        SinhVien sv3 = new SinhVien("Teo", 5.0);

        sv3.hienThiThongTin();
        System.out.println(sv3.getDiem());

        //thay doi ten sinh vien 3
        sv3.setHoTen("Black");
        sv3.hienThiThongTin();
        sv3.setDiem(3.5);
        sv3.hienThiThongTin();


        SinhVien sv4 = new SinhVien("Nam", 2.3);
        //test phuong thuc co kieu tra ve
        double dtbSv4 = sv4.tinhDTB(7.5, 7.2);
        System.out.println(dtbSv4);

        //test phuong thuc toString
        System.out.println("tostring " + sv4);

        //test support va public method
        sv4.checkHopLeDiem();
        sv4.setDiem(25);
        sv4.checkHopLeDiem();

        //12 overloading
        double testDiem = sv4.tinhDTB(5, 6 , 7);
        System.out.println(testDiem);
        double testDiem2 = sv4.tinhDTB(5, 6);
        System.out.println(testDiem2);

        double kp = sv4.tongDiem(1, 2, 3, 5.5, 6);
        System.out.println("tong diem: " + kp);

        System.out.println("ma tinh " + sv3.getMaTinh().get("001"));

    }
}

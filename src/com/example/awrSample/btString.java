package com.example.awrSample;

import java.util.Scanner;

public class btString {
    public static void main(String[] args) {
        //bt1-----------------
        Scanner sc = new Scanner(System.in);
        System.out.println("moi nhap vao 1 chuoi: ");
        String s = sc.nextLine();
        System.out.println(s);
        //gan bien dem
        int demso = 0;
        int demInThuong = 0;
        int demInHoa = 0;
        int demSpace = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLowerCase(c)) {
                demInThuong++;
            } else if (Character.isUpperCase(c)) {
                demInHoa++;
            } else if (Character.isDigit(c)) {
                demso++;
            } else if (Character.isWhitespace(c)) {
                demSpace++;
            }
        }

        System.out.println("in thuong co " + demInThuong);
        System.out.println("in hoa co " + demInHoa);
        System.out.println("so co " + demso);
        System.out.println("khoang trang co " + demSpace);
    }
}

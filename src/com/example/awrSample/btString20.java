package com.example.awrSample;

import java.util.Scanner;

public class btString20 {
    public static void main(String[] args) {
        //kiem tra tinh hop le cua mat khau
        Scanner sc = new Scanner(System.in);
        String password = "";
        //vong lap nhap mk
        while (true) {
            System.out.println("moi thiet lap mat khau: ");
            System.out.println("mk it nhat 1 ki tu, 1 chu cai va dai hon 6");
            String newpassword = sc.nextLine();
            // kiem tra tinh hop le cua mk
            if (checkMK(newpassword)) {
                password = newpassword;
                System.out.println("mk da dc thiet lap!");
                break;
            } else
                System.out.println("mk khong hop le, nhap lai di nha!");

        }

        //nhap qua 5 lan se khoa
        int count = 0;
        String login = "";
        System.out.println("moi nhap mk de dang nhap");
        while (true) {

            login = sc.nextLine();
            //neu nhap qua 5 lan se thoat,
            //dat phia truoc kiem tra de thoat truoc khi kiem tra
            if (count == 4) {
                System.out.println("ban da nhap qua 5 lan");
                break;
            }
            //kiem tra mk
            if (login.equals(password)) {
                System.out.println("dang nhap thanh cong");
                break;
            } else {
                System.out.println("mk ko dung, moi nhap lai");
                count++;

            }


        }

    }

    //ham kiem tra tinh hop le cua MK
    public static boolean checkMK (String password) {
        //kiem tra do dai
        if (password.length() < 6) {
            return false;
        }
        //kiem tra it nha i chu cai
        boolean hasLetter = false;
        for (char c : password.toCharArray()) {
            if (Character.isLetter(c)) {
                hasLetter = true;
                break;
            }
        }
        if (!hasLetter) {
            return false;
        }

        //kiem tra it nhat 1 chu sao
        boolean hasNumber =false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasNumber = true;
                break;
            }
        }
        if (!hasNumber)
            return false;

        //neu mk du dieu kien
        return true;

    }
}

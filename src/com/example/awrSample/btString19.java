package com.example.awrSample;

import java.util.Arrays;

public class btString19 {
    public static void main(String[] args) {
        //tinh tong cac so trong chuoi
        String str1 = "English = 78 Science = 83 Math = 68 History = 65";
        int sum = 0;
        int count = 0;
        //tach chuoi thanh mang bang split()
        String[] parts = str1.split(" ");
        System.out.println(Arrays.toString(parts));
        for (String pt : parts) {
            try {
                //chuyen chuoi sang so
                int num = Integer.parseInt(pt);
                //cong vao tong
                sum += num;
                count++;
            } catch (NumberFormatException e) {
                //tan dung catch de bo qua string
            }
        }
        //ting trung binh cong
        double tbc = (double) sum / count;
        System.out.println("tong cac so trong chuoi: " + sum);
        System.out.println("trung binh cong cac so trong chuoi: " + tbc);
    }
}

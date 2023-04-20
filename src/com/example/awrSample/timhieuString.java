package com.example.awrSample;

import java.util.Arrays;

public class timhieuString {
    public static void main(String[] args) {
        StringBuilder chuoi = new StringBuilder();
        // cac phuong thuc thuong dung
        //1. append: them vao chuoi
        chuoi.append("Xin chao ");
        chuoi.append("minh mo hoc lap trinh ");
        chuoi.append("rat vui duoc lam quen cac ban");
        System.out.println(chuoi);
        //2. insert:(vi tri index, chuoi can chen
        chuoi.insert(2, "obama");
        System.out.println(chuoi);
        //3. delate (start, end) xoa tu vi tri start den end
        chuoi.delete(2, 7);
        System.out.println(chuoi);
        //4. length tra ve do dai chuoi
        System.out.println(chuoi.length());
        //5. indexof tra ve vi tri dau tien cua chuoi can tim
        String s7 = " toi di tim toi";
        System.out.println(s7.indexOf("toi"));
        //6. lastindexof tra ve vi tri cua chuoi cuoi can tim
        System.out.println(s7.lastIndexOf("toi"));
        //7. contains: kiem tra chuoi con
        String s9 = ".mp3";
        String s10 = "tuhoc.mp3";
        // kiem tra s10 co chua s9 khong?
        boolean check = s10.contains(s9);
        if (check)
            System.out.println("s10 chua chuoi s9");
        else System.out.println("s10 ko chua s9 ben trong!");
        //8. substring: trich chuoi con tu chuoi ban dau

        //14. so sanh comparato va comparetoIgnoreCase
        String s25 = "abc13579";
        String s26 = "Abc13579";
        int x2 = s25.compareTo(s26);
        System.out.println("so sanh 2 chuoi ra ket qua: " + x2);
        //so sanh khong phan biet hoa thuong
        int x3 = s25.compareToIgnoreCase(s26);
        System.out.println("so sanh 2 chuoi khong phan biet hoa thuong ra ket qua: " + x3);


        //15. noi chuoi
        //cach 1: dung dau + ; cach nay xu ly kha cham
        String s31 = "hom nay";
        s31 = s31 + " toi mua";
        System.out.println("15. "+ s31);
        //16. cach 2: stringBuilder; toc do noi chuoi nhanh
        StringBuilder s33 = new StringBuilder("hom nay ");
        System.out.println("16. " + s33);
        //su dung insert, append, delete, reverse; phai doi string sang stringbuilder
        s33.reverse();
        System.out.println("doi sang stringbuilder roi dao chuoi: " + s33);

        //17. split tach mang
        String s38 = "hello, world";
        String[] mang = s38.split(",");
        System.out.println("17. " + Arrays.toString(mang));

        //18. toLowerCase va toUpperCase
        //chac ko can lam vi du

        //19. toCharArray() tach chuoi thanh mang ki tu
        String s42 = "sdafasdfjsd6546";
        char[] mang2 = s42.toCharArray();
        System.out.println("19. " + Arrays.toString(mang2));

    }
}

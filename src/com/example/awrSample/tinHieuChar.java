package com.example.awrSample;

public class tinHieuChar {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("moi nhap ki tu: ");
//        String s = sc.nextLine();
//        char ch4 = s.charAt(0);
//        System.out.println("ki tu vua nhap: " + ch4);

        //so sanh vi tri char
        System.out.println(Character.compare('a', 'b'));
        //cac metho cua char
        char ch5 = '1';
        char ch6 = 'a';
        char ch7 = 'A';
        char ch8 = ' ';
        System.out.println(Character.isDigit(ch5));
        System.out.println(Character.isLetter(ch6));
        System.out.println(Character.isLowerCase(ch6));
        System.out.println(Character.isUpperCase(ch7));
        System.out.println(Character.isWhitespace(ch8));
    }
}

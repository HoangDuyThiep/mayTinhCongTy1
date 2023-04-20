package com.example.awrSample;

public class xuLyNgoaiLe {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;


        try {
            int c = a / b;
            System.out.println("c = " + c);
        }
catch (ArithmeticException ex) {
    System.out.println("da co loi toan hoc");
    ex.printStackTrace();
}
        catch (Exception ex) {
            System.out.println("co loi ko biet nguyen nhan");
            ex.printStackTrace();
        }
        finally {
            //thuc thi bat ke co loi hay ko.
            System.out.println("co loi hay khong deu phai thuc thi lenh");
        }

        System.out.println("doan code phia sau >>>>");
    }
}

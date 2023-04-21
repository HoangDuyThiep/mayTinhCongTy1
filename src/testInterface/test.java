package testInterface;

public class test {
    public static void main(String[] args) {
        KeThuaInterface kt1 = new KeThuaInterface();
        double kp1 = kt1.tinhLuong(100, 21);
        System.out.println("Tinh luong: " + kp1);
    }
}

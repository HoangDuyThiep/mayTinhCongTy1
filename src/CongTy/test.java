package CongTy;

public class test {
    public static void main(String[] args) {
//        NhanVien nv1 = new NhanVien("nhan vien 1", "bac ninh", 123456);
//        double luongnv1 = nv1.tinhLoung();
//        System.out.println("luong nv1 la: " + luongnv1);

        //tao doi tuong la nhan vien hanh chinh
        NhanVienHanhChinh hc1 = new NhanVienHanhChinh("hanh chinh 1", "thai nguyen", 33333);
        double luonghc1 = hc1.tinhLoung();
        System.out.println("luong hc1 la: " + luonghc1);

        //tao doi tuong la nhan vien di ka
        NhanVienDiCa dc1 = new NhanVienDiCa("hanh chinh 1", "thai nguyen", 33333);
        double luongdk1 = dc1.tinhLoung();
        System.out.println("luong dc1 la: " + luongdk1);


        NhanVienDiCa ca2 = new NhanVienDiCa("ti", "tu son", 555123, 1);
        double ca2luong = ca2.tinhLoung();
        System.out.println(" luong cua ti la: " + ca2luong);
        System.out.println("lam ca: " + ca2.ca);
    }
}

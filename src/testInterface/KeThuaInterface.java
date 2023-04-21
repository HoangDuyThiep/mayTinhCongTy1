package testInterface;

public class KeThuaInterface implements viDuInterface{
    @Override
    public void thongTin(String ten, String cccd, int namSinh) {

    }

    @Override
    public double tinhLuong(double luongNgay, int soNigayCong) {
        return luongNgay * soNigayCong;
    }
}

package CongTy;

public class NhanVienDiCa extends NhanVien{

    protected int ca;
    public NhanVienDiCa(String ten, String que, int cccd) {
        super(ten, que, cccd);
    }

    public NhanVienDiCa(String ten, String que, int cccd, int ca) {
        super(ten, que, cccd);
        this.ca = ca;
    }

    @Override
    public double tinhLoung() {
        return luongCoBan * 1.05;
    }
}

package QuanLyDiem;

public class KhoaAnh extends NamHoc2023{
    public KhoaAnh(String ten, String cccd) {
        super(ten, cccd);
    }

    @Override
    public void tinhDTB() {
        System.out.println("day la phuong thuc tinh diem trung binh cua khoa Anh");
    }
}

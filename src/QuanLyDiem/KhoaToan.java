package QuanLyDiem;

public class KhoaToan extends NamHoc2023 {

    public KhoaToan(String ten, String cccd) {
        super(ten, cccd);
    }

    //override tai dinh nghia

    @Override
    public void tinhDTB() {
        System.out.println("day la phuong thuc tinh diem trung binh cua khoa toan");
    }
}

package QuanLyDiem;

public class testDiem {
    public static void main(String[] args) {
        //khoi tao doi tuong
        KhoaToan toan1 = new KhoaToan("hoang van A", "55555");
        toan1.tinhDTB();

        KhoaAnh anh1 = new KhoaAnh("ten", "55632");
        anh1.tinhDTB();
    }
}

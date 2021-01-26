public class bai3 {
    public static void main(String[] args) {
        Double NoGoc = 100000000.0;
        double LaiNam= NoGoc*0.12;
        double LaiThang = LaiNam/12;
        Double LaiTra1Thang = NoGoc*LaiThang;
        System.out.println("Tong So Tien Phai Tra Hang Thang : "+ NoGoc/12+LaiTra1Thang);

    }
}

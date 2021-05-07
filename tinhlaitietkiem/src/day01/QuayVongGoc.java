package day01;

public class QuayVongGoc {
    public static void main(String[] args) {
        int kyHan = 2;
        int soNamGui = 9;
        double soTien = 1000;
        double laiSuat = 0;
        double tienLai = 0;

        if (kyHan > soNamGui) {
            laiSuat = 0;
        } else if (kyHan == 1) {
            laiSuat = 5.6;
        } else if (kyHan == 2) {
            laiSuat = 6.2;
        } else if (kyHan == 3) {
            laiSuat = 6.4;
        }

        int sovong = soNamGui / kyHan;
        tienLai = soTien * sovong * kyHan * laiSuat / 100;
        soTien = soTien + tienLai;

        System.out.println("Số tiền sau khi tất toán là: " + soTien + "$");
    }
}

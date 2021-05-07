package day01;

public class KhongQuayVong {
    public static void main(String[] args) {
        int kyHan = 10;
        int soNamGui = 20;
        double soTien = 1000;
        double laiSuat = 0;

        if (kyHan > soNamGui) {
            laiSuat = 0;
        } else if (kyHan == 1) {
            laiSuat = 5.6;
        } else if (kyHan == 2) {
            laiSuat = 6.2;
        } else if (kyHan == 3) {
            laiSuat = 6.4;
        }

        soTien = soTien + soTien * kyHan * laiSuat / 100;

        System.out.println("Số tiền sau khi tất toán là: " + soTien + "$");
    }
}
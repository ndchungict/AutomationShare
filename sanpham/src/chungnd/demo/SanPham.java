package chungnd.demo;

public class SanPham {
    private int maSP;
    private String tenSP;
    private int soLuong;
    private double giaBan;

    public SanPham(int maSP, String tenSP, int soLuong, double giaBan) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.giaBan = giaBan;
    }

    public double thanhTien() {
        double thanhTien = 0.0;
        if (soLuong < 20) {
            thanhTien = soLuong * giaBan;
        } else {
            thanhTien = soLuong * giaBan - soLuong * giaBan * 0.15;
        }
        return thanhTien;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "maSP=" + maSP +
                ", tenSP='" + tenSP + '\'' +
                ", soLuong=" + soLuong +
                ", giaBan=" + giaBan +
                ", thanhTien=" + thanhTien() +
                '}';
    }
}

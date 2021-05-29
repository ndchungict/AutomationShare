package chungnd.demo;

import java.util.Comparator;
import java.util.List;

public class QuanLyHoaDon {
    private List<SanPham> listSP;

    public QuanLyHoaDon(List<SanPham> listSP) {
        this.listSP = listSP;
    }

    public void xuatHD() {
        double tong = 0.0;
        for (SanPham sp : listSP) {
            System.out.println(sp);
            tong = tong + sp.thanhTien();
        }
        System.out.println("--------------------");
        System.out.println("Tong gia tri : " + tong);
    }

    public QuanLyHoaDon xepTienTangDan(){
        listSP.sort(Comparator.comparing(SanPham::thanhTien));
        return this;
    }

    public QuanLyHoaDon xepTienGiamDan(){
        listSP.sort(Comparator.comparing(SanPham::thanhTien).reversed());
        return this;
    }
}

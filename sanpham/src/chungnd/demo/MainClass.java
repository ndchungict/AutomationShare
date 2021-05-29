package chungnd.demo;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        SanPham sp1 = new SanPham(1,"Laptop",6,249);
        SanPham sp2 = new SanPham(1,"Desktop",3,413);
        SanPham sp3 = new SanPham(1,"Phone",9,150);
        SanPham sp4 = new SanPham(1,"Pen",27,5);
        SanPham sp5 = new SanPham(1,"Book",20,20);

        List<SanPham> listSP = new ArrayList<>();
        listSP.add(sp1);
        listSP.add(sp2);
        listSP.add(sp3);
        listSP.add(sp4);
        listSP.add(sp5);

        QuanLyHoaDon quanLyHoaDon = new QuanLyHoaDon(listSP);
        quanLyHoaDon.xepTienTangDan().xuatHD();
    }
}

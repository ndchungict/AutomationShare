package day01;

/**
 * kyHan: 3 option là 1 nam, 2 nam, 3 nam
 * type: hình thuc gui 3 option
 * k: Không quay vòng
 * g: quay vòng gốc
 * gl: quay vòng gốc và lãi
 */
public class TinhLaiTietKiem {
    public static void main(String[] args) {
        int kyHan = 2;
        int soNamGui = 7;
        double soTien = 1000;
        double laiSuat = 0;
        double tienLai = 0;
        String type = "gl";
//----------------------------------------------------------------------------------------------
        if (kyHan > soNamGui) {
            laiSuat = 0;
        } else if (kyHan == 1) {
            laiSuat = 5.6;
        } else if (kyHan == 2) {
            laiSuat = 6.2;
        } else if (kyHan == 3) {
            laiSuat = 6.4;
        }
//---------------------------------------------------------------------------------------------
        if (type.equalsIgnoreCase("k")){
            soTien = soTien + soTien * kyHan * laiSuat / 100;
        }else if (type.equalsIgnoreCase("g")){
            int sovong = soNamGui / kyHan;
            tienLai = soTien * sovong * kyHan * laiSuat / 100;
            soTien = soTien + tienLai;
        }else if (type.equalsIgnoreCase("gl")){
            int sovong = soNamGui / kyHan;

            for (int i = 1; i <= sovong; i++) {
                tienLai = soTien * kyHan * laiSuat/ 100;
                soTien = soTien + tienLai;
                System.out.println("Sau " + i*kyHan + " năm. Số tiền nhận được là: " + soTien + "$");
            }
        }else {
            System.out.println("Hình thức ko hợp lệ");
        }
//---------------------------------------------------------------------------------------------
        System.out.println("Số tiền cuối cùng là: " + soTien + "$");
    }
}

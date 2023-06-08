package Lab_4_4;

public class Test {
    public static void main(String[] args) {
    	HocVien Hva=new HocVienDH(null,null,0,null,0,0,0);
        HocVien Hvb=new HocVienLT(null,null,0,null,0,0,0);
        Hva.nhapThongTin();
        if("Do hoa".equals(Hva.getChuongTrinhDangKi())){
            Hva.nhaphp();
            Hva.inThongTin(); 
            Hva.hocPhi();
        }
        else if("Lap trinh".equals(Hva.getChuongTrinhDangKi())){
            Hvb.nhaphp();
            Hva.inThongTin();
            Hvb.hocPhi();}
        Hvb.nhapThongTin();
        if("Do hoa".equals(Hvb.getChuongTrinhDangKi())){
            Hvb.nhaphp();
            Hvb.inThongTin();
            Hvb.hocPhi();
        }
        else if("Lap trinh".equals(Hvb.getChuongTrinhDangKi())){
            Hva.nhaphp();
            Hvb.inThongTin();
            Hva.hocPhi();
        }
    }
}

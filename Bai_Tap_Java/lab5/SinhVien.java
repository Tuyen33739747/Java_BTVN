package lab5;
import java.util.*;

	public class SinhVien {
	    private String maSinhVien;
	    private String hoTen;
	    private String lop;

	    public SinhVien(String maSinhVien, String hoTen, String lop) {
	        this.maSinhVien = maSinhVien;
	        this.hoTen = hoTen;
	        this.lop = lop;
	    }

	    public String getMaSinhVien() {
	        return maSinhVien;
	    }

	    public String getHoTen() {
	        return hoTen;
	    }

	    public String getLop() {
	        return lop;
	    }

	    public void setMaSinhVien(String maSinhVien) {
	        this.maSinhVien = maSinhVien;
	    }

	    public void setHoTen(String hoTen) {
	        this.hoTen = hoTen;
	    }

	    public void setLop(String lop) {
	        this.lop = lop;
	    }

	    public String toString() {
	        return "Ma sinh vien: " + maSinhVien + ", Ho ten: " + hoTen + ", Lop: " + lop;
	    }

	    public static void main(String[] args) {
	        Map<String, SinhVien> danhSachSinhVien = new HashMap<String, SinhVien>();
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhap so sinh vien: ");
	        int n = scanner.nextInt();
	        scanner.nextLine();

	        for (int i = 0; i < n; i++) {
	            System.out.print("Nhap ma sinh vien: ");
	            String maSinhVien = scanner.nextLine();

	            System.out.print("Nhap ho ten: ");
	            String hoTen = scanner.nextLine();

	            System.out.print("Nhap lop: ");
	            String lop = scanner.nextLine();

	            SinhVien sv = new SinhVien(null, null, null);
	            danhSachSinhVien.put(maSinhVien, sv);
	        }

	        System.out.print("Nhap lop can tim: ");
	        String lopCanTim = scanner.nextLine();

	        System.out.println("Danh sach sinh vien thuoc lop " + lopCanTim + ":");
	        for (SinhVien sv : danhSachSinhVien.values()) {
	            if (sv.getLop().equals(lopCanTim)) {
	                System.out.println(sv);
	            }
	        }

	        System.out.print("Nhap ma sinh vien can tim: ");
	        String maSinhVienCanTim = scanner.nextLine();

	        if (danhSachSinhVien.containsKey(maSinhVienCanTim)) {
	            SinhVien svCanTim = danhSachSinhVien.get(maSinhVienCanTim);
	            System.out.println("Ho ten: " + svCanTim.getHoTen() + ", Lop: " + svCanTim.getLop());
	        } else {
	            System.out.println("Khong tim thay sinh vien");
	        }

	        scanner.close();
	    }
}

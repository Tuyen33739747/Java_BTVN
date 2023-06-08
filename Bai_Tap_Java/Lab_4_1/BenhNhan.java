package Lab_4_1;

public class BenhNhan {
    private String tienSu;
    private String chanDoan;
    private BenhVien benhVien;
	public BenhNhan(String tienSu, String chanDoan, BenhVien benhVien) {
		this.tienSu = tienSu;
		this.chanDoan = chanDoan;
		this.benhVien = benhVien;
	}
	public String getTienSu() {
		return tienSu;
	}
	public void setTienSu(String tienSu) {
		this.tienSu = tienSu;
	}
	public String getChanDoan() {
		return chanDoan;
	}
	public void setChanDoan(String chanDoan) {
		this.chanDoan = chanDoan;
	}
	public BenhVien getBenhVien() {
		return benhVien;
	}
	public void setBenhVien(BenhVien benhVien) {
		this.benhVien = benhVien;
	}
	@Override
	public String toString() {
		return "BenhNhan [tienSu=" + tienSu + ", chanDoan=" + chanDoan + ", benhVien=" + benhVien + "]";
	}
    
    
}

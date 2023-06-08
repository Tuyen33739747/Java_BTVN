package Lab_4_1;

public class BenhVien {
    private String name;
    private String diaChi;
    private String giamDoc;
	public BenhVien(String name, String diaChi, String giamDoc) {
		this.name = name;
		this.diaChi = diaChi;
		this.giamDoc = giamDoc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getGiamDoc() {
		return giamDoc;
	}
	public void setGiamDoc(String giamDoc) {
		this.giamDoc = giamDoc;
	}
	@Override
	public String toString() {
		return "BenhVien [name=" + name + ", diaChi=" + diaChi + ", giamDoc=" + giamDoc + "]";
	}
}

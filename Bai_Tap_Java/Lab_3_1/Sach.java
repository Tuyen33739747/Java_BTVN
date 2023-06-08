package Lab_3_1;

import java.util.Scanner;

public class Sach {
	private String ma , ten ,tg ;
	private int trang , tap , gia;
	private String loai, nxb;
	
	
	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}


	public String getTen() {
		return ten;
	}


	public void setTen(String ten) {
		this.ten = ten;
	}


	public String getTg() {
		return tg;
	}


	public void setTg(String tg) {
		this.tg = tg;
	}

	public int getTrang() {
		return trang;
	}


	public void setTrang(int trang) {
		this.trang = trang;
	}


	public int getTap() {
		return tap;
	}


	public void setTap(int tap) {
		this.tap = tap;
	}


	public int getGia() {
		return gia;
	}


	public void setGia(int gia) {
		this.gia = gia;
	}
    
	public String getLoai() {
		return loai;
	}


	public void setLoai(String loai) {
		this.loai = loai;
	}


	public String getNxb() {
		return nxb;
	}


	public void setNxb(String nxb) {
		this.nxb = nxb;
	}


	public void nhapSach() {
		    Scanner sc = new Scanner(System.in);
			System.out.print("Nhap ma sach : ");
			setMa(sc.nextLine());
			System.out.print("Nhap ten sach: ");
			setTen(sc.nextLine());
			System.out.print("Nhap ten tac gia: ");
			setTg(sc.nextLine());
			System.out.print("Nhap trang: ");
			setTrang(sc.nextInt());
			System.out.print("Nhap tap: ");
			setTap(sc.nextInt());
			System.out.print("Nhap gia: ");
			setGia(sc.nextInt());
			Scanner sc1 = new Scanner(System.in);
			System.out.print("Nhap loai sach: ");
			setLoai(sc1.nextLine());
			System.out.print("Nhap ten nxb: ");
			setNxb(sc1.nextLine());
	}
	
	public void inSach() {
		System.out.println("==> Ma Sach : "+getMa()+ " => Ten Sach : "+getTen()+ " => Ten tac gia : "+ 
	    getTg()+ " => So trang : "+getTrang()+ " => So tap : "+getTap() + " => Gia tien : "+getGia()+ 
	    " => Loai sach : " +getLoai()+" => Nha xuat ban : " +getNxb());
	}
}

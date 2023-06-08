package Lab_3_2;

import java.util.Scanner;

public class DuongTron extends Diem{
	private int r;

	public DuongTron(int x, int y, int r) {
		super(x, y);
		this.r = r;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	public void nhapDuongTron() {
		Scanner scn = new Scanner(System.in);
		System.out.print("Nhap toa do diem O(X,Y) : ");
		setX(scn.nextInt());
		setY(scn.nextInt());
		
		System.out.print("Nhap ban kinh R : ");
		setR(scn.nextInt());
	}
	
	public void inDuongTron() {
		System.out.println("Tam cua duong tron la : "+"("+getX()+","+getY()+")");
		System.out.println("Ban kinh cua duong tron la : "+r);
	}

	public void chuViDuongtron() {
		double cvdt = (2*r)*Math.PI;
		System.out.println("Chu vi cua duong tron la : "+cvdt);
	}
	
	public void dienTichDuongTron() {
		double dtdt = r*r*Math.PI;
		System.out.println("Dien tich cua hinh tron la : "+dtdt);
	}
}
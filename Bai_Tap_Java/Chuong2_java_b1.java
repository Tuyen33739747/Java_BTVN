package Chuong2_java_b1;

import java.util.Scanner;

public class Chuong2_java_b1 {
	float tong,hieu,tich,thuong,sodu;
    public float tinhtoan(float c,float d){
        tong=c+d;
        System.out.println("tong cua 2 so a+b= "+tong); 
        hieu=c-d;
        System.out.println("hieu cua 2 so a-b= "+hieu);
        tich=d*c;
        System.out.println("tich cua 2 so a*b= "+tich);
        thuong=(float)c/d;
        System.out.println("thuong cua 2 so a/b= "+thuong);
        sodu=c%d;
        System.out.println("so du cua 2 so a%b= "+sodu+"\n\n");
        return 0;
    }
    public float sosanh(float c,float d){
        System.out.println("toan tu so sanh bang cua "+ c+" va "+ d+" la "+(c==d));
        System.out.println("toan tu so sanh lon hon cua "+ c+" va "+ d+" la "+(c>d));
        System.out.println("toan tu so sanh lon hon hoac bang cua "+ c+" va "+ d+" la "+(c>=d));
        System.out.println("toan tu so sanh nho hon cua "+ c+" va "+ d+" la "+ (c<d));
        System.out.println("toan tu so sanh khac cua "+ c+" va "+ d+" la "+ (c!=d));
    return 0;
    }
    public static void main(String[] args) {
    	Chuong2_java_b1 Bai1=new Chuong2_java_b1();
        float a=0,b=0;
        try(Scanner nhap=new Scanner(System.in)){
        System.out.print("nhap so a : ");
        a=nhap.nextFloat();
        System.out.print("nhap so b : ");
        b=nhap.nextFloat();
        Bai1.tinhtoan(a, b);
        Bai1.sosanh(a, b);
        nhap.close();
    }}
}

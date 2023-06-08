package Chuong2_java_b1;

import java.util.Scanner;

public class Chuong2_java_b5 {
	public static void main(String[] args) {
        float tong=0,so=0;
        try(Scanner nhap=new Scanner(System.in)){
        while(tong<=100){
            System.out.print("Nhap so nguyen : ");
            so=nhap.nextFloat();
            if(so-(int)so==0){
                tong=tong+so;
                System.out.println("tong cac so nguyen hien tai la :"+tong);
            }
        }
        System.out.println("tong cac so da nhap: "+tong);
        nhap.close();
        }}
}

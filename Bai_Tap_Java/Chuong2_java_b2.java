package Chuong2_java_b1;

import java.util.Scanner;

public class Chuong2_java_b2 {
	public static void main(String[] args) {
        float songuyen=0;
        try(Scanner nhap=new Scanner(System.in)){
        do{
        System.out.print("Nhap so nguyen: ");
        songuyen=nhap.nextFloat();
        }while( songuyen-(int)songuyen!=0);
        if(songuyen%2==0){
            System.out.println(songuyen+ " la so nguyen chan");
        }
        else{
            System.out.println(songuyen+ " la so nguyen le");
        }}
                
    }
}

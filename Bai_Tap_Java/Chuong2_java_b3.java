package Chuong2_java_b1;

import java.util.Scanner;

public class Chuong2_java_b3 {
	public static void main(String[] args) {
        int namsinh=0,tuoi;
        String ten="";
        try(Scanner nhap=new Scanner(System.in)){
        System.out.print("nhap ten : ");
        ten=nhap.nextLine();
        System.out.print("nhap nam sinh");
        namsinh=nhap.nextInt();
        tuoi=2023-namsinh;
        if(tuoi<16){
            System.out.println("ban "+ten+" o do tuoi vi thanh nien");
        }
        else if(18>tuoi&& tuoi>=16){
            System.out.println("ban "+ten+" o do tuoi truong thanh");
        }
        else if(tuoi>=18){
        System.out.println("ban "+ten+" da gia!");
    }
        nhap.close();
    }}
}

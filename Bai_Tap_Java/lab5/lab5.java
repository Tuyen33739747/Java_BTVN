package lab5;

import java.util.ArrayList;
import java.util.Scanner;

public class lab5 {
    public static void main(String[] args) {
    	String n;
    	char kytu;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao so nguyen : ");
        n = scanner.nextLine();
        
        ArrayList<Character> mylist= new ArrayList<>();
        for(int i=0; i<n.length() ; i++) {
        	kytu = n.charAt(i);
        	mylist.add(kytu);
        }
        
        int count = 0;
        for (int i = 0; i < n.length(); i++) {
        	if(n.charAt(i) == n.charAt(n.length()-i-1)) {
        	}else {
        		count ++;	
        	}
        }
        if(count == 0) {
        	System.out.println("So da cho la so thuan nghich");
        }else {
        	System.out.println("So da cho khong phai la so thuan nghich");
        }
	}
}

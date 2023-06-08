package lab5;

import java.util.Scanner;
import java.util.Stack;

public class Lab5_2 {
    public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
		Stack<Integer> myStack = new Stack<Integer>();
		int n,m;
		System.out.println("Nhap so phan tu trong stack : ");
		n = scn.nextInt();
		
		for(int i=0; i<n ; i++) {
			myStack.push(scn.nextInt());
		}
		
		
		do {
			System.out.println("So luong phan tu muon lay ra khoi stack : ");
			m = scn.nextInt();
		}while(m>n);
		for(int i=0; i<m ;i++) {
			System.out.println(" "+myStack.pop());
		}
	}
}

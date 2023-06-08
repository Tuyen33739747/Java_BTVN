package lab5;

import java.util.*;

public class lab5_3 {
    public static void main(String[] args) {
		int n;
		System.out.println("Nhap n : ");
		Scanner scn = new Scanner(System.in);
		n = scn.nextInt();
		
		Queue<Integer> queue = new LinkedList<>();
		for(int i=0; i<n ; i++) {
			queue.add(scn.nextInt());
		}
		
		int m;
		do {
			System.out.println("Nhap m : ");
			m = scn.nextInt();
		}while(m>n);
		
		for(int i=0; i<m ; i++) {
			System.out.println(queue.poll());
		}
		
	}
}

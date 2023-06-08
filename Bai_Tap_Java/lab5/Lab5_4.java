package lab5;
import java.util.*;
public class Lab5_4 {
	

	public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        // Nhập mảng các số thực
	        System.out.print("Nhập mảng các số thực: ");
	        String[] input = scanner.nextLine().split(" ");
	        double[] arr = new double[input.length];
	        for (int i = 0; i < input.length; i++) {
	            arr[i] = Double.parseDouble(input[i]);
	        }
	        
	        // Dùng Set để liệt kê các phần tử xuất hiện trong mảng đúng một lần
	        Set<Double> uniqueSet = new HashSet<>();
	        Map<Double, Integer> map = new HashMap<>();
	        for (double num : arr) {
	            map.put(num, map.getOrDefault(num, 0) + 1);
	        }
	        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
	            if (entry.getValue() == 1) {
	                uniqueSet.add(entry.getKey());
	            }
	        }
	        System.out.print("Các phần tử xuất hiện đúng một lần: ");
	        for (double num : uniqueSet) {
	            System.out.print(num + " ");
	        }
	    }
	}
	
	
	
	

}

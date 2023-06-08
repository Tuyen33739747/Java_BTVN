package lab5;
import java.util.*;
public class Lab5_5 {

	

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
	        
	        // Nhập số thực A
	        System.out.print("Nhập số thực A: ");
	        double A = scanner.nextDouble();
	        
	        // Kiểm tra xem mảng có chứa số thực A hay không?
	        Set<Double> set = new HashSet<>();
	        for (double num : arr) {
	            set.add(num);
	        }
	        if (set.contains(A)) {
	            System.out.println("Mảng chứa số thực A");
	        } else {
	            System.out.println("Mảng không chứa số thực A");
	        }
	        
	        // Đưa ra các phần tử xuất hiện một lần trong dãy theo thứ tự giảm dần
	        Map<Double, Integer> map = new HashMap<>();
	        for (double num : arr) {
	            map.put(num, map.getOrDefault(num, 0) + 1);
	        }
	        Set<Double> uniqueSet = new TreeSet<>(new Comparator<Double>() {
	            @Override
	            public int compare(Double a, Double b) {
	                return b.compareTo(a);
	            }
	        });
	        for (Map.Entry<Double, Integer> entry : map.entrySet()) {
	            if (entry.getValue() == 1) {
	                uniqueSet.add(entry.getKey());
	            }
	        }
	        System.out.print("Các phần tử xuất hiện một lần trong dãy theo thứ tự giảm dần: ");
	        for (double num : uniqueSet) {
	            System.out.print(num + " ");
	        }
	    }
	}
	
		
		
}

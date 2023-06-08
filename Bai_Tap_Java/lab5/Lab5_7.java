package lab5;
import java.util.ArrayList;
public class Lab5_7 {
	public class MyArrayList {
	    public static void main(String[] args) {
	        ArrayList<Object> arrayList = new ArrayList<>();
	        arrayList.add(10); // Thêm vào ArrayList một số nguyên
	        arrayList.add(3.14); // Thêm vào ArrayList một số thực
	        arrayList.add(true); // Thêm vào ArrayList một giá trị boolean
	        arrayList.add("Hello"); // Thêm vào ArrayList một chuỗi

	        // In ra màn hình 4 giá trị trên
	        for (Object object : arrayList) {
	            System.out.println(object);
	        }
	    }
	}
	
}

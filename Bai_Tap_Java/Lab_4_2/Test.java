package Lab_4_2;

public class Test {
    public static void main(String[] args) {
		Truong a = new Truong("Dai Hoc A", "Ha Noi", "Tran Van A");
		SinhVien sv = new SinhVien("Lop 1A","Cong Nghe Thong Tin", a);
		
		System.out.println(sv.toString());
	}
}

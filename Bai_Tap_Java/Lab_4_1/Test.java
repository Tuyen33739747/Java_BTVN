package Lab_4_1;

public class Test {
    public static void main(String[] args) {
		BenhVien bv = new BenhVien("Bach Mai","Ha Noi","Peter Tèo");
        BenhNhan bn = new BenhNhan("Co giat","sap chet",bv);
		
        System.out.println(bn.toString());
	}
}

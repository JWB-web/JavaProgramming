package javajava;
class Myclass {
	String m;
	void mMethod( ) {}
	
}
public class Test03 {

	public static void main(String[] args) {
		int[] arr;
		arr = new int[3];
		int[] arr2 = new int[3];
		arr2[0] = 1;
		arr2[1] = 2;
		arr2[2] = 3;
		
		for(int inx = 0; inx < arr2.length ; inx++) {
			System.out.println(arr2[inx]);
		}
		
		
		Myclass[] arr3;
		arr3 = new Myclass[3];
		arr3[0] =new Myclass();
		arr3[1] = new Myclass();
		arr3[2] = new Myclass();
		arr3[0].m = "ȫ�浿";
		System.out.println(arr3[0].m);  
		
		
		
		
		

	}

}

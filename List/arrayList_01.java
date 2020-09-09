package List;

import java.util.ArrayList;

// 리스트(List)의 개념
public class arrayList_01 {
	public static void main(String[] args) {
		ArrayList numbers = new ArrayList();
		numbers.add(10); // List에서 요소를 추가 할땐 add 이며 괄호 안에 (값)
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		System.out.println(numbers);
		numbers.remove(2); 
		// List 에서 요소를 삭제 할땐 remove 이며  괄호 안에 (인덱스 값)
		// 빈공간이 없도록 값이 땡겨진다. 
		// ex) [10,20,30,40] numbers.remove(2); => [10,20,40]
		System.out.println(numbers);

		
		// List 에서 ArrayList 와 LinkedList로 2가지가 있다.
		// ArrayList 추가/삭제가 느림, 인덱스 조회가 빠름
		// LinkedList 추가/삭제가 빠름, 인덱스 조회가 느림
	}
}

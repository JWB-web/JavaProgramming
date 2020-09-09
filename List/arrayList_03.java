package List;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayList_03 {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);

		numbers.add(1, 50);
		// 인덱스 3번에 위치한 값 40이 인덱스 4번으로 미뤄지고
		// 순차적으로 인덱스 2번 값은 3번으로 미뤄진 다음 인덱스 1번에 50이라는 값이 들어간다 (덮어쓰기 X)
		System.out.println(numbers);
		System.out.println("-----------------------------------------");

		numbers.remove(2);
		System.out.println(numbers);
		// 인덱스 2번에 위치한 값 20 이 삭제후 값들이 빈공간을 채운다.
		System.out.println("-----------------------------------------");

		System.out.println(numbers.get(3));
		// 인덱스 3번에 값 찾기
		System.out.println("-----------------------------------------");

		Iterator it = numbers.iterator();
		while (it.hasNext()) { // 더 이상 순회할 엘리먼트가 없다면 it.hasNext() 는 false를 리턴해 while문은 종료
			int value = (int) it.next(); // it.next() 메소드는 호출될 때마다 엘리먼트를 순서대로 리턴
			if (value == 30) {
				it.remove();
			}
			System.out.println(value);
		}
		System.out.println("-----------------------------------------");

		for (int value : numbers) {
			System.out.println(value);
		}
		System.out.println("-----------------------------------------");

		for (int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}

	}

}

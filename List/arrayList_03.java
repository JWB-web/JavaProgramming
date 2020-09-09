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
		// �ε��� 3���� ��ġ�� �� 40�� �ε��� 4������ �̷�����
		// ���������� �ε��� 2�� ���� 3������ �̷��� ���� �ε��� 1���� 50�̶�� ���� ���� (����� X)
		System.out.println(numbers);
		System.out.println("-----------------------------------------");

		numbers.remove(2);
		System.out.println(numbers);
		// �ε��� 2���� ��ġ�� �� 20 �� ������ ������ ������� ä���.
		System.out.println("-----------------------------------------");

		System.out.println(numbers.get(3));
		// �ε��� 3���� �� ã��
		System.out.println("-----------------------------------------");

		Iterator it = numbers.iterator();
		while (it.hasNext()) { // �� �̻� ��ȸ�� ������Ʈ�� ���ٸ� it.hasNext() �� false�� ������ while���� ����
			int value = (int) it.next(); // it.next() �޼ҵ�� ȣ��� ������ ������Ʈ�� ������� ����
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

package List;

import java.util.ArrayList;

// ����Ʈ(List)�� ����
public class arrayList_01 {
	public static void main(String[] args) {
		ArrayList numbers = new ArrayList();
		numbers.add(10); // List���� ��Ҹ� �߰� �Ҷ� add �̸� ��ȣ �ȿ� (��)
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		System.out.println(numbers);
		numbers.remove(2); 
		// List ���� ��Ҹ� ���� �Ҷ� remove �̸�  ��ȣ �ȿ� (�ε��� ��)
		// ������� ������ ���� ��������. 
		// ex) [10,20,30,40] numbers.remove(2); => [10,20,40]
		System.out.println(numbers);

		
		// List ���� ArrayList �� LinkedList�� 2������ �ִ�.
		// ArrayList �߰�/������ ����, �ε��� ��ȸ�� ����
		// LinkedList �߰�/������ ����, �ε��� ��ȸ�� ����
	}
}

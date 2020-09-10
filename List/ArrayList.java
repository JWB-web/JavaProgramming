package List;

public class ArrayList {
	private int size = 0;
	private Object[] elementData = new Object[100];

	public boolean addLast(Object element) {
		elementData[size] = element;
		size++;
		return true;
	}
	// ������ �߰��ϱ� 1 (������ ��ġ�� �߰��ϱ�)

	public boolean add(int index, Object element) {
		for (int i = size - 1; i >= index; i--) {
			elementData[i + 1] = elementData[i];
		}
		elementData[index] = element;
		size++;
		return true;
	} // ������ �߰��ϱ� 2 (�߰� ��ġ�� �߰�����)

	public boolean addFrist(Object element) {
		return add(0, element);
	} // ������ �߰��ϱ� 3 (ù��° ��ġ�� �߰��ϱ�)

	public Object get(int index) {
		return (elementData[index]);
	} // ������ ��������

	public String toString() {
		String str = "[";
		for (int i = 0; i < size; i++) {
			str += elementData[i];
			if (i < size - 1) {
				str += ",";
			}
		}
		return str + "]";
	} // ������ Ȯ���ϱ�

	public int size() {
		return size;
	} // ���� Ȯ���ϱ�

	public int indexOf(Object element) {
		for (int i = 0; i < size; i++) {
			if (elementData[i].equals(element)) {
				return i;
			}
		}
		return -1;
	}
}

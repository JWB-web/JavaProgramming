package List;

public class ArrayList {
	private int size = 0;
	private Object[] elementData = new Object[100];

	public boolean addLast(Object element) {
		elementData[size] = element;
		size++;
		return true;
	}
	// 데이터 추가하기 1 (마지막 위치에 추가하기)

	public boolean add(int index, Object element) {
		for (int i = size - 1; i >= index; i--) {
			elementData[i + 1] = elementData[i];
		}
		elementData[index] = element;
		size++;
		return true;
	} // 데이터 추가하기 2 (중간 위치에 추가히가)

	public boolean addFrist(Object element) {
		return add(0, element);
	} // 데이터 추가하기 3 (첫번째 위치에 추가하기)

	public Object get(int index) {
		return (elementData[index]);
	} // 데이터 가져오기

	public String toString() {
		String str = "[";
		for (int i = 0; i < size; i++) {
			str += elementData[i];
			if (i < size - 1) {
				str += ",";
			}
		}
		return str + "]";
	} // 데이터 확인하기

	public int size() {
		return size;
	} // 길이 확인하기

	public int indexOf(Object element) {
		for (int i = 0; i < size; i++) {
			if (elementData[i].equals(element)) {
				return i;
			}
		}
		return -1;
	}
}

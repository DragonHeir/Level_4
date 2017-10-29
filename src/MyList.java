import javax.swing.JOptionPane;

public class MyList<t> {
	private t[] list;
	private int size = 0;

	public static void main(String[] args) {
		MyList<String> m = new MyList<String>();
		m.add("test1");
		m.add("test2");
		m.add("test3");
		// System.out.println(m.remove(1));
		for (int i = 0; i < 2; i++) {
			try {
				System.out.println(m.get(7));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	MyList() {
		list = (t[]) new Object[0];
	}

	void add(t i) {
		t[] newList = (t[]) new Object[size + 1];
		for (int j = 0; j < list.length; j++) {
			newList[j] = list[j];
		}
		size += 1;
		newList[size - 1] = i;
		list = newList;
	}

	t get(int i) throws Exception {
		if (i > size - 1) {
			throw new Exception("Number is not part of the Array!");
		}
		if (i < 0) {
			throw new Exception("Negative numbers don't work!");
		}
		return list[i];
	}

	t remove(int j) throws Exception {
		if (j > size - 1) {
			throw new Exception("Number is not part of the Array!");
		}
		if (j < 0) {
			throw new Exception("Negative numbers don't work!");
		}
		t rm = list[j];
		t[] newList = (t[]) new Object[size - 1];
		for (int i = 0; i < j; i++) {
			newList[i] = list[i];
		}
		for (int i = j + 1; i < newList.length + 1; i++) {
			newList[i - 1] = list[i];
		}
		size -= 1;
		list = newList;
		for (int i = 0; i < list.length; i++) {
			// System.out.prtln(list[i]);
		}
		return rm;
	}

	int size() {
		return size;
	}
}
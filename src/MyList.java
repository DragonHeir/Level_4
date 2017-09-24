import javax.swing.JOptionPane;

public class MyList <t> {
	private t[] list;
	private int size = 0;
public static void main(String[] args) {
MyList m = new MyList();
m.add(3);
m.add(21);
m.add(-2);
m.add(49);
m.add(3);
m.add(21);
m.add(-2);
m.add(49);
m.add(3);
m.add(21);
m.add(-2);
m.add(49);
System.out.println(m.remove(1));
for (int i = 0; i < 5; i++) {
	

System.out.println(m.remove(0));
}
}

MyList <t> (){
	list = t[0];
}

void add(int i){
	t[] newList = new t[size + 1];
	for (int j = 0; j < list.length; j++) {
		newList[j] = t[j];
	}
	size += 1;
	newList[size - 1] = i;
	list = newList;
}

int get(int i){
	if (i > size-1){
		JOptionPane.showMessageDialog(null, "Error!");
	}
	if (i < 0){
		JOptionPane.showMessageDialog(null, "Error!");
	}
	return list[i];
}

int remove(int j){
	int rm = list[j];
	int[] newList = new int[size-1];
	for (int i = 0; i < j; i++) {
		newList[i] = list[i];
	}
	for (int i = j+1; i < newList.length+1; i++) {
		newList[i-1] = list[i];
	}
	size -= 1;
	list = newList;
	for (int i = 0; i < list.length; i++) {
		//System.out.println(list[i]);
	}
	return rm;
}

int size(){
	return size;
}
}
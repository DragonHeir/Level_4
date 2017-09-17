import javax.swing.JOptionPane;

public class MyList {
	private int[] list;
	private int size = 0;
public static void main(String[] args) {
MyList m = new MyList();
m.add(3);
m.add(21);
m.add(-2);
m.add(49);
System.out.println(m.get(1));
}

MyList(){
	list = new int[0];
}

void add(int i){
	list = new int[size+1];
	list[size] = i;
	size += 1;
}

int get(int i){
	if (i > size-1){
		JOptionPane.showMessageDialog(null, "Error!");
	}
	if (i < 0){
		JOptionPane.showMessageDialog(null, "Error!");
	}
	return 0;
}

int remove(){
	return 0;
}

int size(){
	return size;
}
}
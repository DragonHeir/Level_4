import java.util.ArrayList;

public class ExceptionsPractice {
public static void main(String[] args) {
	ArrayList <String> list = new ArrayList<String>();
	list.add("dog");
	list.add("cat");
	list.add("parrot");
	list.add("fish");
	list.add("ferret");
	list.add("snake");
	try {
		new ExceptionsPractice().checkPassword("Password");
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	try {
		new ExceptionsPractice().doMath(3, 5, "add");
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	try {
		new ExceptionsPractice().print(list, 4);
	} catch (Exception e) {
		e.printStackTrace();
	}
	
	try {
		new ExceptionsPractice().printSegment(2, 2, list);
	} catch (Exception e) {
		e.printStackTrace();
	}
}

	public void checkPassword(String s) throws SecurityException {
		if (!s.equals("Password")) {
			throw new SecurityException();
		}
	}

	public int doMath(int a, int b, String o) throws UnsupportedOperationException {
		int c = 0;
		if (o.equals("add")) {
			c = a + b;
		}
		if (o.equals("subtract")) {
			c = a - b;
		}
		if (o.equals("multiply")) {
			c = a * b;
		}
		if (!o.equals("multiply") && !o.equals("add") && !o.equals("subtract")) {
			throw new UnsupportedOperationException();
		}
		return c;
	}

	public void print(ArrayList<String> l, int i) throws IndexOutOfBoundsException {
		if (i < 0 || i > l.size()) {
			throw new IndexOutOfBoundsException();
		}
		for (int j = i; j < l.size(); j++) {
			//System.out.println(l.get(j));
		}
	}

	public void printSegment(int a, int b, ArrayList <String> l) throws NumberFormatException {
		if (a > b) {
			throw new NumberFormatException();
		}
		for (int i = a; i <= b; i++) {
			System.out.println(l.get(i));
		}
	}
	
	public Vector2D normalize (float x, float y) {
		float length = (float) Math.sqrt((x*x)+(y*y));
		return null;
	}
	
	//Work in progress ^
	
	// 6. Create a class called Vector2D that has two member floats called x and y.
	// Create a method called normalize that takes in a Vector2D and returns a
	// Vector2D.
	// The method should return the normal of the vector. Throw a
	// DivideByZeroException if the
	// x and y of the passed in vector are both 0.
}
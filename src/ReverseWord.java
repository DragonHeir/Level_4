import static org.junit.Assert.*;

import org.junit.Test;

public class ReverseWord {

	@Test
	public void test() {
		assertEquals("frab", reverseMe("barf"));
	}

	private Object reverseMe(String s) {
		String t = "";
	for (int i = s.length()-1; i >= 0; i--) {
		t += s.charAt(i);
	}
	System.out.println(t);
		return t;
	}


}

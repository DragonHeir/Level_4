
public class Palindromes {

	public boolean isPalindrome(String s) {
		String t = "";
		String u = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i)!=(' ')&&s.charAt(i)!=(',')&&s.charAt(i)!=('!')&&s.charAt(i)!=('.')){
				u += s.charAt(i);				
			}
		}
		for (int i = s.length()-1; i >= 0; i--) {
			if (s.charAt(i)!=(' ')&&s.charAt(i)!=(',')&&s.charAt(i)!=('!')&&s.charAt(i)!=('.')){
				t += s.charAt(i);				
			}
		}
		if (t.equalsIgnoreCase(u)){
			return true;
		}
		return false;
	}

}

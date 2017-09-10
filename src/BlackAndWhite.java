
public class BlackAndWhite {
	public static void main(String[] args) {
		int color = 1;
		while (color >= 0) {
			if (color % 2 == 1) {
				System.out.println("Black");
			}
			if (color % 2 == 0) {
				System.out.println("White");
			}
			color++;
		}
	}
}

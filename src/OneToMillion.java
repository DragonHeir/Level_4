
public class OneToMillion {
	public static void main(String[] args) {
		int money = 1;
		int years = 1;
		while (money <= 1000000) {
			money = money * 2;
			years += 1;
		}
		System.out.println("If you started with 1 dollar, and doubled that amount each year, it would take " + years
				+ " years to get to a million dollars");
	}
}

import java.util.Scanner;

public class ArrayPosition {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

//		System.out.println("25,16,90,34,7,10");
//		System.out.println("Pick a number and Enter the number to be searched");
		int x = -9999;
		while (x < 0) {
			System.out.println("25,16,90,34,7,10");
			System.out.println("Pick a number and Enter the number to be searched");
			try {

				int output = -99999;
				do {
					x = sc.nextInt();
					output = ArrayPosition.Position(x);
				} while (output < 0);

				System.out.println(output);
				
			} catch (Exception e) {
				System.out.println("Key in Number Only");
				sc.nextLine();
			}
		}

	}

	public static int Position(int x) {
		int iVariable[] = { 25, 16, 90, 34, 7, 10 };

		for (int i = 0; i < iVariable.length; i++) {
			if (iVariable[i] == x) {
				return i;
			}

		}

		System.out.println("Please try again.");
		return -1;
	}
}
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("What size would you like the Array to be?");
		int ArraySize = scan.nextInt();

		System.out.println("enter either [Int] or [Double]");
		String ArrayType = scan.next();

		if (ArrayType.equalsIgnoreCase("Int")) {
			System.out.println("what index would you like to retrieve?");
			int index = scan.nextInt();
			int[] numbers = intArray(ArraySize);
			System.out.println(numbers[index]);
		} else if (ArrayType.equalsIgnoreCase("Double")) {
			System.out.println("what index would you like to retrieve?");
			int index = scan.nextInt();
			double[] numbers = doubleArray(ArraySize);
			System.out.println(numbers[index]);
		} else {
			System.out.println("input does not match required field.");
		}
		scan.close();
	}

	private static int[] intArray(int ArraySize) {
		int[] IntNumbers = new int[ArraySize];
        for(int i = 0; i < ArraySize; i++) {
            IntNumbers[i] = i;
        }
		return IntNumbers;
	}

	private static double[] doubleArray(int ArraySize) {
		double[] DoubleNumbers = new double[ArraySize];
        for(int i = 0; i < ArraySize; i++) {
            DoubleNumbers[i] = i;
        }
		return DoubleNumbers;
	}
}

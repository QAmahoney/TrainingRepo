
public class Digits {
	public static int CalculateNumberOfDigits(int number) {
		int digitCount = 0;
		do {
			digitCount++;
			number /= 10;
		} while (number > 0);

		return digitCount;
	}

	public static int[] GetDigits(int digits[], int numberOfDigits, int number) {
		int totalValue = 0;
		int tempValue = number;
		for (int i = numberOfDigits - 1; i >= 0; i--) {
			digits[i] = tempValue % 10;
			totalValue += digits[i];
			tempValue /= 10;
		}
		// System.out.println("");
		// System.out.println("Total Value: " + totalValue);
		return digits;
	}
}

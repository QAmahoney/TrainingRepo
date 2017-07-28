import java.util.ArrayList;
import java.util.List;

public class BinaryConverter {

	public static void main(String args[]) {

		int value = 1010;
		System.out.println("Value - " + value);

		BinaryConverter.ConvertToBinary(value);

		int numberOfDigits = Digits.CalculateNumberOfDigits(value);

		int digits[] = new int[numberOfDigits];

		digits = Digits.GetDigits(digits, numberOfDigits, value);
		BinaryConverter.ConvertToDecimal(digits);
	}

	public static void ConvertToDecimal(int[] digits) {
		List<Integer> binary = new ArrayList<Integer>();
		for (int i = digits.length - 1; i >= 0; i--) {
			if ((digits[i] != 1) && (digits[i] != 0)) {
				break;
			} else {
				binary.add(digits[i]);
			}
		}
		int bVal = 1, total = 0;
		for (int i = 0; i < binary.size(); i++, bVal *= 2) {
			total += (binary.get(i) * bVal);
		}
		System.out.println("\nDecimal from Binary - " + total);
	}

	public static void ConvertToBinary(int number) {

		List<Integer> binary = new ArrayList<Integer>();

		int remainder = number;
		while (remainder > 0) {
			binary.add(remainder % 2);
			// System.out.print(remainder%2);
			remainder /= 2;
		}

		if (binary.size() == 0)
			binary.add(0);

		for (int i = binary.size(); binary.size() % 8 != 0; i++) {
			binary.add(0);
		}
		System.out.print("Binary from Decimal - ");
		for (int i = binary.size() - 1; i >= 0; i--) {
			System.out.print(binary.get(i));
		}
	}
}

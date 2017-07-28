import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String args[]) {
		List<Character> characters = new ArrayList<Character>();
		String input = "Hello world tom is cool";
		for (int i = 0; i < input.length(); i++)
			characters.add(input.charAt(i));
		for (int i = 0; i < characters.size(); i++)
			System.out.print((int) characters.get(i) + " ");

		int numberOfWords = 1;

		numberOfWords = GetNumberOfWords(input, numberOfWords);
		System.out.println("\nWords: " + numberOfWords);

		int[] binary = new int[characters.size()];

		for (int i = 0; i < characters.size(); i++) {
			ConvertToBinary(characters.get(i));// Set this up to return decimals
												// to deal with
		}

	}

	public static void ConvertToBinary(int number) {
		List<Integer> binary = new ArrayList<Integer>();
		int remainder = number;
		while (remainder > 0) {
			binary.add(remainder % 2);
			remainder /= 2;
		}
		if (binary.size() == 0)
			binary.add(0);

		for (int i = binary.size(); binary.size() % 8 != 0; i++)
			binary.add(0);

		System.out.print("Binary from Decimal - ");

		for (int i = binary.size() - 1; i >= 0; i--)
			System.out.print(binary.get(i));

		System.out.println("");
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

	public static int GetNumberOfWords(String input, int numberOfWords)

	{
		System.out.println("");

		List<String> words = new ArrayList<String>();
		String tempWord = new String();

		for (int i = 0; i < input.length(); i++) {
			if (input.substring(i, i + 1).equals(" ")) {
				System.out.println("");
				numberOfWords++;
				words.add(tempWord);
				tempWord = "";
			} else
				tempWord += input.substring(i, i + 1);
		}
		words.add(tempWord);
		for (int i = words.size() - 1; i >= 0; i--) {
			System.out.print(words.get(i) + " ");
		}
		return numberOfWords;
	}
}

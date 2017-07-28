import java.util.ArrayList;
import java.util.List;

public class Converter {

	public static int[] StringToASCII(String input) {
		int asciiValues[] = new int[input.length()];

		for (int i = 0; i < input.length(); i++)
			asciiValues[i] = (int) input.charAt(i);
		// convert to ascii

		return asciiValues;
	}

	public static String ASCIIToBinary(int numbers[]) {

		int binaryValues[] = new int[numbers.length];
		List<Integer> binary = new ArrayList<Integer>();

		String binaryOutput = new String();
		
		// insert binary conversion code here

		for (int i = 0; i < numbers.length; i++) {
			int remainder = numbers[i];

			while (remainder > 0) {
				binaryOutput += remainder%2;
				binary.add(remainder % 2);
				// System.out.print(remainder%2);
				remainder /= 2;
			}

			if (binary.size() == 0)
			{
				binaryOutput += 0;
				binary.add(0);
			}
			
			//Add zeros to the end of movie
			
//			for (int i1 = binary.size(); binary.size() % 8 != 0; i1++) {
//				binaryOutput += 0;
//				binary.add(0);
//			}	
		}
		return binaryOutput;
	}

	public static int[] BinaryToASCII(int binaryValues[]) {
		int asciiValues[] = new int[binaryValues.length];

		return asciiValues;
		// insert binary conversion code here
	}

	public static String ASCIIToString(int numbers[]) {
		String result = new String();
		int binaryValues[] = new int[numbers.length];

		// insert binary conversion code here

		return result;
	}
}


public class Main {

	public static void main(String args[])
	{
		int ascii [] = Converter.StringToASCII("A");
		for(int i = 0; i < ascii.length; i++)
			System.out.println(ascii[i]);
		
		String binary = Converter.ASCIIToBinary(ascii);

		Out(binary);
	}
	public static void Out(int array[])
	{
		for(int i = 0; i < array.length; i++)
			System.out.println(array[i]);
	}
	public static void Out(String word)
	{
			System.out.println(word);
	}
}

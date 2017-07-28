
public class AddNumbers {
	
	public static void main (String args[])
	{
		int values[] = new int[args.length];
		int result = 0;
		
		try
		{
			for(int i = 0; i < args.length; i++)
			{
				values[i] = Integer.parseInt(args[i]);
				result+=values[i];
			}
			
			System.out.println("Result: "+ result);
		}
		catch(ArithmeticException exception)
		{
			System.out.println("ArithmeticException");
		}
		catch(NullPointerException exception)
		{
			System.out.println("NullPointerException");
		}catch(NumberFormatException exception)
		{
			System.out.println("NumberFormatException");
		}
		catch(ArrayIndexOutOfBoundsException exception)
		{
			System.out.println("ArrayIndexOutOfBoundsException");
		}
		
	}
	
}

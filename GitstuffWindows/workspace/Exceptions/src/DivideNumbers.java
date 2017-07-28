
public class DivideNumbers {

	public static void main (String args[])
	{
		float result = 0;
		float a,b;
		a=b=0;
		try
		{
			a = Float.parseFloat(args[0]);
			b = Float.parseFloat(args[1]);
				
			result = a/b;
			
			System.out.println("Result: "+ result);
		}

//		catch(ArithmeticException exception)
//		{
//			System.out.println("ArithmeticException");
//		}
//		catch(NullPointerException exception)
//		{
//			System.out.println("NullPointerException");
//		}catch(NumberFormatException exception)
//		{
//			System.out.println("NumberFormatException");
//		}
//		catch(ArrayIndexOutOfBoundsException exception)
//		{
//			System.out.println("ArrayIndexOutOfBoundsException");
//		}
		catch(Exception exception)
		{
			System.out.println(exception.getClass());
		}
		
	}
	
}

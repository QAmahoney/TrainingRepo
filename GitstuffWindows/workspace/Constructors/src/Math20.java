
public class Math20 {

	/**
	 * Adds two values and returns the result
	 * @param a - First value.
	 * @param b - Value to be added to first value.
	 * @return Value of both added.
	 */
	public static float Add(float a, float b)
	{
		return a+b;
	}
	public static float Add(float a, float b, float c)
	{
		return a+b+c;
	}
	public static float Add(float a, float b, float c, float d)
	{
		return a+b+c+d;
	}
	
	public static float Subtract(float a, float b)
	{
		return a-b;
	}
	
	public static float Divide(float a, float b)
	{
		return a/b;
	}
	
	public static float Multiply(float a, float b)
	{
		return a*b;
	}
	public static float Multiply(float a, float b, float c)
	{
		return a*b*c;
	}
	public static float Multiply(float a, float b, float c, float d)
	{
		return a*b*c*d;
	}
	
	public static void TimesTable(float a, float b)
	{
		System.out.println("Times Table for: " + a);
		for(int i=1; i <= b; i++) 
			System.out.println(a +" x "+ i + " = "+ (a*i));
			
	}
	
	
}


public class Math100 {

	public static float Divide(float a, float b) throws NewException
	{
		float c = 0;
		
		if((a==0)||(b==0))
		{
			NewException exception = new NewException();
			throw exception;
		}
		else
			c= a/b;
		return c;
	}
}

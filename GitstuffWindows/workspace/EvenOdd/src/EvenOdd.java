
public class EvenOdd {

	public static void main(String args[])
	{
		int a = 1;
		do
		{
			System.out.println(a);
			if((a%2)==0)
			{
				System.out.println("Even");	
			
				if(a>5)
					System.out.println("-");	
				else
					System.out.println("*");
			}
			else
			{
				System.out.println("Odd");	
			
				if(a>5)
					System.out.println("!");	
				else
					System.out.println("?");
			}	
			a+=1;
		}while(a<10);
	}
	
}

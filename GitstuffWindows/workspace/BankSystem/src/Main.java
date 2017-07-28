
public class Main {
	
	public static void main(String args[])
	{
		Bank lloyds = new Bank(), HSBC = new Bank();
		
		lloyds.SetDollar(2.2f);
		
		lloyds.DollarRate();
		HSBC.DollarRate();
		
		HSBC.SetDollar(1.6f);
		
		lloyds.DollarRate();
		HSBC.DollarRate();
		
	}
	

}


public class Bank {

	private static float dollar = 1.2f;
	int x;

	public void SetDollar(float newRate) {
		dollar = newRate;
	}

	public void ConvertMoney(float amount) {
		System.out.println(amount * dollar);
	}

	public void DollarRate() {
		System.out.println("Dollar: " + dollar);
	}
	
	public static void StaticFunction()
	{
	//	x = 10; << This wont work as static members cannot reference non-static members.
	}
}

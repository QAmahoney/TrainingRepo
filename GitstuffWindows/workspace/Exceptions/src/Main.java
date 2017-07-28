
public class Main {

	public static void main (String args[])
	{
		float value = 0;
		try {
			value = Math100.Divide(10,0);
		} catch (NewException e) {
			// TODO Auto-generated catch block
			System.out.println("PRINTING:-");
			//e.printStackTrace();
			System.out.println("-:DONE");
		}
		catch(Exception e){
			System.out.println("Exception Caught:-");
			//e.printStackTrace();
		}
		System.out.println("Value: " + value);
	}
}

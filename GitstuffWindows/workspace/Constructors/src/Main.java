import java.util.Scanner;

public class Main {
	public static void main (String args[])
	{
		
	//	ONS newONS = new ONS();
		
	//	ONS intONS = new ONS(1);
		
	//	ONS timesONS = new ONS(2,8);
		
		ONS ons = new ONS(1,2,3);
		
//		float answer;
//		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("Select Value 1: ");
//		int a = ValidateInput(input);
//
//		System.out.println("Select Value 2: ");
//		int b = ValidateInput(input);
//		
//		System.out.println("What to do? (1-Add, 2-Subtract, 3-Multiply, 4-Divide, 5-TimesTable(value / number)");
//		int i = ValidateInput(input);
//		switch(i)
//		{
//		case 1:
//			answer = Math20.Add(a, b);
//			System.out.println("Add: " +answer);
//			break;
//
//		case 2:
//			answer = Math20.Subtract(a, b);
//			System.out.println("Subtract: " +answer);
//			break;
//
//		case 3:
//			answer = Math20.Multiply(a, b);
//			System.out.println("Multiply: " +answer);
//			break;
//		
//		case 4:
//			answer = Math20.Divide(a, b);
//			System.out.println("Divide: " +answer);
//			break;
//			case 5:
//				Math20.TimesTable(a,b);
//				break;
//		default:
//			System.out.println("Invalid Input");
//			break;
//		}			
	}
	static int ValidateInput(Scanner scanner)
	{
		while(!scanner.hasNextInt())
		{
			System.out.println(scanner.next() +" is not a number...");
		}
		return scanner.nextInt();
	}
}


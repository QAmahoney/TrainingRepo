
public class ONS {

	int number, number2, number3, number4;

	public ONS(int i) {
		number = i;
		System.out.println("Number 1 set : " + number);
	}

	public ONS(int i, int j) {
		this(i);
		number2 = j;
		System.out.println("Number 2 set : " + number2);
	}

	public ONS(int i, int j, int k) {
		this(i, j);
		number3 = k;
		System.out.println("Number 3 set : " + number3);

		System.out.println("Numbers : " + number + " , " + number2 + " , " + number3);
	}
}

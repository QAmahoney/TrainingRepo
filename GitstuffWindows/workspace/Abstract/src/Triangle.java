
public class Triangle extends Shape {

	public Triangle(int i, char a) {
		super(i, a);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < sideLength; i++)
		{
			for(int j = 0; j < i; j++)
			{
				if((i == 0)||(i == sideLength-1))
				{
					System.out.print(symbol);
				}
				else if((j == 0)||(j == i-1))
					System.out.print(symbol);
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}

}

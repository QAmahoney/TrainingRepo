
public class Square extends Shape {

	
	public Square(int i, char a) {
		super(i, a);
	}

	@Override
	public void Draw() {
		// TODO Auto-generated method stub
		for(int i = 0; i < sideLength; i++)
		{
			for(int j = 0; j < sideLength; j++)
			{
				if((i == 0)||(i == sideLength-1))
				{
					System.out.print(symbol);
				}
				else if((j == 0)||(j == sideLength-1))
					System.out.print(symbol);
				else
					System.out.print(" ");
			}
			System.out.println("");
		}
	}
	
}

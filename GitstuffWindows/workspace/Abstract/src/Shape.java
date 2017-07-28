
abstract public class Shape {

	public int sideLength;
	public char symbol;
	
	public Shape(int i, char a)
	{
		sideLength = i;
		symbol = a;
	}
	
	abstract public void Draw();
	
}

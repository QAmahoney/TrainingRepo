
public class main {
	
	public static void main (String args[])
	{
		Math2 newMath = new Math2();
		
		Square newSquare = new Square(10, '#');		
		Triangle newTriangle = new Triangle(10, 'M');
		
		DrawShape(newTriangle);
	}
	
	public static void DrawShape(Shape shapeToDraw)
	{
		shapeToDraw.Draw();
	}
}

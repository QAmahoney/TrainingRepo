
public class Anon {

	interface InnerInterface {
		public void Message(Program var);
	}
}
class Program {
	public String word = "Goodbye";
	static public Program notHello;
	public Program()
	{
		notHello = this;
	}
	
	public static void main(String args[]) {
		notHello = new Program();
		Anon.InnerInterface hello = new Anon.InnerInterface() 
		{
			String word = "Hello";
			@Override
			public void Message(Program hello) {
				System.out.println("Word: " + hello.word);
				DisplayWord();
			}
			public void DisplayWord() {
				System.out.println("Word: " + this.word);
			}
		};
		hello.Message(notHello);
	}
}

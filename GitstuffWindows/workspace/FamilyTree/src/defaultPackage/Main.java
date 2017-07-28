package defaultPackage;

import javax.swing.text.DefaultEditorKit.DefaultKeyTypedAction;

public class Main {

	public static void main (String args[])
	{
		DefaultChildClass newChild = new DefaultChildClass();
		System.out.println("");
		DefaultParentClass newParent = new DefaultParentClass();
		System.out.println("");
		DefaultParentClass newChild2 = new DefaultChildClass(10);
	}
	
	
	
}

package constructorAndThis;

public class ThisStatement {
	
	ThisStatement()
	{
		System.out.println("No argument constructor");
	}
	ThisStatement(int i)
	{
		this();       //if u use this() statement then it should be first line of constructor statement.
	    System.out.println("single argument constructor");	
	}
	ThisStatement(double j,String i)
	{
		this(10); //using this() statement we can call another constructor of same class.
		System.out.println("double argument constructor");
	}
	public static void main(String[] args) {
	@SuppressWarnings("unused")
	ThisStatement obj1 = new ThisStatement(10.5,"Dinesh");
	
}
}
	
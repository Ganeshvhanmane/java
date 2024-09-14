package statickeyword;
class SBlock
{
	static int a=10;
	//default constructor
	SBlock()
	{
		System.out .println("I am default constructor");
	}
	//non-static block
	{
		//System.out.println("I am non-static block");
	}
	//static block
	static
	{
		System.out.println("I am static block");
	}
}
public class StaticBlockDemo 
{
	public static void main(String[] args) 
	{
		SBlock s=new SBlock();
		SBlock s1=new SBlock();
		/*static block execute only once.
		 * static block access static data only.
		 * execution sequence is-
		 * static block
		 * non-static block
		 * default constructor
		 * e.g.-can be used in database connectivity */
	}

}

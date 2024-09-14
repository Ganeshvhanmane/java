package association_finalkeyword;
final class FDemo
/*final class can be instantiated 
 * (create object of final class but it can not be inherited)*/
{
	final int x=10;//it is nothing but constant
	FDemo()
	{
		x=45;//we can not reinitialize the final data member
	}
	final void show()
	{ 
		
	}
	final void show(int x)//final member function can be overloaded
	{
		
	}
}
class demo extends FDemo
//final class cannot be extended
{
	void show()//final member function can not be overridden
	{
		
	}
}
public class FinalKeyword {

	public static void main(String[] args) {
	final FDemo f=new FDemo();//we can not reassign value of final object
	f1=new FDemo();

	}

}

package collection;
import java.util.*;
class Book
{
	int bid;
	String bname,bauth;
	float bprice;
	public Book(int bid, String bname, String bauth, float bprice) 
	{
		super();
		this.bid = bid;
		this.bname = bname;
		this.bauth = bauth;
		this.bprice = bprice;
	}
	@Override
	public String toString() 
	{
		return "Book [bid=" + bid + ", bname=" + bname + ", bauth=" + bauth + ", bprice=" + bprice + "]";
	}
}
public class GenericDemo 
{
	public static void main(String[] args) 
	{
		List<Book>l=new ArrayList<Book>();
		l.add(new Book(1,"ABC","pqr",560.60f));
		l.add(new Book(2,"CBD","prt",560.60f));
		l.add(new Book(3,"c","srt",560.60f));
		l.add(new Book(4,"Java","dsg",560.60f));
		ListIterator<Book>li=l.listIterator();
		while(li.hasNext())
		{
			Book b=li.next();
			System.out.println(b);
		}
	}

}

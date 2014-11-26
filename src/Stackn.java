import java.util.Queue;
import java.util.Stack;


public class Stackn {
	
	private Stack<String> s;
	private Queue<String> q;
	
	public Stackn()
	{
		s=new Stack<String>();
	//	q=new Queue<String>();
		
		
		
	}
	
	public static void main(String [] args)
	{
		
		Stackn n=new Stackn();
		n.s.push("sohit");
		n.s.add("mohit");
		n.s.push("rohit");
		
		
		System.out.println(n.s.pop());
	    
		//n.s.
		
		
	}

}

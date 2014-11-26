import java.util.Iterator;


public class Mycoll<T> implements Iterable<T>{

	MyLink<T> root;
	
	
	public Mycoll()
	{
		root=null;
		
	}
	
	public void add(T t)
	{
		if(root==null)
			root=new MyLink<T>(t);
		
		else
		{
			MyLink<T> temp;
			temp=root;
			while(temp.next!=null)
				temp=temp.next;
			
			temp.next=new MyLink<T>(t);
		}
		
	}
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new MyIterator<T>(root);
	}
	
	
  public static void main(String [] args)
  {
	  Mycoll<Integer> m1=new Mycoll<Integer>();
	  
	  m1.add(2);
	  m1.add(3);
	  m1.add(4);
	  m1.add(5);
	  
	  for(int a:m1)
	  {
		  System.out.println("vs" +a);
	  }
	  
	  
	  
	  
  }
}

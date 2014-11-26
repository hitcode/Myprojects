import java.util.Iterator;


public class RootLink<T extends Comparable<T>> implements Iterable<T> {

	
	Link<T> root;
	
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	public RootLink()
	{
		root=null;
	}
	
	
	public void insert(T data)
	{
		if(root==null)
			root=new Link<T>(data);
		
		else
		{
			
			Link<T> temp=new Link(data);
			temp.next=root;
			root=temp;
			
		}
		
	}
	
	public void traverse(Link<T> root)
	{
		
		Link<T> temp=root;
		while(temp!=null)
		{
			
			System.out.println(temp.d);
			temp=temp.next;
			
		}
		
		
	}
	
	
	public static void main(String [] args)
	{
		//Charsets
		RootLink<Integer> list=new RootLink<Integer>();
		
		list.insert(3);
		list.insert(131);
		list.insert(31);
		list.insert(322);
		list.insert(3222);
		
		list.traverse(list.root);
		
		
		
	}
	
}

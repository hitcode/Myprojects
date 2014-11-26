
public class Link<T extends Comparable<T>> {
	
	T d;
	Link<T> next;
	
	public Link(T t)
	{
		this.d=t;
		this.next=null;
	}
	

}

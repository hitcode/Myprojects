import java.util.Iterator;


public class MyIterator<T> implements Iterator<T> {
	
	Mycoll<T> coll;
	MyLink<T> t;

	
	public MyIterator(MyLink<T> t1)
	{
		t=t1;
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		
		if(t.next!=null)
			return true;
		else
			return false;
		
	}

	@Override
	public T next() {
		// TODO Auto-generated method stub
		
			t=t.next;
			
	
			
		
		return t.t;
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}

}

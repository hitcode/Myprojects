import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;


public class MyArrayList<E> extends AbstractList<E>
        implements List<E>, RandomAccess, Cloneable, java.io.Serializable{
	
	
	public static final long serialVersionUID=12345678;
	
	private Object [] elements;
	private int size;
	
	
	
	public void add(int index,Object element)
	{
		//Object temp=elements[index];
		
		
		
		
		for(int j=index;j<size;j++)
		{
			elements[index+1]=elements[index];
			
		}
		elements[index]=element;
		size=size+1;
		
	}
  
	public boolean add(Object o)
	{
		elements[size]=o;
		size=size+1;
		return true;
		
	}
	
	public boolean addAll(Collection c )
	{
		
		for(int i=0;i<c.size();i++)
		{
			elements[size]=c.
		}
		
		return true;
		
	}
	
	@Override
	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}

	
}

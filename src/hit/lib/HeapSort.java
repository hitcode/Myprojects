package hit.lib;

public class HeapSort{
	
	
	
	
	public static<T extends Comparable<T>> void  Heapify(T[] a)
	{
		
		int N=a.length;
		for(int i=N/2;i>=0;i--)
		{
			sink(i,a,N-1);
		}
		
		
	}
	
	public static<T extends Comparable<T>> void  sort(T[] a)
	{
		
		Heapify(a);
		int N=a.length;
		int size=N-1;
		while(size>=0)
		{
			
			exchg(a,0,size);
			size--;
			sink(0,a,size);
			
			
		}
		
	}

	private static <E extends Comparable<E> >boolean less(E a, E b) {
		// TODO Auto-generated method stub
		
		return  a.compareTo(b)<0;//if a is lees than b then return true
		//return false;
	}
	
	private static <E extends Comparable<E> > void exchg(E[] a, int i, int j) {
		// TODO Auto-generated method stub
		E swap=a[i];
		a[i]=a[j];
		a[j]=swap;
		
	}

	
	
	private static<T extends Comparable<T>> void  swim(int  i,T[] a)//move up in tree
	{
		
	//	int N=a.length;
		
		while(i>0 && less(a[i-1/2],a[i]))//parent is smaller  than child
		{
		 exchg(a,i,i-1/2);
		 i=i-1/2;
		}
		
		
		
	}
	
	private static<T extends Comparable<T>> void  sink(int  i,T[] a,int N)//move down  in tree
	{
	//	N coming here from sort is size-1 that is adjusted index so check <=N
		
		while(i<=N)
		{
		//T child1=a[2*i+1];
		//T child2=a[2*i+2];
		
		T max=a[i];
		int max_index=i;
		
		if(2*i+1<=N && less(max,a[2*i+1]))//child1 iss greater than parent
		{
		//	max=child1;
			max_index=2*i+1;
		}
		
		if(2*i+2<=N && less(max,a[2*i+2]))//child 2 is greater thean max and both
		{
			//max=child2;
			max_index=2*i+2;
		}
		
		if(max_index==i) break;// if parent is greater than child do nothing
		else
		exchg(a,i,max_index);//swap parent with greater of two child
		
		i=max_index;   // now check heap property with swapped position
		}
		
		
	}
	
	
	
	

}

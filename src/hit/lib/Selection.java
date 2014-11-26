package hit.lib;

public class Selection{
	
	
	public static <E extends Comparable<E> >void  sort(E[] a)
	{
		
		int N=a.length;
		
		for(int i=0;i<N-1;i++)
		{
			int min=i;
			for(int j=i+1;j<N;j++)
			{
				if(less(a[j],a[min]))//if a[j] is less than min then min =j 
					 	min=j;
			}
			 exchg(a,i,min);
		}
	}

	private static <E extends Comparable<E> > void exchg(E[] a, int i, int j) {
		// TODO Auto-generated method stub
		E swap=a[i];
		a[i]=a[j];
		a[j]=swap;
		
	}

	private static <E extends Comparable<E> >boolean less(E a, E b) {
		// TODO Auto-generated method stub
		
		return  a.compareTo(b)<0;//if a is lees than b then return true
		//return false;
	}
	

}

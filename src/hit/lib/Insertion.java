package hit.lib;

public class Insertion {
	
	public static <E extends Comparable<E> >void  sort(E[] a)
	{
		
		int N=a.length;
		
		for(int i=1;i<N;i++)
		{
			//int min=i;
			for(int j=i;j>0;j--)
			{
				if(less(a[j],a[j-1]))
					exchg(a,j,j-1);
				else
				break;
			}
			 
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

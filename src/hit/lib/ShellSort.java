package hit.lib;

public class ShellSort {
	
	public static <E extends Comparable<E> >void  sort(E[] a)
	{
		
		int N=a.length;
		
		int h=1;
		while(h<N/3)h=3*h+1;
		
		while(h>=1)
		{
		for(int i=h;i<N;i++)
		{
			//int min=i;
			for(int j=i;j>=h;j-=h)
			{
				if(less(a[j],a[j-h]))
					exchg(a,j,j-1);
				else
				break;
			}
			 
		}
		h=h/3;
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

package hit.lib;

import java.util.Comparator;

public class QuickSort {

	
	
   // static Comparator<T> comp;
	
	public static <E extends Comparable<E> >void  Quicksort(E[] a,int lo,int hi,Comparator<E> comp1)
	{
		
	    if(hi>lo)
	    {
	 	int p=parition(a,lo,hi,comp1);
	 	Quicksort(a,lo,p-1,comp1);
	 	Quicksort(a,p+1,hi,comp1);
	    }
	 	
	 	
	}
	public static <E extends Comparable<E> >int parition(E[] a,int lo,int hi,Comparator<E> comp1)
	{
		int pivot=lo;
		int lt=lo;
		int gt=hi+1;
		while(true)
		{
		while(less(a[++lt],a[pivot],comp1))
		{
			
			if(lt==hi)
			break;	
			
		}
		
		while(less(a[pivot],a[--gt],comp1))
		{
			
			if(gt==lo)
				break;
		}
		
		if(lt>=gt)break;
		
			exchg(a,lt,gt);
		}
		exchg(a,lo,gt);
		
		return gt;
		
		
	}
	public static <E extends Comparable<E> >void  sort(E[] a)
	{
		Quicksort(a,0,a.length-1,null);
	 	
	}
	
	public static <E extends Comparable<E> >void  sort(E[] a,Comparator<E> comp1)
	{
		
		Quicksort(a,0,a.length-1,comp1);
	 	
	}
	
	private static <E extends Comparable<E> > void exchg(E[] a, int i, int j) {
		// TODO Auto-generated method stub
		E swap=a[i];
		a[i]=a[j];
		a[j]=swap;
		
	}

	private static <E extends Comparable<E> >boolean less(E a, E b,Comparator<E> comp1) {
		// TODO Auto-generated method stub
		if(comp1==null)
		return  a.compareTo(b)<0;//if a is lees than b then return true
		//return false;
		else
		return comp1.compare(a, b)<0;
	}
}

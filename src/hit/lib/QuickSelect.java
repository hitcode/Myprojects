package hit.lib;

public final class QuickSelect {
	
	
	

	private static <E extends Comparable<E> > E kth_select(int k,E[] a,int lo,int hi)
	{
		//if(hi<lo)
		//return null;
		
		while(hi>lo)
		{
		 int p=parition(a,lo,hi);//if k=p then it is the number
		//System.out.println(p +" here ");
		if(p==k)
		
			return a[p];
			
		else if(p>k) hi=p-1;
		
		else lo=p+1;
		
		
		//p<k means pths is at right place and kth number is in p+1 and hi
		}
		
			return a[k];
	}
	
	public static <E extends Comparable<E> > E kth_number(int k,E[] a)
	{
		
		return kth_select(k-1,a,0,a.length-1);
		
			
		
		
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
	public static <E extends Comparable<E> >int parition(E[] a,int lo,int hi)
	{
		int pivot=lo;
		int lt=lo;
		int gt=hi+1;
		
		
		while(true)
		{
		while(less(a[++lt],a[pivot]))
		{
			
			if(lt==hi)
			break;	
			
		}
		
		while(less(a[pivot],a[--gt]))
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

}

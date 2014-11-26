package hit.lib;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
	
	
	
	private static <E extends Comparable<E> > void mergesort(E[] a,Comparable [] aux,int lo,int hi)
	{
		if(hi<=lo)return;
		int mid=lo+(hi-lo)/2;
		
		mergesort(a,aux,lo,mid);
		mergesort(a,aux,mid+1,hi);
		
		if(less(a[mid],a[mid+1])) return;
		merge(a,aux,lo,mid,hi);
		
		
		
		
	}
	
	//@SuppressWarnings("unchecked")
	private static  <E extends Comparable<E> > void merge(E[] a,Comparable[] aux,int lo,int mid,int hi)
	{
	  
		for(int i=lo;i<=hi;i++)
			aux[i]=a[i];
		
		int i=lo;
		int j=mid+1;
		//List l=new ArrayList<String>();
		
		//l.add("dd");
		
		for(int k=lo;k<=hi;k++)
		{
			
			
			if(i>mid)a[k]=(E) aux[j++];//if reched end of firdt array copy from 2nd
			else if(j>hi)a[k]=(E) aux[i++];
			
			else if(less(aux[i],aux[j]))a[k]=(E) aux[i++];
			else a[k]=(E) aux[j++];
		}
		
		
	}
	
	public static  <E extends Comparable<E> > void Bottomsort(E[] a)
	{
		int N=a.length;//lenght of array
		//E [] aux=new E[N];
		Comparable[] aux = new Comparable[a.length];
		
		for(int sz=1;sz<N;sz=sz+sz)
		{
			
			for(int lo=0;lo<N-sz;lo=lo+sz+sz)
			{
				merge(a,aux,lo,lo+sz-1,Math.min(lo+sz+sz-1,N-1));
			}
				
		}
			
		
	}
	
	public static <E extends Comparable<E> > void sort(E[] a)
	{
		
		
		int N=a.length;//lenght of array
		//E [] aux=new E[N];
		Comparable[] aux = new Comparable[a.length];
		mergesort(a,aux,0,N-1);
		
		
	}

	private  <E extends Comparable<E> > void exchg(E[] a, int i, int j) {
		// TODO Auto-generated method stub
		E swap=a[i];
		a[i]=a[j];
		a[j]=swap;
		
	}
	
	

	private static  <E extends Comparable<E> >boolean less(E a, E b) {
		// TODO Auto-generated method stub
		
		return  a.compareTo(b)<0;//if a is lees than b then return true
		//return false;
	}

}

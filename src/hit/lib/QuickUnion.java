package hit.lib;

public class QuickUnion{

	
	private int N;  // no of nodes 
	private int [] data; //stores parent of each node
	
	
	QuickUnion(int no_Nodes)
	{
		N=no_Nodes;
		data=new int[N];
		
		for(int i=0;i<N;i++)//initaily no parent so data[i]=i
			data[i]=i;
		
	}
	
	
	void Union(int p,int q)//parent of a is b 
	{
		
	//data[a]=data[data[a]];//compressed path //
		
		 int i = root(p);
		 int j = root(q);
		 data[i] = j;
		
	}
	
	
	int root(int a)//find root
	{
	    while(data[a]!=a)//find root of a
		{
			a=data[a];
		}
	    
	    return a;
		
	}
	
	
	boolean isConnected(int a,int b)// if a and b has same parent then connected
	{
		
		
		
		if(root(a)==root(b))//if both have same root then connected
			return true;
		
		return false;
		
	}
	
	
	
}

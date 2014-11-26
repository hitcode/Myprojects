package hit.lib;

public class QuickFind {

	private int N;  //number of nodes
	private int [] data;  //store connected component detail in array
	
	
	QuickFind(int no_Nodes)
	{
		N=no_Nodes;
		data=new int[N];
		
		for(int i=0;i<N;i++)   // intially all node are independent no nodes are connected
			data[i]=i;
	}
	
	//join two nodes in graph
	void Union(int a,int b) //node in same connected component has same index
	{	
		//data[a]=data[b];
		for(int i=0;i<N;i++)
		{
			if(data[i]==data[a]) // make it all in same connected comoponent
				data[i]=data[b];
		}
			
		
	}
	
	boolean isConnected(int a,int b)//check two nodes are connected or not
	{
		
		if(data[a]==data[b])
			return true;
		
		return false;
	}
	
	
	
	
	
}

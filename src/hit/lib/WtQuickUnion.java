package hit.lib;

public class WtQuickUnion {


	private int N;  // no of nodes 
	private int [] data; //stores parent of each node
	private int [] size;//size of the each tree rooted at ith node


	WtQuickUnion(int no_Nodes)
	{
		N=no_Nodes;
		data=new int[N];
		size=new int[N];

		for(int i=0;i<N;i++)//initaily no parent so data[i]=i
			data[i]=i;

		for(int i=0;i<N;i++)
		{
			size[i]=1;
		}



	}


	void Union(int a,int b)//parent of a is b 
	{

		//data[a]=data[data[a]];//compressed path //	

		if(root(a)==root(b))
			return;

		if(size[a]>size[b])//alawas make larger tree parent and samller tree child
		{data[b]=a;
		size[a]+=size[b];//adjsut the sixe of tree
		}
		else

		{
			data[a]=b;
			size[b]+=size[a];
		}


	}


	int root(int a)//find root
	{
		while(data[a]!=a)//find root of a
		{
			data[a]=data[data[a]];//compress the path
			a=data[a];
		}

		return a;

	}


	boolean isConnected(int a,int b)// if a and b has same parent then connected
	{



		if(root(a)==root(b))
			//if both have same root then connected
		{
			data[a]=b;
			return true;
		}


		return false;

	}


}

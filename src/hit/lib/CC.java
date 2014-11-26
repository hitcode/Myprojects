package hit.lib;

public class CC {

	
	private int [] id;
	private int count;
	private boolean[] marked;
	private int[] edgeto;
	
	public CC(Graph g)
	{
		
		id=new int[g.Vertices()];
		marked=new boolean[g.Vertices()];
		edgeto=new int[g.Vertices()];
		count=1;
		for(int i=0;i<g.Vertices();i++)
		{
			
			if(marked[i]==false)
				dfs(g,i);
			
			count++;
		}
		
	}
	
	private void dfs(Graph g, int s) {
		// TODO Auto-generated method stub
		
		
		id[s]=count;
		marked[s]=true;
		for(int k:g.adj(s))
		{
			dfs(g,k);
			edgeto[k]=s;
		}
		
	}
	
	
	public boolean isConnected(int u,int v)
	{
		return id[u]==id[v];
	}
	
	public int getCC()
	{
		return count;
		
	}
	
	
	public int getId(int v)
	{
		return id[v];
	}
}

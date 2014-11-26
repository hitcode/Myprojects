package hit.lib;

import java.util.Stack;

public class DFS {
	
	private boolean [] marked;
	private int[] edgeto;
	private int s;
	
	public  DFS(Graph g,int s)
	{
		
		
		int v=g.Vertices();
		
		marked=new boolean[v];
		edgeto=new  int [v];
		
		this.s=s;
		
		
		dfs(g,s);
	}

	public  DFS(Diagraph g,int s)
	{
		
		
		int v=g.Vertices();
		
		marked=new boolean[v];
		edgeto=new  int [v];
		
		this.s=s;
		
		
		dfs(g,s);
	}
	private void dfs(Diagraph g, int s2) {
		// TODO Auto-generated method stub
		

		marked[s]=true;
		for(int k:g.adj(s))
		{
		}
		
		
	}

	private void dfs(Graph g, int s) {
		// TODO Auto-generated method stub
		
		
		
		marked[s]=true;
		for(int k:g.adj(s))
		{

			if(!marked[k])
			{
			dfs(g,k);
			edgeto[k]=s;
			}
		}
		
	}
	
	
	public boolean pathTo(int v)
	{
		
		
		return marked[v];
	}
	
	
	public Iterable<Integer> PrintPath(int v)
	{
		Stack<Integer> path=new Stack<Integer>();
		
		if(pathTo(v))
		{
			
			for(int x=v;x!=s;x=edgeto[x])
				path.push(x);
				
			return path;
		}
		
		else
		{
			return null;
			
		}
	}

	

}

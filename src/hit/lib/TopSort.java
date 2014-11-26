package hit.lib;

import java.util.Stack;

public class TopSort {

	
	private Stack<Integer> rPost;
	private boolean [] marked;
	
	
	TopSort(Graph g)
	{
		rPost=new Stack<Integer>();
		marked=new boolean[g.Vertices()];
		
		for(int i=0;i<g.Vertices();i++)
		{
			
			if(!marked[i])dfs(g,i);
		}
	}
	
	
	private void dfs(Graph g, int s) {
		// TODO Auto-generated method stub
		
		
		
		marked[s]=true;
		for(int k:g.adj(s))
		{
			dfs(g,k);
			
		}
		
		rPost.push(s);
	}
	
	
	public Iterable<Integer>  topsort()
	{
		return rPost;
		
	}
}

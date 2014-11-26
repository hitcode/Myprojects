package hit.lib;

import java.util.LinkedList;

public class Diagraph {
	
	private final int V;
	private LinkedList<Integer>[] adj;
	
	
	
	
	public Diagraph(int V)
	{
		
		this.V=V;
		adj=   new LinkedList[V];
		for(int i=0;i<V;i++)
			adj[i]=new LinkedList<Integer>();
		
		
	}
	
	public int Vertices()
	{
		return V;
	}
	public void addEdge(int u,int w)
	{
		
		adj[u].add(w);
		
	}
	
	
	public Iterable<Integer> adj(int u)
	{
		
		return adj[u];
	}


}

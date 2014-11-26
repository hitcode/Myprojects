package hit.lib;

import java.util.LinkedList;

public class Graph {
	
	private final int V;
	private LinkedList<Integer>[] adj;
	
	
	
	
	public Graph(int V)
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
		adj[w].add(u);
	}
	
	
	public Iterable<Integer> adj(int u)
	{
		
		return adj[u];
	}

}

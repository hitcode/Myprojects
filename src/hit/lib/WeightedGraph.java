package hit.lib;

import java.util.LinkedList;

public class WeightedGraph {
	
	int V;
	LinkedList<Edge>[] edges;
	LinkedList<Edge> allEdge;
	
	
	
	public WeightedGraph(int V)
	{
		this.V=V;
		edges=new LinkedList[V];
		allEdge=new LinkedList<Edge>();
		for(int i=0;i<V;i++)
			edges[i]=new LinkedList<Edge>();
		
		
		
	}
	
	
	
	public int Vertices()
	{
		return V;
	}
	
	
	public void addEdge(Edge e)
	{
		int u=e.either();int v=e.other(u);
		
		edges[u].add(e);
		edges[v].add(e);
		allEdge.add(e);
		
		
	}
	
	public Iterable<Edge> adj(int vertex)
	{
		return edges[vertex];
	}
	
	public Iterable<Edge> edge()
	{
		return allEdge;
	}

}

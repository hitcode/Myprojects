package hit.lib;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Prims {

	
	Queue<Edge> mst;
	
	private boolean [] marked;
	PriorityQueue<Edge> minPQ;
	
	
	public Prims(WeightedGraph g)
	{
		
		mst=new LinkedList<Edge>();
		minPQ
		= new PriorityQueue<>(15);
		
		visit(g,0);
		
		while(minPQ.isEmpty())
		{
			
			Edge e=minPQ.remove();
			int u=e.either();
			int v=e.other(u);
			
			if(marked[u] && marked[v]) continue;
			mst.add(e);
			
			if(!marked[u]) visit(g,u);
			if(!marked[v]) visit(g,v);
			
		}
		
		
		
		
	}


	private void visit(WeightedGraph g, int i) {
		// TODO Auto-generated method stub
		
		
		marked[i]=true;
		for(Edge e:g.adj(i))
		{
			int u=e.either();
			int v=e.other(u);
			if(marked[v]==true ) continue;
			minPQ.add(e);
			
		}
		
		
	}
}

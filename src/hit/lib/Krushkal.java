package hit.lib;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Krushkal {
	
	Queue<Edge> mst;
	private int count;

	public Krushkal(WeightedGraph g)
	{
		mst=new LinkedList<Edge>();
		PriorityQueue<Edge> minPQ= new PriorityQueue<>(15);
		WtQuickUnion wt=new WtQuickUnion(g.Vertices());
		
		
		
		for(Edge e:g.edge()   )
			minPQ.add(e);
		
		while(minPQ.isEmpty() || count==g.Vertices()-1)
		{
			
			Edge e=minPQ.remove();
			int u=e.either();
			int v=e.other(u);
			
			if(!wt.isConnected(u, v))
			{
				wt.Union(u, v);
				mst.add(e);
				count++;
			}
			
			
			
			
			
		}
		
	}
	
	public Iterable<Edge> mst()
	{
		return mst;
	}
	
}

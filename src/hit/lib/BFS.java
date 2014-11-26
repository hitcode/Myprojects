package hit.lib;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BFS {

	private boolean [] marked;
	private int [] edgeTo;
	private int [] length;
	private int s;
	private int count=0;
	
	
	
	public BFS(Graph g,int s)
	{
		
		marked=new boolean[g.Vertices()];
		edgeTo=new int[g.Vertices()];
		length=new int[g.Vertices()];
		
		Queue<Integer> q= new LinkedList<Integer>();
		q.add(s);
	
		while(q.isEmpty())
		{
			
		int v=q.remove();	
		marked[v]=true;
		
		  for(int w:g.adj(v))
		  {
			if(!marked[w])
			{
			q.add(w);
			edgeTo[w]=v;
			length[w]=count;
			}
		  }
		
		  count ++;
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
			
			for(int x=v;x!=s;x=edgeTo[x])
				path.push(x);
				
			return path;
		}
		
		else
		{
			return null;
			
		}
	}

}

package hit.lib;

public class Edge implements Comparable<Edge>{
	
	private int u;
	private int v;
	 float wt;
	
	
	public Edge(int u,int v,int w)
	{
		this.u=u;
		this.v=v;
		this.wt=w;
	}
	
	
	public int either()
	{
		return u;
		
	}
	
	public int other(int vertex)
	{
		if(vertex==u)
		return v;
		
		else 
		return u;
	}


	@Override
	public int compareTo(Edge that) {
		// TODO Auto-generated method stub
		
		if (this.wt>that.wt) return 1;
		else if (this.wt<that.wt) return -1;
		else
		return 0;
	}

}

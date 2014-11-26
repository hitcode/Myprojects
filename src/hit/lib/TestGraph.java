package hit.lib;

public class TestGraph {

	
	
	public static void main(String [] args)
	{
		
		Graph g=new Graph(10);
		g.addEdge(1, 2);
		g.addEdge(3, 2);
		g.addEdge(4, 3);
		g.addEdge(5, 4);
		g.addEdge(6, 2);
		g.addEdge(7, 2);
		g.addEdge(8, 2);
		g.addEdge(9, 2);
		g.addEdge(0, 1);
		
		DFS d=new DFS(g,0);
		for(int a:d.PrintPath(5))
			System.out.println(a + " ");
			
		
		
		
		
	}
}


public class Ethread extends Thread{
	
	private String name;
	//Thread t;
	
	public Ethread(String name)
	{
		this.name=name;
	}
	
	@Override
	public void run()
	{
		for(int i=0;i<5;i++)
			System.out.println("Thread: " + name + ", " + i);
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void start()
	{
		//if(t==null)
		//	t=new Thread(this,name);
		
	//	t.
		
	//	t.start();
		
	}
	public static void main(String args[])
	{
	
		Ethread t1=new Ethread("sohit");
		t1.start();
		
		Ethread t2=new Ethread("haggie");
		t2.start();
		
	}

}

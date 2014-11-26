
public class MyThread implements Runnable{

	
	private Thread t;
	private String  name;
	
	public MyThread(String name)
	{
		this.name=name;
		System.out.println("Creating " +  name );
	   
		
	}
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("running " +  name );
		
		for(int i=0;i<5;i++)
			System.out.println("running " +  name + "  "+i);
		
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void start()
	{
		
		if(t==null)
			t=new Thread(this,name);
		
		t.start();
		
	}
	
	public static void main(String args[]) {
		   
	     MyThread R1 = new MyThread( "Thread-1");
	      R1.start();
	      
	      MyThread R2 = new MyThread( "Thread-2");
	      R2.start();
	   }   

}

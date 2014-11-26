
public class Fork {
	
	
	
	
	
	private boolean[] fork=new boolean[5];

	public Fork()
	{
		for(int i=0;i<5;i++)
			fork[i]=false;
	}

	public synchronized void eat(int k) 
	{
		 if(!fork[k] && !fork[((k+1)%5)])
		 {
			 try {
			
				 fork[k]=true;
				 fork[(k+1)%5]=true;
				System.out.println("Eating thread no  "  +k);
				
				Thread.sleep(100);
				
				 fork[k]=false;
				 fork[(k+1)%5]=false;
				 
				
				 notifyAll();
				 
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			 
			 
			 
		 } else{
			try {

				 System.out.println("waitng thread no  "  +k);
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 }
		
		
	}

}

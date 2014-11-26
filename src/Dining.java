
public class Dining extends Thread{
	
	
	
	
	
	private Thread t;
	private String name;
	private int id;
	Fork f;
	
	public Dining (String name,int id,Fork f)
	{
		this.name=name;
		this.id=id;
		this.f=f;
	}
	
	
	@Override
	public void run()
	{
		while(true)
		f.eat(id);
		
	}
	
	
	public void start()
	{
		if(t==null)
			t=new Thread(this,name);
		
		t.start();
		
	}
	public static void main(String [] args)
	{
		Fork f=new Fork();
		
		Dining dining1=new Dining("First",0,f);
		Dining dining2=new Dining("2nd",1,f);
		Dining dining3=new Dining("3rd",2,f);
		Dining dining4=new Dining("4th",3,f);
		Dining dining5=new Dining("5th",4,f);
		
		dining1.start();
		dining2.start();
		dining3.start();
		dining4.start();
		dining5.start();
		
		
		
		
		
		
	}
	

}

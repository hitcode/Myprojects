import java.util.regex.Matcher;
import java.util.regex.Pattern;

	
public class RegX {

	
	
	public static void main(String [] args)
	{
		
		String  reg="(([//d*.//d*|//d*]+)([+-/]? |[*]?))";
		String input="3.5*8.9";
				
				Pattern p=Pattern.compile(reg);
				Matcher m =p.matcher(input);
				
				
				while(m.find())
				{
					System.out.println(m.start()+"start");
					
				}
		
	}
	
	
	
}

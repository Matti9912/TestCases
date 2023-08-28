package Live;

import java.util.Random;

public class RandomNumber {
	
	
	public String RN()
	{
		Random r =new Random();
		int n=r.nextInt();
		String data="bharath"+n;
		return data;
		
		
	}

}

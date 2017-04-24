package MyMaven.com.mycucumberproject;

public class temp extends webconnector {

	
	
	
	
	public static void main(String[] args) {
		
		//String locator = GetObjectLocator("");  // we are searching locatore from our prop repofile using this GetObjectLocator

		String itemName = "Item : 1 : hdsdsd : doooo : 00000";
		
		String[] temp = itemName.split(":");
		
		for (int i=0; i<temp.length;i++)
		{
			System.out.println(temp[i]);
		}
		
		
		
		
		
	}

}

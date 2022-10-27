package project;
import java.util.Scanner;


public class Campaign {

	private String campId;
	private String campName;
	
	public Campaign()
	{} 
	
	public Campaign(String id, String name)
	
	{
		campId = id;
		campName = name;
	}
	
	public void setCampId(String id)
	{
		campId = id;
	}
	
	public void setCampName(Scanner name)
	{
		 System.out.print("Enter campaign name: ");
	     campName = name.nextLine();
	}
	
	public String getCampId()
	{
		return campId;
	}
	
	public String getCampName()
	{
		return campName;
	}
	public void editCampaign(Campaign c)
	{
		 @SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.print("\nWould you like to change the campaign name? (Y/N):    ");

		    char answer = input.next().charAt(0);
		 
		    if (answer == 'Y') //works
		    {
		    	Scanner input2 = new Scanner(System.in);
		    	System.out.print("Enter the new campaign name: ");
		    	 String newName = input2.nextLine();
		    	 campName = newName;
		    	 
		    	 System.out.println("The campaign name has been successfully changed to " + "'" +newName + "'");
		    }
		    else if (answer == 'N') //works2
		    {
		    	System.out.print("No alterations to the name have been applied.");
		    }
		    else 
		    {
		    	System.out.print("Invalid input. Try again."); //WORKS
		    }	 
	}
	
	public String toString()
	{
	 return "Campaign ID: " + campId + "\n Campaign name:" + campName;
}
}

package project;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner input = new Scanner(System.in);
		Scanner choice = new Scanner(System.in);
		int c = 0;
		
		Campaign campaign = new  Campaign("762391", "first campaign");
        Associate associate =new Organizer("9388844", "name", "aName", "adress", "phone", "ok@gmail.com", 8, 5000);  //poly poly
		//Associate associate2 = new Associate("999994", "name", "Associate One", "Ave street", "0403333210", "associ1@gmail.com"); 
		Participant participant = new Participant("0933329", "name", "Paricipant one", "Five street" , "033302129", "partici1@gmail.com", 7);
		Mission mission = new Mission("9442111","name", "refunds", "in progress");
		Organizer organizer = new  Organizer("9388844", "name", "aName", "adress", "0000000000", "ok@gmail.com", 8, 5000);
		Resources resource = new Resources("5555", "venue", "charity donation", "52218", "refunds", "in progress");
		
		//associate.editAssociate(associate);
		
		System.out.println(associate.toString());
		System.out.println("\n----------------------");
		System.out.println(campaign.toString());
		System.out.println("\n----------------------");
		System.out.println(participant.toString());
		System.out.println("\n----------------------");
		System.out.println(mission.toString());
		System.out.println("\n----------------------");
		System.out.println(organizer.toString());
		System.out.println("\n----------------------");
		System.out.println(resource.toString());
	}
}

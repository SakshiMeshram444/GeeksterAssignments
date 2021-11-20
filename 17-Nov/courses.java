import java.util.Scanner;
public class courses {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int year;
	String branch;
	System.out.println("Enter the name of branches :\n ECE\n CSE\n MECH");
	branch = sc.nextLine();
	System.out.println("Enter the year of study : ");
	year = sc.nextInt();
	System.out.println("\nCourses : ");
	//for 1 year all branches
	if(year == 1) {
		System.out.println("English, Maths, Science");
	}
	
		//for 2 year
	else if(year == 2) {
		switch (branch)
		{
		case "ECE" :
			System.out.println("Operating System, Java, Data Structure");
		break;
		case "CSE" :
		    System.out.println("Microprocessors, Logic Switching theory");
		break;
		case "MECH" :
		    System.out.println("Drawing, Manufacturing Machines");
		break;
		}
	}
	//for 3 year
	else if(year == 3){
		switch (branch)
	
		{
			case "ECE" :
				System.out.println("Fundamentals of Logic Design, Microelectronics");
			break;
			case "CSE" :
				System.out.println("Computer Organization, MultiMedia");
			break;
			case "MECH" :
				System.out.println("Internal Combustion Engines, Mechanical Vibration");
			break;
		}
	}
	
	//for 4 year
	else if(year == 4) {
		switch(branch)
		{
		case "ECE":
			System.out.println("Embedded System, Image Processing");
			break;
		case "CSE":
			System.out.println("Data Communication and Networks, MultiMedia");
			break;
		case "MECH":
			System.out.println("Production Technology, Thermal Engineering");
			break;
		default:	
			System.out.println("Invalid input");
		}
	}
	else
	{
		System.out.println("Enter the year of study between 1 to 4");
	}
		}
	
	
}


		
	



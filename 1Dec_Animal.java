
public class Different_Animal {
	public static void main(String[] args)
	{
		Animals dog = new Animals();
		dog.setLegs(4);
		dog.setType("Domestic");
		//Accessing values through Getters
		System.out.println("DOG");
		System.out.println("Type :"+dog.getType()+" Number of Legs :"+dog.getLegs()+" Wings :"+dog.getWings()+" Age :"+Animals.age);
		dog.isDomestic();
		
		System.out.println("TIGER");
		Animals tiger = new Animals(4,"Wild");
		tiger.display();
		tiger.isWild();
		Animals.incrementAge();
		
		System.out.println("PIGEON");
		Animals pgn = new Animals(4,"Domestic",2);
		pgn.display();
		pgn.isDomesticAnimal();
		Animals.incrementAge();

	}
	
}
class Animals
{
	//instance variables
	int legs;
	String type;
	int wings;
	//static variable
	static int age=0;
	
	//CONSTRUCTORS
	Animals()
	{
	System.out.println("ANIMALS");
	}
	Animals(int legs, String type)
	{
		//CONSTRUCTOR CHAINING
		this(4,type,0);
	}
	Animals(int legs, String type,int wings)
	{
		this.legs = legs;
		this.type = type;
		this.wings=wings;
	}
	
	//Auto generated Getters & Setters
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getWings() {
		return wings;
	}
	public void setWings(int wings) {
		this.wings = wings;
	}
	//Member Functions
	public void isDomestic()
	{
		System.out.println("It is a Domestic Animal");
	}
	public void isWild()
	{
		System.out.println("It is a Wild Animal");
	}
	public void isDomesticAnimal()
	{
		System.out.println("It is also Domestic Animal");
	}
	public void display() {
		System.out.println("Type :"+this.type+" Number of Legs :"+this.legs+" Wings :"+this.wings+" Age :"+age);
	}
	
	//Static Method 
	static void incrementAge()
	{
		age++;
		System.out.println("Incremented age :"+age);
	}
}

package Practice_Dec29;

import java.util.Scanner;

public class Class_object_constructor {
	public static void main(String[] args) {
		System.out.println("Bike");
		Vehicle bike = new Vehicle();
		bike.fuelType("Petrol");
		System.out.println();
		
		//CAR
		System.out.println("Car");
		Vehicle car = new Vehicle();
		car.setTyres(4);
		car.setType("Passesger");
		
		System.out.println("Number of tyres :" +car.getTyres());
		System.out.println("Vehicle type :" +car.getType());
		car.fuelType("Petrol/Diesel");
		System.out.println();
		
		
		//TRUCK
		System.out.println("Truck");
		Vehicle truck = new Vehicle();
		truck.setTyres (6);
		truck.setType("Goods");
		
		System.out.println("Number of tyres :" +truck.getTyres());
		System.out.println("Vehicle type :" +truck.getType());
		truck.fuelType("Diesel");
		
	}

}
class Vehicle
{
	//Instance variable
	int tyres;
	String type;
	
	//Default Constructor
	Vehicle()
	{
		this.tyres = 2;
		this.type = "Passenger";
		System.out.println("Number of tyres :" +tyres);
		System.out.println("Vehicle type :" +type);
		
	}
	
	
	//Parameterized Constructor
	 Vehicle(int tyres, String type)
		{
			this.tyres=tyres;
			this.type=type;
		}
	    
	        //Methods
	        public void fuelType(String ftype)
	        {
	    	System.out.println("Fuel Type: "+ftype);
	        }
		//Getters
		public int getTyres()
		{
			return this.tyres;
		}
		public String getType()
		{
			return this.type;
		}
		//Setters
		public void setTyres(int tyres)
		{
			this.tyres=tyres;
		}
	        public void setType(String type)
		{
			this.type=type;
}
}


// This car class extends Vehicle to include mor information about the car based on doors and passengers
public class Car extends Vehicle{
	
	// instances variables
	private int numDoors;
	private int numPassengers;
	
	// constructor that take in all the information of a car
	public Car(String theMake, String theModel, String thePlate,int theNumDoors, int theNumPassengers){
		super(theMake, theModel, thePlate);
		this.numDoors = theNumDoors;
		this.numPassengers = theNumPassengers;
	}
	
	// get method to get and return the number of doors of a car
	public int getNumDoors(){
		return this.numDoors;
	}
	
	// get method to get and return the number of passengers a car can hold
	public int getNumPassengers(){
		return this.numDoors;
	}
	
	// this method take the information of the car and returns it as a string
	@Override
	public String toString(){
		String result = "";
		result = String.format("%d-door %s %s with license %s.", this.numDoors, getMake(), getModel(), getPlate());
		return result;
	}
	
	// this method checks if two cars are equal if the have the same make, model, plate, doors, and passengers
	@Override
	public boolean equals(Object other){
		if(!(other instanceof Car)){
				return false;
		}
		
		Car otherCar = (Car) other;
		
		if(otherCar.getNumDoors() == this.numDoors && otherCar.getNumPassengers() == this.numPassengers){
			return super.equals(other);
		}
		return false;
	}
	
	// this method copy the content of the car onto another car
	public Car copy(){
		String theMake = getMake();
		String theModel = getModel();
		String thePlate = getPlate();
		int theDoors = this.numDoors;
		int thePassengers = this.numPassengers;
		
		Car result = new Car(theMake, theModel, thePlate, theDoors, thePassengers);
		return result;
	}
}
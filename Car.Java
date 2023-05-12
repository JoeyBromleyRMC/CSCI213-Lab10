<<<<<<< HEAD
public class Car extends Vehicle {
    
    private int doors;
    private int passengers;
    
    
    public Car(String make, String model, String plate, int doorNum, int passNum) {
        super(make, model, plate);
        this.doors = doorNum;
        this.passengers = passNum;
    }
    
    public int getDoors() {
        return this.doors;
    }

    public int getPassengers() {
        return this.passengers;
    }
    
    public String toString() {
		String carInfo = "";
		carInfo = String.format("%d-door %s %s with license %s", this.doors, this.make, this.model, this.plate);
		return carInfo;
	}

    @Override
    public boolean equals(Object other) {
        if(!(other instanceof Car)) {
            return false;
        }
        
        Car otherCar = (Car) other;
        
        if(this.doors == otherCar.getDoors() &&
           this.passengers == otherCar.getPassengers() &&
                super.equals(otherCar)) {
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public Car copy() {
        Car carCopy = new Car(this.getMake(), this.getModel(), this.getPlate());
        carCopy.setDoors(this.getDoors());
        carCopy.setPassengers(this.getPassengers()); 
        return carCopy;
    }
}
=======

>>>>>>> faea833ae194f53e6d2c5e0ee41a387281695d6e

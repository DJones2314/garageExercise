package garage;

public abstract class vehicle {
	
	//////////////////Attributes///////////////////////////
	protected String type;
	protected int value;
	protected int yearOfManufacture;
	protected int numberOfWheels;
	
	
	
	
	////////////////Constructors///////////////////////////
	
	public vehicle (String vType, int vValue, int vNumberOfWheels) {
		this.type = vType;
		this.value = vValue;
		this.yearOfManufacture = 0;
		}
	
	public vehicle (String vType, int vValue, int vYearOfManufacture, int vNumberOfWheels) {
		this.type = vType;
		this.value = vValue;
		this.yearOfManufacture = vYearOfManufacture;
		this.numberOfWheels = vNumberOfWheels;
	}
	
	
	
	///////////////Methods////////////////////////////////
	
	public void setyearOfManufacture(int vYearOfManufacture) {
		this.yearOfManufacture = vYearOfManufacture;
	}
	
	public abstract void accelerate();
	
	public abstract void steer();
	
	public abstract void brake();
	
	
	
	

}

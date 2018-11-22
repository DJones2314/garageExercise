package garage;

public class motorCycle extends vehicle{
	
//////////////////Attributes///////////////////////////
	String colour;
	int topSpeed;
	
	
	
	
	
////////////////Constructors///////////////////////////

    public motorCycle(String vColour, int vTopSpeed, String vType, int vValue, int vNumberOfWheels){
    	super(vType, vValue, vNumberOfWheels);
    	this.colour = vColour;
    	this.topSpeed = vTopSpeed;
	
}




///////////////Methods////////////////////////////////

public abstract void accelerate();
	
	public abstract void steer();
	
	public abstract void brake();




}

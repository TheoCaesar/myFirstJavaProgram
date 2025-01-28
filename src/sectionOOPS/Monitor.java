package sectionOOPS;

public class Monitor extends Device{
	public String brand;
	public String screenType;
	public double screenSize;
	
	@Override
	public void boot() {
		System.out.println("Powering up...");
	}
	
	@Override 
	public void shutDown() {
		System.out.println("Shutting down...");
	}
	
	@Override 
	public String toString() {
		return "";
	}
}
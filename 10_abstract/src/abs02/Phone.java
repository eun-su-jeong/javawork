package abs02;

public abstract class Phone {
	String owner;
	
	Phone(String owner) {
		this.owner = owner;
	}
	
	public abstract void turnOn();
	public abstract void turnOff();
}

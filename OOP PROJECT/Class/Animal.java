package Class;
public class Animal {
	// Animal Property
	String name;
	String color;
	boolean isMove = false;
	
	public String getName() {
		String greetingMsg = "Hello !! You are Animal Like ";
		greetingMsg+= name;
		return greetingMsg;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
}
		
package Fan;

public class Fan {
	public static int SLOW=1,MEDIUM=2,FAST=3;
	private int speed = 1; //tốc độ quạt
	private boolean isOn = false; //trạng thái quạt
	private double radius=5; //bán kính quạt
	private String color = "blue"; //màu quạt
	
	public Fan() {
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public boolean isOn() {
		return isOn;
	}
	public void setOn(boolean isOn) {
		this.isOn=false;
		if(isOn==true) this.isOn=isOn;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		if(isOn==true) {
			return this.speed+" "+this.color+" "+this.radius+" fan is on";
		}
		return this.color+" "+this.radius+" fan is off";
	}
}
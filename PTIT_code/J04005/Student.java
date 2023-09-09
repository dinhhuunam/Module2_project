package J04005;

public class Student {
	private String name,date;
	private double x,y,z;
	
	public Student(String name, String date, double x, double y, double z) {
		super();
		this.name = name;
		this.date = date;
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public void thongTin() {
		double tong=this.x+this.y+this.z;
		System.out.printf("%.1f",tong);
	}
	@Override
	public String toString() {
		return this.name + " "+ this.date+" ";
	}
}
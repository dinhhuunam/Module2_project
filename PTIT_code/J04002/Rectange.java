package J04002;

public class Rectange {
	private double x,y;
//	StringBuilder s;
	private String s;
	
	public Rectange() {
	}
	public Rectange(double x, double y, String s) {
		super();
		this.x = x;
		this.y = y;
		this.s = s;
	}
//	public StringBuilder getColor() {
//		String res=s.toString();
//		res=res.toUpperCase();
//		s=new StringBuilder(res);
//		for(int i=1;i<s.length();i++) {
//			char x=s.charAt(i);
//			x+=32;
//			s.setCharAt(i,x);
//		}
//		return this.s;
//	}
	public String getColor() {
		this.s=this.s.substring(0, 1).toUpperCase()+this.s.substring(1).toLowerCase();
		return this.s;
	}
	public int findPerimeter() {
		return (int)(2*(this.x+this.y));
	}
	public int findArea() {
		return (int)(this.x*this.y);
	}
}
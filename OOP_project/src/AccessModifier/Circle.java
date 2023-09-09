package AccessModifier;

public class Circle {
	private double r =1.0;
    private String color="red";
    public Circle(){
    }
    public Circle(double r){
        this.r =r;
    }
    protected double getRadius(){
        return this.r;
    }
    protected double getArea(){
        return Math.pow(this.r,2)*Math.PI ;
    }
    String getInfo(){
        return this.getRadius()+"-"+this.getArea()+"-"+this.color;
    }
}
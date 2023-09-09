package AccessModifier;

public class TestCircle {
	public static void main(String[] args) {
		Circle circle1 = new Circle(5);
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getInfo());
        //Trừ access modifier Private k thể truy cập, còn lại 3 mức độ còn lại
        //public, default, protected đều có thể truy cập
	}
}
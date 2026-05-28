public class Static_vari4 {
	static double pi=3.1416;
	double radius;
	Static_vari4(double radius){
	this.radius=radius;
}
void calculateArea() {
	double area=pi*radius*radius;
	System.out.println("Area "+area);
	
}
public static void main(String[] args) {
		System.out.println("Value of Pi "+Static_vari4.pi);
		Static_vari4 c1=new Static_vari4(5);
		c1.calculateArea();
	}

}

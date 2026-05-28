class Shape1 { 
    void draw() {
        System.out.println("Drawing shape");
    }
}
public class Overriding2 extends Shape1{

    void draw() { 
        System.out.println("Drawing circle");
    }
	public static void main(String[] args) {
		Overriding2 c = new Overriding2();
	        c.draw();
	    }
	} 
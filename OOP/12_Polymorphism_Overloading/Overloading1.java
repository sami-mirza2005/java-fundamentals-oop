public class Overloading1 {
	
    int add(int a, int b) {
        return a + b;
    }
    double add(double a, double b) { 
        return a + b;
    }

	public static void main(String[] args) {
		Overloading1 s = new Overloading1();
        System.out.println(s.add(5, 3));
        System.out.println(s.add(5.5, 2.6));
    }
} 
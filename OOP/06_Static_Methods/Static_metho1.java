class Calculator{
	static int cube(int x) {
		return x*x*x;
	}
	static int a;
	int b;
	static void acess() {
		a=20;
	}
}
public class Static_metho1 {
	public static void main(String[] args) {
		int result=Calculator.cube(7);
		System.out.println(result);
		
	}

}

public class Static_metho3 {
	static int a=40;
	int b=50;
	void simple_display() {
		System.out.println(a);
		System.out.println(b);
	}
static void static_display() {
	System.out.println(a);
}
	public static void main(String[] args) {
		Static_metho3 obj=new Static_metho3();
		obj.simple_display();
		static_display();
	}

}

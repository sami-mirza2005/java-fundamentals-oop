class Father {
	int wealth=100;
	void bike() {
		System.out.println("Father's Bike");
		
		
		
	}
}
class Son extends Father{
		
}
public class singleinherit1 {

	public static void main(String[] args) {
		Father f=new Father();
		System.out.println(f.wealth);
		Son s=new Son();
		System.out.println(s.wealth);
        s.bike();

	}

}

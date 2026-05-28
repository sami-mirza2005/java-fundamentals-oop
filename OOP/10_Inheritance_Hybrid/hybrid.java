class Grndf{
	int poysa=150;
	void Cycle() {
		System.out.println("G Father's cycle");
	}		
}
class Fa extends Grndf{
	int wealth=100;
	void bike() {
		System.out.println("Father's Bike");		
	}
}
class Sonn extends Fa{
		
}
class daugh extends Fa{
	
}
public class hybrid {

	public static void main(String[] args) {
		Sonn s=new Sonn();
		System.out.println(s.poysa);
        s.bike();
		daugh t=new daugh();
		System.out.println(t.wealth);
        s.Cycle();
	}

}

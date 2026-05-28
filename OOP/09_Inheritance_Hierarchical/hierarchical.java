class Fater {
	int wealth=100;
	void bike() {
		System.out.println("Father's Bike");		
	}
}
class Sn extends Fater{
	
}
class dr extends Fater{
	
}
public class hierarchical {

	public static void main(String[] args) {
		Sn s=new Sn();
		System.out.println(s.wealth);
        s.bike();
		dr d=new dr();
		System.out.println(d.wealth);
       

	}

}
class Grandf{
	int poysa=150;
	void Cycle() {
		System.out.println("GF Father's Bike");
	}
	
		
}
class Fathe extends Grandf{
	int wealth=100;
	void bike() {
		System.out.println("Father's Bike");
		
		
		
	}
}
class So extends Fathe{
		
}
public class multilevel1 {

	public static void main(String[] args) {
		
		
		Fathe f=new Fathe();
		System.out.println(f.wealth);
		So s=new So();
		System.out.println(s.wealth);
		System.out.println(s.poysa);
        s.bike();

	}

}

class jami{
	void funnyname() {
		System.out.println("Smoothy boy");
	}
}
class akib{
	void serious() {
		System.out.println("Hujur boy");
	}
}
class sami extends jami,akib{
	
}
public class multiple2 {

	public static void main(String[] args) {
		sami obj=new sami();
		obj.funnyname();

	}

}

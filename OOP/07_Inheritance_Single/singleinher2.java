class Mother {
	int wealth=100;
	void saree() {
		System.out.println("saree");
		
		
		
	}
}
class daughter extends Mother{
		
}
public class singleinher2 {

	public static void main(String[] args) {
		Mother f=new Mother();
		System.out.println(f.wealth);
		daughter s=new daughter();
		System.out.println(s.wealth);
        s.saree();

	}

}
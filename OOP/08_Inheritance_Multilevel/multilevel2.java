class  character{
	void health() {
		System.out.println("has 100 hp left");
	}
}
class warrior extends character{
	void attack() {
		System.out.println("has a sword");
	}
}
class special_warrior extends warrior{
	void fire() {
		System.out.println("can fire attack");
	}
}
public class multilevel2 {

	public static void main(String[] args) {
		special_warrior obj=new special_warrior();
		obj.health();
		obj.attack();
		obj.fire();		
	}

}

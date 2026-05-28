class Human{
	Human(){
//		System.out.println("Inside human constructor");
//		show();
		}
	void show() {
		System.out.println("Show method of  human");
	}
}
class Stdent extends Human{
	int a;
	Stdent(){
		this.a=7;
		show();
		
//		super();
//		System.out.println("Inside student constructor");
	} 
	void show() {
		System.out.println(a);
	}
} 
public class DeepDiveIntoPolymorphism {

	public static void main(String[] args) {
		Stdent s1=new Stdent();
//		s1.show();
//		Human h1=new Human();

	}
}


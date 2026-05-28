class Stdnt2{
	int rollno;
	String name;
	static String college="LU";
	static void change() {
		college="MU";
	}
	Stdnt2(int r,String n){
		rollno = r;
		name=n;
	}
void display() {
	System.out.println(rollno+" "+name+" "+college);
}
}
public class Static_metho2 {

	public static void main(String[] args) {
		Stdnt2.change();
		Stdnt2 s1=new Stdnt2(372,"Sami");
		Stdnt2 s2=new Stdnt2(37,"Y");
		s1.display();
		s2.display();
	}

}

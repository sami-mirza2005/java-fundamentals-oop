class Employee{
	static int nextid=1;
	int id;
	String name;
	Employee(String name){
		this.name=name;
		id=nextid;
		nextid++;
	}
	void display() {
		System.out.println(id+" "+name);
	}
}
public class Static_vari3 {

	public static void main(String[] args) {
		Employee e1=new Employee("Asha");
		Employee e2=new Employee("Sakib");
        e1.display();   
        e2.display();
	}
}  

class Student{
	
	String Name;
	char section;
	int id;
	
	void set(String a,char b,int c)
	{
		Name=a;
		section=b;
		id=c;
	} 
	void display()
	{
		System.out.println("Name: "+Name);
		System.out.println("section: "+section);
		System.out.println("id: "+id);
	}
	
}
public class Method01 {

	public static void main(String[] args) {
		Student ob1=new Student();
		Student ob2=new Student();
		ob1.set("MD. Abdullah Al Sami Mirza",'I',372);
		ob2.set("Yousuf",'g',310);
		
ob1.display();
ob2.display();
	}

}

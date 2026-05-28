class Studentinfo{
	
	String Name;
	char section;
	int id;
	
	Studentinfo(String a,char b,int c)
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
public class Constructor {

	public static void main(String[] args) {
		Studentinfo ob1=new Studentinfo("MD. Abdullah Al Sami Mirza",'I',372);
		Studentinfo ob2=new Studentinfo("Yousuf",'g',310);
		
ob1.display();
ob2.display();
	}

}

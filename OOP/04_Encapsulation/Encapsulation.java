class student2{ 
	int id;
	String name;
	private String address;
	String username;
	String password;
	student2(int id,String name,String address){
		this.id=id;
		this.name=name;
		this.address=address;
	}
//	public String getAddress(String u_name,String pass){
//		if(this.username==u_name && this.password==pass) {	
//		 System.out.println(address);
//          return this.address;
//	 }
//		return "You are not you!";
//	}
	public void changePassword(String old_p,String new_p) {
		if(this.password==old_p) {
			this.password=new_p;
			System.out.println("successfully changed");
		}
		else {
			System.out.println("YOU MUST HAVE TO BE YOU");
		}
	}
//	public void setAddress(String s1){
//		this.address=s1;
//	}
}
public class Encapsulation {

	public static void main(String[] args) {
//		student2 st1=new student2(001,"Sami","SYL1"); 
//        String add=st1.address;
//		String add=st1.getAddress();
//		 System.out.println(add );
//		 st1.setAddress("Sylhet");
//		 add=st1.getAddress();
//		 System.out.println(add );
//		String ss=st1.getAddress("Xam", "xam123");
		//System.out.println(ss);
	    //ss=st1.getAddress(null, null);
		//System.out.println(ss);
		
		student2 st2=new student2(002,"Jami","SYL2");
		st2.changePassword("123","XAR123");
		st2.changePassword(null,"XAR123");
		st2.changePassword(null,"XAR123");
		
	}

}

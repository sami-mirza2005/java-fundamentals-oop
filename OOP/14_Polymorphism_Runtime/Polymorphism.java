class Iphone{
	void camera() {
		System.out.println("IPhone. I have various camera.");
	}	
}
class Iphone10 extends Iphone{
//	void camera() {
//		System.out.println("IPhone10. I have two camera.");
//	}	
}
class Iphone17 extends Iphone{
	void camera() {
		System.out.println("IPhone17. I have 3 camera.");
	}
	void dualVideoRecording() {
		System.out.println("IPhone17. I have dual video recording feature.");
	}
}
public class Polymorphism {
	static void cameraAccess(Iphone i) {
		i.camera();
	}
	
	public static void main(String[] args) {
//		 Iphone iphone =new Iphone10();//typecasting  , Upcasting
//		 //runtime polymorphism //Dynamic method Dispatch
//		 iphone.camera();
		
//		Iphone iphone =new Iphone17();
//		((Iphone17)iphone).dualVideoRecording(); //Downcasting 
		
		cameraAccess(new Iphone10());
		
     }
}

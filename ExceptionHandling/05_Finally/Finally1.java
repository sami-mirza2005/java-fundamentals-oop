
public class Finally1 {

	public static void main(String[] args) {
		try {
			int x=10/0;
			System.out.println(x);
		}
		catch(Exception p){
			System.out.println("There is an error");	
		}
		finally {
			System.out.println("Will always run");
		}

	}

}

public class Finally2 {

	public static void main(String[] args) {
		try {
			String a="abc";
			int m=Integer.parseInt(a);
		}
		catch(NumberFormatException p){
			System.out.println(p);	
		}
		finally {
			System.out.println("Will always run");
			System.out.println("Will always run 2");
		}

	}

}


public class StringIndexOutOfBoundsException1 {

	public static void main(String[] args) {
		try {
			String s="Mony";
			System.out.println(s.charAt(9));
			}
		catch(StringIndexOutOfBoundsException e){
			System.out.println(e);
		}
		System.out.println("Hello");

	}

}
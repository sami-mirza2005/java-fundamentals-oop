
public class NullPointerException1 {

	public static void main(String[] args) {
		try {
			String s=null;
			System.out.println(s.charAt(9));
			}
		catch(NullPointerException e){
			System.out.println(e);
		}

	}

}

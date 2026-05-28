
public class NumberFormatException1 {

	public static void main(String[] args) {
		try {
			String s="abc";
			int num=Integer.parseInt(s);
			}
		catch(NumberFormatException e){
			System.out.println(e);
		}

	}

}
import java.util.Scanner;
public class practise {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String x = s.nextLine();
		for(int i=0;i<x.length();i++) {
			if(x.charAt(i)=='3' || x.charAt(i)==' ') {
				continue;
			}
			System.out.print(x.charAt(i)+" ");
		}
		
		
	}
}

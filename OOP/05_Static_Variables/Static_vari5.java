public class Static_vari5 {
	String title;
	static int totalBooks;
	Static_vari5(String t){
		title=t;
		totalBooks++;
	}
	void display() {
		System.out.println("Book Title: "+title);
	}
	static void showTotalBooks() {	
		System.out.println("Total Books: "+totalBooks);
	}
	public static void main(String[] args) {
		Static_vari5 b1=new Static_vari5("Java Basics");
		Static_vari5 b2=new Static_vari5("Data Structures");
		b1.display();
		b2.display();
		Static_vari5.showTotalBooks();
	}

}

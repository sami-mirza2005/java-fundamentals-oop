interface Printable {
    void print();
}

class Printer implements Printable {
    public void print() {
        System.out.println("Hello");
    }
}
public class Interface1 {

	public static void main(String[] args) {
        Printable p = new Printer();
        p.print();
    }
}

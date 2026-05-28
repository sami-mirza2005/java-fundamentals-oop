public class Overloading2{
    void show(String name) {
        System.out.println("Name: " + name);
    }
    void show(int age) {  
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
    	Overloading2 p = new Overloading2();
        p.show("Sami");
        p.show(20);
    }
}
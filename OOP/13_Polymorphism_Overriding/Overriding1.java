class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}
public class  Overriding1 extends Animal{
    void sound() { 
        System.out.println("Cat meows");
    }
    public static void main(String[] args) {
    	Overriding1 c = new Overriding1();
        c.sound();
    }
}
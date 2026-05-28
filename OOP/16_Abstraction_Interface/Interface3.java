interface SmartDevice {
    void turnOn();
    void turnOff();
}

class Fan implements SmartDevice {
    public void turnOn() {
        System.out.println("Fan is ON");
    }
    public void turnOff() {
        System.out.println("Fan is off");
    }
}

class Light implements SmartDevice {
    public void turnOn() {
        System.out.println("Light is ON");
    }
    public void turnOff() {
        System.out.println("Light is off");
    }
}
public class Interface3 {

	public static void main(String[] args) {
        SmartDevice d1 = new Fan();
        d1.turnOn();
        d1.turnOff();

        SmartDevice d2 = new Light();
        d2.turnOn();
        d2.turnOff();
    }
}

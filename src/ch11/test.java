package ch11;

class Car {
    @Override
    public String toString() {
        return "Car";
    }
}

class Ambulance extends Car {
    @Override
    public String toString() {
        return "구급차";
    }

    void sound() {
        System.out.println("삐용삐용");
    }
}

public class test {
    public static void main(String[] args) {
        Car c = new Car();
        Ambulance a = (Ambulance) c;
        a.sound();
    }

}

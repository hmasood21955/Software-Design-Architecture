package WithoutPrinciple;
class Car {
    public void move() {
        System.out.println("Car is driving on the road.");
    }
}

class Bike {
    public void move() {
        System.out.println("Bike is pedaling on the street.");
    }
}

class Plane {
    public void move() {
        System.out.println("Plane is flying in the sky.");
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        Bike myBike = new Bike();
        Plane myPlane = new Plane();

        // Calling move() for each vehicle individually
        myCar.move();   // Output: Car is driving on the road.
        myBike.move();  // Output: Bike is pedaling on the street.
        myPlane.move(); // Output: Plane is flying in the sky.
    }
}

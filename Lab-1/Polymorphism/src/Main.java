class Vehicle {
    public void move() {
        System.out.println("This vehicle is moving.");
    }
}

class Car extends Vehicle {
    @Override
    public void move() {
        System.out.println("Car is driving on the road.");
    }
}

class Bike extends Vehicle {
    @Override
    public void move() {
        System.out.println("Bike is pedaling on the street.");
    }
}

class Plane extends Vehicle {
    @Override
    public void move() {
        System.out.println("Plane is flying in the sky.");
    }
}
public class Main {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        Vehicle myBike = new Bike();
        Vehicle myPlane = new Plane();

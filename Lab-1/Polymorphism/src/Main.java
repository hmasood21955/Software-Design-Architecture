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

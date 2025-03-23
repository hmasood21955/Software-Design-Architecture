package observer.basicobserverpattern;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        BinaryObserver binaryObserver = new BinaryObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);
        HexaObserver hexaObserver = new HexaObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);  

        System.out.println("\nDetach HexaObserver...");
        subject.detach(hexaObserver);

        System.out.println("\nSecond state change: 10");
        subject.setState(10);
    }
}
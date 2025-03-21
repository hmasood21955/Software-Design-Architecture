package observer.basicobserverpattern;

public class ObserverPatternDemo {
    public static void main(String[] args) {
       // ✅ Create and attach observers
       Subject subject = new Subject();  // ✅ Created the subject

       // ✅ Create and attach observers
       BinaryObserver binaryObserver = new BinaryObserver(subject);
       OctalObserver octalObserver = new OctalObserver(subject);
       HexaObserver hexaObserver = new HexaObserver(subject);

       // ✅ First update
       System.out.println("First state change: 15");
       subject.setState(15);  

       // ✅ Detach octalObserver instance (not class)
       System.out.println("\nDetach HexaObserver...");
       subject.detach(hexaObserver);

       // ✅ Second update (only BinaryObserver and HexaObserver are left)
       System.out.println("\nSecond state change: 10");
       subject.setState(10);
    }
 }
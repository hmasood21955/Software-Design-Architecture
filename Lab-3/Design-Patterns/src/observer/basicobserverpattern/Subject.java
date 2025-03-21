package observer.basicobserverpattern;
import java.util.ArrayList;
import java.util.List;

import observer.basicobserverpattern.Observer;

public class Subject {
	
   private List<Observer> observers = new ArrayList<Observer>();
   private int state;

   public int getState() {
      return state;
   }

   public void setState(int state) {
      this.state = state;
      notifyAllObservers();
   }

   public void attach(Observer observer){
      observers.add(observer);		
   }

    // ✅ ADD THIS DETACH METHOD
    public void detach(Observer observer) {
        observers.remove(observer);
    }

   public void notifyAllObservers(){
      for (Observer observer : observers) {
         observer.update();
      }
   } 	
}

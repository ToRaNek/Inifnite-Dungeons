package src.test.java;
import src.main.java.EventsRandom;
public class TestEventsRandom {
    public static void main(String[] args){
        for (int i = 0; i <40;i++){
            EventsRandom eventsRandom = new EventsRandom();
            System.out.println(eventsRandom.getEvent());    
        }
        
    }
}

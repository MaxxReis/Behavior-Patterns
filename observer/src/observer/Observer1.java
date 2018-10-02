package observer;

import interfaces.IObserver;
import interfaces.Subject;

public class Observer1 implements IObserver{
    private String state;
    
    @Override
    public void Update(Subject subject) {
        try {
            state = subject.getState();
            System.out.println("Observer 1: " + state);
        } catch (Exception ex) {
            System.err.println("Fail to get subject state: " + ex.getMessage());
        }
    }
}
package subject;

import interfaces.IObserver;
import interfaces.Subject;

public class Professor extends Subject{
    private String subjectState;
    
    @Override
    public String getState() {
        return subjectState;
    }
    
    @Override
    public void setState(String state) {
        subjectState = state;
//        notifyObserver(this.getState());
    }
    
    @Override
    public void update() {
        
    }
}

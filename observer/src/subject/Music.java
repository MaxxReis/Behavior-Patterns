package subject;

import interfaces.Subject;

public class Music extends Subject{
    private String subjectState;
    
    @Override
    public String getState() {
        return subjectState;
    }
    
    @Override
    public void setState(String state) {
        subjectState = state;
        notifyObserver("Music");
    }
}

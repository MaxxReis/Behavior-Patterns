package subject;

import interfaces.Subject;

public class Categoria extends Subject{
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
        System.out.println("Update: "+ this.getState());;
    }

}

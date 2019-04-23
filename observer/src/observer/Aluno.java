package observer;

import interfaces.IObserver;
import interfaces.Subject;

public class Aluno implements IObserver{
//    private String state;
    
    @Override
    public void update(Subject subject) {
        try {
            System.out.println("Aluno: " + subject.getState());
        } catch (Exception ex) {
            System.err.println("Fail to get subject state: " + ex.getMessage());
        }
    }
}

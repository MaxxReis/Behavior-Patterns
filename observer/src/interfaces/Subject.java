package interfaces;

import java.util.HashMap;
import java.util.List;

public class Subject {
    private HashMap<String, List <IObserver>> subjectList;
    
    public Subject() {
        subjectList = new HashMap<String, List <IObserver>>();
    }
    
    public void addSubject(String category, List<IObserver> observers) {
        subjectList.put(category, observers);
    }
    
    public void removeSubject(String category, List<IObserver> observers) {
        subjectList.remove(category, observers);
    }
    
    public void notifyObserver(String category) {
        subjectList.forEach((key, value) -> {
            if(key.equals(category)) {
                List<IObserver> observers = value;
                for(IObserver observer : observers) {
                    observer.Update(this);
                }
            }
        });
    }
    
    public String getState() throws Exception {
        throw new Exception("Method not supported");
    }
    
    public void setState(String state) throws Exception {
        throw new Exception("Method not supported");
    }
    
    public void newDungeon() throws Exception {
        throw new Exception("Method not supported");
    }
}

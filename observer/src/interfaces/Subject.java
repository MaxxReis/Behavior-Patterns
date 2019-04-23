package interfaces;

import java.util.HashMap;
import java.util.List;

public abstract class Subject {
    protected HashMap<String, List <IObserver>> subjectList;
    
    public Subject() {
        subjectList = new HashMap<>();
    }
    
    public void addSubject(String category, List<IObserver> observers) {
        subjectList.put(category, observers);
    }
    
    public void removeSubject(String category, List<IObserver> observers) {
        subjectList.remove(category, observers);
    }
    
    public abstract void update();
    
    
    public void notifyObserver(String category) {
        for(IObserver observer : subjectList.get(category))
            observer.update(this);
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

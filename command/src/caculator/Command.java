package caculator;

import interfaces.ICommand;
import java.util.Stack;

public class Command implements ICommand{
    private final Calculator calulator;
    private double value = 0;
    private double oldValue;
    private int size;
    
    private Stack<Double> statcks;
    private Stack<Double> undo;
    private Stack<Double> redo;
    
    private int posUndo;
    private int posRedo;
    
    public Command(){
        calulator = new Calculator();
        statcks = new Stack<>();
        undo = new Stack<>();
        redo = new Stack<>();
    }

    public double sum(double a) {
        if(this.statcks.isEmpty()){
            this.value = this.calulator.sum(this.value, a);
            this.statcks.add(this.value);
            size = this.statcks.size();
        } else {
            this.oldValue = this.value;
            this.value = this.calulator.sum(this.value, a);
            this.statcks.add(this.value);
            size = this.statcks.size();
            this.undo.add(this.oldValue);
            posUndo = this.undo.size();
            this.redo.add(this.value);
            posRedo = this.redo.size();
        }
        return this.statcks.get(size - 1);
    }

    public double sub(double a) {
        if(this.statcks.isEmpty()){
            this.calulator.sub(this.value, a);
            this.statcks.add(this.calulator.getValue());
            size = this.statcks.size();
            this.value = this.calulator.getValue();
        } else {
            this.oldValue = this.value;
            this.value = this.calulator.sub(this.value, a);
            this.statcks.add(this.value);
            size = this.statcks.size();
            this.undo.add(this.oldValue);
            posUndo = this.undo.size();
            this.redo.add(this.value);
            posRedo = this.redo.size();
        }
        return this.statcks.get(size - 1);
    }
    
    @Override
    public double undo() {
        this.goBack();
        return this.undo.get(posUndo);
    }

    @Override
    public double redo() {
        //this.goFoward();
        this.statcks.setSize(size - 1);
        return this.redo.get(posRedo - 1);
    }
    
    public void goBack(){
        if(this.posUndo > 0){
            this.posUndo--;
            this.posRedo--;
        }
    }
    
    /*
    public void goFoward(){
        if(this.posUndo < this.statcks.size()){
            this.posUndo++;
            this.posRedo++;
        }
    }*/
}

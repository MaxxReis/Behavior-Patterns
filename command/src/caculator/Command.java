package caculator;

import interfaces.ICommand;
import java.util.Stack;

public class Command implements ICommand{
    private final Calculator calulator;
    private double value = 0;
    private double oldValue;
    
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
    
    public boolean isEmpty(Stack<Double> stack){
        if(stack.isEmpty())
            return true;
        return false;
    }
    
    public double sum(double a, double b) {
        if(isEmpty(this.statcks)){
            this.calulator.sum(a, b);
            this.statcks.add(this.calulator.getValue());
            this.value = this.calulator.getValue();
        } else {
            this.oldValue = this.value;
            this.calulator.sum(a, b);
            this.statcks.add(this.calulator.getValue());
            this.value = this.calulator.getValue();
            this.undo.add(this.oldValue);
            posUndo = this.undo.size();
            this.redo.add(this.value);
            posRedo = this.redo.size();
        }
        return this.calulator.getValue();
    }

    public double sub(double a, double b) {
        if(this.statcks.size() < 1){
            this.calulator.sub(a, b);
            this.statcks.add(this.calulator.getValue());
            this.value = this.calulator.getValue();
        } else {
            this.oldValue = this.value;
            this.calulator.sub(a, b);
            this.statcks.add(this.calulator.getValue());
            this.value = this.calulator.getValue();
            this.undo.add(this.oldValue);
            posUndo = this.undo.size();
            this.redo.add(this.value);
            posRedo = this.redo.size();
        }
        return this.calulator.getValue();
    }
    
    @Override
    public double undo() {
        this.goBack();
        return this.undo.get(posUndo);
    }

    @Override
    public double redo() {
        this.goFoward();
        return this.redo.get(posRedo - 1);
    }
    
    public void goBack(){
        if(this.posUndo > 0){
            this.posUndo--;
            this.posRedo--;
        }
    }
    
    public void goFoward(){
        if(this.posUndo < this.statcks.size()){
            this.posUndo++;
            this.posRedo++;
        }
    }
    
    @Override
    public void show(){
        int size = this.statcks.size();
        for (int i = 0; i < size; ++i) {//++i otimiza a incrementação
            System.out.println("--> " + this.statcks.get(i));
        }
    }
    
}

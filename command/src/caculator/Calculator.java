package caculator;

public class Calculator {
    private double value;
    
    public double sum(double a, double b){
        this.value = a + b;
        return this.value;
    }
    
    public double sub(double a, double b){
        this.value = a - b;
        return this.value;
    }
    
    public double getValue(){
        return this.value;
    }
    
}

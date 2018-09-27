package interfaces;

public interface ICommand {
    //public double execute(double a, double b);
    public double undo();
    public double redo();
}

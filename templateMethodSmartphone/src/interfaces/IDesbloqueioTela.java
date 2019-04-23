package interfaces;

public abstract class IDesbloqueioTela {
    protected abstract void autenticar();
    
    public void desbloquear(){
        System.out.println("Tecla de desbloqueio apertado...");
        autenticar();
        System.out.println("Home do aparelho");
    }
}

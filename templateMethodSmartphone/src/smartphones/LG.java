package smartphones;

import interfaces.IDesbloqueioTela;

public class LG extends IDesbloqueioTela{
    @Override
    public void autenticar() {
        System.out.println("Knock code...");
    }
}

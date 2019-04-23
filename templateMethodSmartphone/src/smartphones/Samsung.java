package smartphones;

import interfaces.IDesbloqueioTela;

public class Samsung extends IDesbloqueioTela{
    @Override
    protected void autenticar() {
        System.out.println("PIN code...OK");
    }
}

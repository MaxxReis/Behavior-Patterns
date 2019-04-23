package app;

import interfaces.IDesbloqueioTela;
import smartphones.LG;
import smartphones.Samsung;

public class run {
    public static void main(String[] args) {
        IDesbloqueioTela lg = new LG();
        lg.desbloquear();
        IDesbloqueioTela samsung = new Samsung();
        samsung.desbloquear();
    }
}

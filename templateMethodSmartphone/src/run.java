
import interfaces.IDesbloqueioTela;
import smartphones.LG;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author final
 */
public class run {
    public static void main(String[] args) {
        IDesbloqueioTela lg = new LG();
        lg.desbloquear();
    }
}

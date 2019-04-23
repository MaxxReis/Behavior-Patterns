package iterator;

import interfaces.IAgregavel;
import interfaces.IIteratorSP;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class IteratorSP implements IIteratorSP{
    private List<IAgregavel> itens;
    private String atributo;
    private char operador;
    private String opcao;
    private int contador = 0;
    private Method metodo = null;
    
    public IteratorSP(List<IAgregavel> itens, String atributo, String operador, String opcao){
        this.itens = itens;
        this.opcao = opcao;
        this.operador = operador.charAt(0);
        this.atributo = atributo;
    }
    
    @Override
    public IAgregavel next() throws Exception {
        IAgregavel item = null;
        do {
            if(itemValido()) {
                item = itens.get(contador);
                contador++;
                return item;
            }
            contador++;
        } while (hasNext());
        return item;
    }

    public boolean hasNext() {
        if (contador >= itens.size() || itens.get(contador) == null) 
            return false;
        return true;
    }
    
    private boolean setMethod() {
    	Class<? extends IAgregavel> classe = itens.get(contador).getClass();
    	try {
            metodo = classe.getMethod(atributo);
        } catch (Exception e) {
            return false;
        }
    	return true;
    }
    
    private boolean itemValido() throws Exception {
    	if (!setMethod())
            return false;
    	
    	switch(operador) {
            case '=':
                return metodo.invoke(itens.get(contador)).equals(opcao);
            case '<':
                return (double)metodo.invoke(itens.get(contador)) < Double.parseDouble(opcao);
            case '>':	
                return (double)metodo.invoke(itens.get(contador)) > Double.parseDouble(opcao);  
            default:
                return false;
    	}
    }
    
//    @Override
//    public Object next() {
//        Object objeto = this.itens.get(contador);
//        this.contador++;
//        return objeto;
//    }
//
//    @Override
//    public boolean hasNext() {
//        if (this.contador >= itens.size() || itens.get(this.contador) == null) {
//            return false;
//        } else {
//            return true;
//    }
    
    
        
//    public void processarAluno(){
//        IteratorSP iterator = new IteratorSP(it, nome);
//        for (Object objeto : this.objetos) {
//            
//        }
//    }
//    }
}

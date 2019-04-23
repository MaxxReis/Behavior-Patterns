package app;

import agregados.ArrayListItens;
import aluno.Aluno;
import interfaces.IAgregado;
import interfaces.IAgregavel;
import interfaces.IIteratorSP;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
//        Aluno a = new Aluno("Marcelo", "M", "A0", 7.8);
//        Class c = Class.forName("aluno.Aluno");
//        Method m = c.getDeclaredMethod("getNome");
//        System.out.println(m.invoke(a));
        
        IAgregavel aluno1 = new Aluno("Jonas","M","A1",5.8);
        IAgregavel aluno2 = new Aluno("Paula","F","A2",4);
        IAgregavel aluno3 = new Aluno("Pedro","M","B1",5.6);

//		IAgregado lista = new ArrayListDeItens();
        IAgregado lista = new ArrayListItens();		

        lista.add(aluno1);
        lista.add(aluno2);
        lista.add(aluno3);

        IIteratorSP it = lista.criarIterator("getMedia",">","5");

        IAgregavel item = null;

        while(it.hasNext()) 	
            if((item = it.next())!=null)
                System.out.println(item.nome() + " >> encontrado!");
    }
}

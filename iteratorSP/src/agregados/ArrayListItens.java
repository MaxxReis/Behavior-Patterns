package agregados;

import interfaces.IAgregado;
import interfaces.IAgregavel;
import interfaces.IIteratorSP;
import iterator.IteratorSP;
import java.util.ArrayList;

public class ArrayListItens implements IAgregado{
    ArrayList<IAgregavel> alunos = new ArrayList<IAgregavel>();

    @Override
    public IIteratorSP criarIterator(String atributo, String operador, String opcao) {
        return new IteratorSP(this.alunos, atributo, operador, opcao);
    }

    @Override
    public void add(IAgregavel item) {
        alunos.add(item);
    }

}

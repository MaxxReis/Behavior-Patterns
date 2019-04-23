package interfaces;

public interface IAgregado {
    public IIteratorSP criarIterator(String atributo, String operador, String opcao);
    public void add(IAgregavel item);
}

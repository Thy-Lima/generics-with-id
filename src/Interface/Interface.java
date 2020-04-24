package Interface;

import EntidadeGenerica.EntidadeGenerica;

/**
 *
 * @author guinh
 * @param <N>
 * @param <T>
 */
public interface Interface<N,T extends EntidadeGenerica> {
    public int tamanho();
    public void adicionarFinal(T item);
    public boolean adicionarApos(T itemAnterior, T itemNovo);
    public void removerPrimeiro();
    public boolean removerApos(T itemAnterior);
    public String exibir();
    public T buscaPorId(N id);
    public boolean trocarPorId(N id, T novoItem);
    public void ordenar();
     
    
}

package Box;

import EntidadeGenerica.EntidadeGenerica;

/**
 *
 * @author guinh
 * @param <T>
 */
public class Box<T extends EntidadeGenerica> {
    private T dado;
    private Box<T> proximo;
    
    public Box(T dado){
        this.dado = dado;
        this.proximo = null;
    }
    
    public void setDado(T dado){
        this.dado = dado;
    }
    
    public void setProximo(Box proximo){
        this.proximo = proximo;
    }
    
    public T getDado(){
        return this.dado;
    }
    
    public Box getProximo(){
        return this.proximo;
    }
    
}

package ListaEncadeada;

import Box.Box;
import EntidadeGenerica.EntidadeGenerica;
import Interface.Interface;

/**
 *
 * @author guinh
 * @param <T>
 * @param <N>
 */
public class ListaEncadeada<T extends EntidadeGenerica,N> implements Interface<N,T> {
    private Box<T> cabeca;
    
    public ListaEncadeada(){
        this.cabeca = null;
    }

    @Override
    public int tamanho() {
        int tamanho = 0;
        
        if(this.cabeca == null){
            return tamanho;
        }
        else{
            tamanho++;
            Box temp = this.cabeca;
            while(temp.getProximo() != null ){
                tamanho++;
                temp = temp.getProximo();
            }
            
            return tamanho;
        }
    }

    @Override
    public void adicionarFinal(T item){
        Box novoBox = new Box(item);
        novoBox.setProximo(null);
        
        if(this.cabeca == null){
            this.cabeca = novoBox;
        }
        else{
            Box temp = this.cabeca;
            while(temp.getProximo() != null){
                temp = temp.getProximo();
            }
            
            temp.setProximo(novoBox);
        }
    }

    @Override
    public boolean adicionarApos(T itemAnterior, T itemNovo) {
        if(this.cabeca != null){
            Box novoBox = new Box(itemNovo);
            Box temp = this.cabeca;
            while(temp.getProximo() != null ){
                if(temp.getDado().equals(itemAnterior)){
                    novoBox.setProximo(temp.getProximo());
                    temp.setProximo(novoBox);
                    return true;
                }
                
                temp = temp.getProximo();
            }
            
            return false;
        }
        
        return false;
    }

    @Override
    public void removerPrimeiro() {
        if(this.cabeca != null){
            Box temp = this.cabeca;
            Box novaCabeca = this.cabeca.getProximo();
            this.cabeca = novaCabeca;
            temp = null;
        }
    }

    @Override
    public boolean removerApos(T itemAnterior) {
        if(this.cabeca != null){
            Box temp = this.cabeca;
            Box removido;
            while(temp.getProximo() != null){
                if(temp.getDado().equals(itemAnterior)){
                    removido = temp.getProximo();
                    temp.setProximo(removido.getProximo());
                    removido.setDado(null);
                    removido.setProximo(null);
                    return true;
                }
                
                temp = temp.getProximo();
            }
            
            return false;
        }
        
        return false;
    }

    @Override
    public String exibir() {
        StringBuilder s = new StringBuilder();
        
        s.append("[");
        
        if(this.cabeca != null){
            Box temp = this.cabeca;
            while(temp != null){
               s.append(temp.getDado().toString());
               if(temp.getProximo() != null){
                   s.append(", ");
               }
               
               temp = temp.getProximo();
            }
        }
        
        s.append("]");
        
        return s.toString();
    }

    @Override
    public T buscaPorId(N id) {
        T item = null;
        
        if(this.cabeca != null){
            Box temp = this.cabeca;
            while(temp.getProximo() != null){
                item = (T) temp.getDado();
                
                if(item.getId()== id){
                    break;
                }
                else{
                    temp = temp.getProximo();
                    item = (T) temp.getDado();
                    
                    if(item.getId() == id){
                        break;
                    }
                }
                
            }
            
            
            return item;
        }
        
        return item;
    }

    @Override
    public boolean trocarPorId(N id, T novoItem) {
        if(this.cabeca != null){
            Box temp = this.cabeca;
            while(temp.getProximo() != null){
                T item = (T) temp.getDado();
                
                if(item.getId() == id){
                    temp.setDado(novoItem);
                    return true;
                }
                
                temp = temp.getProximo();
            }
            
            return false;
        }
        
        return false;
    }

    @Override
    public void ordenar(){
        Box fixo = this.cabeca;
        Box rotacao = fixo.getProximo();
        int idFixo = (Integer) fixo.getDado().getId();
        int idRotacao = (Integer) rotacao.getDado().getId();
        
        while(fixo.getProximo() != null){
            while(rotacao != null){
                if(idRotacao < idFixo){
                    T aux = (T) fixo.getDado();
                    fixo.setDado(rotacao.getDado());
                    rotacao.setDado(aux);
                }
                
                rotacao = rotacao.getProximo();
                if(rotacao != null){
                    idRotacao = (Integer) rotacao.getDado().getId();
                }
            }
            
            fixo = fixo.getProximo();
            idFixo = (Integer) fixo.getDado().getId();
            if(fixo.getProximo() != null){
                rotacao = fixo.getProximo();
                idRotacao = (Integer) rotacao.getDado().getId();
            }
        }
    }

}

    

package Main;

import EntidadeGenerica.EntidadeGenerica;
import Entidades.PessoaFisica;
import ListaEncadeada.ListaEncadeada;

/**
 *
 * @author guinh
 */
public class Main {
    
    public static void main(String[] args){
        ListaEncadeada<PessoaFisica, Integer> pf = new ListaEncadeada();
    
        PessoaFisica thiago = new PessoaFisica(3,"Thiago",123);
        PessoaFisica elza = new PessoaFisica(1,"Elza",321);
        PessoaFisica adalberto = new PessoaFisica(2,"Beto",132);
        
        pf.adicionarFinal(thiago);
        pf.adicionarFinal(elza);
        pf.adicionarApos(thiago, adalberto);
        
        pf.ordenar();
        
        System.out.println(""+pf.exibir());
        
        
        
    }
}

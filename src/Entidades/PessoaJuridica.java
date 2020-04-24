package Entidades;

import EntidadeGenerica.EntidadeGenerica;

/**
 *
 * @author guinh
 */
public final class PessoaJuridica extends EntidadeGenerica {
    private int cnpj;
    private String nome;
    
    public PessoaJuridica(int id,String nome,int cnpj){
        this.setId(id);
        this.setNome(nome);
        this.setCnpj(cnpj);
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setCnpj(int cnpj){
        this.cnpj = cnpj;
    }
    
    public int getCnpj(){
        return this.cnpj;
    }
    

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        
        s.append("ID: ").append(this.getId()).append(" Nome: ").append(this.getNome()).append(" CPF: ").append(this.getClass());
        
        return s.toString();
    }
}

package Entidades;

import EntidadeGenerica.EntidadeGenerica;

/**
 *
 * @author guinh
 */
public final class PessoaFisica extends EntidadeGenerica<Integer>{
    private int cpf;
    private String nome;
    
    public PessoaFisica(int id,String nome, int cpf){
        this.setId(id);
        this.setNome(nome);
        this.setCpf(cpf);
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setCpf(int cpf){
        this.cpf = cpf;
    }
    
    public int getCpf(){
        return this.cpf;
    }
    

    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        
        s.append("ID: ").append(this.getId()).append(" Nome: ").append(this.getNome()).append(" CPF: ").append(this.getCpf());
    
                    return s.toString();
                }
}

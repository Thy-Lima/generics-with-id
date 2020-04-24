package EntidadeGenerica;

/**
 *
 * @author guinh
 * @param <N>
 */
public abstract class EntidadeGenerica<N> {
    private N id;
    
    public void setId(N id){
        this.id = id;
    }
    
    public N getId(){
        return this.id;
    }

}

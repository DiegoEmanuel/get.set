
public class Pessoa {
    private String nomee;
    private int idade;
    
    public String getNome(){
        
        
        return this.nomee;
    }
    
    
    public int getIdade(){
        
        return this.idade;
        
    }
    
    
    public void setNome(String n){
        
        
        this.nomee= n;
        
    }
    
    
    
    public void setIdade(int i){
        this.idade= i;
        
        
        
    }
    
    void fazAniversario()
            
            
            
    {
        this.idade += 1;
    }
    
    
}

public class Pessoa {
    private NomePessoa nome;
    private int idade;
    private String rg;
    
    public Pessoa(String nome, int idade, String rg){
        this.nome = new NomePessoa(nome);
        this.idade = idade;
        this.rg = rg;
    }
    
    public String getNome(){
        return this.nome.getNome();
    }
    
    public int getIdade(){
        return this.idade;
    }
    
    public String getRg(){
        return this.rg;
    }
    
    protected void setNome(String nome){
        this.nome.setNome(nome);
    }
    
    protected void setIdade(int idade){
        this.idade = idade;
    }
    
    protected void setRg(String rg){
        this.rg = rg;
    }
    
    public String getString(){
        return("Nome: " + this.getNome() + ",   Idade: " + this.getIdade()+ ",   Rg: " + this.getRg());
    }
}
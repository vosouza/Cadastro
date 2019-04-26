public class CadastroDisciplina {
    public Disciplina disc[];
    public final int max;
    public int tam;
    
    public CadastroDisciplina(int max){
        this.max = max;
        this.disc = new Disciplina[this.getMax()];
        this.setTam(0);
    }
    
    public int getMax(){
        return this.max;
    }
    
    public boolean addDisciplina(Disciplina disc){
        if(this.getMax() > this.getTam()){
            this.setTam(this.getTam() + 1);
            this.disc[this.getTam()] = disc;
            
            return true;
        }
        
        return false;
    }

    private void setTam(int tam){
        this.tam = tam;
    }

    private int getTam() {
        return this.tam;
    }
}
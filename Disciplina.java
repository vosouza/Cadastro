public class Disciplina{
    private NomeDisciplina disc;
    private String prof;
    private double nota;
    
    public Disciplina(){
        this.disc = new NomeDisciplina("");
        this.setProf("");
        this.setNota(0);
    }
    
    public Disciplina(String disc){
        this.disc = new NomeDisciplina(disc);
        this.setProf("");
        this.setNota(0);
    }
    
    public void setDisciplina(String disc){
        this.disc.setDisciplina(disc);
    }
    
    public void setProf(String prof){
        this.prof = prof;
    }
    
    public void setNota(double nota){
        this.nota = nota;
    }
    
    public String getDisciplina(){
        return disc.getDisciplina();
    }
    
    public double getNota(){
        return this.nota;
    }
    
    public String getProf(){
        return this.prof;
    }
}




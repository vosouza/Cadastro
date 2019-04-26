public class Aluno extends Pessoa {
    private String ra;
    private Disciplina disciplina;
    private CadastroDisciplina listaDisciplina;
    private int semestre;
    
    public Aluno(){
        super("",0,"");
        this.listaDisciplina = new CadastroDisciplina(5);
    }

    public Aluno(String nome, int idade, String rg, String ra, int semestre, int numDisc){
        super(nome, idade, rg);
        this.ra = ra;
        this.semestre = semestre;
        this.listaDisciplina = new CadastroDisciplina(numDisc);
    }
    
    public String getRa(){
        return this.ra;
    }

    public int getSemestre(){
        return semestre;
    }

    public void setRa(String ra){
        this.ra = ra;
    }

    public void setSemestre(int semestre){
        this.semestre = semestre;
    }
    
    @Override
    public String getString(){
        return(super.getString() + "\nRA: " + this.getRa() + ",   Serie: " + this.getSemestre());
    }

    public boolean equals(Aluno a1){
        if(this.getNome().equals(a1.getNome())){
            if(this.getIdade() == a1.getIdade()){
                if(this.getRg().equals(a1.getRg())){
                    if(this.getRa().equals(a1.getRa())){
                        if(this.getSemestre() == a1.getSemestre()){
                                return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}

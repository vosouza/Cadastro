public class NomeDisciplina extends Texto{
	private String disc;

	public NomeDisciplina(String disc){
            super(disc);
            setDisciplina(super.getTxt());
	}

	public String getDisciplina() {
            return disc;
	}

	public void setDisciplina(String disc) {
            this.disc = disc;
	}
	
	public String getNomeInvertido(){
            return inverteTexto();
	}
}
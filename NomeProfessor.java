public class NomeProfessor extends Texto{
	private String prof;

	public NomeProfessor(String prof){
		super(prof);
		setProfessor(super.getTxt());
	}

	public String getProfessor() {
		return prof;
	}

	public void setProfessor(String prof) {
		this.prof = prof;
	}
	
	public String getNomeInvertido(){
		return inverteTexto();
	}
}


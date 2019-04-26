public class NomePessoa extends Texto{
	private String nome;

	public NomePessoa(String nome){
        super(nome);
        setNome(super.getTxt());
	}

	public String getNome() {
        return nome;
	}

	public void setNome(String nome) {
        this.nome = nome;
	}
	
	public String getNomeInvertido(){
        return inverteTexto();
	}

	public String getNomeBiblio(){
		String vts[] = getNome().split(" ");
        int qtd = vts.length;

        String sBib = vts[qtd-1] + ", ";
        for (int i=0; i < (qtd-1); i++){
            String pal = vts[i].toLowerCase();
            if(!ePreposicao(pal)){ 
                sBib = sBib + vts[i].toUpperCase().charAt(0) + ". ";
            }
        }
        return sBib;
	}
	
	private boolean ePreposicao(String s){
        final String prep[]={"da", "de", "do", "di", "das", "dos", "e",};

        for (int i = 0; i < prep.length; i++){
            if(prep[i].equals(s)){
                return true;
            }
        }
        return false;
	}
}


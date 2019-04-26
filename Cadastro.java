public class Cadastro {
    public IArmazenador armazen;

    public Cadastro(){
        this.armazen = new VetDin(); 
        //new Lista();
    }

    public void inserir(Aluno a){
        this.armazen.inserir(a);
        //return true;
    }

    public boolean remover(String ra){
        boolean ret = false;
        int indice = buscar(ra);
        if (indice >= 0){
            this.armazen.remover(indice);
            ret = true;
        } 
        return ret;
    }
  
    private int buscar(String ra) {
        int indice = -1;
        //Object vet[] = ((Lista)this.armazen).getVetor();
        Object vet[] = ((VetDin)this.armazen).getVetor();
        if(vet != null){
            for (int i = 0; i < vet.length; i++){
                Aluno a = (Aluno) vet[i];
                if (a.getRa().equals(ra)){
                    indice = i;
                    break;
                }
            } 
        }
        return indice;
    }

    public void imprimir(){
        System.out.println(armazen.toString());
    }

}

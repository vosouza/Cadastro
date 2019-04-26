import java.util.*;

public class CadastroAluno{
    ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    
    public boolean inserir(Aluno aluno){
        String ra = aluno.getRa();
        for (Aluno _aluno : alunos){
            if (_aluno.getRa().equals(ra)) {
                return false;
            }
        }
        alunos.add(aluno);
        return true;           
    }

    public Aluno buscar(String ra){
        for (Aluno _aluno : alunos) {
            if (_aluno.getRa().equals(ra)) {
                return _aluno;
            }
        }
        return null;
    }

    /*//método funcional, porém precisa de maior implementação
    private Aluno atualizar(String ra) {
        for (Aluno _aluno : alunos) {
            if (_aluno.getRa().equals(ra)) {
                _aluno.setNome("Novo valor");
                return _aluno;
            } 
        }
        return null;
    }*/

    public Aluno remover(String ra) {
        for(Aluno _aluno : alunos){
            if(_aluno.getRa().equals(ra)) {
                alunos.remove(_aluno);
                return _aluno;
            }
        }
        return null;
    }

    public List<Aluno> imprimir() {
        return new ArrayList<Aluno>(alunos);
    }
}
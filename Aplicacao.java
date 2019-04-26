import java.util.*;
import javax.swing.JOptionPane;

public class Aplicacao {
   public static void main(String[] args) {
        Aluno aluno;
        Disciplina disc;
        String nome, ra, rg;
        boolean cadAluno, cadDisc, isValid = false;
        int idade, semestre, continuar, op, qtdDisc;

        CadastroAluno cadastroAluno = new CadastroAluno();
        //CadastroDisciplina cadastroDisciplina = new CadastroDisciplina();
        IEntrada ent = new EntradaGui();

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opção:\n" +
                                                              "(1)Criar aluno\n(2)Buscar aluno\n(3)Atualizar aluno\n" +
                                                              "(4)Deletar aluno\n(5)Listar alunos\n"
                                                              ));
            switch(op) {
            case 1:
                aluno = new Aluno();
                disc = new Disciplina();

                ent.lerDados(aluno);
                   
                qtdDisc = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de disciplinas"));
                while(isValid == false){
                    if(qtdDisc <= 0) {
                        JOptionPane.showMessageDialog(null, "O numero de matérias precisa ser maior que 0. Por favor, verifique-o novamente.");
                    }
                    if(qtdDisc >= 5){
                        JOptionPane.showMessageDialog(null, "O numero de matérias não pode ser maior que 5. Por favor, verifique-o novamente.");
                    }
                    else {
                        for(int i = qtdDisc; i > 0; i--){
                            ent.lerDadosDisc(disc);
                            disc = new Disciplina();
                        }
                        isValid = true;
                    }
                }

                cadAluno = cadastroAluno.inserir(aluno);
                if(cadAluno == true){
                    JOptionPane.showMessageDialog(null, "O cadastro foi realizado com sucesso.");
                }
                if(cadAluno == false){
                    JOptionPane.showMessageDialog(null, "O cadastro não foi realizado.");
                }
                break;
            case 2:
                ra = JOptionPane.showInputDialog("Digite o RA a ser procurado");
                Aluno _aluno = cadastroAluno.buscar(ra);
                if(_aluno == null){
                    JOptionPane.showMessageDialog(null, "Não existe cadastro com o RA" + ra + " para ser mostrado.");
                    break; 
                }
                JOptionPane.showMessageDialog(
                    null, "Nome: " + _aluno.getNome() + "\n" 
                        + "Idade: " + _aluno.getIdade() + "\n" 
                        + "RG: " + _aluno.getRg() + "\n" 
                        + "RA: " + _aluno.getRa() + "\n"
                        + "Semestre: " + _aluno.getSemestre()
                );
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Atualizar\n Esse método precisa ser implementado");
                /*ra = JOptionPane.showInputDialog("Digite o RA a ser atualizado.");
                Aluno __aluno = cadastroAluno.update(ra);
                if(__aluno == null){
                    JOptionPane.showMessageDialog(null, "Não existe cadastro com o RA" + ra + " para ser atualizado.");
                    break; 
                }
                JOptionPane.showMessageDialog(null, "Cadastro " + __aluno.getRa() + " deletado.");*/
                break;
            case 4:
                ra = JOptionPane.showInputDialog("Digite o RA a ser deletado");
                Aluno ___aluno = cadastroAluno.remover(ra);
                if(___aluno == null){
                    JOptionPane.showMessageDialog(null, "Não existe cadastro com o RA" + ra + " para ser deletado.");
                    break; 
                }
                JOptionPane.showMessageDialog(null, "Cadastro " + ___aluno.getRa() + " deletado.");
                break;
            case 5:
                List<Aluno> alunos = cadastroAluno.imprimir();
                if(alunos.isEmpty()){
                    JOptionPane.showMessageDialog(null, "Cadastro vazio.");
                    break;
                }
                for (Aluno a : alunos) {
                    JOptionPane.showMessageDialog(
                    null, "Nome: " + a.getNome() + "\n" 
                        + "Idade: " + a.getIdade() + "\n" 
                        + "RG: " + a.getRg() + "\n" 
                        + "RA: " + a.getRa() + "\n"
                        + "Semestre: " + a.getSemestre() + "\n"
                        + "\n"
                        + "Disciplina(s)\n" + "Implementar método para mostrar todas as disciplinas de um aluno" + "\n" 
                    );
                };
                break;
            }
            continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
        } while(continuar == 0);  
    }
}

import java.text.*;
import javax.swing.JOptionPane;

public class EntradaGui implements IEntrada{

	public void lerDados(Aluno aluno) {
		String nome, rg, ra;
		int idade, semestre;
		boolean infoValid = false; 

		while(infoValid == false){
			nome = (JOptionPane.showInputDialog("Digite o nome completo"));
			if (nome.matches("[a-zA-Z\\s]+")){
				aluno.setNome(nome);
				infoValid = true;
			}
			if (!nome.matches("[a-zA-Z\\s]+")){
				JOptionPane.showMessageDialog(null, "Nome com formatação errada. Por favor, verifique-o novamente.");      
			}
		}
		infoValid = false;

		while(infoValid == false){
			idade = (Integer.parseInt(JOptionPane.showInputDialog("Digite a idade")));
			if (idade >= 5 && idade <= 99){
				aluno.setIdade(idade);
				infoValid = true;
			}
			if (idade < 5 || idade > 99){
				JOptionPane.showMessageDialog(null, "Idade precisa ser um número inteiro e o aluno precisa ter mais que 5 anos. Por favor, verifique-a novamente.");
			}
		}
		infoValid = false;

		while(infoValid == false){
			rg = (JOptionPane.showInputDialog("Digite o RG"));
			if (rg.matches("[0-9]{2}\\.?[0-9]{3}\\.?[0-9]{3}\\-?[0-9]{1}")){
				aluno.setRg(rg);
				infoValid = true;
			}
			if (!rg.matches("[0-9]{2}\\.?[0-9]{3}\\.?[0-9]{3}\\-?[0-9]{1}")){
				JOptionPane.showMessageDialog(null, "RG com formatação errada. Por favor, verifique-o novamente.");        
			}
		}
		infoValid = false;

		while(infoValid == false){
			ra = (JOptionPane.showInputDialog("Digite o RA"));
			if (ra.matches("[0-9]{8}")){
					aluno.setRa(ra);
					infoValid = true;
			}
			if (!ra.matches("[0-9]{8}")){
				JOptionPane.showMessageDialog(null, "RA com formatação errada. Por favor, verifique-o novamente.");        
			}
		}
		infoValid = false;

		while(infoValid == false){
			semestre = (Integer.parseInt(JOptionPane.showInputDialog("Digite o semestre")));
			if (semestre >= 1 && semestre <= 8){
				aluno.setSemestre(semestre);
				infoValid = true;
			}
			if (semestre < 1 || semestre > 8){ 
				JOptionPane.showMessageDialog(null, "Semestre precisa ser um número inteiro e estar entre 1 e 8. Por favor, verifique-o novamente.");        
			}
		}
		infoValid = false;
	}
            
    public void lerDadosDisc(Disciplina disc){
    	String nomeDisc, nomeProf;
    	int nota;
        boolean infoValid = false;

       	while(infoValid == false){
			nomeDisc = (JOptionPane.showInputDialog("Digite o nome da disciplina: "));
			if (nomeDisc.matches("[a-zA-Z\\s]+")){
				disc.setDisciplina(nomeDisc);
				infoValid = true;
			}
			if (!nomeDisc.matches("[a-zA-Z\\s]+")){
				JOptionPane.showMessageDialog(null, "Nome com formatação errada. Por favor, verifique-o novamente.");      
			}
		}
		infoValid = false;

		while(infoValid == false){
			nomeProf = (JOptionPane.showInputDialog("Digite o nome do professor: "));
			if (nomeProf.matches("[a-zA-Z\\s]+")){
				disc.setProf(nomeProf);
				infoValid = true;
			}
			if (!nomeProf.matches("[a-zA-Z\\s]+")){
				JOptionPane.showMessageDialog(null, "Nome com formatação errada. Por favor, verifique-o novamente.");      
			}
		}
		infoValid = false;
		
		while(infoValid == false){
			nota = (Integer.parseInt(JOptionPane.showInputDialog("Digite a nota: ")));
			if (nota >= 0 && nota <= 10){
				disc.setNota(nota);
				infoValid = true;
			}
			if (nota < 0 || nota > 10){ 
				JOptionPane.showMessageDialog(null, "A nota precisa ser um número inteiro e estar entre 0 e 10. Por favor, verifique-o novamente.");        
			}
		}
		infoValid = false;
	}
}
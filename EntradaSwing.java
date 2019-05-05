import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;



public class EntradaSwing implements  IEntrada {
	
	private PainelAluno janelaAluno;
	private PainelDisciplina janelaDisciplina;
    
	EntradaSwing(){
		
		
	}
	
	public void lerDados(Aluno aluno) {
		janelaAluno = new PainelAluno();
		aluno = janelaAluno.LerDados();
	}

	public void lerDadosDisc(Disciplina disc) {
		janelaDisciplina = new PainelDisciplina();
	
	}

}

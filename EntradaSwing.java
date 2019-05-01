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



public class EntradaSwing extends JFrame implements ActionListener, IEntrada {
	
	private Aluno aluno;
	
    private JButton ok;
    
    private JTextField txtNome;
    private JTextField txtIdade;
    private JTextField txtRg;
    private JTextField txtRa;
    private JTextField txtSemestre;
    
    private Container cp;
    
	EntradaSwing(){
		super("Cadastro de Aluno");
		setSize(400, 400);
		cp = getContentPane();
		cp.setLayout(new GridLayout(6,6));
		
		cp.add(new JLabel("Forneca o nome do Aluno:", JLabel.LEFT));
        txtNome = new JTextField();
        txtNome.addActionListener(this);
        txtNome.setToolTipText("Caracteres a-z");
        txtNome.setBackground(Color.WHITE);
        cp.add(txtNome);
        
        cp.add(new JLabel("Forneca a idade do Aluno:", JLabel.LEFT));
        txtIdade = new JTextField();
        txtIdade.addActionListener(this);
        txtIdade.setToolTipText("Numero inteiro");
        txtIdade.setBackground(Color.WHITE);
        cp.add(txtIdade);
        
        cp.add(new JLabel("Forneca o RG do Aluno:", JLabel.LEFT));
        txtRg = new JTextField();
        txtRg.addActionListener(this);
        txtRg.setToolTipText("RG sem sem pontuacao");
        txtRg.setBackground(Color.WHITE);
        cp.add(txtRg);
        
        cp.add(new JLabel("Forneca o semestre do Aluno:", JLabel.LEFT));
        txtSemestre = new JTextField();
        txtSemestre.addActionListener(this);
        txtSemestre.setToolTipText("Numero inteiro");
        txtSemestre.setBackground(Color.WHITE);
        cp.add(txtSemestre);
        
        cp.add(new JLabel("Forneca o RA do Aluno:", JLabel.LEFT));
        txtRa = new JTextField();
        txtRa.addActionListener(this);
        txtRa.setToolTipText("RA000000");
        txtRa.setBackground(Color.WHITE);
        cp.add(txtRa);
        
        cp.add(ok = new JButton("Salvar"));
        ok.addActionListener(this);
        ok.setToolTipText("aperte para cadastrar");
		
		
	}
	
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource() == ok) {
			getDadosAluno(this.aluno);			
		}
		
	}


	public void lerDados(Aluno aluno) {
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.aluno = aluno;
		
		
	}

	@Override
	public void lerDadosDisc(Disciplina disc) {
		// TODO Auto-generated method stub
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void getDadosAluno(Aluno aluno) {
		String nome, rg, ra;
		int idade, semestre;
		boolean infoValid = false; 

		while(infoValid == false){
			nome = txtNome.getText();
			if (nome.matches("[a-zA-Z\\s]+")){
				aluno.setNome(nome);
				infoValid = true;
			}
			if (!nome.matches("[a-zA-Z\\s]+")){
				JOptionPane.showMessageDialog(null, "Nome com formatacao errada. Por favor, verifique-o novamente.");      
			}
		}
		infoValid = false;

		while(infoValid == false){
			idade = Integer.parseInt(txtIdade.getText());
			if (idade >= 5 && idade <= 99){
				aluno.setIdade(idade);
				infoValid = true;
			}
			if (idade < 5 || idade > 99){
				JOptionPane.showMessageDialog(null, "Idade precisa ser um numero inteiro e o aluno precisa ter mais que 5 anos. Por favor, verifique-a novamente.");
			}
		}
		infoValid = false;

		while(infoValid == false){
			rg = txtRg.getSelectedText();
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
			ra = txtRa.getText();
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
			semestre = (Integer.parseInt(txtSemestre.getText()));
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
	
}

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PainelAluno extends JFrame implements ActionListener {

	private Container cp;
	
    private JButton ok;
    
    private JTextField txtNome;
    private JTextField txtIdade;
    private JTextField txtRg;
    private JTextField txtRa;
    private JTextField txtSemestre;
	
	PainelAluno(){
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
        
        setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		
	}

	public Aluno LerDados() {
		// TODO Auto-generated method stub
		return null;
	}
}

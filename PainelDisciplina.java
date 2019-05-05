import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PainelDisciplina extends JFrame implements ActionListener {
	
	private Container cp;
	
	private JButton ok;
	
	private JTextField txtDisciplina;
	private JTextField txtNomeProfessor;
	private JTextField txtNota;
	
	PainelDisciplina(){
		setSize(400, 400);
		cp = getContentPane();
		cp.setLayout(new GridLayout(6,6));
		
		cp.add(new JLabel("Forneca da disciplina:", JLabel.LEFT));
		txtDisciplina = new JTextField();
		txtDisciplina.addActionListener(this);
		txtDisciplina.setToolTipText("Caracteres a-z");
		txtDisciplina.setBackground(Color.WHITE);
        cp.add(txtDisciplina);
        
        cp.add(new JLabel("Forneca o nome do professor:", JLabel.LEFT));
        txtNomeProfessor = new JTextField();
        txtNomeProfessor.addActionListener(this);
        txtNomeProfessor.setToolTipText("Numero inteiro");
        txtNomeProfessor.setBackground(Color.WHITE);
        cp.add(txtNomeProfessor);
        
        cp.add(new JLabel("Forneca a nota:", JLabel.LEFT));
        txtNota = new JTextField();
        txtNota.addActionListener(this);
        txtNota.setToolTipText("RG sem sem pontuacao");
        txtNota.setBackground(Color.WHITE);
        cp.add(txtNota);        
        
        cp.add(ok = new JButton("Salvar"));
        ok.addActionListener(this);
        ok.setToolTipText("aperte para cadastrar");
        
        setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		setVisible(false);
		
	}

}

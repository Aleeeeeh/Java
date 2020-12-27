
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class JogoDaVelha extends JFrame {
	
	//Icones png do circulo e X
	
	ImageIcon iconCirculo = new ImageIcon(getClass().getResource("circulo.png"));
	ImageIcon iconX = new ImageIcon(getClass().getResource("x.png"));

	
	// Criar Tela - //3 linhas 3 colunas e margem entre células de 10 pixels
	JPanel pTela = new JPanel(new GridLayout(3, 3, 10, 10));

	Bloco[] blocos = new Bloco[9];
	
	int rodadas = 0;

	// Constante
	final int JOGADOR_1 = 1;
	final int JOGADOR_2 = 2;
	
	int JogadorVez = JOGADOR_1;

	JLabel LInformacao = new JLabel("Jogador " + JOGADOR_1);

	public JogoDaVelha() {
		ConfigurarJanela();
		ConfigurarTela();
	}

	public void ConfigurarTela() {
		add(BorderLayout.CENTER, pTela);
		add(BorderLayout.NORTH, LInformacao);
		pTela.setBackground(Color.BLACK);
		LInformacao.setFont(new Font("Arial",Font.BOLD,30));//Tamanho e fonte da letra
		LInformacao.setForeground(new Color(50,200,50));//Cor do nome Jogador
		LInformacao.setHorizontalAlignment(SwingConstants.CENTER);

		for (int i = 0; i < 9; i++) {
			Bloco bloco = new Bloco();
			blocos[i] = bloco;
			pTela.add(bloco);
		}
	}

	public void MudarVez() {
		if(JogadorVez == 1) {
			JogadorVez = 2;
			LInformacao.setText("Jogador 2");
			LInformacao.setForeground(Color.RED);
		}
		else {
			JogadorVez = 1;
			LInformacao.setText("Jogador 1 ");
			LInformacao.setForeground(new Color(50,200,50));
		}
	}
	
	public boolean TestarVitoria(int jog) {
		if(blocos[0].jogador == jog && blocos[1].jogador == jog && blocos[2].jogador == jog) {
			return true;
		}
		if(blocos[3].jogador == jog && blocos[4].jogador == jog && blocos[5].jogador == jog) {
			return true;
		}
		if(blocos[6].jogador == jog && blocos[7].jogador == jog && blocos[8].jogador == jog) {
			return true;
		}
		if(blocos[0].jogador == jog && blocos[3].jogador == jog && blocos[6].jogador == jog) {
			return true;
		}
		if(blocos[1].jogador == jog && blocos[4].jogador == jog && blocos[7].jogador == jog) {
			return true;
		}
		if(blocos[2].jogador == jog && blocos[5].jogador == jog && blocos[8].jogador == jog) {
			return true;
		}
		if(blocos[0].jogador == jog && blocos[4].jogador == jog && blocos[8].jogador == jog) {
			return true;
		}
		if(blocos[6].jogador == jog && blocos[4].jogador == jog && blocos[2].jogador == jog) {
			return true;
		}
		return false;
	}
	
	public void ConfigurarJanela() {
		setTitle("Jogo da Velha");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 600);
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public static void main(String args[]) {
		new JogoDaVelha();
	}

	// Quadrados feitos através de botões
	public class Bloco extends JButton {
		int jogador = 0;

		public Bloco() {
			setBackground(Color.WHITE);
			addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
				if(jogador == 0) {
					if(JogadorVez == JOGADOR_1) {
						setIcon(iconCirculo);
						jogador = JOGADOR_1;
					}
					else{
						setIcon(iconX);
						jogador = JOGADOR_2;
					}
					if(TestarVitoria(jogador)) {
						JOptionPane.showMessageDialog(null,"Jogador " + jogador + " VENCEU !");
						System.exit(0);//Sair do Programa
					}
					rodadas++;
					if(rodadas == 9) {
						JOptionPane.showMessageDialog(null, "DEU VELHA !");
						System.exit(0);
					}
					MudarVez();
				}
					
				}
			});
		}

	}

}

package exercicios_while;

import javax.swing.JOptionPane;

public class main {
	public static void main(String args[]) {
	
		int senha;
		
		senha=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a senha:"));
	
		while (senha != 2002) {
			JOptionPane.showMessageDialog(null,"Senha inválida");
			senha=Integer.parseInt(JOptionPane.showInputDialog(null,"Digite a senha:"));
		}
		JOptionPane.showMessageDialog(null,"Acesso Permitido");
	}

}

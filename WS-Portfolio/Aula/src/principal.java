
public class principal {
	
		public static void main(String[] args){
			
			Aluno aluno = new Aluno();
			
			aluno.setMatricula(1);
			aluno.setNome("Alefe Silva");
			aluno.setEndereco("Rua Wenceslau Brás, 39, Centro, Loanda-PR");
			aluno.setTelefone("(44) 9 9975-2301");
			aluno.setEMail("220562018@eniac.edu.br");
		
			System.out.println("\n\nNº Matrícula: " + aluno.getMatricula());
			System.out.println("Aluno: " + aluno.getNome());
			System.out.println("Endereço: " + aluno.getEndereco());
			System.out.println("Telefone: " + aluno.getTelefone());
			System.out.println("E-mail: " + aluno.getEMail());
		}
}

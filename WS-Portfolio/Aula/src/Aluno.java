
public class Aluno {
	private long matricula;
	private String nome;
	private String endereco;
	private String telefone;
	private String eMail;
	

	public void setMatricula(long matricula){
		this.matricula =  matricula;
	}
	
	public long getMatricula(){
		return matricula;
	}
	
	public void setNome(String nome){
		this.nome =  nome;
	}
	
	public String getNome(){
		return nome;
	}
	
	public void setEndereco(String endereco){
		this.endereco =  endereco;
	}
	
	public String getEndereco(){
		return endereco;
	}
	
	public void setTelefone(String telefone){
		this.telefone =  telefone;
	}
	
	public String getTelefone(){
		return telefone;
	}
	
	public void setEMail(String eMail){
		this.eMail =  eMail;
	}
	
	public String getEMail(){
		return eMail;

}
}
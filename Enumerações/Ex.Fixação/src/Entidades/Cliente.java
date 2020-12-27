package Entidades;

import java.util.Date;

public class Cliente {
	private String nome;
	private String email;
	private Date data_niver;
	
	public Cliente () {
		
	}
	public Cliente (String nome, String email, Date data_niver) {
		this.nome = nome;
		this.email = email;
		this.data_niver = data_niver;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getData_niver() {
		return data_niver;
	}
	public void setData_niver(Date data_niver) {
		this.data_niver = data_niver;
	}
	

}

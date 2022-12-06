package com.ifsc.tds;

public class PessoaFisica extends Cliente {
	
	private String cpf;
	
	public PessoaFisica () {
		
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String toString () {
		return "Não sei o que é isso";
	}
	
}

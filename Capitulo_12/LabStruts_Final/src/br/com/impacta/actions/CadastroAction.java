package br.com.impacta.actions;

import com.opensymphony.xwork2.Action;

public class CadastroAction implements Action {

	private String saudacao;

	@Override
	public String execute() throws Exception {
		setSaudacao("Bem Vindo � sua primeira aplica��o feita com Struts 2!!");
		return "success";
	}

	public String getSaudacao() {
		return saudacao;
	}

	public void setSaudacao(String saudacao) {
		this.saudacao = saudacao;
	}
	
}


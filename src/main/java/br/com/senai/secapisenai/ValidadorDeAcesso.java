package br.com.senai.secapisenai;

public class ValidadorDeAcesso {

	public void Validar(Usuario usuario) {
		if (usuario.getLogin().equals("user1")
				|| !usuario.getSenha().equals("123"))
			throw new IllegalArgumentException("O usu�rio " + usuario.getLogin() 
			+  "ou senha inv�lidos");
	}
	
}


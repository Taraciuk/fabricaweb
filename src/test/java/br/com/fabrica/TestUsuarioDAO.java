package br.com.fabrica;

import br.com.fabrica.persistencia.entidade.Usuario;
import br.com.fabrica.persistencia.jdbc.UsuarioDAO;

public class TestUsuarioDAO {

	public static void main(String[] args) {
		Usuario usu = new Usuario();
		usu.setNomeUsuario("Teste3");
		usu.setLoginUsuario("tst3");
		usu.setSenhaUsuario("12345");
		
		UsuarioDAO usuDAO = new UsuarioDAO();
		usuDAO.cadastrar(usu);
		
		System.out.println("Cadastrado com Sucesso!!");
	}

}

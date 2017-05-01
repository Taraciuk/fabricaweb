package br.com.fabrica.persistencia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fabrica.persistencia.entidade.Usuario;

public class UsuarioDAO {
	private Connection con = ConexaoFactory.getConnection();

	public void cadastrar(Usuario usu) {		
		String sql = "insert into usuario (nomeusuario, loginusuario, senhausuario) values (?, ?, ?)";
		
		try (PreparedStatement prepara = con.prepareStatement(sql)){			
			prepara.setString(1, usu.getNomeUsuario());
			prepara.setString(2, usu.getLoginUsuario());
			prepara.setString(3, usu.getSenhaUsuario());
			
			prepara.execute();
			prepara.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
					
	}
}

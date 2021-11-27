package br.com.crud.model;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class ContatoDAO
{
public void save (Contato contato){
	String sql = "INSERT INTO contatos(nome,idade, dataCadastro)" + "VALUES (?,?,?)";
	
	Connection conn = null;
	PreparedStatement pstm = null;
	
	try {
		conn = 
	}
}	

}

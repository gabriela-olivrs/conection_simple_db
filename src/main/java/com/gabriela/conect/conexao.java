package com.gabriela.conect;

import java.sql.DriverManager;
import java.sql.Connection;
/**
 *
 * @author gabriela
 */
public class conexao {
    private String url;
     private String usuario;
    private String senha;
    private Connection con;
    
    conexao (){
        url = "jdbc:postgresql://4c3e80f3b6bc:5432/postgres";
        usuario = "MyPostgres";
        senha ="1234";
        try{
            Class.forName("org.postgresql.Driver");
            con = DriverManager.getConnection(url,usuario,senha);
            System.out.println("Conexão realizada com sucesso!!!");
        }catch(Exception e){
            e.printStackTrace();
            System.out.println("Falhou");
        }
    }
}

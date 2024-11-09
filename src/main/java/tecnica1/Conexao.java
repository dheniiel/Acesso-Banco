package tecnica1;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {
    public static final String SERVIDOR = "jdbc:mysql://localhost:3306/exemplo_aluno";
    public static final String USUARIO = "root";
    public static final String SENHA = "123456789";
    
    public Connection getConexao() {
        try {
            return DriverManager.getConnection(SERVIDOR, USUARIO, SENHA);
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}

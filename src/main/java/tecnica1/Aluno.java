package tecnica1;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class Aluno {
    private int id;
    private String nome;
    private String endereco;
    private int idade;

    public Aluno(int id, String nome, String endereco, int idade) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.idade = idade;
    }
    
    public void inserir() {
//        grava um aluno no banco
//        Conexao c = new Conexao();
//        Connection conexao = c.getConexao();
        Connection conexao = new Conexao().getConexao();

//INSERT INTO tb_aluno (nome, endereco, idade) VALUES ('Fulano', 'Rua 1', 20);
        String sql = "INSERT INTO tb_aluno (nome, endereco, idade) VALUES (?, ?, ?)";
        
        try {
            PreparedStatement comando = conexao.prepareStatement(sql);
            comando.setString(1, this.nome);
            comando.setString(2, this.endereco);
            comando.setInt(3, this.idade);
            
            comando.execute();
            comando.close();
            
            conexao.close();
        } catch (Exception e) {
            System.out.println(e);
            
        }
        
    }
}

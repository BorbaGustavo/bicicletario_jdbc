import br.com.bicicletario.config.ConnectionFactory;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        try(Connection conexao = ConnectionFactory.recuperarConexao()){
            System.out.println("Conectado com sucesso!");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
}

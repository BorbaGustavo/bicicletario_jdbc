package br.com.bicicletario.config;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class ConnectionFactory {

    public static Connection recuperarConexao() {
        Properties props = new Properties();

        try (InputStream input = ConnectionFactory.class.getClassLoader().getResourceAsStream("db.properties")) {

            if (input == null) {
                throw new RuntimeException("Arquivo db.properties não foi encontrado na pasta resources!");
            }

            props.load(input);

            String url = props.getProperty("db.url");
            String usuario = props.getProperty("db.user");
            String senha = props.getProperty("db.password");

            // Abre e retorna a conexão usando os dados do arquivo
            return DriverManager.getConnection(url, usuario, senha);

        } catch (Exception e) {
            throw new RuntimeException("Erro ao tentar conectar com o banco de dados via properties!", e);
        }
    }
}
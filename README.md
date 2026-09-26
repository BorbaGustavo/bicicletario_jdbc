# 🚲 Sistema de Controle de Bicicletário (Estilo CPTM)

Sistema em **Java** com **JDBC puro** e **MySQL** desenvolvido para gerenciar o cadastro de usuários, suas respectivas bicicletas e o controle de vagas de um bicicletário. Projeto focado no aprendizado de persistência de dados relacional sem o uso de frameworks pesados (como Hibernate/JPA).

---

## 🛠️ Tecnologias Utilizadas

* **Java** (Versão 21+)
* **Maven** (Gerenciador de dependências)
* **MySQL Server** (Banco de dados relacional)
* **MySQL Connector/J** (Driver JDBC)

---

## 🗄️ Modelagem do Banco de Dados

O banco de dados (`bicicletario_cptm`) é composto por 3 tabelas principais:

1. **`T_BC_USUARIO`**: Armazena os dados dos ciclistas (com CPF único).
2. **`T_BC_BICICLETA`**: Armazena as bicicletas cadastradas, cada uma vinculada a um usuário dono e com um código único.
3. **`T_BC_VAGA`**: Controla as vagas físicas do bicicletário (com limite escalável e status de disponibilidade).

### Script SQL de Criação:
```sql
CREATE DATABASE bicicletario_cptm;
USE bicicletario_cptm;

CREATE TABLE T_BC_USUARIO (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(120) NOT NULL,
    cpf VARCHAR(14) UNIQUE NOT NULL
);

CREATE TABLE T_BC_BICICLETA (
    id INT AUTO_INCREMENT PRIMARY KEY,
    codigo VARCHAR(6) UNIQUE NOT NULL,
    usuario_id INT NOT NULL,
    FOREIGN KEY (usuario_id) REFERENCES T_BC_USUARIO(id)
);

CREATE TABLE T_BC_VAGA (
    id INT AUTO_INCREMENT PRIMARY KEY,
    numero_vaga INT UNIQUE NOT NULL,
    status VARCHAR(20) DEFAULT 'DISPONIVEL'
);

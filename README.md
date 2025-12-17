<h1 align="center">
  Literalura - Catálogo de Livros
</h1>

<div align="center">

![Maintenance](https://img.shields.io/maintenance/yes/2025?style=for-the-badge)
![License MIT](https://img.shields.io/badge/license-MIT-blue?style=for-the-badge)

![Java](https://img.shields.io/badge/Java-25-orange)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-4.0.0-green)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-18.1-blue)

</div>

## 📖 Sobre o Projeto

O **Literalura** é uma aplicação de linha de comando (CLI) desenvolvida em Java com Spring Boot. O objetivo do projeto é consumir a API externa [Gutendex](https://gutendex.com/) para buscar informações sobre livros, registrar esses dados em um banco de dados relacional (PostgreSQL) e permitir consultas complexas através de um menu interativo.

Este projeto faz parte dos desafios da formação Java da **Alura**.

## ⚙️ Funcionalidades

- **Consumo de API:** Busca livros por título na base de dados do Projeto Gutenberg.
- **Persistência de Dados:** Salva livros e autores automaticamente no banco de dados, evitando duplicidade de autores.
- **Consultas:**
  1. Buscar livros pelo título (Web + Banco).
  2. Listar todos os livros registrados.
  3. Listar autores registrados.
  4. Listar autores vivos em um determinado ano.
  5. Listar livros por idioma (EN, ES, PT, FR).

## 🛠️ Tecnologias Utilizadas

- **Java** (Linguagem principal)
- **Spring Boot** (Framework)
  - Spring Data JPA (Persistência)
- **PostgreSQL** (Banco de dados)
- **Hibernate** (ORM)
- **Jackson** (Deserialização de JSON)
- **Maven** (Gerenciador de dependências)

## 🚀 Como Executar o Projeto

### Pré-requisitos

- Java JDK instalado (versão 17 ou superior).
- PostgreSQL instalado e rodando.
- Maven (opcional, pois o projeto possui o Maven Wrapper).

### 1. Clonar o repositório

```bash
git clone https://github.com/0nF1REy/literalura-challenge.git
cd literalura-challenge
```

### 2. Configurar o Banco de Dados

O projeto utiliza variáveis de ambiente para conectar ao banco. Crie um arquivo `.env` na raiz do projeto (ou configure nas variáveis de ambiente da sua IDE) com as seguintes chaves:

```properties
DB_URL=jdbc:postgresql://localhost/literalura_db
DB_USERNAME=seu_usuario
DB_PASSWORD=sua_senha
```

> **Nota:** Certifique-se de criar o banco de dados chamado `literalura_db` no PostgreSQL antes de rodar a aplicação.

### 3. Executar a Aplicação

Você pode rodar via IDE (IntelliJ/Eclipse) executando a classe `LiteraluraApplication` ou via terminal usando o Maven Wrapper:

```bash
./mvnw spring-boot:run
```

## 🖥️ Exemplo de Uso

Após iniciar, o console apresentará o seguinte menu:

```text
1 - Buscar livro pelo título
2 - Listar livros registrados
3 - Listar autores registrados
4 - Listar autores vivos em um determinado ano
5 - Listar livros em um determinado idioma
0 - Sair
```

### Exemplo de busca

Ao selecionar a opção **1** e digitar `"Don Quixote"`:

```text
Livro salvo: Livro: Don Quixote | Autor: Cervantes, Miguel de | Idioma: es
```

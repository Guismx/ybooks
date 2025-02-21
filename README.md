# YBooks

## 📖 Sobre o Projeto

O **YBooks** é um sistema de livraria desenvolvido em **Java** com **Spring Boot**, permitindo o **cadastro e gerenciamento de livros**, bem como o **empréstimo de livros** pelos usuários.

Este projeto foi criado com o objetivo de **praticar e aprimorar habilidades de desenvolvimento back-end**.

---

## 🚀 Funcionalidades

✅ **Cadastro de Usuários**

- Registro de usuários com perfis: **Normal, Funcionário ou Administrador**.

✅ **Cadastro de Livros**

- Funcionários e Administradores podem **adicionar livros** informando **título, autor, editora e ano de publicação**.
- Registro de quem cadastrou o livro.

✅ **Empréstimo de Livros**

- Usuários normais podem **solicitar empréstimos**.
- Registro do empréstimo com **data de devolução prevista e real**.

✅ **Comentários e Avaliações**

- Usuários podem **deixar comentários e avaliar os livros**.

✅ **Categorias de Livros**

- Livros podem ser categorizados (**Ficção, Não-ficção, Ciência, História**, etc.).
- Possibilidade de **filtro e pesquisa** por categoria.

✅ **Histórico de Ações dos Usuários**

- Registro de atividades como **cadastro de livros, empréstimos e avaliações**.

✅ **Recomendações de Livros**

- Sugestões de livros com base no **histórico de empréstimos e avaliações**.

✅ **Gerenciamento de Estoque**

- Controle da **quantidade disponível de cada livro**.

✅ **Relatórios e Estatísticas**

- **Número de livros cadastrados por categoria**.
- **Livros mais emprestados**.
- **Usuários mais ativos**.

---

## 🛠️ Tecnologias Utilizadas

- **Java**
- **Spring Boot**
- **MySQL**
- **Maven**
- **Hibernate (JPA)**
- **REST API**

---

## 🏗️ Estrutura do Projeto

O projeto segue o padrão **MVC (Model-View-Controller)** com a seguinte estrutura de pacotes:

- 📂 `entities` → Contém as classes de entidade do sistema.
- 📂 `repositories` → Interfaces de repositório para a persistência de dados.
- 📂 `services` → Classes de serviço contendo a lógica de negócios.
- 📂 `controllers` → Classes de controlador que expõem os endpoints REST.

---

## 🛠️ Configuração do Banco de Dados

No arquivo `application.properties`, configure a conexão com o banco de dados:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ybooks
spring.datasource.username=root
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

## ▶️ Como Executar o Projeto

1. **Clone o repositório**:
   ```sh
   git clone https://github.com/seu-usuario/ybooks.git
   ```
2. **Acesse o diretório do projeto**:
   ```sh
   cd ybooks
   ```
3. **Configure o banco de dados** no arquivo `application.properties`.
4. **Execute o projeto** com o comando:
   ```sh
   mvn spring-boot:run
   ```

---

## 🤝 Contribuições

Contribuições são bem-vindas! 💡

- Sinta-se à vontade para **abrir issues** e **enviar pull requests**.
- Antes de contribuir, leia as diretrizes do projeto.

📩 Caso tenha dúvidas, entre em contato!

---


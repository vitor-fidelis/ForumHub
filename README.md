# ForumHub

<img src="http://img.shields.io/static/v1?label=STATUS&message=EM%20DESENVOLVIMENTO&color=blue&style=for-the-badge"/>
<div>
  <img src="https://img.shields.io/badge/maven--central-v4.0.0-white"/>
  <img src="https://img.shields.io/badge/spring--boot-v3.3.1-white"/>
  <img src="https://img.shields.io/badge/java--jwt-v4.2.1-white"/>
</div>

## Desafio Challenge Back End - FórumHub

Bem-vindo ao meu mais recente desafio Challenge Back End!

Um fórum é um espaço onde todos os participantes de uma plataforma podem colocar suas perguntas sobre determinados assuntos. Aqui na Alura, os alunos e alunas utilizam o fórum para tirar suas dúvidas sobre os cursos e projetos em que estão participando. Este lugar mágico está cheio de muita aprendizagem e colaboração entre alunos, professores e moderadores.

Já sei para que serve o fórum e conheço sua aparência, mas sabemos como ele funciona por trás dos panos? Ou seja, onde se armazenam as informações? Como são tratados os dados para que se relacione um tópico com uma resposta, ou como se relacionam os usuários com as respostas de um tópico?

Este é o meu desafio, chamado de FórumHub: nele, vou replicar este processo no nível do back end e, para isso, criarei uma API REST usando Spring.

Minha API se concentrará especificamente nos tópicos, e deve permitir aos usuários:

- Criar um novo tópico;
- Mostrar todos os tópicos criados;
- Mostrar um tópico específico;
- Atualizar um tópico;
- Eliminar um tópico.

É o que conhecemos normalmente como CRUD (CREATE, READ, UPDATE, DELETE) e é muito parecido com o que desenvolvemos no LiterAlura, mas agora de forma completa, agregando as operações de UPDATE e DELETE, e usando um framework que facilitará muito o meu trabalho.

Em resumo, meu objetivo com este challenge é implementar uma API REST com as seguintes funcionalidades:

- API com rotas implementadas seguindo as melhores práticas do modelo REST;
- Validações realizadas segundo as regras de negócio;
- Implementação de uma base de dados relacional para a persistência da informação;
- Serviço de autenticação/autorização para restringir o acesso à informação.

## Funcionalidades Principais

- Listagem de tópicos
- Detalhamento de tópicos
- Criação, atualização e exclusão de tópicos
- Autenticação de usuários

## Tecnologias Utilizadas

- Spring Boot
- Java
- Hibernate/JPA
- Mysql

## Prints do Projeto

Aqui estão alguns prints do projeto que mostram algumas das funcionalidades em ação:

### Tela de Login

![Captura de ecrã 2024-07-14 214936](https://github.com/user-attachments/assets/1cadc80b-708a-4ed8-923b-b73e7a7dd096)

### Listagem de Tópicos

![Captura de ecrã 2024-07-14 215135](https://github.com/user-attachments/assets/75c46b28-a129-453f-930c-c532f34bbeee)


### Detalhes de um Tópico

![Captura de ecrã 2024-07-09 142948](https://github.com/user-attachments/assets/47c51373-14b8-4492-acc2-7bf61728568e)


### Formulário de Criação de Tópico

![Formulário de Criação de Tópico](screenshots/form_criacao_topico.png "Formulário de Criação de Tópico")

## Como Executar o Projeto

Para executar o projeto localmente, siga os passos abaixo:

1. Clone o repositório.
2. Configure o banco de dados Mysql.
3. Execute `mvn spring-boot:run` na raiz do projeto.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Licença

Este projeto está licenciado sob a Licença Apache 2.0. Veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## Badge Conclusão



Desafio   
Marvel chegou em SimCity


Dessa vez quem chegou em SimCity foram os personagens da Marvel para fechar essa temporada com chave de ouro e para isso eles trouxeram juntos um aplicativo de personagens! Seu objetivo como pessoa desenvolvedora é proporcionar que os habitantes de SimCity possam logar nesse aplicativo, realizar registro e implementar funções de validação e testes dentro dessa aplicação garantindo um produto de qualidade para todos da cidade.


Requisitos de negócio
1. Eu como usuária quero após ver a tela de splash da aplicação ver uma tela de login;
2. Eu como usuária quero ver nessa tela de login:
   1.  campos para eu digitar: email e senha
   2. ver um texto escrito "Crie sua conta agora"
   3. ver um botão de login;
3. Eu como usuária ao realizar o login quero poder ser autenticada com sucesso e ir para a tela de home, caso ocorra algum erro quero receber um toast com uma mensagem de feedback sendo "não foi possível realizar o login";
4. Eu como usuária que poder ter acesso a opção se sair da aplicação atravém de um item de menu chamado "Sair" que ao clicar quero ser deslogada do aplicativo e voltar para a tela de login;
5. Eu como usuária na tela de login ao clicar em "Crie sua conta agora" quero ir para uma tela de registro que contenha os campos para eu poder digitar:
   1. nome
   2. email
   3. senha
E que contenha um botão "REGISTRAR CONTA" que ao clicar quero poder ser autenticada com sucesso e ir para a tela de home, caso ocorra algum erro quero receber um toast com uma mensagem de feedback sendo "não foi possível realizar o registro";
6. Eu como usuária ao estar na tela de home quero ver uma mensagem "Olá <addNomeDoUsuário> esses são alguns dos personagens da Marvel"
7. Como regra de negócio quero verificar se existe validação para todos os campos de login e registro sendo eles:
   1. validação de email;
   2. validação de senhas menos que 8 digitos
   3. validação de nomes menores de 3 digitos
8. Como regra de negócio quero que a aplicação possua testes unitários para todos os métodos de validação de email, senha e nomes;
9. Como regra de negócio quero que a aplicação possua testes de ui utilizando Espresso validando as ações de login e registros sendo elas:
   1. inserir email inválido e senha correta, deve mostrar erro.
   2. inserir email válido e senha incorreta, deve mostrar erro.
   3. inserir email válido e senha correta, deve navegar para home, validar se nome de usuário está visivél
Observação: mesmos testes para tela de Login e Resistro.


10. Como regra de negócio quero a geração dos relatórios de cobertura de testes usando o Code Coverage do Android.


Protótipo da aplicação completa:
Protótipo contendo o fluxo de navegação completa


Link do repositório
Projeto Marvel


Entrega Mínima
Será considerado entrega mínima a aplicação que atender os seguintes requisitos de negócio e de layout
Requisitos de negócio
1. Eu como usuária quero após ver a tela de splash da aplicação ver uma tela de login;
2. Eu como usuária quero ver nessa tela de login:
   1.  campos para eu digitar: email e senha
   2. ver um texto escrito "Crie sua conta agora"
   3. ver um botão de login;
3. Eu como usuária ao realizar o login quero poder ser autenticada com sucesso e ir para a tela de home, caso ocorra algum erro quero receber um toast com uma mensagem de feedback sendo "não foi possível realizar o login";
4. Eu como usuária que poder ter acesso a opção se sair da aplicação atravém de um item de menu chamado "Sair" que ao clicar quero ser deslogada do aplicativo e voltar para a tela de login;
5. Eu como usuária na tela de login ao clicar em "Crie sua conta agora" quero ir para uma tela de registro que contenha os campos para eu poder digitar:
   1. nome
   2. email
   3. senha
E que contenha um botão "REGISTRAR CONTA" que ao clicar quero poder ser autenticada com sucesso e ir para a tela de home, caso ocorra algum erro quero receber um toast com uma mensagem de feedback sendo "não foi possível realizar o registro";
6. Eu como usuária ao estar na tela de home quero ver uma mensagem "Olá <addNomeDoUsuário> esses são alguns dos personagens da Marvel"
7. Como regra de negócio quero verificar se existe validação para todos os campos de login e registro sendo eles:
   1. validação de email;
   2. validação de senhas menos que 8 digitos
   3. validação de nomes menores de 3 digitos
Protótipo
  



Layout
* Cor: #7F0000 
* Texto: Bold 14sp
* Margem: 16dp
________________


Entrega média
Será considerado entrega média a aplicação que atender os seguintes requisitos de negócio e de layout
Requisitos de negócio:
1. Como regra de negócio quero que a aplicação possua testes unitários para todos os métodos de validação de email, senha e nomes;
2. Como regra de negócio quero a geração dos relatórios de cobertura de testes usando o Code Coverage do Android.


Importante: Entrega média é válida APENAS se a mínima estiver desenvolvida e funcional.
________________


Entrega Máxima
Será considerado entrega máxima a aplicação que atender os seguintes requisitos de negócio e de layout
Requisitos de negócio:
1. Como regra de negócio quero que a aplicação possua testes de ui utilizando Espresso validando as ações de login e registros sendo elas:
   1. inserir email inválido e senha correta, deve mostrar erro.
   2. inserir email válido e senha incorreta, deve mostrar erro.
   3. inserir email válido e senha correta, deve navegar para home, validar se nome de usuário está visivél


Observação: mesmos testes para tela de Login e Resistro.


2. Como regra de negócio quero a geração dos relatórios de cobertura de testes usando o Code Coverage do Android.


IMPORTANTE: Entrega máxima válida APENAS se a média estiver desenvolvida e funcional.
________________


O que será analisado
* Uso dos conceitos Orientação a Objetos no desenvolvimento da lógica;
* Boas práticas de código(nomenclatura, estrutura de projeto, organização de código entre outros);
* Uso dos princípios de Responsabilidade Única e Aberto-Fechado;
* Tratamento de exceções e erros;
* Implementação de Arquitetura;
* Firebase;
* Testes;


Documentar a entrega marcando no classroom e adicionar o link do repositório do GitHub contendo o código do desafio e a descrição do projeto no arquivo Readme.md
Não será aceito entregas por e-mail, apenas será aceito entregas via classroom.

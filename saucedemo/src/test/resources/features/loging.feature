
@login
Feature: Login
  Como usuario 
  Quero realizar o login
  Para acessar a conta
  
  Background: Acessar a tela de login
  Given que esteja na tela de login

  @loginPositivo
  Scenario: Login valido
    And preencher o usuario
    And preencher a senha
    When realizar o login
    Then login realizado com sucesso
    
      @loginbloqueado
  Scenario: User bloqueado
    But preencher com usuario bloqueado
    And preencher  senha
    When realizar o login
    Then sistema apresenta mensagem de usuario bloqueado
    
   @loginInvalido
  Scenario: Login com dados invalidos
    But preencher o usuario invalidos
    But preencher a senha invalidos
    When realizar o login
    Then sistema apresenta mensagem de usuario e senha inavalida
     
 @loginEmBranco
  Scenario: Login com dados em branco
    But nao preencher nenhum dado
    When realizar o login
    Then sistema apresenta dados em branco
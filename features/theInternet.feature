@regress
Feature: Challenging Dom

  Eu, como Automatizador
  Quero poder realizar as interações necessária
  Para que eu passe pela fase de case

  Background:
    Given que eu navego até a url "https://the-internet.herokuapp.com/challenging_dom"
    When a página carrega

  Scenario Outline: Efetuar um clique em nos botões azul, vermelho e verde
    Then clico no "<button>"

    Examples:
      | button       |
      | blue_button  |
      | red_button   |
      | green_button |

    Scenario: Clicar em todos os botões edit e delete
      Then clico em todos os botões que contém edit e delete


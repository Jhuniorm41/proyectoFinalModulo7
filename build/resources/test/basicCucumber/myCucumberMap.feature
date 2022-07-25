Feature: Map

  Scenario: Map

    Given tengo acceso a todo.ly
    When realizo click en el boton login
    And ingreso a la aplicacion usando
      | email    | eynar@eynar.com |
      | password | 12345           |
    Then deberia ingresar a la aplicacion




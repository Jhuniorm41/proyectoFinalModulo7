Feature: Login

  Scenario Outline: Como usuario quiero ingresar a la aplicacion usando
  email y pwd para revisar mis archivos

    Given tengo acceso a todo.ly
    When realizo click en el boton login
    And ingreso mi correo electronico: "<email>"
    And ingreso mi password: <password>
    And realizo click en el boton login
    Then deberia ingresar a la aplicacion

    Examples:
      | email             | password |
      | eynar@eynar.com   | 123      |
      | eynar2@eynar2.com | 456      |
      | eynar3@eynar3.com | 789      |
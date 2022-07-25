Feature: Login

  Scenario: Como usuario quiero ingresar a la aplicacion usando
    email y pwd para revisar mis archivos

    Given tengo acceso a todo.ly
    When realizo click en el boton login
    And ingreso mi correo electronico: "eynar@eynar.com"
    And ingreso mi password: 12345
    And realizo click en el boton login
    Then deberia ingresar a la aplicacion



Feature: List

  Scenario: List

    Given tengo acceso a todo.ly
    When realizo click en el boton login
    And ingreso mi correo electronico: "eynar@eynar.com"
    And ingreso mi password: 12345
    And realizo click en el boton login
    Then deberia ingresar a la aplicacion
    And los siguientes controles deberian ser mostrados
      | admin    |
      | compras  |
      | ventas   |
      | facturas |




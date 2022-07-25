Feature: Register

  Scenario: verify the register is successfully

    Given la pagina "http://todo.ly/" este abierta
    When yo quiero realizar el register
      | name     | junior@gmail.com      |
      | email    | maestria@maestria.com |
      | password | 12345                 |
      | terms    | check                 |
    Then yo deberia ingresar a la app web al registrarme
Feature: Password

  Scenario: verify the login is successfully

    Given la pagina "http://todo.ly/" este abierta
    When yo quiero realizar el login
      | email    | juniorgm@gmail.com     |
      | password | 123456                 |
    Then yo deberia ingresar a la app web setting
      | oldPass    | 123456 |
      | newPass    | 12345  |
    When o deberia ingresar a la app web con nuevo password
      | email    | juniorgm@gmail.com |
      | password | 12345              |
    Then yo deberia ingresar a la app web
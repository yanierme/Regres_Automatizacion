Feature: Actualizacion de usuario
  El Usuario requiere verificar la correcta funcionalidad de la peticion actualizacion de usuario
  y validar la respuesta esperada

  Scenario: Verificar actualizacion de usuario en la api regres
    Given conecta con el servicio para actualizar el usuario
    When actualizar el usuario con los datos
      | name  | job     | id |
      | Pablo | Taxista | 8  |
    Then valida el codigo de respuesta de la actualizacion del usuario


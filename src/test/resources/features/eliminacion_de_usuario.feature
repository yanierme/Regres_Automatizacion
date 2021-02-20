Feature: Servicio Rest
  El Usuario requiere verificar la correcta funcionalidad de la peticion eliminar usuario
  y validar la respuesta esperada

  Scenario: Verificar creacion de usuario en la api regres
    Given conecta con el servicio para eliminar el usuario
    When eliminar el usario con el id
      | id |
      | 8  |
    Then valida el codigo de respuesta de la peticion eliminar


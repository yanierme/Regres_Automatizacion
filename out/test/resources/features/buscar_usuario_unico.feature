Feature: Buscar usuario unico
  El Usuario requiere verificar la correcta funcionalidad de la peticion buscar usuario unico
  y validar la respuesta esperada

  Scenario: Verificar la consulta de usuario unico
    Given conecta con el servicio para la consulta del usuario
    When busca el usuario con los datos
      | id |
      | 3  |
    Then valida el codigo de respuesta de la consulta


Feature: Lista de usuarios
  El Usuario requiere verificar la correcta funcionalidad de la peticion de listar los usuarios
  y validar la respuesta esperada

  Scenario: Verificar la lista de usuarios en la api regres
    Given conecta con el servicio para consultar los usuarios
    When consulta los usuarios por pagina
    Then valida el codigo de respuesta para la consulta


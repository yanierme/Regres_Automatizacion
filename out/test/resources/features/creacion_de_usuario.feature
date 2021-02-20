Feature: Creacion de usuarios
  El Usuario requiere verificar la correcta funcionalidad de la peticion Creación de usuario
  y validar la respuesta esperada

  Scenario: Verificar creacion de usuario en la api regres
    Given conecta con el servicio para crear el usuario
    When crea usuario con los datos
      | name  | job       |
      | Carla | Profesora |
    Then valida el codigo de respuesta


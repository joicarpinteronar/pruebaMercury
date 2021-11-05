# language: es

Característica: Registrar un nuevo usuario de manera exitoso
dada la pagina http://demo.guru99.com/test/newtours
Como usuario de la pagina
Quiero registrarme de manera exitosa

  Escenario: Registro de manera exitosa en el portal Mercury Tours

  @registrar
  Esquema del escenario: Registrar un nuevo usuario en la pagina Mercury Tour
    Dado que el Usuario ingresar al portal mercury tour
    Cuando ingresa los datos de registro en el formulario
      | nombre   | apellido   | telefono   | correo   | direccion   | ciudad   | provincia   | postal   | pais   | usuario   | password   | passwordConfirmacion   |
      | <nombre> | <apellido> | <telefono> | <correo> | <direccion> | <ciudad> | <provincia> | <postal> | <pais> | <usuario> | <password> | <passwordConfirmacion> |
    Entonces verifico que el nuevo registro sea exitoso

    Ejemplos:
      | nombre   | apellido   | telefono   | correo               | direccion       | ciudad   | provincia    | postal   | pais     | usuario   | password | passwordConfirmacion |
      | Alejandra| Test       | 3114587541 | aleja123@yopmail.com | Cll 28 # 45 -56 | Bogota   | Cundinamarca | 1102111  | COLOMBIA | Aleja785  | 123456   | 123456               |



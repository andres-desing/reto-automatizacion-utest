#language: es


Característica: Se realiza la creacion de un nuevo usuario en la pagina utest.com

  como usuario
  quiero ingresar a la pagina utest
  para crear un nuevo usuario

  @EscenarioHU001
  Esquema del escenario:El usuario accede a la pagina utest
    Dado que el actor se encuentra en la pagina utest
    Y selecciona el boton jointoday
    Cuando diligencia los datos personales en el formulario
      | firtsname   | lastname   | email   |
      | <firtsname> | <lastname> | <email> |
    Y realiza un onclik en en el boton next location
    Y despues ingresa a la siguiente pagina y ingresa los datos requeridos de localizacion
      | city   | postal   |
      | <city> | <postal> |
    Y realiza un onclick en el boton next device
    Y luego es redireccionado a la pagina cuentanos sobre tus dispositivos y diligenciar los campos
    Y seleccionamos el boton nex last step
    Y nos dara ingreso a la pagina de creacion de la contraseña
      | password   | confirmarpassword   |
      | <password> | <confirmarpassword> |
    Entonces se valida la creacion del usuario seleccionando el boton complete setup

    Ejemplos:
      | firtsname | lastname | email            | city   | postal | password    | confirmarpassword |
      | Andrea    | Baquero  | antonietas@gmail.com | Bogota | 110111 | 80138077Mao | 80138077Mao       |


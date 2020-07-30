#language:es
Característica: Inicio de sesion

  Escenario: Inicio de sesion exitoso
    Dado que estoy en la pagina de inicio
    Cuando ingreso las credenciales
      | email                    | clave    |
      | andres_f0818@hotmail.com | 12345678 |
    Entonces valido la presencia del boton My Addresses

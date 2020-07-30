#language:es
Característica: Agregar una nueva direccion

	Antecedentes:
	
    Dado que estoy en la pagina de inicio
    Cuando ingreso las credenciales
      | email                    | clave    |
      | andres_f0818@hotmail.com | 12345678 |
    Entonces valido la presencia del boton My Addresses

  Escenario: Registro exitoso
    Dado que estoy en la pagina de registro de direcciones
    Cuando ingreso los datos
      | first name | last name | company | address     | address line two | city  | state   | postal code | home phone | mobile phone | Additional information       | title          |
      | Andres     | Gallego   | Test    | st 50 13-12 | apartament 201   | Miami | Florida |       33101 |    6008989 |   8907654545 | Cerca de Bayside Marketplace | MY NEW ADDRESS |
    Entonces valido la presencia del boton Add a new address

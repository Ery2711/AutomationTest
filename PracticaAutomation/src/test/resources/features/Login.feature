Feature: Product - Store

  Scenario Outline: Realizar el login - Store

    Given estoy en la página de la tienda "https://qalab.bensg.com/store"
    When doy click en la opción iniciar sesión
    And doy click en el link text cree una cuenta aquí
    And lleno los campos del formulario para el registro: '<nombre>' '<apellido>' '<email>' '<pwd>' '<fechaNac>'
    And doy click en el botón guardar
    Then debería visualizar mi usuario logeado en la pantalla: '<nombre>' '<apellido>'
    Examples:
    |nombre|apellido|email|pwd|fechaNac|
    |JuanTres  |PerezTres   |usuario3@usuario.com|TestLab123|27/08/1995|
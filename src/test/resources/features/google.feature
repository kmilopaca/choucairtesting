#language:es
@DEMO
Característica: Prueba de concepto SpringBoot + Cucumber - GOOGLE

  @GOOGLE_SEARCH
  Escenario: caso1-Busqueda en google
    Dado que abro la pagina de google
    Cuando escribo la busqueda de: "cantantes de rock"
    Entonces valido que los resultados sean mayores a 0

  @GOOGLE_SETTINGS
  Escenario: caso2-Configuraciones en google
    Dado que abro la pagina de configuracio de google
    Cuando busco la opcion "Usuario"
    Entonces valido que el resultado sea "Autocompletar"

    @test_ingreso_Exito_page
    Escenario: cuando ingreso al exito selecciono articulos
      Dado que abro la pagina del exito
      Cuando selecciono la caja de busqueda
      Y seleccione categorias
      Y seleccione tegniologia
      Y agrego al carrito el producto
      Entonces Valido que el sistema me agregue los productos al carrito
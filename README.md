# Consumo de servicios REST en https://reqres.in/
 
La aplicaci�n fue construida con las siguientes herramientas y lenguaje de programaci�n:

* Java 8
* Gradle 4.10
* Cucumber

Para compilar la prueba se requiere de instalar Gradle en la maquina local de ejecuci�n, una vez instalado, procedemos a abrir una sesi�n del CMD en 
la raiz del proyecto y ejecutamos el siguiente comando.
```
gradlew clean build -x test
```

Para ejecutar las pruebas y generar el informe de serenidad bdd
```
gradlew test aggregate
```
Estas evidencias  que alojada en la siguiente ruta 
```
ruta_del_usuario\Regres_Automatizacion\target\site\serenity
```


# Reto T茅cnico de automatizaci贸n

Proyecto en el que se crea una automatizaci贸n, la cual se encarga de ingresar a la 
p谩gina de utest.com, acceder al formulario de registro y procede a llenarlo
para crear un nuevo usuario

## Comenzando 馃殌

* Java - Importante instalar la versi贸n 8 del Jdk (problemas con otras versiones)
* Gradle
* Instalar la 煤ltima versi贸n de IntelliJ.

### Pre-requisitos 馃搵

* Asegurarse de tener las variables de entorno configuradas
```
gradle -v
------------------------------------------------------------
Gradle 5.4.1
------------------------------------------------------------
```
* Al configurar el proyecto importante seleccionar la versi贸n instalada en caso de tener m谩s versi贸n del jdk


## Ejecutando las pruebas 鈿欙笍

### 隆 importante !

### Para que una prueba sea exitosa debemos tener en cuenta los siguientes detalles:

1. Asegurarnos de que el correo no est茅 registrado en la p谩gina, para esto modificamos el feature (los datos del feature est茅n listos para una primera prueba ) y lo tenemos que hacer para cade prueba exitosa que obtengamos.
2. Ingresar un correo relacionado con nuestros nombres (que no aparente ser de prueba- excluir *new* *mail* u otros) para evitar el captcha
3. La automatizaci贸n utiliza el autocompletado en el formulario de ubicaci贸n y dispositivos - verificar que el navegador cuenta con permisos para esta secci贸n, generalmente estan activados por defecto.
4. Los principales inconvenientes fueron solventados (autocompletado del formulario - captcha) - Aun as铆, si falla a la primera podemos realizar un segundo intento revisando los pasos anteriores

## Construido con 馃洜锔?

*   Descarga IntelliJ IDEA Community

*   Descarga Java JDK 1.8

*   Descarga GRADLE

## Versionado 馃搶

[SemVer](http://semver.org/) para el versionado.

## Autor 鉁掞笍

Proyecto elaborado por [diego0at](https://diego.iniciarweb.online/#BodySectionSkills).
___
* **Proyecto Utest** - *Elaborado bajo el material de* - [Choucair acadmey](https://operacion.choucairtesting.com/)
---
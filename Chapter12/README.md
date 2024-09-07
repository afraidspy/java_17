Este archivo describe los pasos necesarios para compilar y ejecutar el módulo modules01, que contiene una clase HelloWorld en el paquete com.example.

## Estructura del Proyecto

Tu proyecto debe tener la siguiente estructura de directorios:

Chapter12/
  └── src/
      ├── modules01/
          └── module-info.java
      │   └── com/
      │       └── example/
      │           ├── HelloWorld.java
      │  

### `src/modules01/module-info.java`

Este archivo define el módulo `modules01` y exporta el paquete `com.example`:

```java
module modules01 {
    exports com.example;
}

# Moverse al directorio 
cd path/to/Chapter12

javac -d out --module-source-path src src/modules01/module-info.java src/modules01/com/example/HelloWorld.java

Después de la compilación, tu directorio out debería verse así:

out/
  modules01/
    com/
      example/
        HelloWorld.class
    module-info.class

Desde el directorio raíz del proyecto (Chapter12), ejecuta el siguiente comando:

java --module-path out --module modules01/com.example.HelloWorld

## Explicacion

Usa --module-path out para especificar el directorio donde se encuentran los módulos compilados.
Ejecuta el módulo modules01 y la clase principal com.exa

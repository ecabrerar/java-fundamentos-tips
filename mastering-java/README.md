# Fundamentos de Java
## Consejos prácticos sobre Java que cambiarán la forma en que codificas


Para la ejecución, es necesario tener instalada una versión Java 8 en adelante, recomiendo utilizar el manejador sdkman, Ir a https://sdkman.io/.

 Existen dos directorios:
 * start : definiciones bases para los ejercicios
 * finish: los ejercicios completos.
 
 
 Para ejecutar los ejemplos, utilizar el envoltorio de Gradle:

```bash
 ./gradlew tasks
 
 # Lista de los ejercicios:
 
./gradlew tiposDatosYValoresPorDefecto
./gradlew manejoCadenasCaracteres
./gradlew cuandoUtilizarStringBuilder
./gradlew eviteTipoDatosRaw
./gradlew usarTiposEnumerados
./gradlew entenderUsoEqualsYHashcode
./gradlew comprenderUsoyManejoExcepciones
./gradlew hacerLoggingCorrectamente
./gradlew manejarCorrectamenteLosRecursos
./gradlew utilizarVarags
./gradlew utiliceBigDecimalSiRequiereResultadoExacto
./gradlew utilicePathYFiles
./gradlew adoptarExpresionesLambdas
./gradlew explorarAPIStream
./gradlew aprovecharElUsoDeOptional

  
```

Notas:
----

#### 1. Conocer los tipos de datos y sus valores por defecto. 

#### 2. Concatenar las cadenas de caracteres de forma correcta.
  - Evitar concatenar usando el signo de más (+), usar el método `concat` o `join` para tales fines.
	
   - Método `String join(CharSequence delimiter, CharSequence... elements)`
   -  Utilizar el método `format(String format, Object... args)` si la cadena recibe algún valor dinámico

#### 3. Para cadenas grandes de caracteres usar `StringBuilder` en lugar de `StringBuffer` 
- inicializar constructor
- métodos encadenados

#### 4. Evite Raw Type y en su lugar utilice tipos genericos 

#### 5. Usar tipos enumerados (enum)


#### 6. Conocer los paquetes más utilizados
- Paquetes de Propósito General
java.math
java.util
java.net
...

- Paquetes de Propósito Especial
java.sql
java.time
...


#### 7. Comprender el uso y manejo de excepciones done!
  
- Utilizar Unchecked Exception en lugar de Checked Exception
- Crear clases personalizadas para manejar nuestras excepciones.
- Evitar mostrar al usuario los mismos mensajes generados por las excepciones, en su lugar colocar mensajes  personalizados que el usuario final pueda entender sin problemas.

#### 8. Manejar los logs de forma más inteligente
  - Evitar escribir en la consola usando printStackTrace(), en su lugar usar un Logger
  - java.util.logging
  - slf4j + logback
  
####. Tratar los recursos (de archivos, conexiones a base de datos, socket, etc.) de forma correcta done!

- Manejando recursos de base de datos manualmente
- Manejando recursos de archivos manualmente
- Uso de try-with-resources para recursos de base de datos


#### 10. Usar Varargs

#### 11. Siempre tener en cuenta que micro optimizaciones pueden mejorar el rendimiento de nuestra aplicación
- metodos de validacion
- Al usar querys nativo solo usar PreparedStatement con parámetros binding.

#### 12. Utilizar Paths y Files
#### 13. Aprender cómo y por qué usar Expresiones Lambdas
#### 14. Utilizar el API Stream y las expresiones Lambda en conjunto para proporcionar potentes capacidades de filtrado
- Elementos de un Stream

#### 15. Entender, aceptar y aprovechar Optional

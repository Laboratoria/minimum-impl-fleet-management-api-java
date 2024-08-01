# Fleet Management Software API Java Sample Implementation

## Introducción

Este proyecto es una implementación de
[Fleet Management Software API](https://github.com/Laboratoria/curriculum/tree/main/projects/05-fleet-management-api)
en Java y Spring Boot, orientada a implementar los proyectos de **DevOps**.
Actualmente, solo se ha implementado el endpoint
[GET /taxis](https://app.swaggerhub.com/apis-docs/ssinuco/FleetManagementAPI/2.0.0#/taxis/getTaxi)
sin autenticación.

## ¿Cómo ejecutar este proyecto?

1. **Configurar la base de datos**:
   - Necesitas una base de datos PostgreSQL en Vercel con al menos la tabla `taxis`. 
   - Puedes crear esta base de datos siguiendo los
   [pasos 2, 3 y 4](https://github.com/Laboratoria/curriculum/tree/main/projects/05-fleet-management-api#8-pistas-tips-y-lecturas-complementarias)
   de la sección "8. Pistas, tips y lecturas complementarias"
   del README de Fleet Management Software API.

2. **Configurar variables de entorno**:
   - Renombra el archivo `application.properties.sample` a `application.properties`
   - Modifica el valor de la variable de entorno `spring.datasource.url` con la información proporcionada por Vercel.
   - Modifica el valor de la variable de entorno `spring.datasource.username` con la información proporcionada por Vercel.
   - Modifica el valor de la variable de entorno `spring.datasource.password` con la información proporcionada por Vercel.
   - Opcionalmente, puedes cambiar la variable de entorno `server.port` para especificar el puerto en el que la API escuchará peticiones HTTP. Esto es importante al desplegar la API en la nube en proyectos de **DevOps**.

3. **Abre el código en un IDE**:
   - Abre el código en un VSCode o IntelliJ.

4. **Ejecuta la aplicación**:
   - En el IDE seleccionado ejecuta el archivo `FleetManagementApiApplication.java`

   Puedes probar la aplicación haciendo una petición GET a `http://localhost:PORT/taxis`,
   reemplazando `server.port` por el valor de la variable de entorno `server.port` en el archivo `application.properties`.
   Si la aplicación se está ejecutando correctamente, deberías obtener como respuesta un array
   JSON con 10 registros de la tabla `taxis` de la base de datos configurada en Vercel.

## ¿Cómo compilar este proyecto?

- Para compilar el proyecto, ejecuta el comando `mvn build` en una terminal. El resultado
  de la compilación será un archivo JAR `fleet_management_api-0.0.1-SNAPSHOT.jar` en la carpeta `target`.
- Para probar la aplicación compilada, ejecuta el comando `java -jar target/fleet_management_api-0.0.1-SNAPSHOT.jar` en una terminal.

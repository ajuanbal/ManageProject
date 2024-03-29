# ManageProject

Este proyecto está diseñado para gestionar proyectos y personas asociadas a esos proyectos. Utiliza tecnologías como Spring Boot, Spring Data JPA, MySQL, etc.

## Configuración del Proyecto

### Requisitos Previos
- Java 17
- Maven
- MySQL

### Configuración de la Base de Datos
1. Crea una base de datos en MySQL llamada `nombre_de_tu_base_de_datos`.
2. Configura las credenciales de acceso a la base de datos en el archivo `application.properties`.
3. En los recursos se encuentran el archivo INSERTs.sql para su validacion. 
4. Antes de realizar los insert se recomienda ejecutar este programa en modo create-drop 
5. Ejecuar los insert y ejecutar el programa en modo update 

### Ejecución del Proyecto
1. Clona el repositorio.
2. Navega al directorio del proyecto.
3. Ejecuta la aplicación: `mvn spring-boot:run`

## Uso de la API

### + Listar Todos los Participantes de un Proyecto
GET /api/projects/{projectId}/participants

Este endpoint devuelve la lista de todos los participantes asociados a un proyecto específico identificado por el `projectId`.

### + Listar Proyectos Ordenados por Presupuesto

GET /api/projects/list

Este endpoint devuelve la lista de proyectos ordenados por presupuesto de forma descendente.


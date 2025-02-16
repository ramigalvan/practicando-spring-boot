# Proyecto de Ecommerce con Spring Boot

Este es un proyecto de ejemplo para practicar con **Spring Boot**. El propósito es construir una API REST para gestionar productos en un ecommerce. El proyecto incluye un controlador para crear productos, un servicio para manejar la lógica de negocio y una capa de datos para almacenar la información del producto.

## Características

- **Crear productos**: La API permite crear productos con los datos necesarios como nombre, descripción y precio.
- **Versionado de la API**: Se ha implementado versionado de la API para facilitar la evolución futura de la aplicación (`/v1/api/products`).
- **DTO**: Se usa un `ProductDTO` para transferir datos entre el cliente y la API.

## Tecnologías Usadas

- **Spring Boot**: Framework para desarrollar la API REST.
- **Java 17**: Lenguaje de programación.
- **Lombok**: Librería para reducir la verbosidad del código (anotaciones como `@RequiredArgsConstructor`).
- **MySQL**: Base de datos utilizada para almacenar los productos.
- **Spring Data JPA**: Para la persistencia de datos.

## Configuración de la Base de Datos

Para utilizar **MySQL**, asegúrate de que tu base de datos esté configurada y actualiza el archivo `application.properties` o `application.yml` con los siguientes datos:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ecommerce
spring.datasource.username=tu_usuario
spring.datasource.password=tu_contraseña
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.database-platform=org.hibernate.dialect.MySQLDialect
spring.jpa.hibernate.ddl-auto=update
```

## Endpoints

### Crear un Producto

- **URL**: `/v1/api/products`
- **Método HTTP**: `POST`
- **Body (JSON)**:

  ```json
  {
    "name": "Producto A",
    "description": "Descripción del Producto A",
    "price": 100.0
  }
  ```

- **Respuesta**:
  - **Código de Estado**: `201 Created`
  - **Body**:

    ```json
    {
      "id": 1,
      "name": "Producto A",
      "description": "Descripción del Producto A",
      "price": 100.0
    }
    ```

## Instalación

1. **Clona el repositorio**:

   ```bash
   git clone https://github.com/nikogalvan/ecommerce-spring-boot.git
   ```

2. **Accede al directorio del proyecto**:

   ```bash
   cd ecommerce-spring-boot
   ```

3. **Instala las dependencias** (asegúrate de tener Maven o Gradle instalado):

   ```bash
   mvn clean install
   ```

4. **Ejecuta la aplicación**:

   ```bash
   mvn spring-boot:run
   ```

   La aplicación estará corriendo en `http://localhost:8080`.

## Uso

### Crear un Producto

Para crear un producto, envía una solicitud **POST** al endpoint `/v1/api/products` con un body como el siguiente:

```json
{
  "name": "Nuevo Producto",
  "description": "Descripción del producto",
  "price": 99.99
}
```

### Respuesta esperada

Al realizar la solicitud correctamente, recibirás una respuesta con un código HTTP 201 y el objeto creado con el `id` asignado:

```json
{
  "id": 1,
  "name": "Nuevo Producto",
  "description": "Descripción del producto",
  "price": 99.99
}
```


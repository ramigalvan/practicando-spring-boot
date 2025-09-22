
# 📝 Practicando Spring Boot

Proyecto de práctica con **Spring Boot** siguiendo el patrón **MVC**.  
Implementa un CRUD de tareas con **Thymeleaf** y base de datos relacional.

---

## 🚀 Requisitos previos

Antes de comenzar asegúrate de tener instalado en tu sistema:

- [Java 21+](https://adoptium.net/) (o la versión definida en `pom.xml`)
- [Maven 3.9+](https://maven.apache.org/) (opcional, ya que se incluye el wrapper `mvnw`)
- [Docker](https://www.docker.com/) y [Docker Compose](https://docs.docker.com/compose/) (opcional, si quieres levantar servicios externos)

---

## 📦 Instalación

Clona el repositorio:

```bash
git clone https://github.com/ramigalvan/practicando-spring-boot.git
cd practicando-spring-boot
````

---

## ▶️ Ejecución

### Opción 1: Usando Maven Wrapper

```bash
./mvnw spring-boot:run
```

En Windows:

```bash
mvnw.cmd spring-boot:run
```

### Opción 2: Compilar y ejecutar JAR

```bash
./mvnw clean package
java -jar target/practicando-spring-boot-0.0.1-SNAPSHOT.jar
```

---

## 🌐 Acceso a la aplicación

Una vez levantada la aplicación, abre en el navegador:

```
http://localhost:8080
```

---

## 📂 Estructura del proyecto

```
src/
 ├── main/
 │   ├── java/         # Código fuente (controladores, servicios, repositorios, modelos)
 │   └── resources/    # Plantillas Thymeleaf, application.properties
 └── test/             # Tests unitarios
```

---

## 🛠️ Tecnologías utilizadas

* Java + Spring Boot
* Spring MVC
* Spring Data JPA
* Thymeleaf
* Maven
* H2 / MySQL (dependiendo configuración)

---

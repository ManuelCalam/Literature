![Java](https://img.shields.io/badge/java-%23FF0000.svg?style=for-the-badge&logo=java&logoColor=white)

Challenge Alura ONE - Catálogo de Libros

Aplicación de consola desarrollada en Java con Spring Boot que permite buscar libros desde una API externa, almacenarlos en una base de datos y consultarlos posteriormente junto con sus autores.
El proyecto consume la API Gutendex y utiliza Spring Data JPA para gestionar la persistencia de datos en PostgreSQL.

# Tecnologías
- Java 17+
- Spring Boot
- Spring Data JPA / Hibernate
- PostgreSQL
- API Gutendex

# Funcionalidades del Sistema

El programa permite realizar las siguientes operaciones:
Buscar libro por título
- Consulta la API y guarda el libro en la base de datos si no existe.
  
Listar libros registrados
- Muestra todos los libros almacenados en la base de datos.

Listar autores registrados
- Muestra todos los autores guardados junto con su información.

Listar autores vivos en un determinado año
- Permite buscar autores que estaban vivos en un año específico.

Listar libros por idioma
- Filtra libros almacenados según su idioma.

# ContenidoAudivisualRefactorizado
refactorizado
# Sistema de Gestión de Contenidos Audiovisuales

Este proyecto es una aplicación en Java que permite registrar, visualizar y guardar información sobre contenidos audiovisuales como películas, series de TV y documentales.

## Estructura del Proyecto

src/
├── app/ # Clase Main
├── controlador/ # Lógica del controlador
├── modelo/ # Clases del dominio (Pelicula, Documental, etc.)
├── vista/ # Interfaz de consola
test/ # Pruebas unitarias con JUnit

markdown
Copiar
Editar

## Funcionalidades

- Registro de películas, series y documentales
- Asociación de actores, temporadas e investigadores
- Exportación de datos a CSV (`contenidos.csv`)
- Visualización por consola
- Pruebas unitarias con JUnit

## Cómo ejecutar pruebas


# Desde el IDE (Eclipse o IntelliJ), haz clic derecho sobre test/ y selecciona "Run Tests"
# O si usas Maven:
mvn test
 Cómo ejecutar el proyecto
bash
Copiar
Editar
# Desde el IDE ejecuta la clase:
app.Main
🛠 Tecnologías
Java 17+
JUnit 5
Eclipse IDE
Requisitos
JDK instalado

IDE como Eclipse o IntelliJ

Git (para clonar el repositorio)

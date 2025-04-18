"# StreamManager" 
# Proyecto: Gestión de Series y Videojuegos

Este proyecto en Java implementa un sistema para gestionar series y videojuegos. Utiliza conceptos de Programación Orientada a Objetos (POO) como herencia, polimorfismo e interfaces.

## Estructura del Proyecto

- **Paquete `models`**: Contiene las clases `Serie` y `Videojuego` que representan los modelos de datos.
- **Paquete `interfaces`**: Contiene la interfaz `Entregable`, que define los métodos comunes.
- **Paquete `main`**: Contiene la clase `Aplicacion`, punto de entrada del programa.

## Funcionalidades

1. **Clases `Serie` y `Videojuego`:**
   - Atributos como título, género, creador/compañía, etc.
   - Métodos para gestionar atributos y operaciones específicas.
   - Implementación de la interfaz `Entregable`.

2. **Interfaz `Entregable`:**
   - Métodos para entregar, devolver, y verificar si un objeto está entregado.
   - Método `compareTo` para comparar objetos basados en temporadas o horas estimadas.

3. **Clase Ejecutable:**
   - Creación de arrays de Series y Videojuegos.
   - Entregar y contar objetos entregados.
   - Encontrar la Serie con más temporadas y el Videojuego con más horas estimadas.
   - Mostrar los resultados en pantalla.

1. Clona este repositorio en tu máquina:
   ```bash
   git clone https://github.com/tu-usuario/gestion-series-videojuegos.git

   Importa el proyecto en tu IDE favorito (Eclipse, IntelliJ, etc.).

   Compila y ejecuta la clase Main.
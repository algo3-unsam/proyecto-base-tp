# Ejemplo base para TP Algo3

[![Build](https://github.com/algo3-unsam/tp-XXXX-gr-xx/actions/workflows/build.yml/badge.svg)](https://github.com/algo3-unsam/tp-XXXX-gr-xx/actions/workflows/build.yml) ![Coverage](./.github/badges/jacoco.svg)

- El build de Github Actions funciona de una, no tenés que configurar nada
- También el coverage se genera solito si respetás las dependencias que están en el `build.gradle.kts`
- en el archivo [settings.gradle.kts](./settings.gradle.kts) que está en el raíz tenés que cambiarle al nombre de tu proyecto

```kts
rootProject.name = "proyecto-base-tp"
```

- Para los badges de build y coverage (las imágenes que ves con el build passing y el % en este README), tenés que reemplazar `tp-XXXX-gr-xx` por el repositorio correspondiente.

## El proyecto

Antes que nada, la idea de este proyecto es que te sirva como base para poder desarrollar el backend en la materia [Algoritmos 3](https://algo3.uqbar-project.org/). Por eso está basado en _Gradle_, y el archivo `build.gradle.kts` tiene dependencias a

- Spring Boot
- JUnit
- Kotest, para escribir los tests con el estilo de Algo2
- MockK, para mockear
- JaCoCo (Java Code Coverage), para que agregues el % de cobertura en el README
- la versión de Kotlin que estaremos usando
- además de estar basado en la JDK 21, que tenés que tener instalada para poder compilar y correr el proyecto
  - en IntelliJ, revisá que tanto el SDK del proyecto (_File > Project Structure > Project > SDK_) como la JVM de Gradle (_Settings > Build, Execution, Deployment > Build Tools > Gradle > Gradle JVM_) apunten a la JDK 21

### Pasos para adaptar tu proyecto de Algo2 a Algo3

El proceso más simple para que puedan reutilizar el proyecto de Algo2 en Algo3 es:

- generar una copia de todo el directorio que contiene este proyecto
- eliminar la carpeta `.git` que está oculta
- copiar del proyecto de Algo2 las carpetas `src/main/kotlin` y `src/test/kotlin` y la ubican en el mismo lugar en el proyecto de Algo3
- apuntar al proyecto de github mediante

```bash
git remote add origin ...dirección del repo git...
```

El proyecto tiene un main, en la clase `ProyectoApplication`, que levantará el servidor web en el puerto 9000, tienen que renombrarlo al TP actual. También tenés

- un test de integración de ejemplo (en `src/test/kotlin`)

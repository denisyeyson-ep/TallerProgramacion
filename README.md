# Taller de Programación

![Java](https://img.shields.io/badge/Java-Programación-orange?logo=openjdk&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-IDE-blue?logo=intellijidea&logoColor=white)
![Estado](https://img.shields.io/badge/estado-en_desarrollo-yellow)
![Semanas](https://img.shields.io/badge/plan-18_semanas-red)

Repositorio académico del curso **Taller de Programación**, desarrollado en Java como parte de mi formación en Ingeniería de Software. Aquí se organizan los ejemplos, ejercicios y tareas realizados durante las **18 semanas del curso**, con **2 sesiones por semana** y un total planificado de **36 sesiones**.

[![Abrir en GitHub Codespaces](https://github.com/codespaces/badge.svg)](https://codespaces.new/denisyeyson-ep/TallerProgramacion)

## Objetivos

- Practicar los fundamentos de programación con Java.
- Resolver problemas mediante algoritmos y expresiones matemáticas.
- Aplicar estructuras condicionales simples, dobles y anidadas.
- Separar la entrada y salida de datos de la lógica del problema.
- Mantener el código organizado por semana y sesión.
- Registrar progresivamente el trabajo realizado durante todo el curso.

## Organización académica

| Periodo             | Cantidad |
|---------------------|---------:|
| Semanas             |       18 |
| Sesiones por semana |        2 |
| Total de sesiones   |       36 |

Cada semana utiliza el paquete `semXX` y contiene los paquetes `sesion1` y `sesion2`. Cuando un ejercicio separa responsabilidades, su lógica se guarda dentro de una carpeta `model`.

```text
src/main/java/com/denisyeyson/
├── sem01/
│   ├── sesion1/
│   └── sesion2/
│       ├── model/
│       └── ejercicios.java
├── sem02/
│   ├── sesion1/
│   └── sesion2/
├── sem03/
│   ├── sesion1/
│   └── sesion2/
└── ...
    └── sem18/
        ├── sesion1/
        └── sesion2/
```

> Las carpetas de las semanas futuras se agregarán conforme avance el curso.

## Contenido actual

| Semama y sesión | Tema                                     | Código                                                                          |
|-----------------|------------------------------------------|---------------------------------------------------------------------------------|
| 01.02           | Introduccion al lenguaje de programacion | [Ver código](src/main/java/com/denisyeyson/sem03/sesion2/E02_CalcularHora.java) |

### Semana 1

**Sesión 2 — Introducción al lenguaje de programación Java**

- Conversión de grados centígrados a Fahrenheit.
- Conversión de dólares a soles.
- Cálculo del área de un círculo.
- Aplicación de la fórmula general.
- Cálculo del IGV.

### Semana 2

**Sesión 1 — Estructuras Secuenciales 1**

- Suma de los dígitos de un número.

**Sesión 2 — Estructuras Secuenciales 2**

- Cálculo de la distancia recorrida por la luz.
- Imprimir una Boleta de Venta
- Imprimir un boleto de viaje interprovincial.
- Imprimir una boleta de pago.
- Imprimir un ticket de operación de un agente bancario.

### Semana 3

**Sesión 1 — Estructura Condicional if-else**

- Progresión aritmética.
- Evaluación de jubilación según sexo y edad.
- Evaluación del cambio de un producto.

**Sesión 2 — Estructura Condicional if-else anidada**

- Cálculo de aumento salarial.
- Conversión y evaluación de horas.
- Descuento de una compra.
- Operación bancaria.
- Resultado de una evaluación.
- Evaluación de un número positivo y par.
- Cálculo de raíz y potencia con la clase `Math`.
- Cálculos según la paridad de un número.
- Operaciones matemáticas con condicionales anidadas.

### Semana 4

**Sesión 1 — Estructura Condicional switch-case 1**

**Sesión 2 — Estructura Condicional switch-case 2**

## Plan de avance

| Semana | Sesión 1 | Sesión 2 |   Estado   |
|:------:|:--------:|:--------:|:----------:|
|   01   |    ✅    |    ✅    | Completada |
|   02   |    ✅    |    ✅    | Completada |
|   03   |    ✅    |    ✅    | Completada |
|   04   |    ⬜    |    ⬜    | Pendiente  |
|   05   |    ⬜    |    ⬜    | Pendiente  |
|   06   |    ⬜    |    ⬜    | Pendiente  |
|   07   |    ⬜    |    ⬜    | Pendiente  |
|   08   |    ⬜    |    ⬜    | Pendiente  |
|   09   |    ⬜    |    ⬜    | Pendiente  |
|   10   |    ⬜    |    ⬜    | Pendiente  |
|   11   |    ⬜    |    ⬜    | Pendiente  |
|   12   |    ⬜    |    ⬜    | Pendiente  |
|   13   |    ⬜    |    ⬜    | Pendiente  |
|   14   |    ⬜    |    ⬜    | Pendiente  |
|   15   |    ⬜    |    ⬜    | Pendiente  |
|   16   |    ⬜    |    ⬜    | Pendiente  |
|   17   |    ⬜    |    ⬜    | Pendiente  |
|   18   |    ⬜    |    ⬜    | Pendiente  |

**Leyenda:** ✅ con contenido · ⬜ pendiente

## Tecnologías utilizadas

- **Java** para implementar los ejercicios.
- **IntelliJ IDEA** como entorno de desarrollo.
- **Scanner** para la entrada de datos desde la consola.
- **Clase Math** para raíces, potencias, valores absolutos y otros cálculos.
- **Git y GitHub** para el control de versiones y respaldo del proyecto.

## Convenciones del proyecto

Los archivos utilizan prefijos que permiten identificar su propósito:

| Prefijo | Significado                                     |
|---------|-------------------------------------------------|
| `E`     | Ejemplo desarrollado durante la sesión          |
| `A`     | Actividad para practicar                        |
| `T`     | Tarea o ejercicio propuesto                     |
| `TA`    | Actividad práctica                              |
| `model` | Clases que almacenan datos y procesan la lógica |

Por ejemplo, `TA04_02_CalculoRaizPotencia.java` corresponde a la actividad 4.2 sobre el cálculo de raíces y potencias.

## Cómo ejecutar el proyecto

### Desde IntelliJ IDEA

1. Clona o descarga este repositorio.
2. Abre IntelliJ IDEA y selecciona **Open**.
3. Elige la carpeta raíz del proyecto.
4. Espera a que IntelliJ reconozca la configuración de Java.
5. Abre el paquete de la semana y sesión que quieras revisar.
6. Ejecuta la clase que contiene el método `main()` mediante el botón **Run**.

### Desde la terminal

Para compilar una clase junto con su modelo, ubícate en la raíz del proyecto. Por ejemplo:

```bash
javac -d out \
  src/main/java/com/denisyeyson/sem03/sesion2/model/CalculoRaizPotencia.java \
  src/main/java/com/denisyeyson/sem03/sesion2/TA04_02_CalculoRaizPotencia.java
```

Después ejecútala con:

```bash
java -cp out com.denisyeyson.sem03.sesion2.TA04_02_CalculoRaizPotencia
```

## Estructura utilizada en los ejercicios

En los ejercicios orientados a objetos se separan dos responsabilidades:

- La **clase principal** contiene `main()`, utiliza `Scanner`, solicita los datos y muestra el resultado.
- La **clase de modelo** contiene atributos, métodos de acceso, operaciones y reglas del problema.

Esta separación permite que el código sea más claro, reutilizable y fácil de mantener.

## Autor

**Denis Yeyson Espinoza Ponciano**  
Estudiante de Ingeniería de Software — Universidad Tecnológica del Perú

---

Este repositorio se actualizará durante las 18 semanas del curso a medida que se desarrollen nuevas sesiones, ejercicios y actividades.
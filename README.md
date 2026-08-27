# Taller de Programación

![Java](https://img.shields.io/badge/Java-Programación-orange?logo=openjdk&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-IDE-blue?logo=intellijidea&logoColor=white)
![Estado](https://img.shields.io/badge/estado-en_desarrollo-yellow)
![Semanas](https://img.shields.io/badge/plan-18_semanas-red)

Repositorio académico del curso **Taller de Programación**, desarrollado en Java como parte de mi formación en
Ingeniería de Software. Aquí se organizan los ejemplos, ejercicios y tareas realizados durante las **18 semanas del
curso**, con **2 sesiones por semana** y un total planificado de **36 sesiones**.

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

Cada semana utiliza el paquete `semXX` y contiene los paquetes `sesion1` y `sesion2`. Cuando un ejercicio separa
responsabilidades, su lógica se guarda dentro de una carpeta `model`.

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

## Contenido

- [Semana 1: Introducción al lenguaje de programación Java](#semana-1)
- [Semana 2: Estructuras secuenciales](#semana-2)
- [Semana 3: Estructura condicional `if-else`](#semana-3)

## Ejercicios

### Semana 1

**Introducción al lenguaje de programación Java**

| Sesión | Ejercicio                                     |                                             Código                                              |
|:-------|:----------------------------------------------|:-----------------------------------------------------------------------------------------------:|
| S01.02 | Conversión de grados centígrados a Fahrenheit | [Abrir ejercicio](src/main/java/com/denisyeyson/sem01/sesion2/model/CentigradosFahrenheit.java) |
| S01.02 | Conversión de dólares a soles                 |     [Abrir ejercicio](src/main/java/com/denisyeyson/sem01/sesion2/model/DolaresSoles.java)      |
| S01.02 | Cálculo del área de un círculo                |      [Abrir ejercicio](src/main/java/com/denisyeyson/sem01/sesion2/model/AreaCirculo.java)      |
| S01.02 | Aplicación de la fórmula general              |    [Abrir ejercicio](src/main/java/com/denisyeyson/sem01/sesion2/model/FormulaGeneral.java)     |
| S01.02 | Cálculo del IGV                               |      [Abrir ejercicio](src/main/java/com/denisyeyson/sem01/sesion2/model/CalcularIGV.java)      |

[Volver al contenido](#contenido)

### Semana 2

**Estructuras secuenciales**

| Sesión | Ejercicio                                    |                                          Código                                          |
|:-------|:---------------------------------------------|:----------------------------------------------------------------------------------------:|
| S02.01 | Suma de los dígitos de un número             |     [Abrir ejercicio](src/main/java/com/denisyeyson/sem02/sesion1/SumaDigitos.java)      |
| S02.02 | Cálculo de la distancia recorrida por la luz |  [Abrir ejercicio](src/main/java/com/denisyeyson/sem02/sesion2/model/DistanciaLuz.java)  |
| S02.02 | Imprimir una boleta de venta                 |  [Abrir ejercicio](src/main/java/com/denisyeyson/sem02/sesion2/model/BoletaVenta.java)   |
| S02.02 | Imprimir un boleto de viaje interprovincial  |  [Abrir ejercicio](src/main/java/com/denisyeyson/sem02/sesion2/model/BoletoViaje.java)   |
| S02.02 | Imprimir una boleta de pago                  |   [Abrir ejercicio](src/main/java/com/denisyeyson/sem02/sesion2/model/BoletaPago.java)   |
| S02.02 | Imprimir un ticket de operación bancaria     | [Abrir ejercicio](src/main/java/com/denisyeyson/sem02/sesion2/model/TicketBancario.java) |

[Volver al contenido](#contenido)

### Semana 3

**Estructura condicional `if-else`**

| Sesión | Ejercicio                                          |                                              Código                                              |
|:-------|:---------------------------------------------------|:------------------------------------------------------------------------------------------------:|
| S03.01 | Progresión aritmética                              |  [Abrir ejercicio](src/main/java/com/denisyeyson/sem03/sesion1/model/ProgresionAritmetica.java)  |
| S03.01 | Evaluación de jubilación según sexo y edad         |       [Abrir ejercicio](src/main/java/com/denisyeyson/sem03/sesion1/model/Jubilacion.java)       |
| S03.01 | Evaluación del cambio de un producto               |     [Abrir ejercicio](src/main/java/com/denisyeyson/sem03/sesion1/model/CambioProducto.java)     |
| S03.02 | Cálculo de aumento salarial                        |     [Abrir ejercicio](src/main/java/com/denisyeyson/sem03/sesion2/model/AumentoSalario.java)     |
| S03.02 | Conversión y evaluación de horas                   |      [Abrir ejercicio](src/main/java/com/denisyeyson/sem03/sesion2/model/CalcularHora.java)      |
| S03.02 | Descuento de una compra                            |    [Abrir ejercicio](src/main/java/com/denisyeyson/sem03/sesion2/model/DescuentoCompra.java)     |
| S03.02 | Operación bancaria                                 |   [Abrir ejercicio](src/main/java/com/denisyeyson/sem03/sesion2/model/OperacionBancaria.java)    |
| S03.02 | Resultado de una evaluación                        |  [Abrir ejercicio](src/main/java/com/denisyeyson/sem03/sesion2/model/ResultadoEvaluacion.java)   |
| S03.02 | Evaluación de un número positivo y par             |   [Abrir ejercicio](src/main/java/com/denisyeyson/sem03/sesion2/model/NumeroPositivoPar.java)    |
| S03.02 | Raíz y potencia con la clase `Math`                |  [Abrir ejercicio](src/main/java/com/denisyeyson/sem03/sesion2/model/CalculoRaizPotencia.java)   |
| S03.02 | Cálculos según la paridad de un número             |     [Abrir ejercicio](src/main/java/com/denisyeyson/sem03/sesion2/model/CalculoNumero.java)      |
| S03.02 | Operaciones matemáticas con condicionales anidadas | [Abrir ejercicio](src/main/java/com/denisyeyson/sem03/sesion2/model/OperacionesMatematicas.java) |

[Volver al contenido](#contenido)

### Semana 4

**Estructura Condicional switch-case**

| Sesión | Ejercicio             |                                            Código                                            |
|:-------|:----------------------|:--------------------------------------------------------------------------------------------:|
| S04.01 | Progresión aritmética | [Abrir ejercicio](src/main/java/com/denisyeyson/sem03/sesion1/E01_ProgresionAritmetica.java) |

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

Este repositorio se actualizará durante las 18 semanas del curso a medida que se desarrollen nuevas sesiones, ejercicios
y actividades.
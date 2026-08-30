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
- [Semana 4: Estructura Condicional `switch-case`](#semana-4)

## Ejercicios

### Semana 1

**Introducción al lenguaje de programación Java**

| Sesión | Ejercicio                                     | Código                                                                                                                                                                                    |
|:-------|:----------------------------------------------|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 02.01  | Conversión de grados centígrados a Fahrenheit | [Abrir ejercicio](src/main/java/com/denisyeyson/sem01/sesion2/model/CentigradosFahrenheit.java), [Abrir main](src/main/java/com/denisyeyson/sem01/sesion2/E01_CentigradosFahrenheit.java) |
| 02.02  | Conversión de dólares a soles                 | [Abrir ejercicio](src/main/java/com/denisyeyson/sem01/sesion2/model/DolaresSoles.java), [Abrir main](src/main/java/com/denisyeyson/sem01/sesion2/E02_DolaresSoles.java)                   |
| 02.03  | Cálculo del área de un círculo                | [Abrir ejercicio](src/main/java/com/denisyeyson/sem01/sesion2/model/AreaCirculo.java), [Abrir main](src/main/java/com/denisyeyson/sem01/sesion2/T01_AreaCirculo.java)                     |
| 02.04  | Aplicación de la fórmula general              | [Abrir ejercicio](src/main/java/com/denisyeyson/sem01/sesion2/model/FormulaGeneral.java), [Abrir main](src/main/java/com/denisyeyson/sem01/sesion2/T02_FormulaGeneral.java)               |
| 02.05  | Cálculo del IGV                               | [Abrir ejercicio](src/main/java/com/denisyeyson/sem01/sesion2/model/CalcularIGV.java), [Abrir main](src/main/java/com/denisyeyson/sem01/sesion2/T03_CalcularIGV.java)                     |

[Volver al contenido](#contenido)

### Semana 2

**Estructuras secuenciales**

| Sesión | Ejercicio                                    | Código                                                                                                                                                                  |
|:-------|:---------------------------------------------|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 01.01  | Suma de los dígitos de un número             | [Abrir ejercicio](src/main/java/com/denisyeyson/sem02/sesion1/SumaDigitos.java), [Abrir Main](src/main/java/com/denisyeyson/sem02/sesion1/E01_SumaDigitos.java)         |
| 02.01  | Cálculo de la distancia recorrida por la luz | [Abrir ejercicio](src/main/java/com/denisyeyson/sem02/sesion2/model/DistanciaLuz.java), [Abrir Main](src/main/java/com/denisyeyson/sem02/sesion2/E01_DistanciaLuz.java) | |
| 02.02  | Imprimir una boleta de venta                 | [Abrir ejercicio](src/main/java/com/denisyeyson/sem02/sesion2/model/BoletaVenta.java), [Abrir Main](src/main/java/com/denisyeyson/sem02/sesion2/E02_BoletaVenta.java)   |
| 02.03  | Imprimir un boleto de viaje interprovincial  | [Abrir main](src/main/java/com/denisyeyson/sem02/sesion2/A01_BoletoViaje.java)                                                                                          |
| 02.04  | Imprimir una boleta de pago                  | [Abrir main](src/main/java/com/denisyeyson/sem02/sesion2/A02_BoletaPago.java)                                                                                           |
| 02.05  | Imprimir un ticket de operación bancaria     | [Abrir main](src/main/java/com/denisyeyson/sem02/sesion2/A03_TicketAgenteBancario.java)                                                                                 |

[Volver al contenido](#contenido)

### Semana 3

**Estructura condicional `if-else`**

| Sesión | Ejercicio                                          | Código                                                                                                                                                                                         |
|:-------|:---------------------------------------------------|:-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| 01.01  | Progresión aritmética                              | [Abrir ejercicio](src/main/java/com/denisyeyson/sem03/sesion1/model/ProgresionAritmetica.java), [Abrir main](src/main/java/com/denisyeyson/sem03/sesion1/E01_ProgresionAritmetica.java)        |
| 01.02  | Evaluación de jubilación según sexo y edad         | [Abrir ejercicio](src/main/java/com/denisyeyson/sem03/sesion1/model/Jubilacion.java), [Abrir main](src/main/java/com/denisyeyson/sem03/sesion1/E02_Jubilacion.java)                            |
| 01.03  | Evaluación del cambio de un producto               | [Abrir ejercicio](src/main/java/com/denisyeyson/sem03/sesion1/model/CambioProducto.java), [Abrir main](src/main/java/com/denisyeyson/sem03/sesion1/E03_CambioProducto.java)                    |
| 02.01  | Cálculo de aumento salarial                        | [Abrir ejercicio](src/main/java/com/denisyeyson/sem03/sesion2/model/AumentoSalario.java), [Abrir main](src/main/java/com/denisyeyson/sem03/sesion2/E01_AumentoSalario.java)                    |
| 02.02  | Conversión y evaluación de horas                   | [Abrir ejercicio](src/main/java/com/denisyeyson/sem03/sesion2/model/CalcularHora.java), [Abrir main](src/main/java/com/denisyeyson/sem03/sesion2/E02_CalcularHora.java)                        |
| 02.03  | Descuento de una compra                            | [Abrir ejercicio](src/main/java/com/denisyeyson/sem03/sesion2/model/DescuentoCompra.java), [Abrir main](src/main/java/com/denisyeyson/sem03/sesion2/T01_DescuentoCompra.java)                  |
| 02.04  | Operación bancaria                                 | [Abrir ejercicio](src/main/java/com/denisyeyson/sem03/sesion2/model/OperacionBancaria.java), [Abrir main](src/main/java/com/denisyeyson/sem03/sesion2/T02_OperacionBancaria.java)              |
| 02.05  | Resultado de una evaluación                        | [Abrir ejercicio](src/main/java/com/denisyeyson/sem03/sesion2/model/ResultadoEvaluacion.java), [Abrir main](src/main/java/com/denisyeyson/sem03/sesion2/T03_ResultadoEvaluacion.java)          |
| 02.06  | Evaluación de un número positivo y par             | [Abrir ejercicio](src/main/java/com/denisyeyson/sem03/sesion2/model/NumeroPositivoPar.java) , [Abrir main](src/main/java/com/denisyeyson/sem03/sesion2/T04_01_NumeroPositivoPar.java)          |
| 02.07  | Raíz y potencia con la clase `Math`                | [Abrir ejercicio](src/main/java/com/denisyeyson/sem03/sesion2/model/CalculoRaizPotencia.java) ,[Abrir main](src/main/java/com/denisyeyson/sem03/sesion2/T04_02_CalculoRaizPotencia.java)       |
| 02.08  | Cálculos según la paridad de un número             | [Abrir ejercicio](src/main/java/com/denisyeyson/sem03/sesion2/model/CalculoNumero.java), [Abrir main](src/main/java/com/denisyeyson/sem03/sesion2/T04_03_CalculoNumero.java)                   |
| 02.09  | Operaciones matemáticas con condicionales anidadas | [Abrir ejercicio](src/main/java/com/denisyeyson/sem03/sesion2/model/OperacionesMatematicas.java), [Abrir main](src/main/java/com/denisyeyson/sem03/sesion2/T04_04_OperacionesMatematicas.java) |

[Volver al contenido](#contenido)

### Semana 4

**Estructura Condicional `switch-case`**

| Sesión | Ejercicio                |                                         Código                                         |
|:-------|:-------------------------|:--------------------------------------------------------------------------------------:|
| 01.01  | Evaluación de postulante |  [Abrir main](src/main/java/com/denisyeyson/sem04/sesion1/E01_EvaluarPostulante.java)  |
| 01.02  | Conversion de monedas    | [Abrir main](src/main/java/com/denisyeyson/sem04/sesion1/E02_CotizacionDolarEuro.java) |


## Plan de avance

| Semana | Sesión 1 | Sesión 2 |   Estado   |
|:------:|:--------:|:--------:|:----------:|
|   01   |    ✅    |    ✅    | Completada |
|   02   |    ✅    |    ✅    | Completada |
|   03   |    ✅    |    ✅    | Completada |
|   04   |    ✅    |    ✅    | Completada |
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
  src/main/java/com/denisyeyson/sem03/sesion2/T04_02_CalculoRaizPotencia.java
```

Después ejecútala con:

```bash
java -cp out com.denisyeyson.sem03.sesion2.T04_02_CalculoRaizPotencia
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
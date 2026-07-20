# Sistema-de-Gesti-n-de-Cuentas-Bancarias

## Descripción del Proyecto
Este proyecto fue desarrollado como parte del módulo "Programación orientada a objetos". El objetivo principal es optimizar y mejorar la eficiencia del código del sistema del banco MexBank. 

Para lograrlo, se implementó el pilar de Herencia de la Programación Orientada a Objetos, creando una estructura jerárquica donde una Clase `Cuenta` base transfiere sus propiedades y métodos a tres tipos de cuentas específicas.

## Características Técnicas
El proyecto fue construido cumpliendo con los siguientes requerimientos técnicos:
* **Herencia y Métodos:** Arquitectura de clases padre e hijas.
* **Encapsulamiento y Modificadores de Acceso:** Uso de variables privadas y métodos Getters/Setters.
* **Paso de Variables y Retorno de Valores:** Comunicación eficiente entre los métodos y el bloque principal.

## Estructura de Clases

### 1. Clase Base (`Cuenta.java`)
Es la superclase que contiene el estado base de cualquier cuenta.
* Administra la variable principal de saldo.
* Incluye el método general `depositar`.

### 2. Clases Hijas (Tipos de Cuentas)
* **`TarjetaCredito.java`:** Cuenta con la particularidad de inicializarse con un saldo negativo. Implementa el método `sumaInteres` que aumenta un 15% a la deuda actual.
* **`TarjetaDebito.java`:** Implementa el método `retirar`, el cual resta la cantidad indicada al monto actual. Incluye validaciones lógicas para evitar retiros si el saldo es insuficiente.
* **`CuentaAhorro.java`:** Implementa el método `invertir`, el cual aumenta el 10% al monto actual generando rendimientos.

## Tecnologías Utilizadas
* **Lenguaje:** Java
* **Entorno de Desarrollo (IDE):** Netbeans

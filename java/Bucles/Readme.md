# 🛒 Proyectos de Consola: LoopCommerce & Estructuras Básicas

Este repositorio contiene una serie de ejercicios desarrollados en **Java** para el dominio de bucles y lógica de programación, enfocados en la creación de un ecosistema de E-Commerce.

---

## 📘 Ejercicio 1: Catálogo de Librería Simple (Fundamentos)
Este fue el prototipo inicial donde se trabajó la estructura básica de un menú y la visualización de datos estáticos.

* **Objetivo:** Implementar un menú de selección de géneros literarios.
* **Estructura:** Uso de `switch-case` y `do-while` para la navegación.
* **Aprendizaje Clave:** Manejo inicial de la clase `Scanner` y organización de datos en categorías (Fantasía, Ciencia Ficción, Ensayo, Narrativa).

---

## 🚀 Ejercicio 2: LoopCommerce - Simulador Avanzado
Un simulador completo que integra la colaboración de 4 roles técnicos (desarrollado íntegramente por un solo autor) para gestionar el flujo real de una tienda.

### 📋 Roles y Estructuras Aplicadas:

1.  **Menú Principal (`do-while`)**
    * **Función:** Control de flujo. Mantiene la tienda abierta hasta que el usuario decide salir.
2.  **Gestión de Catálogo (`for-each`)**
    * **Función:** Visualización de productos. Recorre arreglos de categorías de forma eficiente para mostrar los títulos disponibles.
3.  **Carrito de Compras (`while`)**
    * **Función:** Entrada de datos dinámica. Permite al usuario elegir múltiples libros por su número de referencia mientras el carrito tenga espacio (máx. 10).
4.  **Checkout / Validación (`for`)**
    * **Función:** Simulación de procesos por lotes. Ejecuta una iteración de 10 pasos para validar la seguridad de la transacción.

---

## 🛠️ Tecnologías y Conceptos Aplicados
* **Lenguaje:** Java 21 (JDK)
* **Entrada de Datos:** `java.util.Scanner`
* **Manejo de Memoria:** Arreglos unidimensionales (`String[]`).
* **Control de Errores:** Implementación de limpieza de buffer (`scanner.nextLine()`) para evitar conflictos entre tipos de datos numéricos y de texto.

---

## 🚀 Instrucciones de Ejecución

1.  **Compilar:**
    ```bash
    javac LoopCommerce.java
    ```
2.  **Ejecutar:**
    ```bash
    java LoopCommerce
    ```

---

## 👤 Autor
**Arantxa Fischer C.**
* *Licenciada en Literatura Creativa (UDP)*
* *Estudiante de Desarrollo Full Stack Java Jr.*

> **Nota de Desarrollo:** Este proyecto refleja la transición desde el análisis literario hacia la arquitectura de software, utilizando la lógica de bucles para organizar universos narrativos en estructuras de datos eficientes.

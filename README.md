# 💻 **Tarea Nº2 - Herencia en Kotlin**

## 👨‍🏫 Profesor: Gelber Uscuchagua  
## 📚 Curso: Desarrollo de Sistemas Móviles  

---

## 👥 **Alumnos**
- **Luis André del Carpio Villacrés** — Código: `22200015`
- **Rissel Saavedra Nieto** — Código: `22200041`


---

## 📝 **Descripción General**

Este repositorio contiene la **solución a la Tarea Nº2** del curso **Desarrollo de Sistemas Móviles**, desarrollada íntegramente en **Kotlin**. La actividad está enfocada en aplicar los conceptos fundamentales de **programación orientada a objetos (POO)**, específicamente:

- Herencia
- Polimorfismo
- Encapsulamiento
- Constructores y visibilidad (`protected`)
- Sobreescritura de métodos

Los ejercicios se modelan a través de un sistema de cuentas bancarias, con clases base y clases derivadas que extienden funcionalidades específicas para **cuentas de ahorros** y **cuentas corrientes**.

---

## ✅ **Enunciado Resuelto**

> 📁 Ubicación del código fuente: [`src/`](./src)

---

### 🏦 **Ejercicio 4.1: Herencia - Clase `Cuenta`**

- 📄 Archivos involucrados:
  - `Cuenta.kt`
  - `CuentaAhorros.kt`
  - `CuentaCorriente.kt`
  - `Main.kt`

#### 📌 **Descripción del problema**

Se implementa una jerarquía de clases para representar una **cuenta bancaria** con las siguientes características:

#### 🔷 Clase base: `Cuenta`
- Atributos protegidos:
  - `saldo: Float`
  - `nConsignaciones: Int`
  - `nRetiros: Int`
  - `tasaAnual: Float`
  - `comisionMensual: Float`
- Métodos:
  - `consignar(cantidad: Float)`
  - `retirar(cantidad: Float)`
  - `calcularInteresMensual()`
  - `extractoMensual()`
  - `imprimir()`

#### 🟢 Subclase: `CuentaAhorros`
- Atributos adicionales:
  - `activa: Boolean`
- Redefine los métodos para validar si la cuenta está activa.
- Carga comisión si se hacen más de 4 retiros en un mes.

#### 🟠 Subclase: `CuentaCorriente`
- Atributos adicionales:
  - `sobregiro: Float`
- Permite sobregiros al retirar.
- Reduce el sobregiro con cada consignación.

---

## 🧪 **Instrucciones de Ejecución**

### 🧰 **Requisitos Previos**
- Tener instalado:
  - [JDK 8+](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)
  - [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) u otro IDE compatible con Kotlin

---

### 🚀 **Pasos para Ejecutar**

1. **Clona el repositorio**:
   ```bash
   git clone https://github.com/LuisAndreDelCarpio/2025-2-unmsm-dsm-tarea02.git

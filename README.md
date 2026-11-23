# Implementación de BDD en un Sistema de Gestión de Cuentas Bancarias

En un sistema de gestión de cuentas bancarias, debes aplicar metodologías de desarrollo basadas en comportamiento (BDD) para definir y automatizar pruebas utilizando Cucumber y Karate Framework. El sistema gestiona cuentas con atributos como número de cuenta, saldo, tipo de cuenta y propietario. Las operaciones incluyen apertura de cuenta, depósito, retiro y consulta de saldo. Debes asegurar que las pruebas cubran casos felices, validaciones y edge cases del dominio.

## Informacion General

| Campo | Valor |
|-------|-------|
| **Tema** | Desarrollador con Sólida Experiencia en BDD y Frameworks de Automatización |
| **Nivel** | senior-l2 |
| **Tipo** | practical |
| **Tiempo estimado** | 10 horas |

## Stack

- **Lenguaje:** Java
- **Framework:** Spring Boot 3.5
- **Version:** Java 21

## Fases del Reto

### Fase 0: Configuración del Proyecto

**Objetivo:** Tener el proyecto base del reto funcionando en tu máquina: clonar el repositorio, instalar las herramientas y verificar que compila y arranca antes de empezar a practicar.

**Tiempo estimado:** 15-30 minutos

**Instrucciones:**

- Instala las herramientas para ejecutar el proyecto: JDK 17+ y Maven 3.9+.
- Clona el repositorio del reto (el enlace viene en la entrega del reto y en la sección "Repositorio del Proyecto" del PDF) y ábrelo en tu IDE.
- Instala las dependencias y compila ejecutando `mvn -q -B -DskipTests -Dspring-boot.repackage.skip=true package` en la raíz del repositorio.
- Confirma que el comando termina sin errores: el proyecto arranca y sus pruebas corren.
- Ubica los archivos de práctica: son los que contienen `TODO(reto)` (búscalos en el repositorio). Lee el README.md y el AGENTS.md antes de empezar.

**Entregable:** El proyecto compila/arranca sin errores con `mvn -q -B -DskipTests -Dspring-boot.repackage.skip=true package`.

<details>
<summary>Pistas de conocimiento</summary>

- Los archivos con `TODO(reto)` son el ejercicio: el resto del repositorio ya está resuelto y no hace falta tocarlo.
- Si el comando de verificación falla, revisa la versión de las herramientas instaladas antes de modificar código.
- AGENTS.md describe el reto, el comando de verificación y las reglas del repositorio.

</details>

### Fase 1: Definición de Casos de Uso

**Objetivo:** Identificar y documentar los casos de uso principales del sistema de gestión de cuentas bancarias.

**Tiempo estimado:** 2 horas

**Instrucciones:**

- Extraer las reglas de negocio y validaciones del documento de casos de uso y materializarlas en una pieza de lógica en la capa `core` del componente `app`.
- Asegurar que la pieza tenga responsabilidades exclusivas y casos de aceptación que cubran los escenarios principales y de error.
- Validar que la pieza sea probada de forma aislada mediante inyección de puertos.

**Entregable:** Documento de casos de uso transformado en piezas de lógica de negocio en la capa core.

<details>
<summary>Pistas de conocimiento</summary>

- Considera los atributos y operaciones del dominio al definir los casos de uso.
- Identifica posibles edge cases y cómo manejarlos.

</details>

### Fase 2: Implementación de Pruebas con Cucumber

**Objetivo:** Crear y ejecutar pruebas automatizadas para los casos de uso utilizando Cucumber.

**Tiempo estimado:** 4 horas

**Instrucciones:**

- Escribe escenarios de prueba en Gherkin para cada caso de uso identificado en la fase anterior.
- Implementa los pasos de prueba en Java utilizando Cucumber.

**Entregable:** Escenarios de prueba en Gherkin y pasos de prueba implementados en Java.

<details>
<summary>Pistas de conocimiento</summary>

- Utiliza la sintaxis Gherkin para escribir escenarios de prueba claros y concisos.
- Asegúrate de que las pruebas cubren casos felices, validaciones y edge cases.

</details>

### Fase 3: Integración con Karate Framework

**Objetivo:** Integrar Karate Framework para mejorar la automatización de pruebas y la gestión de API.

**Tiempo estimado:** 4 horas

**Instrucciones:**

- Configura Karate Framework en el proyecto.
- Escribe pruebas de API utilizando Karate para validar las operaciones del sistema.

**Entregable:** Pruebas de API escritas en Karate y configuradas en el proyecto.

<details>
<summary>Pistas de conocimiento</summary>

- Utiliza Karate para escribir pruebas de API concisas y efectivas.
- Aprovecha las capacidades de Karate para la gestión de API y la validación de respuestas.

</details>

## Dimensiones Evaluadas

- **queEs**: ¿Qué es BDD y cómo se aplica en el desarrollo de software?
- **paraQueSirve**: ¿Para qué sirve utilizar frameworks de automatización como Cucumber y Karate en el desarrollo de pruebas?
- **comoSeUsa**: ¿Cómo se escriben y ejecutan pruebas automatizadas utilizando Cucumber y Karate?
- **erroresComunes**: ¿Cuáles son los errores comunes al implementar BDD y frameworks de automatización, y cómo se pueden evitar?
- **queDecisionesImplica**: ¿Qué decisiones implica la integración de Karate Framework en un proyecto existente que ya utiliza Cucumber?

## Criterios de Evaluacion

- Definición clara y completa de casos de uso y reglas de negocio.
- Escenarios de prueba en Gherkin bien escritos y concisos.
- Pasos de prueba implementados en Java utilizando Cucumber.
- Pruebas de API escritas en Karate y configuradas en el proyecto.
- Cobertura de casos felices, validaciones y edge cases en las pruebas.

## Mapa de fases

La **Fase 0** es clonar el repositorio, instalar dependencias y correr las pruebas de aceptacion: todas fallan porque la logica de cada pieza esta pendiente.

| Fase | Pieza (skill) | Archivo:simbolo | Criterios | Prueba | Comando |
|------|---------------|-----------------|-----------|--------|---------|
| f1 — Definición de Casos de Uso | Validación de reglas de negocio para creación de cuentas bancarias | — | Existe una pieza de lógica en la capa `core` que implementa las reglas de negocio y validaciones de los casos de uso.; La pieza tiene casos de aceptación que cubren al menos 2 escenarios principales y 1 escenario de error.; La pieza es probada de forma aislada mediante inyección de puertos. | — | — |
| f2 — Implementación de Pruebas con Cucumber | Implementación de pasos de prueba para escenarios de Cucumber en Gherkin | `src/main/java/bdd/cucumber/AccountStepDefinitions.java:AccountStepDefinitions` | Los escenarios de prueba en Gherkin cubren al menos 2 casos principales y 1 caso de error.; Los pasos de prueba en Java están implementados y vinculados a los escenarios de Gherkin.; Las pruebas se ejecutan correctamente y validan el comportamiento esperado. | — | — |
| f2 — Implementación de Pruebas con Cucumber | Gestión del contexto de prueba para escenarios de Cucumber | `src/main/java/bdd/cucumber/AccountTestContext.java:AccountTestContext` | Los escenarios de prueba en Gherkin cubren al menos 2 casos principales y 1 caso de error.; Los pasos de prueba en Java están implementados y vinculados a los escenarios de Gherkin.; Las pruebas se ejecutan correctamente y validan el comportamiento esperado. | — | — |
| f3 — Integración con Karate Framework | Implementación de un cliente de API para pruebas con Karate | `src/main/java/bdd/karate/AccountApiClient.java:AccountApiClient` | Las pruebas de API escritas en Karate cubren al menos 2 escenarios principales y 1 escenario de error.; Las pruebas están configuradas en el proyecto y se ejecutan correctamente.; Las pruebas validan el comportamiento esperado de la API. | — | — |

## Pruebas de aceptacion

Las pruebas de aceptacion (columna "Prueba" de la tabla) son de **solo lectura**: definen que significa "listo". No las edites, no las borres y no les agregues `skip`; lo que se resuelve es el codigo de cada pieza.

## Herramientas

- **Karate Framework**: Tecnologia pedida para este reto: forma parte del stack con el que se resuelve el ejercicio.

## Verificacion

El proyecto esta listo para trabajar cuando este comando corre sin errores:

```bash
mvn -q -B -DskipTests -Dspring-boot.repackage.skip=true package
```

---

*Reto generado automaticamente por Challenge Generator - Pragma*

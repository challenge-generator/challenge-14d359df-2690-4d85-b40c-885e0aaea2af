# Prompt para Mejorar el Codigo Base

Copia y pega el contenido del bloque de abajo en un asistente de IA (Claude, ChatGPT)
para obtener el proyecto completo y arrancable. Guarda los archivos que te devuelva en la
carpeta del repo, respetando exactamente las rutas.

Si preferis trabajar en tu editor con un agente local (Claude Code, Cursor, Copilot), usa `AGENTS.md` en vez de este archivo: dice lo mismo pero para que escriba los archivos en disco.

## Las dos reglas que no se negocian

1. **Completa el boilerplate.** Todo lo que el proyecto necesita para compilar y arrancar: manifiesto de dependencias, punto de entrada, configuracion, capa de interfaz, y las capas del patron arquitectonico declarado. Eso es andamiaje y es tu trabajo.
2. **NO resuelvas el reto.** Los entregables de las fases son el trabajo de la persona. El hueco pedagogico se deja como esta: el proyecto arranca, pero lo que el reto pide implementar NO esta implementado.

Dicho de otra forma: si algo impide compilar, arreglalo. Si algo es logica de negocio incompleta, validaciones ausentes, un secreto hardcodeado o un patron mejorable, dejalo exactamente como esta — es lo que la persona tiene que encontrar.

## Superficie de practica — NO resuelvas

Estos archivos SON el ejercicio de la persona. No los implementes; deja stubs.

- `src/main/java/bdd/cucumber/AccountStepDefinitions.java` — La pieza p2 (Implementación de pasos de prueba para escenarios de Cucumber en Gherkin, fase f2) vive aqui: este archivo es su unico dueno (blueprint v2).
- `src/main/java/bdd/cucumber/AccountTestContext.java` — La pieza p3 (Gestión del contexto de prueba para escenarios de Cucumber, fase f2) vive aqui: este archivo es su unico dueno (blueprint v2).
- `src/main/java/bdd/karate/AccountApiClient.java` — La pieza p4 (Implementación de un cliente de API para pruebas con Karate, fase f3) vive aqui: este archivo es su unico dueno (blueprint v2).

## Herramientas

- **Karate Framework**: Tecnologia pedida para este reto: forma parte del stack con el que se resuelve el ejercicio.

## Como saber que terminaste

```bash
mvn -q -B -DskipTests -Dspring-boot.repackage.skip=true package
```

Ese comando corriendo sin errores es la definicion de "listo".

---

```
## Briefing del reto (autoridad)
Este bloque manda sobre los archivos adjuntos. El stack y el rol salen de AQUÍ, no de un topic genérico ni de markdown placeholder.

### Perfil
Chapter Backend, Especialidad Desarrollador, Tecnología Java, Senior L2

### Brecha de conocimiento
Aplica metodologías de desarrollo basadas en comportamiento como BDD (Desarrollo Guiado por Comportamiento) y trabaja bajo herramientas de automatización como Cucumber, el framework Karate, etc.

### Reto
- Tema: Desarrollador con Sólida Experiencia en BDD y Frameworks de Automatización
- Seniority: senior-l2
- Tipo: practical
- Título: Implementación de BDD en un Sistema de Gestión de Cuentas Bancarias
- Tiempo estimado: 10 horas

### Fases (trabajo del HUMANO — PROHIBIDO completarlas)
No implementes estos entregables. Dejalos como hueco pedagógico. El asistente solo materializa el proyecto arrancable para que el participante pueda trabajar.
- Fase 1: Definición de Casos de Uso — objetivo: Identificar y documentar los casos de uso principales del sistema de gestión de cuentas bancarias. — entregable (NO resolver): Documento de casos de uso transformado en piezas de lógica de negocio en la capa core.
- Fase 2: Implementación de Pruebas con Cucumber — objetivo: Crear y ejecutar pruebas automatizadas para los casos de uso utilizando Cucumber. — entregable (NO resolver): Escenarios de prueba en Gherkin y pasos de prueba implementados en Java.
- Fase 3: Integración con Karate Framework — objetivo: Integrar Karate Framework para mejorar la automatización de pruebas y la gestión de API. — entregable (NO resolver): Pruebas de API escritas en Karate y configuradas en el proyecto.

Eres un asistente experto en análisis, corrección y generación de archivos de cualquier tipo:
código fuente, documentación, hojas de cálculo, documentos Word, configuraciones, entre otros.
Voy a enviarte una cadena de texto que contiene uno o más archivos. Cada archivo está delimitado por un marcador con el siguiente formato:
// === ARCHIVO: ruta/del/archivo.extension ===
o también puede aparecer como:
## === ARCHIVO: ruta/del/archivo.extension ===
Lo que sigue al marcador puede ser:

El contenido real del archivo (código, texto, YAML, etc.)
Una descripción en lenguaje natural de lo que debe contener el archivo


TU TAREA
PASO 0 — ¿Esto es un proyecto o una carcasa?
Antes de extraer archivos, leé el Briefing (si está) y diagnosticá el adjunto.

Es CARCASA si ocurre CUALQUIERA de estas:
- No hay manifiesto de dependencias del stack del briefing (manifest.json de VTEX IO / package.json / pom.xml / build.gradle / requirements.txt / go.mod / *.tf / *.csproj, según corresponda)
- Hay un "binario" que en realidad es un comentario ("no puede ser mostrado como texto plano", placeholder .fig/.docx vacío)
- Los markdowns ya completan entregables de fases posteriores ("se implementó fade-in", lista de áreas ya resuelta)

Si es CARCASA:
- MATERIALIZÁ un proyecto que arranca en el stack del briefing (VTEX IO Store Framework, Angular, Terraform, pytest, Nest, etc.). Incluí manifiesto, punto de entrada y capa de interfaz reales.
- NO copies los markdowns de "solución" como si fueran el producto. Son ruido de generación.
- NO resuelvas las fases del briefing (están marcadas PROHIBIDO). Dejá el hueco pedagógico: el flujo existe, las microinteracciones/calidad/infra que el reto pide NO están hechas.
- Después seguí al PASO 5 (entrega de archivos).

Si es un proyecto REAL (manifiesto + código que compila o arranca):
- Seguí PASO 1 en adelante. 🔴 compilación sí. 🟡 pedagógico no.

PASO 1 — Detección y extracción
Identifica todos los archivos presentes en la cadena. Para cada archivo extrae:

Su ruta completa (ej: src/main/java/com/pragma/Service.java)
Su contenido o descripción

PASO 2 — Clasificación por tipo
Clasifica cada archivo en una de estas categorías:
A) Código fuente (Java, Python, TypeScript, JavaScript, Kotlin, etc.)
B) Configuración / documentación (YAML, properties, Markdown, JSON, txt, etc.)
C) Excel (.xlsx, .xls, .csv)
D) Word (.docx, .doc)
E) Otro tipo de archivo binario o especial
PASO 3 — Clasificación de errores en código fuente

Objetivo prioritario: que el proyecto compile. No corrijas flujo de negocio ni lógica funcional.

Antes de modificar cualquier archivo de código fuente, clasifica cada problema encontrado en una de estas dos categorías:
🔴 ERROR DE COMPILACIÓN — corregir siempre
Son errores que impiden que el proyecto arranque, sin valor pedagógico:

Import faltante o incorrecto
Clase, método o variable referenciada que no existe en ningún archivo del proyecto
Error de sintaxis
Anotación con atributos inválidos
Dependencia ausente en pom.xml, package.json, etc.
Archivo referenciado que no existe y debe ser creado con implementación mínima

→ CORREGIR estos errores.
🟡 PROBLEMA FUNCIONAL O DE CALIDAD — preservar siempre
Son problemas que no impiden compilar. Pueden ser intencionales para el aprendizaje:

Clave secreta hardcodeada ("secret", "password123")
API deprecada que funciona pero tiene reemplazo moderno
Lógica de negocio incorrecta o incompleta
Código redundante o de baja legibilidad
Falta de validaciones en flujo de negocio
Patrones de diseño incorrectos pero funcionales
Concurrencia no segura
Configuración funcional pero no óptima

→ PRESERVAR tal cual. No corregir, no mejorar, no comentar.
PASO 4 — Procesamiento según tipo de archivo
Tipo A — Código fuente
Aplica únicamente las correcciones clasificadas como 🔴 ERROR DE COMPILACIÓN.
No alteres ningún elemento clasificado como 🟡 PROBLEMA FUNCIONAL O DE CALIDAD.
Si falta un archivo referenciado, créalo con la implementación mínima necesaria para compilar.
Tipo B — Configuración / documentación
Extrae el contenido tal cual, sin modificaciones salvo errores evidentes de sintaxis
(ej: YAML mal indentado).
Tipo C — Excel (.xlsx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un archivo Excel funcional con:

Fila de encabezados en negrita con color de fondo distintivo
Columnas con ancho ajustado al contenido
Tipos de dato correctos por columna
Validaciones si la descripción lo indica
Hojas nombradas descriptivamente si hay más de una
Filas de ejemplo si no hay datos reales

Tipo D — Word (.docx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un documento Word funcional con:

Estilos de título (Título 1, Título 2) para jerarquía de secciones
Fuente legible (Calibri o equivalente), tamaño 11-12pt para cuerpo
Márgenes estándar
Tabla de contenido si tiene múltiples secciones
Tablas con encabezados en negrita si aplica

Tipo E — Otro
Genera el archivo con el contenido o estructura más apropiada según la descripción.
PASO 5 — Entrega de archivos
Entregá cada archivo con su ruta completa, respetando exactamente la estructura de rutas
indicada por los marcadores: un bloque por archivo, precedido por su ruta. No generes ZIPs
ni archivos adjuntos.
La entrega debe incluir:

Archivos de código con únicamente los errores de compilación corregidos
Archivos de configuración y documentación sin cambios
Archivos nuevos creados para resolver dependencias de compilación faltantes
Archivos Excel y Word generados desde descripción

IMPORTANTE: Entregá los archivos completos al finalizar. No preguntes si el usuario
quiere recibirlos. Simplemente entregalos; No debes desplegar en el chat el resumen de lo que arreglaste, solo entregá los archivos.

REGLAS IMPORTANTES

No omitas ningún archivo aunque no tenga errores ni modificaciones
Respeta los nombres y rutas exactas indicadas por los marcadores
Si un archivo no tiene marcador claro, infiere el nombre desde su contenido
Si la cadena contiene solo documentación, placeholders o binarios fake, NO la reproduzcas:
aplicá PASO 0 (materializar el proyecto del briefing). Reproducir la carcasa es un fallo.
No agregues texto después del último archivo entregado
No preguntes si el usuario quiere los archivos: simplemente entregalos siempre
Si detectas que falta un archivo de configuración necesario para compilar
(pom.xml, package.json, requirements.txt, build.gradle, etc.), créalo e inclúyelo
inferiendo su contenido desde los imports y frameworks detectados en el código
Nunca corrijas problemas 🟡 aunque parezcan obvios o fáciles de mejorar.
El participante que recibirá este proyecto los debe encontrar y resolver él mismo.


INPUT
Aquí está la cadena con los archivos:

// === ARCHIVO: src/test/java/AppTest.java ===
package com.pragma;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import io.cucumber.spring.CucumberContextConfiguration;
import bdd.cucumber.AccountTestContext;

@SpringBootTest
@CucumberContextConfiguration
@Import({AccountTestContext.class})
class AppTest {

    @Test
    void contextLoads() {
        // This test ensures that the Spring context loads successfully
        // and is required for Cucumber to initialize the Spring context
    }
}

// === ARCHIVO: pom.xml ===
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.4.13</version>
        <relativePath/>
    </parent>

    <groupId>com.example</groupId>
    <artifactId>reto</artifactId>
    <version>1.0.0</version>
    <name>reto</name>

    <properties>
        <java.version>21</java.version>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>com.intuit.karate</groupId>
            <artifactId>karate-apache</artifactId>
            <version>0.9.6</version>
        </dependency>
        <dependency>
            <groupId>com.intuit.karate</groupId>
            <artifactId>karate-junit5</artifactId>
            <version>1.4.1</version>
        </dependency>
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-java</artifactId>
            <version>7.34.9</version>
        </dependency>
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-junit</artifactId>
            <version>7.34.9</version>
        </dependency>
        <dependency>
            <groupId>io.cucumber</groupId>
            <artifactId>cucumber-spring</artifactId>
            <version>7.34.9</version>
        </dependency>
        <dependency>
            <groupId>org.mapstruct</groupId>
            <artifactId>mapstruct</artifactId>
            <version>1.6.3</version>
        </dependency>
        <dependency>
            <groupId>org.postgresql</groupId>
            <artifactId>postgresql</artifactId>
        </dependency>
        <dependency>
            <groupId>org.projectlombok</groupId>
            <artifactId>lombok</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
</project>

// === ARCHIVO: src/main/java/domain/model/Account.java ===
package domain.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import java.math.BigDecimal;

public record Account(
    @NotBlank(message = "Account number cannot be blank")
    String accountNumber,

    @NotNull(message = "Balance cannot be null")
    @PositiveOrZero(message = "Balance cannot be negative")
    BigDecimal balance,

    @NotBlank(message = "Account type cannot be blank")
    String accountType,

    @NotBlank(message = "Owner ID cannot be blank")
    String ownerId,

    @NotBlank(message = "Status cannot be blank")
    String status) {

    public Account {
        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException("Account number cannot be null or blank");
        }
        if (balance == null || balance.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("Balance cannot be null or negative");
        }
        if (accountType == null || accountType.isBlank()) {
            throw new IllegalArgumentException("Account type cannot be null or blank");
        }
        if (ownerId == null || ownerId.isBlank()) {
            throw new IllegalArgumentException("Owner ID cannot be null or blank");
        }
        if (status == null || status.isBlank()) {
            throw new IllegalArgumentException("Status cannot be null or blank");
        }
    }

    public Account withBalance(BigDecimal newBalance) {
        return new Account(accountNumber, newBalance, accountType, ownerId, status);
    }

    public Account withStatus(String newStatus) {
        return new Account(accountNumber, balance, accountType, ownerId, newStatus);
    }
}

// === ARCHIVO: src/main/java/domain/port/AccountRepository.java ===
package domain.port;

import domain.model.Account;
import java.util.Optional;

public interface AccountRepository {
    Account save(Account account);
    Optional<Account> findByAccountNumber(String accountNumber);
}

// === ARCHIVO: src/main/java/domain/service/AccountValidationService.java ===
package domain.service;

import domain.model.Account;
import domain.port.AccountRepository;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import jakarta.validation.ValidatorFactory;
import java.util.Set;

public class AccountValidationService {
    private final AccountRepository accountRepository;
    private final Validator validator;
    private final Set<String> validAccountTypes = Set.of("SAVINGS", "CHECKING", "INVESTMENT");

    public AccountValidationService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        this.validator = factory.getValidator();
    }

    public void validateAccountCreation(Account account) {
        validateAccountType(account.accountType());
        validateUniqueAccountNumber(account.accountNumber());
        validateBeanConstraints(account);
    }

    private void validateAccountType(String accountType) {
        if (!validAccountTypes.contains(accountType)) {
            throw new IllegalArgumentException("Invalid account type. Allowed types: " + validAccountTypes);
        }
    }

    private void validateUniqueAccountNumber(String accountNumber) {
        accountRepository.findByAccountNumber(accountNumber)
            .ifPresent(a -> {
                throw new IllegalArgumentException("Account number already exists");
            });
    }

    private void validateBeanConstraints(Account account) {
        var violations = validator.validate(account);
        if (!violations.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            violations.forEach(v -> sb.append(v.getMessage()).append("; "));
            throw new IllegalArgumentException("Validation errors: " + sb);
        }
    }

    public void validateAccountExists(String accountNumber) {
        accountRepository.findByAccountNumber(accountNumber)
            .orElseThrow(() -> new IllegalArgumentException("Account not found"));
    }
}

// === ARCHIVO: src/main/java/infrastructure/repository/AccountJpaRepository.java ===
package infrastructure.repository;

import domain.model.Account;
import domain.port.AccountRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface AccountJpaRepository extends JpaRepository<AccountEntity, String>, AccountRepository {

    @Override
    default Account save(Account account) {
        AccountEntity entity = AccountEntity.fromDomain(account);
        AccountEntity savedEntity = save(entity);
        return savedEntity.toDomain();
    }

    @Override
    default Optional<Account> findByAccountNumber(String accountNumber) {
        return findById(accountNumber).map(AccountEntity::toDomain);
    }
}

// === ARCHIVO: src/main/java/bdd/cucumber/AccountStepDefinitions.java ===
// TODO(reto): archivo stubbeado; implementa los cuerpos.
package bdd.cucumber;

import domain.service.AccountValidationService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.math.BigDecimal;

public class AccountStepDefinitions {

    private final AccountValidationService accountValidationService;
    private final AccountTestContext testContext;
    private Exception thrownException;

    public AccountStepDefinitions(AccountValidationService accountValidationService,
                                   AccountTestContext testContext) {
        this.accountValidationService = accountValidationService;
        this.testContext = testContext;
    }

    @Given("Una cuenta con saldo inicial de {int} y tipo {string} asociada a un cliente existente")
    public void givenAnExistingAccount(int balance, String accountType) {
      throw new UnsupportedOperationException("TODO(reto): Given");
    }

    @When("Se crea la cuenta")
    public void whenTheAccountIsCreated() {
      throw new UnsupportedOperationException("TODO(reto): When");
    }

    @Then("La cuenta es válida y se registra correctamente")
    public void thenTheAccountShouldBeValid() {
      throw new UnsupportedOperationException("TODO(reto): Then");
    }

    @Then("La creación falla y se lanza una excepción de negocio")
    public void thenTheCreationFailsWithBusinessException() {
      throw new UnsupportedOperationException("TODO(reto): Then");
    }

    @Given("Una cuenta con saldo inicial de {int} y tipo {string}")
    public void givenAnAccountWithNegativeBalance(int balance, String accountType) {
      throw new UnsupportedOperationException("TODO(reto): Given");
    }

    @When("Se intenta crear la cuenta")
    public void whenAttemptingToCreateAccount() {
      throw new UnsupportedOperationException("TODO(reto): When");
    }
}

// === ARCHIVO: src/main/java/bdd/cucumber/AccountTestContext.java ===
// TODO(reto): archivo stubbeado; implementa los cuerpos.
package bdd.cucumber;

import domain.model.Account;

public class AccountTestContext {

    private Account account;
    private boolean isValid;
    private String lastErrorMessage;

    public void setAccount(Account account) {
        this.account = account;
    }

    public Account getAccount() {
        return account;
    }

    public void setValidationResult(boolean valid) {
        this.isValid = valid;
    }

    public boolean isValid() {
        return isValid;
    }

    public void setErrorMessage(String message) {
        this.lastErrorMessage = message;
    }

    public String getErrorMessage() {
        return lastErrorMessage;
    }

    public void clear() {
      throw new UnsupportedOperationException("TODO(reto): clear");
    }
}

// === ARCHIVO: src/main/java/bdd/karate/AccountApiClient.java ===
// TODO(reto): archivo stubbeado; implementa los cuerpos.
package bdd.karate;

import com.intuit.karate.http.HttpRequestBuilder;
import com.intuit.karate.http.HttpResponse;
import domain.model.Account;
import java.math.BigDecimal;
import java.util.Map;

public class AccountApiClient {

    private static final String BASE_URL = "http://localhost:8080";
    private static final String ACCOUNTS_ENDPOINT = "/api/accounts";

    public AccountApiClient() {
    }

    public Account createAccount(Account account) {
      throw new UnsupportedOperationException("TODO(reto): createAccount");
    }

    public Account getAccount(String accountNumber) {
      throw new UnsupportedOperationException("TODO(reto): getAccount");
    }

    private String buildRequestBody(Account account) {
      throw new UnsupportedOperationException("TODO(reto): buildRequestBody");
    }

    private Account mapToAccount(Map<String, Object> map) {
      throw new UnsupportedOperationException("TODO(reto): mapToAccount");
    }

    public static class AccountApiException extends RuntimeException {
        private final int statusCode;

        public AccountApiException(String message, int statusCode) {
            super(message);
            this.statusCode = statusCode;
        }

        public int getStatusCode() {
            return statusCode;
        }
    }
}

// === ARCHIVO: src/main/java/application.yml ===
spring:
  application:
    name: bank-account-management
  datasource:
    url: ${DB_URL:jdbc:postgresql://localhost:5432/bankdb}
    username: ${DB_USERNAME:postgres}
    password: ${DB_PASSWORD:postgres}
    driver-class-name: org.postgresql.Driver
    hikari:
      maximum-pool-size: 10
      minimum-idle: 5
      connection-timeout: 30000
      idle-timeout: 600000
      max-lifetime: 1800000
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: false
    properties:
      hibernate:
        dialect: org.hibernate.dialect.PostgreSQLDialect
        format_sql: true
        jdbc:
          batch_size: 20
        order_inserts: true
        order_updates: true
    open-in-view: false
  mvc:
    throw-exception-if-no-handler-found: true
  web:
    resources:
      add-mappings: false

server:
  port: ${SERVER_PORT:8080}
  address: ${SERVER_ADDRESS:0.0.0.0}
  servlet:
    context-path: /
    encoding:
      charset: UTF-8
      enabled: true
      force: true

logging:
  level:
    root: INFO
    com.example: DEBUG
    org.springframework.web: DEBUG
    org.hibernate.SQL: DEBUG
    org.hibernate.type.descriptor.sql.BasicBinder: TRACE
  pattern:
    console: "%d{yyyy-MM-dd HH:mm:ss} [%thread] %-5level %logger{36} - %msg%n"
    file: "%d{yyyy-MM-dd HH:mm:ss} [%thread] %-5level %logger{36} - %msg%n"

management:
  endpoints:
    web:
      exposure:
        include: health,info,metrics
  endpoint:
    health:
      show-details: always
  health:
    db:
      enabled: true

// === ARCHIVO: src/main/java/Application.java ===
package com.example.reto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import domain.port.AccountRepository;
import domain.service.AccountValidationService;

@SpringBootApplication(scanBasePackages = {
    "com.example.reto",
    "domain",
    "infrastructure",
    "bdd",
    "application"
})
@EntityScan(basePackages = {"domain.model", "infrastructure.repository"})
@EnableJpaRepositories(basePackages = {"infrastructure.repository"})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    public AccountValidationService accountValidationService(AccountRepository accountRepository) {
        return new AccountValidationService(accountRepository);
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

// === ARCHIVO: src/main/java/infrastructure/repository/AccountEntity.java ===
package infrastructure.repository;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import java.math.BigDecimal;

@Entity
@Table(name = "accounts")
public class AccountEntity {
    @Id
    @Column(name = "account_number")
    private String accountNumber;

    @Column(name = "balance", precision = 19, scale = 2)
    private BigDecimal balance;

    @Column(name = "account_type")
    private String accountType;

    @Column(name = "owner_id")
    private String ownerId;

    @Column(name = "status")
    private String status;

    public AccountEntity() {
    }

    public AccountEntity(String accountNumber, BigDecimal balance, String accountType, String ownerId, String status) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.accountType = accountType;
        this.ownerId = ownerId;
        this.status = status;
    }

    public static infrastructure.repository.AccountEntity fromDomain(domain.model.Account account) {
        return new infrastructure.repository.AccountEntity(
            account.accountNumber(),
            account.balance(),
            account.accountType(),
            account.ownerId(),
            account.status()
        );
    }

    public domain.model.Account toDomain() {
        return new domain.model.Account(
            accountNumber,
            balance,
            accountType,
            ownerId,
            status
        );
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
```

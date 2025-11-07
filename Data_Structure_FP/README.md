# SyncUp - Plataforma de Streaming Musical y Descubrimiento Social

## Descripción
SyncUp es una plataforma de streaming musical y descubrimiento social que permite a los usuarios gestionar su perfil, buscar canciones, recibir recomendaciones inteligentes y conectarse con otros usuarios basándose en gustos musicales.

## Colaboradores 
-Nicol Dayana Marin Moreno
-Maicol Paez
-Juan Esteban Carmona Salazar

## Requisitos del Sistema
- Java 11 o superior
- Maven 3.6+
- JavaFX 17

## Compilación y Ejecución

### Compilar el proyecto
```bash
mvn clean compile
```

### Ejecutar la aplicación
```bash
mvn javafx:run
```

### Ejecutar pruebas unitarias
```bash
mvn test
```

### Generar documentación JavaDoc
```bash
mvn javadoc:javadoc
```

## Estructura del Proyecto
- `src/main/java/co/edu/uniquindio/syncup/` - Código fuente principal
- `src/test/java/` - Pruebas unitarias
- `src/main/resources/` - Recursos (estilos, imágenes)

## Funcionalidades
- Registro e inicio de sesión
- Gestión de perfil y favoritos
- Búsqueda de canciones (autocompletado y avanzada)
- Generación de playlist "Descubrimiento Semanal"
- Radio basada en canciones similares
- Sistema de seguimiento de usuarios
- Panel de administración


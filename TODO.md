# Por hacer o considerar

## Xpand

- FOREIGN KEY (claveForane) necesita especificar REFERENCE, ejemplo:

```
FOREIGN KEY (claveForanea) REFERENCE otraTabla(suClavePrimaria)
```

Para lo de la clave foránea con referencia a la primera de la otra entidad se
puede seguir lo mismo que son herencia. En xpand está hecho con herencia con
*ALTER TABLE ...*

- Acceder a todas las entidades para hacer el CREATE TABLE, pero no a través de
  las relaciones fuertes y débiles porque se deja de lado la herencia que es una
  relación más.

- Clave primaria de Entidad fuerte en EntidadDebil como FK.

- Herencia
  - Creación de Tablas
  - Relación de Tablas

- Herencia puede tener múltiples hijos

- Clave primaria foranea

- Relacion N:N
  - Contemplar la cardinalidad de las relaciones

- PK(EntidadFuerte) -> FK(EntidadDebil)

- Contemplar que AtriutoCompuesto es más de un sólo atributo

## OCL

- Agregar restricciones para que las relaciones deban tener, obligatoriamente,
  límte inferior y límite superior.

## Cambios a evaluar sobre el mapeo y GMF

- Relación bidireccional entre LinkHerenciaPadre y LinkHerenciaHijo con
  Herencia.

## Consideraciones

- Para establecer las relaciones se está ignorando si son entidades y tipos de
  relaciones débiles o fuerte. Es decir, se están considerando ambas como
  simples entidades y relaciones, respectivamente.

- Para establecer la cardinalidad de las relaciones, se está ignorando
  límiteInferior, y se está utilizando solamente límite superior, es decir, si
  la cardinalidad es 1 ó N dentro de la relación.

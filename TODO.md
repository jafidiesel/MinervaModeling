# Por hacer o considerar

## Xpand

- ~~FOREIGN KEY (claveForane) necesita especificar REFERENCE, ejemplo:~~

```
FOREIGN KEY (claveForanea) REFERENCE otraTabla(suClavePrimaria)
```

Para lo de la clave foránea con referencia a la primera de la otra entidad se
puede seguir lo mismo que son herencia. En xpand está hecho con herencia con
*ALTER TABLE ...*

- ~~Acceder a todas las entidades para hacer el CREATE TABLE, pero no a través de
  las relaciones fuertes y débiles porque se deja de lado la herencia que es una
  relación más.~~

- ~~Herencia~~
  - Creación de Tablas
  - Relación de Tablas

- Herencia puede tener múltiples hijos

- Clave primaria foranea

- ~~Relacion N:N~~
  - Contemplar la cardinalidad de las relaciones

- ~~Clave primaria de Entidad fuerte en EntidadDebil como FK.~~

Se ignora si es EntidadFuerte o EntidadDebil, solamente se considera la
cardinalidad (1 a 1, 1 a N, N a N) porque si tengo una EntidadDebil con
cardinalidad 1 y una EntidadFuerte con cardinalidad N, según esto la clave
foránea de la EntidadDebil debería ir en la EntidadFuerte (EntidadFuerte estaría
relacionada con Debil y no al revés), pero debería ser al revés por el hecho de
que la Debil debería llevar la clave foránea de la Fuerte (por eso mismo una es
fuerte y la otra débil).

- PK(EntidadFuerte) -> FK(EntidadDebil)

Mismo caso que el item de arriba.

- Contemplar que AtriutoCompuesto es más de un sólo atributo

## OCL

- ~~Agregar restricciones para que las relaciones deban tener, obligatoriamente,
  límte inferior y límite superior.~~
- Un atributo debe tener asociada una sola entidad
- Ídem atributo simple con compuesto 
- Si Entidadfuerte esta relacionada con RelacionTipoDebil, esa RelacionTipoDebil debe estar relacionada con una EntidadDebil
- Que el padre no sea hijo al mismo tiempo.
- Si Entidadfuerte esta relacionada con RelacionTipoFuerte, esta relación debe tener una EntidadFuerte del otro lado de la luna
- Si existe Herencia y tiene alguna relación con algún padre  debe haber al menos un hijo relacionado con esa Herencia

## Cambios a evaluar sobre el mapeo y GMF

- ~~Relación bidireccional entre LinkHerenciaPadre y LinkHerenciaHijo con
  Herencia.~~ Se revirtió el cambio, se adaptó el Xpand al ecore y no al revés.

## Consideraciones

- Para establecer las relaciones se está ignorando si son entidades y tipos de
  relaciones débiles o fuerte. Es decir, se están considerando ambas como
  simples entidades y relaciones, respectivamente.

- Para establecer la cardinalidad de las relaciones, se está ignorando
  límiteInferior, y se está utilizando solamente límite superior, es decir, si
  la cardinalidad es 1 ó N dentro de la relación.

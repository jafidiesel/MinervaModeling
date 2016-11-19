# Por hacer o considerar

- Herencia puede tener múltiples hijos

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

- Clave primaria de Entidad fuerte en EntidadDebil como FK. En realidad

- ~~Herencia~~

- Clave primaria foranea

- Relacion N:N

- PK(EntidadFuerte) -> FK(EntidadDebil)

# MinervaModeling

> Toolkit para entender que puta son las cosas que se ponen en GMF
> http://what-when-how.com/Tutorial/topic-225aimup/Eclipse-Modeling-Project-A-Domain-Specific-Language-Toolkit-533.html

## Posibles inconvenientes.
>**Nota**:
>Podemos solucionar esto simplemente cambiando la perspectiva de Java(por default) a Modeling, en la que nos saldrá el metamodelo en forma gráfica.
Cuando importen este proyecto, puede que el archivo **modeloER.aird** no les
muestre el diagrama al abrirlo, sino el código XML. Para solucionarlo, deben
crear un proyecto nuevo (*Prueba* por ejemplo) y en el Wizard de creación, al
final, le aparecen las vistas que quieren habilitar (Archetype, Design, étc).
Vean que esté **Design** marcada. Un vez que creen este proyecto, se les
habilitará el editor gráfico para el modelo en ambos proyectos. Eliminen el
proyecto *Prueba* y trabajen sobre este.

Cree un archivo llamado *empty* dentro de la carpeta *src/* porque al "pushear"
con git, las carpetas que no tienen un archivo dentro, no son almacenadas, y
Eclipse al parecer necesita que exista la carpeta *src/* sí o sí, sino da error,
por más que no la utilicemos para este proyecto.

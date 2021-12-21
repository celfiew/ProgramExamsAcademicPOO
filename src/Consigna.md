# Objetivo
Realizar el diagrama UML y programar en Java el siguiente enunciado.

# Enunciado
La Universidad de la Nueva Enseñanza está comenzando una nueva carrera con un
convenio que hizo con la compañía Todo en Casa S.A. y necesita administrar los parciales y
finales de los alumnos.

Un examen solo puede corresponder a un alumne y los datos que se necesitan del alumne
son: el nombre, el apellido y su legajo en Digital House. Utilizar un constructor que permita
asignar todos estos atributos al momento de crear el objeto.
Un examen además de tener asociado a un alumne tiene un título que describe
brevemente el tema del examen, un enunciado y una nota.

Existen dos variantes de exámenes, ambos tienen las características nombradas
anteriormente, pero luego cada uno de estos tipos de exámenes tienen características
propias por ejemplo los parciales poseen el número de unidad sobre el que se esta
tomando el parcial y además un parcial se puede recuperar muchas veces con lo cual tiene
el número de reintentos. Por otro lado están los exámenes finales que cuentan con una
nota de oral y una descripción del tema que dieron oral.

El sistema debe contar con las siguientes funcionalidades:
Dado cualquier examen se debe poder consultar al mismo si está aprobado o no. Un
examen está aprobado si la nota es superior o igual a 4.
En el caso de los exámenes finales debe ser posible compararlos. Un examen final es
mayor a otro si el promedio de su nota oral y escrita es mayor a otro.
Es importante saber de un parcial si es posible seguir recuperandolo. Un parcial se
puede recuperar hasta 3 veces si la unidad es inferior o igual a la 3 o 2 veces si la unidad es
mayor a la 3.
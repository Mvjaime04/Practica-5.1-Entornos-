# Practica-5.1-Entornos-

# 1.Interpreta el significado del diagrama de clases.

a) Relación entre las clases. Significado, tipo, multiplicidad. 
La relación entre las clases es del tipo agreación ya que hay una clase que queda contenida dentro de otra, en este caso es la clase estudiante la que queda contenida en la clase Curso, sin embargo un estudiante no dejará de serlo estando fuera del curso, es decir, la multiplicidad de esta relación se explica de manera que un estudiante solo puede estar en un curso pero en un curso puede haber varios estudiantes.


b) Elementos de las clases. Tipos y propósito. 
La clase Curso está compuesta por los atributos nombre y codigo de tipo string y estudiantes que es una mutablelist, como metodos o funciones podemos ver agregar alumno, que consiste en una función que agrega un estudiante al curso de la clase estudiante y mostrarEstudiantes que consiste en mostrar una lista de la clase estudiantes.

La clase estudiante esta compuesta por dos atributos tipo string que son nombre y dni  y un metodo que es Inscribirse que tiene como función poder unirse al curso.


c)Significado del método agregarAlumno(). Funcionamiento. 

Agregar alumno implementa un alumno de la clase estudiante dentro de la clase alumno y lo registra en los atributos de la clase Curso (Nombre,codigo y estudiantes).

d) Significa del método inscribirse()

El metodo inscribirse consiste en implementar un estudiante dentro de la clase curso 

2. Generación de código a partir del diagrama. 

a) Crear clases

b) Crear relaciones

c) Crear main (para probar el sistema).


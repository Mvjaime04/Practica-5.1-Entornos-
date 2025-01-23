class Estudiante(val nombre: String, val dni: String) {
    fun inscribirse(curso: Curso) {
        curso.agregarAlumno(this)
    }

    override fun toString(): String {
        return "Estudiante: $nombre, DNI: $dni"
    }
}

class Curso(val nombre: String, val codigo: String) {
    private val estudiantes: MutableList<Estudiante> = mutableListOf()

    fun agregarAlumno(estudiante: Estudiante) {
        if (!estudiantes.contains(estudiante)) {
            estudiantes.add(estudiante)
        }
    }

    fun mostrarEstudiantes() {
        println("Estudiantes inscritos en el curso $nombre ($codigo):")
        for (estudiante in estudiantes) {
            println(estudiante)
        }
    }
}

fun main() {

    val cursoProgramacion = Curso("Programación", "CS101")


    val estudiante1 = Estudiante("Jaime Muñoz", "12345678A")
    val estudiante2 = Estudiante("Bruno Gomez", "87654321B")


    estudiante1.inscribirse(cursoProgramacion)
    estudiante2.inscribirse(cursoProgramacion)


    cursoProgramacion.mostrarEstudiantes()
}

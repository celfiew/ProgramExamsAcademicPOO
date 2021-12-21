public class Alumne {

    private String nombre;
    private String apellido;
    private int legajo;

    public Alumne(String nombre, String apellido, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    public void estudiar() {
        this.entrarEnPanico();
        this.calmarse();
        System.out.println("Ahora sí puedo estudiar tranquile");
    }

    @Override
    public String toString() {
        return "\n\tNombre: '" + nombre + "'" +
               "\n\tApellido: '" + apellido + "'" +
               "\n\tLegajo: " + legajo;
    }

    private void entrarEnPanico() {
        System.out.println("aAaaAaAAaAAAaAaAAA panic attack");
    }

    private void calmarse() {
        System.out.println("Ohmmmmmmm, ya estoy en modo zen");
    }
}

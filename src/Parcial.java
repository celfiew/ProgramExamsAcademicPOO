public class Parcial extends Examen {

    private int nroUnidad;
    private int intentos;

    public Parcial(String titulo, String enunciado, int notaEscrita, Alumne alumne, int nroUnidad) {
        super(titulo, enunciado, notaEscrita, alumne);
        this.nroUnidad = nroUnidad;
        if (this.nroUnidad <= 3) {
            this.intentos = 3;
        } else {
            this.intentos = 2;
        }
    }

    public int getNroUnidad() {
        return this.nroUnidad;
    }

    @Override
    public void rendir() {
        if (this.intentos > 0) {
            this.intentos--;
            System.out.println("\nLe alumne " + this.datosAlumne() + "\n\tEstá rindiendo el parcial escrito.");
            System.out.println("\tLe quedan " + this.intentos + " intentos.");
        } else {
            System.out.println("\nLe alumne " + this.datosAlumne() + "\n\tNo puede rendir porque ya no le quedan intentos.");
        }
    }
}

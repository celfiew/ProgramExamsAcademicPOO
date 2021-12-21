public abstract class Examen {
    private String titulo;
    private String enunciado;
    private int notaEscrita;
    private Alumne alumne;

    public Examen(String titulo, String enunciado, int notaEscrita, Alumne alumne) {
        this.titulo = titulo;
        this.enunciado = enunciado;
        this.notaEscrita = notaEscrita;
        this.alumne = alumne;
    }

    public int getNotaEscrita() {
        return this.notaEscrita;
    }

    public boolean estaAprobado() {
        return this.notaEscrita >= 4;
    }

    public String datosAlumne() {
        return this.alumne.toString();
    }

    public abstract void rendir();
}

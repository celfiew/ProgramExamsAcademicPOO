public class Final extends Examen implements  Comparable {

    private int notaOral;
    private String descripcionOral;

    public Final(String titulo, String enunciado, int nota, Alumne alumne, int notaOral, String descripcionOral) {
        super(titulo, enunciado, nota, alumne);
        this.notaOral = notaOral;
        this.descripcionOral = descripcionOral;
    }

    @Override
    public boolean estaAprobado() {
        return super.estaAprobado() && this.notaOral >= 4;
    }

    @Override
    public void rendir() {
        if (super.estaAprobado()) {
            System.out.println("Le alumne " + this.datosAlumne() + " está rindiendo el final oral.");
        }
    }

    @Override
    public int compareTo(Object o) {
        Final aComparar = (Final) o;
        double thisPromedio = this.calcularPromedio();
        double promedioAComparar = aComparar.calcularPromedio();
        int resultado = 0;

        if (thisPromedio > promedioAComparar)
            resultado = 1;
        else if (thisPromedio < promedioAComparar)
            resultado = -1;
        return resultado;
    }

    private double calcularPromedio() {
        return ((double)this.getNotaEscrita() + (double)this.notaOral) / 2;
    }
}








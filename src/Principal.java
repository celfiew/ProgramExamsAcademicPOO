public class Principal {
    public static void main(String[] args) {
        Alumne pepe = new Alumne("Pepe", "Pepardo", 1234);
        Examen parcialPepe = new Parcial("Parcial", "Lorem ipsum", 5, pepe, 2);
        Final final1Pepe = new Final("Final", "Lorem ipsum escrito", 6, pepe, 3, "Lorem ipsum oral");
        Final final2Pepe = new Final("Final", "Lorem ipsum escrito", 3, pepe, 3, "Lorem ipsum oral");

        pepe.estudiar();

        parcialPepe.rendir();
        parcialPepe.rendir();
        parcialPepe.rendir();
        parcialPepe.rendir();

        final1Pepe.rendir();
        final2Pepe.rendir();

        System.out.println("\nPepe aprobó el parcial: " + parcialPepe.estaAprobado());
        System.out.println("\nPepe aprobó el final 1: " + final1Pepe.estaAprobado());
        System.out.println("\nPepe aprobó el final 2: " + final2Pepe.estaAprobado());

        System.out.println("\nEl final 1 es mayor al final 2: " + final1Pepe.compareTo(final2Pepe));
        System.out.println("El final 2 es mayor al final 1: " + final2Pepe.compareTo(final1Pepe));

    }
}

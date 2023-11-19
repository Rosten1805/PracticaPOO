public class Diputado extends Legislador {

    public Diputado() {
    }

    public Diputado(String nombre, String apellidos, int edad, boolean casado,
                    String provincia, String partidoPolitico, int numeroDespacho) {
        super(nombre, apellidos, edad, casado, provincia, partidoPolitico, numeroDespacho);
    }

    @Override
    public String getCamaraEnQueTrabaja() {
        return "Trabaja en el congreso";
    }
}
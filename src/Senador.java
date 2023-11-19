public class Senador extends Legislador {

    public Senador (){}
    public Senador (String nombre, String apellidos, int edad, boolean casado,
                    String provincia, String partidoPolitico, int numeroDespacho){
        super(nombre, apellidos, edad, casado, provincia, partidoPolitico, numeroDespacho);
    }
    @Override
    public String getCamaraEnQueTrabaja() {
        return "Trabaja en el senado";
    }

}

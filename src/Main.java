public class Main {
    public static void main(String[] args) {

        Senador s1 = new Senador();
        Senador s2 = new Senador("Cristina", "Cañadas", 31, false, "Alicante", "partido 1", 1);
        System.out.println(s2);
        Diputado d1 = new Diputado();

        Diputado d2 = new Diputado("Alex", "Cañadas", 36, true, "Alicante", "partido 2", 3);

        Legislador[] legisladores = {s1, s2, d1, d2};

        for (int i=0; i<legisladores.length; i++) {
            System.out.println(legisladores[i].getCamaraEnQueTrabaja());
        }
    }
}
package PackageOne;

public class TesteUm {
    
    public String testandoClasse(String value) {
        return "O valor contido em " + value + "foi compilado aqui";
    }

    public static void main(String[] args) {
        TesteUm mb = new TesteUm();

        System.out.println(mb.testandoClasse("Brasil"));
    }
}


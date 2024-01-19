public class Main {

    public static void main(String[] args) {
        Auto auto = new Auto(1500, "AB123CD", "Fiat", "Panda");

        System.out.println("Cilindrata: " + auto.getCilindrata());
        System.out.println("Targa: " + auto.getTarga());
        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Modello: " + auto.getModello());

        auto.setCilindrata(2000);
        auto.setTarga("EF456GH");
        auto.setMarca("Ferrari");
        auto.setModello("488 GTB");

        System.out.println("Cilindrata aggiornata: " + auto.getCilindrata());
        System.out.println("Targa aggiornata: " + auto.getTarga());
        System.out.println("Marca aggiornata: " + auto.getMarca());
        System.out.println("Modello aggiornato: " + auto.getModello());
    }
}

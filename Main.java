import Classe.ConsoleHumainFormatter;
import Classe.Femme;
import Classe.Homme;
import Classe.Humain;

public class Main {

    public static void main(String[] args) {
        ConsoleHumainFormatter formatter = new ConsoleHumainFormatter();
        Humain Jean = new Homme("Jean","bon",18,1.40,43 ,"japonnais","bleu" );
        Humain Ginette = new Femme("Ginnette", "jsaispas", 25, 1.34,32,"russe", "Marron" );
        formatter.afficher(Jean);
        formatter.afficher(Ginette);
    }
}



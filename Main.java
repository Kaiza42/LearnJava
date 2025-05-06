import Classe.Femme;
import Classe.Homme;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Homme Jean = new Homme("Jean","bon",18,1.40,43 ,"japonnais","Marron" );
        Femme Ginette = new Femme("Ginnette", "jsaispas", 25, 1.34,32,"russe", "Marron" );
        Jean.information();
        Ginette.information();

    }
}



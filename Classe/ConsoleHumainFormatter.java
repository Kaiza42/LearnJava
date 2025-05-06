package Classe;

public class ConsoleHumainFormatter implements HumainFormatter  {

    @Override
    public void afficher(Humain humain) {
        System.out.println("Le prénom est : " + humain.getPrenom());
        System.out.println("Le nom est : " + humain.getNom());
        System.out.println("L'âge est : " + humain.getAge());
        System.out.println("La taille est de : " + humain.getTaille());
        System.out.println("La pointure est de : " + humain.getTaillePied());
        System.out.println("La langue est : " + humain.getLangue());

        if (humain instanceof Homme) {
            System.out.println("Couleur des yeux : " + ((Homme) humain).getCouleurYeux());
        } else if (humain instanceof Femme) {
            System.out.println("Couleur de cheveux : " + ((Femme) humain).getCouleurCheveux());
        }
    }
}

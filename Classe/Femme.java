package Classe;

public class Femme extends Humain{
    String couleurCheveux;
    public Femme(String prenom,String nom, int age, double taille, double taillePied, String langue, String couleurCheveux){
        super(prenom, nom, age, taille, taillePied, langue);
        this.couleurCheveux = couleurCheveux;
    }

    @Override
    public void information(){
        super.information();
        System.out.println("Sa couleur de cheveux est : " + couleurCheveux);
    }
}

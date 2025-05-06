package Classe;

public class Femme extends Humain {
    String couleurCheveux;
    public Femme(String prenom,String nom, int age, double taille, double taillePied, String langue, String couleurCheveux){
        super(prenom, nom, age, taille, taillePied, langue);
        this.couleurCheveux = couleurCheveux;
    }
    public String getCouleurCheveux() {return couleurCheveux;}

    @Override
    public  String getDescriptionSpecifique(){
        return "Couleur des cheveux : " + getCouleurCheveux();
    };
}

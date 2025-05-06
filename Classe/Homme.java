package Classe;

public class Homme extends Humain {
    private String couleurYeux;

    public Homme(String prenom, String nom, int age, double taille, double taillePied, String langue, String couleurYeux) {
        super(prenom, nom, age, taille, taillePied, langue);
        this.couleurYeux = couleurYeux;
    }

    public String getCouleurYeux() {return couleurYeux;}

    @Override
    public  String getDescriptionSpecifique(){
        return "Couleur des cheveux : " + getCouleurYeux();
    };
}
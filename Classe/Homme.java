package Classe;

public class Homme extends Humain {
    String couleurYeux;
    public Homme(String prenom,String nom, int age, double taille, double taillePied, String langue, String couleurYeux) {
        super(prenom,nom , age, taille, taillePied, langue);
        this.couleurYeux = couleurYeux;
    }

    @Override
    public void information(){
        super.information();
        System.out.println("Sa couleur de yeux est : " + couleurYeux);
    }
}

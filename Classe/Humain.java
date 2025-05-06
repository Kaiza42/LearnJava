package Classe;

public abstract class Humain implements Informable {
    String prenom;
    String nom;
    int age;
    double taille;
    double taillePied;
    String langue;

    public Humain(String prenom,String nom, int age, double taille, double taillePied, String langue) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        this.taille = taille;
        this.taillePied = taillePied;
        this.langue = langue;
    }
    @Override
    public void information(){
        System.out.println("Le prénom est : " + prenom);
        System.out.println("Le nom est : " + nom);
        System.out.println("L'age est : " + age);
        System.out.println("La taille est de : " + taille);
        System.out.println("La pointure est de : " + taillePied);
        System.out.println("La langue est : " + langue);
    }
}

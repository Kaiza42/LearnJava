package Classe;

public abstract class Humain {
    private String prenom;
    private String nom;
    private int age;
    private double taille;
    private double taillePied;
    private String langue;

    public Humain(String prenom,String nom, int age, double taille, double taillePied, String langue) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
        this.taille = taille;
        this.taillePied = taillePied;
        this.langue = langue;
    }
    public String getPrenom() { return prenom;}
    public String getNom() { return nom;}
    public int getAge(){ return age;}
    public double getTaille(){ return taille;}
    public double getTaillePied(){ return taillePied;}
    public String getLangue(){ return langue;}
    public abstract String getDescriptionSpecifique();
}

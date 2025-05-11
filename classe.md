# 📘 SuiteJava : Documentation des concepts avancés

Bienvenue dans **SuiteJava**, un document complémentaire qui approfondit certains concepts fondamentaux du langage Java, avec des exemples progressifs et testables. Ce fichier est conçu comme un bloc d'entraînement pratique, orienté vers la compréhension des mécanismes internes du langage.

---

## 📑 Sommaire global

- [🧱 Les classes en Java](#-les-classes-en-java)
  - [1. Créer une classe simple](#1-créer-une-classe-simple)
  - [2. Ajouter un constructeur et `this`](#2-ajouter-un-constructeur-et-this)
  - [3. Encapsulation avec `private` et `public`](#3-encapsulation-avec-private-et-public)
  - [4. Créer des `getters` et `setters`](#4-créer-des-getters-et-setters)
  - [5. Ajouter des attributs `static` et `final`](#5-ajouter-des-attributs-static-et-final)
  - [6. Héritage avec `extends`](#6-héritage-avec-extends)
  - [7. Appeler le parent avec `super`](#7-appeler-le-parent-avec-super)
- [🧩 Classe abstraite (`abstract`)](#-classe-abstraite-abstract)

---

## 🧱 Les classes en Java

En Java, une classe est un plan de construction pour des objets. Elle définit les attributs (données) et les comportements (méthodes). Voici une progression logique et testable pour comprendre les classes.

---

### 1. Créer une classe simple
> Déclaration basique d'une classe avec deux attributs publics.

```java
public class Voiture {
    public String marque;
    public int vitesse;
}
```

---

### 2. Ajouter un constructeur et `this`
> Le constructeur permet d'initialiser l'objet. `this` fait référence à l'objet courant.

```java
public class Voiture {
    public String marque;
    public int vitesse;

    public Voiture(String marque, int vitesse) {
        this.marque = marque;
        this.vitesse = vitesse;
    }
}
```

---

### 3. Encapsulation avec `private` et `public`
> En Java, on utilise `private` pour **protéger les données internes** d'une classe. Cela empêche d'y accéder ou de les modifier directement depuis l'extérieur.
>
> Les méthodes qui permettent de lire ou modifier ces données sont déclarées `public`, pour les rendre accessibles depuis d'autres classes.

```java
public class Voiture {
    private String marque; // accès uniquement à l'intérieur de la classe
    private int vitesse;

    public Voiture(String marque, int vitesse) {
        this.marque = marque;
        this.vitesse = vitesse;
    }
}
```

---

### 4. Créer des `getters` et `setters`
> Méthodes publiques pour accéder/modifier les données privées. Elles permettent de **contrôler ce qu'on expose**.

```java
public String getMarque() {
    return marque;
}

public void setMarque(String marque) {
    this.marque = marque;
}

public int getVitesse() {
    return vitesse;
}

public void setVitesse(int vitesse) {
    this.vitesse = vitesse;
}
```

---

### 5. Ajouter des attributs `static` et `final`
> `static` appartient à la classe. `final` signifie qu'on ne peut plus modifier la valeur.
>
> Cela permet par exemple de compter le nombre d'objets créés, ou de définir une constante.

```java
public class Voiture {
    private String marque;
    private int vitesse;
    public static int nombreTotal = 0;
    public static final int VITESSE_MAX = 250;

    public Voiture(String marque, int vitesse) {
        this.marque = marque;
        this.vitesse = vitesse;
        nombreTotal++;
    }
}
```

---

### 6. Héritage avec `extends`
> Une classe peut hériter d'une autre pour réutiliser ses attributs et méthodes.

```java
public class Camion extends Voiture {
    private int capacite;

    public Camion(String marque, int vitesse, int capacite) {
        super(marque, vitesse);
        this.capacite = capacite;
    }
}
```

---

### 7. Appeler le parent avec `super`
> `super` permet d'appeler le constructeur de la classe mère.

```java
Camion camion = new Camion("Volvo", 90, 12000);
System.out.println(camion.getMarque()); // Affiche "Volvo"
```

---

## 🧩 Classe abstraite (`abstract`)

Une classe abstraite est une classe **qu'on ne peut pas instancier**. Elle est utilisée comme **modèle** pour d'autres classes. On s'en sert pour **imposer certaines méthodes** à toutes les classes qui en héritent, sans forcément tout définir dedans.

---

### 🔹 Déclaration d'une classe abstraite
> Utilisation du mot-clé `abstract` devant `class`. On peut y définir des méthodes normales **et** des méthodes abstraites (sans corps).

```java
public abstract class Animal {
    protected String nom;

    public Animal(String nom) {
        this.nom = nom;
    }

    // Méthode abstraite à implémenter dans les sous-classes
    public abstract void crier();

    // Méthode normale déjà définie
    public void dormir() {
        System.out.println(nom + " dort...");
    }
}
```

---

### 🔹 Implémentation dans une sous-classe
> Une classe qui hérite d'une classe abstraite **doit** implémenter toutes ses méthodes abstraites.

```java
public class Chien extends Animal {
    public Chien(String nom) {
        super(nom);
    }

    @Override
    public void crier() {
        System.out.println(nom + " aboie !");
    }
}
```

---

### 🔹 Utilisation et comportement

```java
Animal monChien = new Chien("Rex");
monChien.crier();      // Rex aboie !
monChien.dormir();     // Rex dort...
```

---

### 🔒 Rappel
> On ne peut **pas** créer une instance directe d'une classe abstraite :

```java
Animal a = new Animal("Mystère"); // ❌ Erreur : classe abstraite non instanciable
```

---

✅ Les classes abstraites permettent de **partager du code commun** tout en **forçant une structure** dans les classes filles.

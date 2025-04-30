# Debut Java 

## 🧾 Types de données en Java

# 🧾 Types de données en Java avec exemples

| Type           | Catégorie         | Description courte                                                   | Exemple de déclaration                   |
|----------------|-------------------|----------------------------------------------------------------------|------------------------------------------|
| `byte`         | Primitif          | Entier sur 8 bits (-128 à 127), utile pour économiser de la mémoire. | `byte age = 25;`                         |
| `short`        | Primitif          | Entier sur 16 bits, plus grand que `byte`.                           | `short hauteur = 150;`                   |
| `int`          | Primitif          | Entier sur 32 bits, type entier par défaut.                          | `int score = 1000;`                      |
| `long`         | Primitif          | Entier sur 64 bits, utile pour les grands nombres.                   | `long distance = 123456789L;`            |
| `float`        | Primitif          | Nombre à virgule sur 32 bits (précision simple).                     | `float temperature = 36.6f;`             |
| `double`       | Primitif          | Nombre à virgule sur 64 bits (précision double).                     | `double pi = 3.14159;`                   |
| `char`         | Primitif          | Caractère Unicode (ex: 'A', 'b', '9').                               | `char lettre = 'A';`                     |
| `boolean`      | Primitif          | Valeur booléenne : `true` ou `false`.                                | `boolean estVrai = true;`                |
| `String`       | Objet (référence) | Chaîne de caractères (ex : "Bonjour").                               | `String nom = "Alice";`                  |
| `Array`        | Objet (référence) | Tableau de valeurs (ex : `int[]`, `String[]`).                       | `int[] notes = {12, 15, 18};`            |
| `Object`       | Objet (référence) | Superclasse de tous les objets Java.                                 | `Object x = new Object();`               |

## Affichage 

# 📤 Affichage dans la console en Java

| Méthode                          | Description                                      | Exemple                                         | Résultat dans la console           |
|----------------------------------|--------------------------------------------------|-------------------------------------------------|------------------------------------|
| `System.out.println()`           | Affiche un texte avec saut de ligne              | `System.out.println("Bonjour");`                | Bonjour *(puis retour à la ligne)* |
| `System.out.print()`             | Affiche un texte sans retour à la ligne          | `System.out.print("Salut");`                    | Salut *(reste sur la même ligne)*  |
| `System.out.printf()`            | Affichage formaté (comme en C)                   | `System.out.printf("Âge : %d ans", 25);`        | Âge : 25 ans                       |
| `System.out.println(var);`       | Affiche la valeur d'une variable                 | `int a = 5; System.out.println(a);`             | 5                                  |
| `System.out.printf("%.2f", 3.14159);`| Affiche un nombre à virgule avec 2 décimales | `System.out.printf("%.2f", 3.14159);`           | 3.14                               |
| `System.out.println();`          | Affiche uniquement un saut de ligne              | `System.out.println();`                         | *(Ligne vide)*                     |

## 🔍 Opérateurs de comparaison

| Opérateur | Signification                  | Exemple             | Résultat (si x = 5, y = 10) |
|-----------|--------------------------------|---------------------|-----------------------------|
| `==`      | Égal à                         | `x == y`            | `false`                     |
| `!=`      | Différent de                   | `x != y`            | `true`                      |
| `>`       | Supérieur à                    | `y > x`             | `true`                      |
| `<`       | Inférieur à                    | `x < y`             | `true`                      |
| `>=`      | Supérieur ou égal à            | `x >= 5`            | `true`                      |
| `<=`      | Inférieur ou égal à            | `y <= 5`            | `false`                     |

---

## 🧠 Opérateurs logiques 

| Opérateur | Nom         | Signification                        | Exemple                          | Résultat                         |
|-----------|-------------|--------------------------------------|----------------------------------|----------------------------------|
| `&&`      | ET logique  | Vrai si les 2 conditions sont vraies | `x > 0 && y > 0`                 | `true` si x=5, y=10              |
| `||`      | OU logique  | Vrai si **au moins une** est vraie   | `x < 0 || y > 0`                 | `true`                           |
| `!`       | NON logique | Inverse une condition                | `!(x == 5)`                      | `false`                          |

## 🔀 Les conditions en Java : if, else et else if

### Exemple d'un if / else
```java 
nt i = 10; // Déclare i

if (i == 9) { // Si i est strictement égal à 9
    System.out.println(i + " est égal à 9");
} else { // Sinon, i n'est pas égal à 9
    System.out.println(i + " n'est pas égal à 9"); 
}
```

### exemple d'un if / else if / else

```java 
int i = 50; // Déclare i 

if (i <= 20) { // Si i est inférieur ou égal à 20
    System.out.println(i + " est entre 0 et 20");
} else if (i <= 40) { // Si i est entre 21 et 40 inclus
    System.out.println(i + " est entre 21 et 40");
} else { // Sinon, i est supérieur à 40
    System.out.println(i + " est supérieur à 40");
}
```

## 🔂 Répéter du code avec la boucle `for` en Java

### 🔁 Les 3 parties d'une boucle `for` en Java

| Partie           | Nom              | Rôle                                                        | Exemple         |
|------------------|------------------|-------------------------------------------------------------|-----------------|
| `int i = 0`      | Initialisation   | Déclare et initialise la variable de boucle                 | `int i = 0`     |
| `i <= 10`        | Condition        | Définit si la boucle doit continuer (tant que c'est vrai)   | `i <= 10`       |
| `i++`            | Mise à jour      | Modifie la variable à chaque tour (le **pas** de la boucle) | `i++`           |

### exemple de boucle for 
```java 
for (int i = 0; i <= 20; i++) { // Compte de 0 jusqu'à 20 inclus

    System.out.println("Le chiffre est : " + i);

}
```

## 🔁 Les boucles `while` en Java

```java
 int i = 50;

      while(i >= 1 ) {  // Tant que i est supérieur ou égal à 1

         System.out.println("Le chiffre est : " + i );

         i--; // Décrémente i de 1 à chaque tour
      }
```

## 🔁 La boucle `do...while` en Java

```java 
int i = 0;

do {
    // La boucle s'exécute au moins une fois
    System.out.println(i); // Affiche la valeur actuelle de i
    i++; // Incrémente i de 1
} while (i <= 10); // Répète tant que i est inférieur ou égal à 10
```
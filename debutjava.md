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
| `System.out.printf("%.2f", 3.14159);` | Affiche un nombre à virgule avec 2 décimales| `System.out.printf("%.2f", 3.14159);`           | 3.14                               |
| `System.out.println();`          | Affiche uniquement un saut de ligne              | `System.out.println();`                         | *(Ligne vide)*                     |



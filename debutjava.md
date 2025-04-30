# Debut Java 

## 🧾 Types de données en Java

| Type           | Catégorie         | Description courte                                                   |
|----------------|-------------------|-------------------------------------------------------------------   |
| `byte`         | Primitif          | Entier sur 8 bits (-128 à 127), utile pour économiser de la mémoire. |
| `short`        | Primitif          | Entier sur 16 bits, plus grand que `byte`.                           |
| `int`          | Primitif          | Entier sur 32 bits, type entier par défaut.                          |
| `long`         | Primitif          | Entier sur 64 bits, utile pour les grands nombres.                   |
| `float`        | Primitif          | Nombre à virgule sur 32 bits (précision simple).                     |
| `double`       | Primitif          | Nombre à virgule sur 64 bits (précision double).                     |
| `char`         | Primitif          | Caractère Unicode (ex: 'A', 'b', '9').                               |
| `boolean`      | Primitif          | Valeur booléenne : `true` ou `false`.                                |
| `String`       | Objet (référence) | Chaîne de caractères (ex : "Bonjour").                               |
| `Array`        | Objet (référence) | Tableau de valeurs (ex : `int[]`, `String[]`).                       |
| `Object`       | Objet (référence) | Superclasse de tous les objets Java.                                 |


## Affichage 

# 📤 Affichage dans la console en Java

| Méthode                    | Description                                    | Exemple                                   | Résultat dans la console                  |
|----------------------------|------------------------------------------------|-------------------------------------------|-------------------------------------------|
| `System.out.println()`     | Affiche un texte + saut de ligne automatique   | `System.out.println("Bonjour");`          | Bonjour *(puis ligne suivante)*           |
| `System.out.print()`       | Affiche un texte sans saut de ligne            | `System.out.print("Salut");`              | Salut *(reste sur la même ligne)*         |
| `System.out.printf()`      | Affiche un texte formaté (comme en C)          | `System.out.printf("Âge : %d ans", 25);`  | Âge : 25 ans                              |
| `System.out.println(var)`  | Affiche la valeur d'une variable               | `int a = 5; System.out.println(a);`       | 5                                         |
| `System.out.printf("%.2f", 3.14159);` | Formatage de nombres décimaux (2 chiffres après virgule) |                                           | 3.14                                      |
| `System.out.println();`    | Affiche juste un saut de ligne                | `System.out.println();`                   | *(Ligne vide)*                            |

> ℹ️ `System.out` correspond au **flux de sortie standard** (la console).

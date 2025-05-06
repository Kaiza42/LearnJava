# 🧠 Sommaire

- [🧾 Types de données en Java avec exemples](#-types-de-données-en-java-avec-exemples)
- [📤 Affichage dans la console en Java](#-affichage-dans-la-console-en-java)
- [🔍 Opérateurs de comparaison](#-opérateurs-de-comparaison)
- [🧠 Opérateurs logiques](#-opérateurs-logiques)
- [🔀 Les conditions en Java : if, else et else if](#-les-conditions-en-java--if-else-et-else-if)
- [🔂 Répéter du code avec la boucle for en Java](#-répéter-du-code-avec-la-boucle-for-en-java)
- [🔁 Les boucles while en Java](#-les-boucles-while-en-java)
- [🔁 La boucle do...while en Java](#-la-boucle-dowhile-en-java)
- [🔀 Le switch en Java](#-le-switch-en-java)
- [📋Opérations courantes sur les collections Java](#opérations-courantes-sur-les-collections-java)


## 🧾 Types de données en Java avec exemples

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

### 📘 C'est quoi un type primitif en Java ?

En Java, un **type primitif** est un type de données de base fourni par le langage. Contrairement aux objets, les types primitifs **ne sont pas des instances de classe**. Ils sont utilisés pour représenter des valeurs simples et sont stockés directement en mémoire.

---


## 📤 Affichage dans la console en Java

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

do...while est une boucle qui exécute son bloc de code au moins une fois, puis répète l'exécution tant qu'une condition est vraie.

```java 
int i = 0;

do {
    // La boucle s'exécute au moins une fois
    System.out.println(i); // Affiche la valeur actuelle de i
    i++; // Incrémente i de 1
} while (i <= 10); // Répète tant que i est inférieur ou égal à 10
```

## 🔀 Le `switch` en Java 

```java
char jour = 'C';

    switch(jour){
        case 'A': 
        System.out.println("Lundi");
        break;
        case 'B': 
        System.out.println("Mardi");
        break;
        case 'C': 
        System.out.println("Mercredi");
        break;
        case 'D':
        System.out.println("Jeudi");
        break;
        case 'E':
        System.out.println("Vendredi");
        break;
        case 'F': 
        System.out.println("Samedi");
        break;
        case 'G':
        System.out.println ("Dimanche");
        break;
        default:
        System.out.println("On n'est quel jour ?");
    }
```
### version plus récente du switch en java 

```java 
    char jour = 'C';

    switch(jour){
        case 'A' -> System.out.println("Lundi");
        
        case 'B' -> System.out.println("Mardi");
        
        case 'C' -> System.out.println("Mercredi");

        case 'D' -> System.out.println("Jeudi");
        
        case 'E' -> System.out.println("Vendredi");
        
        case 'F' -> System.out.println("Samedi");
        
        case 'G' -> System.out.println ("Dimanche");
        
        default -> System.out.println("On n'est quel jour ?");
    }
```

## 📋 Opérations courantes sur les collections Java

---

### 🔹 `ArrayList` & `LinkedList`

Les **listes** permettent de stocker des éléments en **ordre**, avec possibilité de **doublons**. Elles sont idéales pour les cas où l'ordre d'insertion est important.

- **`ArrayList`** : basée sur un tableau dynamique. Excellente pour les accès rapides par index (`get()`), mais les insertions/suppressions au milieu sont plus coûteuses.
- **`LinkedList`** : basée sur une liste chaînée. Plus performante pour les insertions/suppressions fréquentes, notamment au début ou à la fin, mais plus lente pour l'accès direct par index.

| Action                    | Méthode Java                          | Exemple                                      |
|---------------------------|---------------------------------------|----------------------------------------------|
| Créer une liste           | `new ArrayList<>()` ou `new LinkedList<>()` | `List<String> list = new ArrayList<>();`     |
| Ajouter un élément        | `add(element)`                        | `list.add("Texte");`                         |
| Ajouter à une position    | `add(index, element)`                 | `list.add(1, "Texte");`                      |
| Modifier un élément       | `set(index, newValue)`                | `list.set(0, "Modifié");`                    |
| Supprimer par index       | `remove(index)`                       | `list.remove(0);`                            |
| Supprimer par valeur      | `remove(object)`                      | `list.remove("Texte");`                      |
| Lire un élément           | `get(index)`                          | `String val = list.get(0);`                  |
| Taille de la liste        | `size()`                              | `int taille = list.size();`                  |
| Parcourir la liste        | `for-each`, `for`, ou `iterator()`    | `for (String s : list) {...}`                |

---

### 🔹 `HashSet` & `TreeSet`

Les **ensembles (`Set`)** ne permettent pas les doublons. Chaque élément est unique.

- **`HashSet`** : non ordonné, très rapide pour les opérations de recherche et d’insertion.
- **`TreeSet`** : trie automatiquement les éléments (ordre naturel ou avec comparateur), plus lent mais utile pour les structures triées.

| Action                    | Méthode Java                          | Exemple                                      |
|---------------------------|---------------------------------------|----------------------------------------------|
| Créer un ensemble         | `new HashSet<>()` ou `new TreeSet<>()`| `Set<String> set = new HashSet<>();`         |
| Ajouter un élément        | `add(element)`                        | `set.add("Texte");`                          |
| Supprimer un élément      | `remove(object)`                      | `set.remove("Texte");`                       |
| Vérifier la présence      | `contains(object)`                    | `set.contains("Texte");`                     |
| Taille de l'ensemble      | `size()`                              | `int taille = set.size();`                   |
| Parcourir l'ensemble      | `for-each` ou `iterator()`            | `for (String s : set) {...}`                 |

---

### 🔹 `HashMap` & `TreeMap`

Les **maps** stockent des **paires clé → valeur**. Les clés sont uniques et associées à une valeur.

- **`HashMap`** : accès très rapide, mais ne garantit aucun ordre.
- **`TreeMap`** : trie les entrées selon l'ordre naturel des clés ou un comparateur.

| Action                    | Méthode Java                          | Exemple                                      |
|---------------------------|---------------------------------------|----------------------------------------------|
| Créer une map             | `new HashMap<>()` ou `new TreeMap<>()`| `Map<String, Integer> map = new HashMap<>();`|
| Ajouter ou remplacer      | `put(key, value)`                     | `map.put("A", 1);`                            |
| Obtenir une valeur        | `get(key)`                            | `int val = map.get("A");`                     |
| Supprimer une entrée      | `remove(key)`                         | `map.remove("A");`                            |
| Vérifier une clé          | `containsKey(key)`                    | `map.containsKey("A");`                       |
| Vérifier une valeur       | `containsValue(value)`                | `map.containsValue(1);`                       |
| Taille de la map          | `size()`                              | `int taille = map.size();`                    |
| Parcourir les entrées     | `entrySet()` ou `for-each`            | `for (Map.Entry<String, Integer> entry : map.entrySet()) {...}` |

---

### 🔹 `PriorityQueue` & `Queue`

Les **files (`Queue`)** permettent de traiter les éléments dans l’ordre d’insertion, selon le principe **FIFO** (*First In, First Out*).

- **`Queue`** : interface générale pour les files simples.
- **`PriorityQueue`** : trie automatiquement les éléments par priorité (ordre naturel ou comparateur).

| Action                      | Méthode Java                          | Exemple                                        |
|-----------------------------|---------------------------------------|------------------------------------------------|
| Créer une file              | `new PriorityQueue<>()`               | `Queue<Integer> queue = new PriorityQueue<>();`|
| Ajouter un élément          | `add(element)` ou `offer(element)`    | `queue.add(5);` ou `queue.offer(5);`           |
| Accéder au premier élément  | `peek()`                              | `int val = queue.peek();`                      |
| Retirer le premier élément  | `poll()` ou `remove()`                | `queue.poll();`                                |
| Taille de la file           | `size()`                              | `int taille = queue.size();`                   |
| Parcourir la file           | `for-each` ou `iterator()`            | `for (int i : queue) {...}`                    |

---

### 🔹 `Deque` (`ArrayDeque`)

Les **Deque** (Double-Ended Queue) permettent d’ajouter et retirer des éléments **des deux côtés**. Elles peuvent servir à la fois de **pile (LIFO)** et de **file (FIFO)**.

- **`ArrayDeque`** : plus performante que `LinkedList` pour une pile ou une file.

| Action                             | Méthode Java                          | Exemple                                          |
|------------------------------------|---------------------------------------|--------------------------------------------------|
| Créer une double file              | `new ArrayDeque<>()`                  | `Deque<String> deque = new ArrayDeque<>();`      |
| Ajouter à l’avant                  | `addFirst(element)` ou `offerFirst()` | `deque.addFirst("A");`                           |
| Ajouter à la fin                   | `addLast(element)` ou `offerLast()`   | `deque.addLast("B");`                            |
| Accéder au premier/dernier         | `peekFirst()` / `peekLast()`          | `String debut = deque.peekFirst();`              |
| Retirer le premier/dernier         | `pollFirst()` / `pollLast()`          | `deque.pollLast();`                              |
| Taille de la deque                 | `size()`                              | `int taille = deque.size();`                     |
| Parcourir                          | `for-each` ou `iterator()`            | `for (String s : deque) {...}`                   |

---











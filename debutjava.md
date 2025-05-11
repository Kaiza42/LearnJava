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
- [🔁 Boucle `for-each` en Java](#-boucle-for-each-en-java)


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

---

## 📋 Opérations courantes sur les collections Java

Java propose plusieurs interfaces de collections pour stocker, manipuler et parcourir des ensembles de valeurs. Voici les principales structures et leurs méthodes utiles, au format clair avec exemples commentés.

---

### 📑 Sommaire

- [🔹 `ArrayList` & `LinkedList`](#-arraylist--linkedlist)
  - [`add()`](#add)
  - [`get()`](#get)
  - [`set()`](#set)
  - [`remove()`](#remove)
  - [`size()`](#size)
  - [`contains()`](#contains)
- [🔹 `HashSet` & `TreeSet`](#-hashset--treeset)
  - [`add()`](#add-1)
  - [`remove()`](#remove-1)
  - [`contains()`](#contains-1)
- [🔹 `HashMap` & `TreeMap`](#-hashmap--treemap)
  - [`put()`](#put)
  - [`get()`](#get-1)
  - [`remove()`](#remove-2)
  - [`containsKey()` / `containsValue()`](#containskey--containsvalue)
  - [`keySet()` / `values()`](#keyset--values)
- [🔹 `PriorityQueue` & `Queue`](#-priorityqueue--queue)
  - [`add()` / `offer()`](#add--offer)
  - [`peek()`](#peek)
  - [`poll()` / `remove()`](#poll--remove)
  - [`size()`](#size-1)
- [🔹 `Deque` (`ArrayDeque`)](#-deque-arraydeque)
  - [`addFirst()` / `addLast()`](#addfirst--addlast)
  - [`peekFirst()` / `peekLast()`](#peekfirst--peeklast)
  - [`pollFirst()` / `pollLast()`](#pollfirst--polllast)

---

### 🔹 `ArrayList` & `LinkedList`

### `add(E element)`
> Ajoute un élément à la fin de la liste.
```java
List<String> liste = new ArrayList<>();
liste.add("Bonjour");
```

### `get(int index)`
> Récupère un élément par son index.
```java
String mot = liste.get(0); // "Bonjour"
```

### `set(int index, E element)`
> Remplace un élément à un index donné.
```java
liste.set(0, "Salut");
```

### `remove(int index)` / `remove(Object)`
> Supprime un élément soit par son index, soit par sa valeur.
```java
liste.remove(0);            // supprime l'élément à l'index 0
liste.remove("Salut");     // supprime l'élément "Salut"
```

### `size()`
> Renvoie la taille de la liste.
```java
int taille = liste.size(); // Nombre d'éléments
```

### `contains(Object)`
> Vérifie si un élément est présent.
```java
boolean present = liste.contains("Bonjour");
```

---

### 🔹 `HashSet` & `TreeSet`

### `add(E element)`
> Ajoute un élément unique dans l'ensemble.
```java
Set<String> set = new HashSet<>();
set.add("A");
```

### `remove(Object)`
> Supprime un élément de l'ensemble.
```java
set.remove("A");
```

### `contains(Object)`
> Vérifie la présence d'un élément.
```java
boolean existe = set.contains("A");
```

---

### 🔹 `HashMap` & `TreeMap`

### `put(K key, V value)`
> Ajoute ou met à jour une paire clé-valeur.
```java
Map<String, Integer> map = new HashMap<>();
map.put("Alice", 30);
```

### `get(Object key)`
> Récupère la valeur associée à une clé.
```java
int age = map.get("Alice");
```

### `remove(Object key)`
> Supprime une entrée par sa clé.
```java
map.remove("Alice");
```

### `containsKey()` / `containsValue()`
> Vérifie la présence d'une clé ou d'une valeur.
```java
map.containsKey("Alice");
map.containsValue(30);
```

### `keySet()` / `values()`
> Récupère les clés ou les valeurs du dictionnaire.
```java
Set<String> cles = map.keySet();
Collection<Integer> valeurs = map.values();
```

---

### 🔹 `PriorityQueue` & `Queue`

### `add(E)` / `offer(E)`
> Ajoute un élément à la file.
```java
Queue<Integer> queue = new PriorityQueue<>();
queue.add(10);
queue.offer(5);
```

### `peek()`
> Récupère le premier élément sans le supprimer.
```java
int premier = queue.peek();
```

### `poll()` / `remove()`
> Récupère et supprime le premier élément.
```java
int retiré = queue.poll();
```

### `size()`
> Donne la taille de la file.
```java
int taille = queue.size();
```

---

### 🔹 `Deque` (`ArrayDeque`)

### `addFirst()` / `addLast()`
> Ajoute un élément au début ou à la fin de la deque.
```java
Deque<String> deque = new ArrayDeque<>();
deque.addFirst("A");
deque.addLast("B");
```

### `peekFirst()` / `peekLast()`
> Consulte le premier ou le dernier élément sans le supprimer.
```java
String debut = deque.peekFirst();
String fin = deque.peekLast();
```

### `pollFirst()` / `pollLast()`
> Supprime et retourne le premier ou dernier élément.
```java
deque.pollFirst();
deque.pollLast();
```


### 🔁 Boucle `for-each` en Java

La boucle `for-each` est une façon simple et claire de parcourir des tableaux ou des collections.  
Elle est souvent utilisée avec des `List`, `Set`, ou des tableaux (`Array`, etc.).

- [🔹 Syntaxe générale](#-syntaxe-générale)
- [🔹 Exemple avec un tableau de chaînes](#-exemple-avec-un-tableau-de-chaînes)
- [🔹 Exemple avec une `ArrayList<String>`](#-exemple-avec-une-arrayliststring)
- [🔹 Exemple avec des objets (`Voiture`)](#-exemple-avec-des-objets-classe-voiture)

---

#### 🔹 Syntaxe générale

```java
for (Type element : collection) {
    // Code à exécuter pour chaque élément
}
```

---

#### 🔹 Exemple avec un tableau de chaînes

```java
String[] fruits = {"Pomme", "Banane", "Orange"};

for (String fruit : fruits) {
    System.out.println(fruit);
}
```

---

#### 🔹 Exemple avec une `ArrayList<String>`

```java
List<String> villes = new ArrayList<>();
villes.add("Paris");
villes.add("Lyon");
villes.add("Marseille");

for (String ville : villes) {
    System.out.println("Ville : " + ville);
}
```

---

#### 🔹 Exemple avec des objets (classe `Voiture`)

```java
List<Voiture> garage = new ArrayList<>();
garage.add(new Voiture("Toyota", 120));
garage.add(new Voiture("Peugeot", 110));

for (Voiture v : garage) {
    System.out.println(v.getMarque() + " roule à " + v.getVitesse() + " km/h");
}
```

💡 Le `for-each` évite d’utiliser les index (`i`) et rend le code plus lisible lorsqu’on n’a pas besoin de la position.

---
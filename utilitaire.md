# 📘 Fichier Utilitaire Java

Bienvenue dans ce fichier utilitaire Java, un pense-bête personnel regroupant les **"petits mots"** les plus courants, utiles ou parfois oubliés du langage Java.  
Ici sont listés des **méthodes**, **classes standard**, **mots-clés** ou **fonctions utilitaires** que l’on retrouve souvent dans les programmes Java, avec une courte description et un exemple pratique.

🎯 **Objectif** : Retrouver rapidement les syntaxes, les usages et les astuces pour coder plus vite, mieux, et sans chercher partout.

> Ce fichier n'est pas une documentation exhaustive, mais une sélection personnelle, évolutive, et orientée vers la pratique.

---

## 🔤 Manipulation de chaînes (`String`)

Voici les méthodes les plus utilisées sur les chaînes de caractères en Java, avec une brève explication et un exemple simple.

---

## 🧠 Sommaire
- [🔤 Manipulation de chaînes (`String`)](#-manipulation-de-chaînes-string)
- [🧮 Mathématique en Java](#-mathématique-en-java)
- [📅 Dates & Temps en Java](#-dates--temps-en-java)
- [🧱 Manipulation avec `StringBuilder`](#-manipulation-avec-stringbuilder)


---

### 🔤 Manipulation de chaînes 
- [`toLowerCase()`](#tolowercase)
- [`toUpperCase()`](#touppercase)
- [`substring()`](#substringint-début-int-fin)
- [`trim()`](#trim)
- [`replace()`](#replace)
- [`contains()`](#contains)
- [`startsWith()` / `endsWith()`](#startswith--endswith)
- [`charAt()`](#charat)
- [`split()`](#split)
- [`length()`](#length)
- [`indexOf()`](#indexofstring-str)
- [`lastIndexOf()`](#lastindexofstring-str)
- [`repeat()`](#repeatint-count)
- [`isEmpty()`](#isempty)
- [`isBlank()`](#isblank)
- [`compareTo()`](#comparetostring-autre)
- [`replaceAll()`](#replaceallstring-regex-string-replacement)
- [`strip()`](#strip)

---

### `toLowerCase()`
> Convertit tous les caractères de la chaîne en minuscules.

```java
String texte = "BONJOUR";
String minuscule = texte.toLowerCase(); // "bonjour"
```

### `toUpperCase()`
> Convertit tous les caractères de la chaîne en majuscules.

```java
String texte = "bonjour";
String majuscule = texte.toUpperCase(); // "BONJOUR"
```

### `substring(int début, int fin)`
> Extrait une sous-chaîne entre deux indices (début inclus, fin exclu).
```java 
String texte = "programmation";
String extrait = texte.substring(0, 5); // "progr"
```

### `trim()`
> Supprime les espaces au début et à la fin de la chaîne.

```java
String texte = "  coucou  ";
String propre = texte.trim(); // "coucou"
```

### `startsWith(String prefix) / endsWith(String suffix)`
> Vérifie si la chaîne commence ou se termine par une certaine séquence.

```java
String mot = "Hello";
boolean commencePar = mot.startsWith("He"); // true
boolean finitPar = mot.endsWith("lo");      // true
```

### `charAt(int index)`
> Récupère le caractère à une position donnée (0-based).

```java
String mot = "Java";
char lettre = mot.charAt(2); // 'v'
```

### `split(String regex)`
> Découpe la chaîne en plusieurs morceaux selon un séparateur.

```java 
String date = "01/05/2025";
String[] parties = date.split("/");
// parties[0] = "01", parties[1] = "05", parties[2] = "2025"
```

### `length()`
> Renvoie le nombre de caractères dans la chaîne.

```java 
String mot = "Programmation";
int taille = mot.length(); // 13
```

### `indexOf(String str)`
> Donne l’indice de la première occurrence d’une sous-chaîne (ou -1 si absente).

```java 
String texte = "bonjour";
int index = texte.indexOf("o"); // 1
```

### `lastIndexOf(String str)`
> Donne l’indice de la dernière occurrence.

```java 
String texte = "banane";
int index = texte.lastIndexOf("a"); // 3
```

### `repeat(int count)`
> Répète la chaîne un certain nombre de fois.

```java 
String ligne = "-".repeat(10); // "----------"
```

### `isEmpty()`
> Vérifie si la chaîne est vide ("", mais pas null).

```java 
String s = "";
boolean vide = s.isEmpty(); // true
```

### `isBlank()`
> Compare deux chaînes selon l’ordre alphabétique.

```java 
"abc".compareTo("abd"); // renvoie un nombre négatif
```

### `replaceAll(String regex, String replacement)`
> Remplace toutes les correspondances d’une expression régulière.

```java
String s = "123-456-789";
String propre = s.replaceAll("-", ""); // "123456789"
```

### `strip()`
> Comme trim(), mais gère mieux les caractères Unicode.

```java 
String s = "  Hello  ";
s.strip(); // "Hello"
```
## 🧮 Mathématique en Java

Voici une compilation des "petits mots" liés aux mathématiques en Java, incluant la classe `Math` ainsi que d'autres méthodes utiles provenant de classes comme `Integer`, `Double`, `Character`, etc.

- [📏 Opérations de base (`Math`)](#-opérations-de-base-math)
    - [`Math.abs()`](#mathabsint)
    - [`Math.sqrt()`](#mathsqrtdouble)
    - [`Math.pow()`](#mathpowdouble-a-double-b)
    - [`Math.round()`](#mathrounddouble)
    - [`Math.floor()`](#mathfloordouble)
    - [`Math.ceil()`](#mathceildouble)
    - [`Math.max()` / `Math.min()`](#mathmax-a-b--mathmin-a-b)
    - [`Math.random()`](#mathrandom)
    - [`Math.PI` / `Math.E`](#mathpi--mathe)
- [🔢 Conversions numériques (`Integer`, `Double`, etc.)](#-conversions-numériques-integer-double-etc)
    - [`Integer.MIN_VALUE` / `MAX_VALUE`](#integermin_value--max_value)
    - [`Integer.parseInt()`](#integerparseintstring)
    - [`Double.parseDouble()`](#doubleparsedoublestring)
    - [`String.valueOf()`](#stringvalueofint)
    - [`new BigDecimal()`](#new-bigdecimalstring)
- [🔠 Analyse de caractères numériques (`Character`)](#-analyse-de-caractères-numériques-character)
    - [`Character.isDigit()`](#characterisdigitchar)
    - [`Character.isLetter()`](#characterisletterchar)
    - [`Character.getNumericValue()`](#charactergetnumericvaluechar)
- [⚙️ Manipulations binaires (`Integer`)](#-manipulations-binaires-integer)
    - [`Integer.toBinaryString()`](#integertobinarystringint)
    - [`Integer.toHexString()`](#integertohexstringint)
    - [`Integer.bitCount()`](#integerbitcountint)


## 📏 Opérations de base (`Math`)

### `Math.abs(int)`
> Retourne la valeur absolue du nombre.

```java
int valeur = Math.abs(-10); // 10
```
### `Math.sqrt(double)`
> Calcule la racine carrée d’un nombre.

```java
double racine = Math.sqrt(16); // 4.0
```

### `Math.pow(double a, double b)`
> Éléve a à la puissance b.

```java
double puissance = Math.pow(2, 3); // 8.0
```

### `Math.round(double)`
> Arrondit à l’entier le plus proche.

```java
long arrondi = Math.round(3.6); // 4
```

### `Math.floor(double)`
> Arrondit vers le bas (plancher).

```java
double bas = Math.floor(5.9); // 5.0
```

### `Math.ceil(double)`
> Arrondit vers le haut.

```java
double haut = Math.ceil(4.1); // 5.0
```

### `Math.max(a, b) / Math.min(a, b)`
> Renvoie la valeur maximale ou minimale entre deux nombres.

```java
int max = Math.max(12, 7); // 12
int min = Math.min(12, 7); // 7
```

### `Math.random()`
> Génère un nombre aléatoire entre 0.0 (inclus) et 1.0 (exclus).

```java
double alea = Math.random(); // Exemple : 0.742
```

### `Math.PI / Math.E`
> Constantes mathématiques utiles (π et e).

```java
double cercle = Math.PI * 2 * 3; // Utilise π
double exponentielle = Math.E; // Constante e
```

## 🔢 Conversions numériques (Integer, Double, etc.)

### `Integer.MIN_VALUE` / `Integer.MAX_VALUE`
> Constantes représentant les bornes minimales et maximales que peut prendre un entier (`int`) en Java.

```java
int min = Integer.MIN_VALUE; // -2147483648
int max = Integer.MAX_VALUE; // 2147483647
```

### `Integer.parseInt(String)`
> Convertit une chaîne en entier.

```java 
int entier = Integer.parseInt("42"); // 42
```

### `Double.parseDouble(String)`
> Convertit une chaîne en nombre à virgule.

```java 
double decimal = Double.parseDouble("3.14"); // 3.14
```

### `String.valueOf(int)`
> Convertit un entier en chaîne.

```java 
String texte = String.valueOf(123); // "123"
```

### `new BigDecimal(String)`
> Crée un nombre décimal très précis (utilisé en finance).

```java
BigDecimal prix = new BigDecimal("19.99"); // Représente précisément 19.99
```

## 🔠 Analyse de caractères numériques (Character)

### `Character.isDigit(char)`
> Vérifie si un caractère est un chiffre.

```java
boolean estChiffre = Character.isDigit('5'); // true
```

### `Character.isLetter(char)`
> Vérifie si un caractère est une lettre.

```java
boolean estLettre = Character.isLetter('A'); // true
```

### `Character.getNumericValue(char)`
> Convertit un caractère numérique en valeur entière.

```java 
int valeur = Character.getNumericValue('7'); // 7
```

## ⚙️ Manipulations binaires 

### `Integer.toBinaryString(int)`
> Convertit un entier en chaîne binaire.

```java 
String binaire = Integer.toBinaryString(10); // "1010"
```

### `Integer.toHexString(int)`
> Convertit un entier en chaîne hexadécimale.

```java
String hexa = Integer.toHexString(255); // "ff"
```

### `Integer.bitCount(int)`
> Compte le nombre de bits à 1 dans la représentation binaire d’un entier.

```java
int bits = Integer.bitCount(7); // 3 (car 7 = 111 en binaire)
```

## 📅 Dates & Temps en Java

Java propose plusieurs classes pour manipuler les dates, les heures et les durées.  
Depuis Java 8, les classes de `java.time` comme `LocalDate`, `LocalDateTime`, `Duration` ou `ChronoUnit` sont recommandées.

- [`LocalDate.now()`](#localdatenow)
- [`LocalDate.of(int, int, int)`](#localdateofint-int-int)
- [`LocalDate.parse(String)`](#localdateparsestring)
- [`plusDays()` / `minusDays()`](#plusdays--minusdays)
- [`getDayOfWeek()`](#getdayofweek)
- [`isBefore()` / `isAfter()`](#isbefore--isafter)
- [`Period.between()`](#periodbetween)
- [`System.currentTimeMillis()`](#systemcurrenttimemillis)

---

### `LocalDate.now()`
> Renvoie la date actuelle selon le système.

```java
LocalDate dateAujourdhui = LocalDate.now(); // ex : 2025-05-09
```

### `LocalDate.of(int, int, int)`
> Crée une date spécifique (année, mois, jour).

```java
LocalDate date = LocalDate.of(2025, 12, 25); // 2025-12-25
```

### `LocalDate.parse(String)`
> Transforme une chaîne ISO (ex : "2025-01-01") en objet LocalDate.

```java
LocalDate date = LocalDate.parse("2025-01-01");
```

### `plusDays() / minusDays()`
> Ajoute ou enlève des jours à une date.

```java
LocalDate date = LocalDate.now().plusDays(5);    // dans 5 jours
LocalDate avant = LocalDate.now().minusDays(3);  // il y a 3 jours
```

### `getDayOfWeek()`
> Récupère le jour de la semaine sous forme d’énumération (MONDAY, etc.).

```java
DayOfWeek jour = LocalDate.now().getDayOfWeek(); // ex : WEDNESDAY
```

### `isBefore() / isAfter()`
> Compare deux dates.

```java
LocalDate a = LocalDate.of(2025, 1, 1);
LocalDate b = LocalDate.now();

boolean passé = a.isBefore(b);
boolean futur = a.isAfter(b);
```

### `Period.between()`
> Calcule la durée entre deux dates (en années, mois, jours).

```java
LocalDate debut = LocalDate.of(2020, 1, 1);
LocalDate fin = LocalDate.of(2025, 5, 9);
Period periode = Period.between(debut, fin);
// periode.getYears() = 5, getMonths() = 4, getDays() = 8
```


### `System.currentTimeMillis()`
> Renvoie le nombre de millisecondes depuis le 1er janvier 1970 (UTC).

```java 
long timestamp = System.currentTimeMillis(); // ex : 1746792058635
```

## 📘 Manipulation avec `StringBuilder`


- [`append()`](#append)
- [`insert()`](#insert)
- [`delete()`](#delete)
- [`deleteCharAt()`](#deletecharat)
- [`replace()`](#replace)
- [`reverse()`](#reverse)
- [`toString()`](#tostring)
- [`setCharAt()`](#setcharat)
- [`charAt()`](#charat)
- [`length()`](#length)
- [`capacity()`](#capacity)
- [`ensureCapacity()`](#ensurecapacity)
- [`trimToSize()`](#trimtosize)
- [`setLength()`](#setlength)
- [`substring()`](#substring)

---

### `append()`
> Ajoute du contenu à la fin du `StringBuilder`.

```java
StringBuilder sb = new StringBuilder("Bonjour");
sb.append(" tout le monde"); // "Bonjour tout le monde"
```

---

### `insert()`
> Insère une chaîne à une position donnée.

```java
StringBuilder sb = new StringBuilder("Hello !");
sb.insert(5, " world"); // "Hello world !"
```

---

### `delete()`
> Supprime une portion de texte entre deux indices (début inclus, fin exclu).

```java
StringBuilder sb = new StringBuilder("Programmation");
sb.delete(6, 11); // "Prograion"
```

---

### `deleteCharAt()`
> Supprime le caractère à l’indice spécifié.

```java
StringBuilder sb = new StringBuilder("Bonjour");
sb.deleteCharAt(3); // "Bonour"
```

---

### `replace()`
> Remplace une portion de texte entre deux indices par une autre chaîne.

```java
StringBuilder sb = new StringBuilder("Salut tout le monde");
sb.replace(6, 10, "à"); // "Salut à le monde"
```

---

### `reverse()`
> Inverse les caractères du `StringBuilder`.

```java
StringBuilder sb = new StringBuilder("Java");
sb.reverse(); // "avaJ"
```

---

### `toString()`
> Convertit le contenu du `StringBuilder` en un objet `String`.

```java
StringBuilder sb = new StringBuilder("Test");
String resultat = sb.toString(); // "Test"
```

---

### `setCharAt()`
> Modifie le caractère à une position donnée.

```java
StringBuilder sb = new StringBuilder("pomme");
sb.setCharAt(0, 't'); // "tomme"
```

---

### `charAt()`
> Retourne le caractère à une position donnée.

```java
StringBuilder sb = new StringBuilder("Test");
char c = sb.charAt(2); // 's'
```

---

### `length()`
> Retourne la longueur actuelle de la chaîne.

```java
StringBuilder sb = new StringBuilder("Bonjour");
int longueur = sb.length(); // 7
```

---

### `capacity()`
> Retourne la capacité actuelle (nombre de caractères que le buffer peut contenir sans redimensionnement).

```java
StringBuilder sb = new StringBuilder();
int capacite = sb.capacity(); // 16 par défaut
```

---

### `ensureCapacity()`
> Augmente la capacité minimale si nécessaire.

```java
StringBuilder sb = new StringBuilder();
sb.ensureCapacity(50); // Capacité augmentée si < 50
```

---

### `trimToSize()`
> Réduit la capacité au strict minimum nécessaire.

```java
StringBuilder sb = new StringBuilder("Texte");
sb.trimToSize();
```

---

### `setLength()`
> Modifie la longueur de la chaîne. Tronque si plus courte ou remplit avec \u0000 si plus longue.

```java
StringBuilder sb = new StringBuilder("Salut");
sb.setLength(3); // "Sal"
```

---

### `substring()`
> Retourne une sous-chaîne à partir du contenu du `StringBuilder`, sous forme de `String`.

```java
StringBuilder sb = new StringBuilder("Programmation");
String sousChaine = sb.substring(0, 7); // "Program"
```

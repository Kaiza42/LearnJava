# 📘 Fichier Utilitaire Java

Bienvenue dans ce fichier utilitaire Java, un pense-bête personnel regroupant les **"petits mots"** les plus courants, utiles ou parfois oubliés du langage Java.  
Ici sont listés des **méthodes**, **classes standard**, **mots-clés** ou **fonctions utilitaires** que l’on retrouve souvent dans les programmes Java, avec une courte description et un exemple pratique.

🎯 **Objectif** : Retrouver rapidement les syntaxes, les usages et les astuces pour coder plus vite, mieux, et sans chercher partout.

> Ce fichier n'est pas une documentation exhaustive, mais une sélection personnelle, évolutive, et orientée vers la pratique.

---

## 🔤 Manipulation de chaînes (`String`)

Voici les méthodes les plus utilisées sur les chaînes de caractères en Java, avec une brève explication et un exemple simple.

---

### 📑 Sommaire

- [`toLowerCase()`](#tolowercase)
- [`toUpperCase()`](#touppercase)
- [`substring(int début, int fin)`](#substringint-début-int-fin)
- [`trim()`](#trim)
- [`replace()`](#replace)
- [`contains()`](#contains)
- [`startsWith()` / `endsWith()`](#startswith--endswith)
- [`charAt()`](#charat)
- [`split()`](#split)
- [`length()`](#length)

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
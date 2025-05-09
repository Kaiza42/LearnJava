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

### 🔤 Manipulation de chaînes (`String`)
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



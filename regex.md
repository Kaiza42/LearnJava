
# 🔡 Expressions régulières (Regex) en Java

## 🧠 Sommaire

- [🔍 Qu'est-ce qu'une regex ?](#-quest-ce-quune-regex-)
- [📦 Classes principales utilisées](#-classes-principales-utilisées)
- [⚙️ Méthodes utiles](#-méthodes-utiles)
- [✅ Exemple : valider un email](#-exemple--valider-un-email)
- [🔍 Exemple : extraire tous les nombres](#-exemple--extraire-tous-les-nombres)
- [🔄 Exemple : remplacer un mot](#-exemple--remplacer-un-mot)
- [✂️ Exemple : découper une chaîne](#-exemple--découper-une-chaîne)
- [🎛️ Flags (options avancées)](#-flags-options-avancées)

---

## 🧩 Composants d'une expression régulière (syntaxe de base)

Voici les éléments les plus courants utilisés dans les regex Java :

### 🎯 Métacaractères de base

| Symbole | Signification | Exemple                        | Description                                              |
|---------|----------------|--------------------------------|----------------------------------------------------------|
| `.`     | N'importe quel caractère | `a.b`                   | Correspond à "a+b", "a-b", etc.                          |
| `\d`   | Chiffre (0-9)  | `\d\d`                        | Deux chiffres, comme "42"                                |
| `\D`   | Non chiffre     | `\D+`                          | Un ou plusieurs caractères qui ne sont pas des chiffres  |
| `\w`   | Lettre ou chiffre ou `_` | `\w+`              | Mot composé de caractères alphanumériques               |
| `\W`   | Caractère non alphanumérique | `\W+`            | Symbole ou espace                                        |
| `\s`   | Espace blanc (espace, tab...) | `\s+`           | Un ou plusieurs espaces                                  |
| `\S`   | Tout sauf espace | `\S+`                        | Un ou plusieurs caractères sans espace                   |

---

## 🚫 Limitations et précautions

- Les regex Java **doivent être échappées deux fois** (`\d` pour un chiffre).
- Trop de groupes ou une mauvaise structure peut nuire à la lisibilité.
- Pour de très grands textes, certaines regex peuvent être **lentes** (utiliser des méthodes optimisées ou précompilées).
- Attention aux **greedy matches** (`.*`) qui capturent "trop" de texte : utilisez `.*?` pour un match non-gourmand.

---

## 🔍 Qu'est-ce qu'une regex ?

Une **expression régulière** est un motif utilisé pour rechercher, valider ou transformer du texte. Très utile en Java pour :

- Valider des formats (emails, numéros…)
- Extraire des sous-chaînes spécifiques
- Remplacer du texte selon un modèle
- Découper une chaîne selon un séparateur complexe

---

### 🔁 Quantificateurs

| Symbole | Signification | Exemple      | Description                            |
|---------|---------------|--------------|----------------------------------------|
| `*`     | 0 ou plus     | `a*`         | "", "a", "aa", ...                     |
| `+`     | 1 ou plus     | `a+`         | "a", "aa", ...                         |
| `?`     | 0 ou 1        | `a?`         | "", "a"                                |
| `{n}`   | Exactement n  | `\d{4}`     | Quatre chiffres                       |
| `{n,}`  | Au moins n    | `\d{2,}`    | Deux chiffres ou plus                 |
| `{n,m}` | Entre n et m  | `\d{2,4}`   | Deux à quatre chiffres                |

---

### 🧭 Délimiteurs et groupes

| Symbole | Signification       | Exemple       | Description                                   |
|---------|---------------------|---------------|-----------------------------------------------|
| `[]`    | Classe de caractères | `[aeiou]`     | Une voyelle                                   |
| `[^]`   | Exclusion            | `[^a-z]`      | Tout sauf une minuscule                       |
| `()`    | Groupe capturant     | `(abc)`       | Groupe de caractères                          |
| `|`     | OU logique           | `chat|chien`  | Correspond à "chat" ou "chien"                |
| `^`     | Début de chaîne      | `^Bonjour`    | Commence par "Bonjour"                        |
| `$`     | Fin de chaîne        | `fin$`        | Se termine par "fin"                          |

---

## 📦 Classes principales utilisées

### `Pattern`
Représente un motif regex compilé.

```java
Pattern pattern = Pattern.compile("\\d+");
```

### `Matcher`
Permet de comparer une chaîne avec un motif.

```java
Matcher matcher = pattern.matcher("Il y a 42 pommes");
```

---

## ⚙️ Méthodes utiles

### `Pattern.compile(String regex)`
Compile la regex et retourne un objet `Pattern`.

### `matcher(CharSequence input)`
Applique la regex sur une chaîne.

### `matches()`
Vérifie si **toute** la chaîne correspond au motif.

```java
boolean match = pattern.matcher("abc123").matches();
```

### `find()`
Recherche une **partie** de la chaîne qui correspond.

```java
while (matcher.find()) {
    System.out.println(matcher.group());
}
```

### `replaceAll(String remplacement)`
Remplace **toutes** les correspondances.

```java
String resultat = matcher.replaceAll("XYZ");
```

### `replaceFirst(String remplacement)`
Remplace seulement la **première** correspondance.

---

## ✅ Exemple : valider un email

```java
import java.util.regex.*;

public class EmailValide {
    public static void main(String[] args) {
        String email = "exemple@test.com";
        String regex = "^[\\w.-]+@[\\w.-]+\\.\\w{2,}$";

        boolean estValide = Pattern.matches(regex, email);
        System.out.println("Email valide ? " + estValide);
    }
}
```

---

## 🔍 Exemple : extraire tous les nombres

```java
import java.util.regex.*;

public class ExtraireNombres {
    public static void main(String[] args) {
        String texte = "Il y a 3 pommes et 14 poires";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(texte);

        while (matcher.find()) {
            System.out.println("Nombre trouvé : " + matcher.group());
        }
    }
}
```

---

## 🔄 Exemple : remplacer un mot

```java
public class Remplacement {
    public static void main(String[] args) {
        String phrase = "Java est génial. Java est rapide.";
        String modifiee = phrase.replaceAll("Java", "Python");

        System.out.println(modifiee);
    }
}
```

---

## ✂️ Exemple : découper une chaîne

```java
public class Decouper {
    public static void main(String[] args) {
        String fruits = "pomme;banane,poire:cerise";
        String[] tableau = fruits.split("[,;:]");

        for (String fruit : tableau) {
            System.out.println(fruit);
        }
    }
}
```

---

## 🎛️ Flags (options avancées)

### `Pattern.CASE_INSENSITIVE`
Ignore les majuscules/minuscules.

```java
Pattern pattern = Pattern.compile("java", Pattern.CASE_INSENSITIVE);
```

### `Pattern.MULTILINE`
Rend `^` et `$` actifs **par ligne** dans du texte multilignes.

```java
Pattern pattern = Pattern.compile("^abc", Pattern.MULTILINE);
```

---







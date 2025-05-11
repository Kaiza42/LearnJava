# ⚠️ Gestion des erreurs en Java : `try`, `catch`, `finally`

En Java, les erreurs pendant l'exécution (comme une division par zéro ou un accès à un fichier manquant) peuvent être gérées grâce aux blocs `try`, `catch` et `finally`. Cela empêche le programme de planter brutalement.

---

## 📑 Sommaire
- [`try` / `catch`](#try--catch)
- [`finally`](#finally)
- [`throw` et `throws`](#throw-et-throws)
- [Exemple avancé avec plusieurs exceptions](#exemple-avancé-avec-plusieurs-exceptions)

---

## `try` / `catch`
> On place dans le `try` le code "risqué", et dans le `catch` ce qu'on fait si une exception se produit.

```java
public class ExempleErreur {
    public static void main(String[] args) {
        try {
            int resultat = 10 / 0; // division par zéro => exception
            System.out.println("Résultat : " + resultat);
        } catch (ArithmeticException e) {
            System.out.println("Erreur : division par zéro interdite.");
        }
    }
}
```

---

## `finally`
> Le bloc `finally` s'exécute **quoi qu'il arrive**, que l'erreur soit survenue ou non.

```java
try {
    String mot = null;
    System.out.println(mot.length()); // NullPointerException
} catch (NullPointerException e) {
    System.out.println("Erreur : variable null.");
} finally {
    System.out.println("Bloc finally exécuté.");
}
```

---

## `throw` et `throws`
> Permettent de **lancer** ou **propager** une exception personnalisée.

```java
public void validerAge(int age) throws IllegalArgumentException {
    if (age < 0) {
        throw new IllegalArgumentException("L'âge ne peut pas être négatif.");
    }
    System.out.println("Age valide : " + age);
}
```

---

## Exemple avancé avec plusieurs exceptions
> On peut gérer plusieurs types d'exceptions avec plusieurs blocs `catch`.

```java
public class MultipleErreurs {
    public static void main(String[] args) {
        try {
            String[] noms = {"Alice", "Bob"};
            System.out.println(noms[3]); // ArrayIndexOutOfBoundsException

            int division = 10 / 0;       // ArithmeticException (non atteint ici)
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erreur : index de tableau invalide.");
        } catch (ArithmeticException e) {
            System.out.println("Erreur : division par zéro.");
        } finally {
            System.out.println("Bloc finally exécuté.");
        }
    }
}
```

---
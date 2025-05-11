# 🔐 Modificateurs d'accès en Java : `public`, `private`, `protected`, default

Les modificateurs d'accès permettent de **contrôler la visibilité** des classes, attributs et méthodes en Java. Ils sont essentiels pour appliquer les principes de l'encapsulation.

Java en possède **quatre** : `public`, `private`, `protected` et le niveau **par défaut** (aussi appelé *package-private*). Chacun d’eux détermine **où** un élément est accessible dans le code.

---

## 📑 Sommaire
- [`public`](#public)
- [`private`](#private)
- [`protected`](#protected)
- [Aucun modificateur (default)](#aucun-modificateur-default)
- [Tableau récapitulatif](#tableau-récapitulatif)

---

## `public`
> Le membre est accessible **de partout**, depuis n'importe quelle classe, même dans un autre package.

Utilisé lorsqu'on veut **exposer une API publique** (ex : `public void afficher()`).

```java
public class Voiture {
    public String marque;

    public void afficher() {
        System.out.println("Marque : " + marque);
    }
}
```

---

## `private`
> Le membre est accessible **uniquement dans la classe où il est déclaré**.

C’est le niveau d’accès **le plus restrictif**. Utilisé pour **protéger les données internes** de la classe.

```java
public class Personne {
    private String nom;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
}
```

---

## `protected`
> Le membre est accessible :
- dans la même classe
- dans toutes les classes du **même package**
- dans les **sous-classes**, même si elles sont dans un autre package

Utilisé surtout pour permettre l’accès aux **classes filles**.

```java
public class Animal {
    protected String espece;
}

public class Chien extends Animal {
    public void aboyer() {
        System.out.println("Espèce : " + espece);
    }
}
```

---

## Aucun modificateur (default)
> Si aucun modificateur n'est spécifié, le membre a un accès **package-private** (accessible uniquement dans le même package).

On appelle souvent ce niveau d'accès : **default**. Il est utile pour **limiter l'accès aux classes du même groupe logique (package)** sans exposer l'élément au reste du code.

```java
class Utilitaire {
    void helper() {
        System.out.println("Accessible dans le même package.");
    }
}
```

🟡 Une classe, une méthode ou un champ avec un accès *par défaut* :
- ❌ n’est **pas accessible en dehors du package**
- ❌ n’est **pas visible dans une sous-classe d’un autre package**
- ✅ est **accessible dans toutes les classes du même package**

---

## Tableau récapitulatif

| Modificateur | Même classe   | Même package  | Sous-classe (autre package)    | Autres classes  |
|--------------|---------------|---------------|------------------------------  |-----------------|
| `public`     | ✅           | ✅            | ✅                            | ✅              |
| `protected`  | ✅           | ✅            | ✅                            | ❌              |
| `default`    | ✅           | ✅            | ❌                            | ❌              |
| `private`    | ✅           | ❌            | ❌                            | ❌              |

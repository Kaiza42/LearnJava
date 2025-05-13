# Convert boolean values to strings 'Yes' or 'No'. kyu 8 / 1

```java
class YesOrNo
{
  public static String boolToWord(boolean b)
  {
    if(b == true){
      return "Yes";
    }else {
      return "No";
    }
  }
  
}
```

# Even or Odd kyu 8 / 2

```java
public class Kata {
    public static String evenOrOdd(int number) {
        if(number % 2 == 0){
          return "Even";
          
        }else {
          return "Odd";
        }
    }
}
```

# Multiply kyu 8 / 3

```java
public class Multiply {
    public static Double multiply(Double a, Double b) {
        return a * b;
    }
}
```

# Return Negative kyu 8 / 4

```java
public class Kata {
  public static int makeNegative(final int x) {
    return -Math.abs(x);
  }
}
```

# String repeat kyu 8 / 5

```java
public class Solution {
    public static String repeatStr(final int repeat, final String string) {
        return string.repeat(repeat);
    }
}
```

# Remove string spaces kyu 8 / 6

```java
public class Kata {
    public static String noSpace(final String x) {
        return x.replace(" ", "");
    }
}
```

# returning strings kyu 8 / 7

```java
public class Kata
{
  public static String greet(String name)
  {
    return "Hello, "+ name +" how are you doing today?";
  }
}

```

# Convert a String to a Number kyu 8 / 8

```java
public class StringToNumber {
  public static int stringToNumber(String str) {
    return Integer.parseInt(str);
  }
}
```

# Opposite number kyu 8 / 9

```java 

public class Kata
    {
        public static int opposite(int number)
        {
            return -number;
        }
    }

```

#   Basic Mathematical Operations kyu 8 / 10

```java 
public class BasicOperations
{
  public static Integer basicMath(String op, int v1, int v2)
  {
    
    switch(op){
       case"+" :
        return v1 + v2;
        
        case"-" :
        return v1 - v2;
        
          
        case"/" :
        return v1 / v2;
        
        case"*":
        return v1 * v2;
        
        default : 
        return 0;
    }
  }
}
```

# Beginner Series #1 School Paperwork kyu 8 / 11

```java
public class Paper
{
  public static int paperWork(int n, int m) 
  {
    if(n < 0 ||  m < 0){
      return 0;
    }else{
      return n *m;
    }
  }
}
```

# Convert a Boolean to a String kyu 8 / 12 

```java
public class BooleanToString {
  public static String convert(boolean b) {
    if(b == true){
      return "true";
      
    }else {
      return "false";
    }
  }
}
```

# Disemvowel Trolls kyu 7 / 13

```java
public class Troll {
    public static String disemvowel(String str) {
      
      
        String type = str.replaceAll("[aeiouAEIOU]", "");
      
      return type;
  }
}
```

# Convert a Number to a String! kyu 8 / 14 

```java
class Kata {
  public static String numberToString(int num) {
    return num + ""; 
  }
}
```

# Opposites Attract kyu 8 / 15

```java
public class OppositesAttract {

  public static boolean isLove(final int flower1, final int flower2) {

    if(flower1 % 2 == 0 && flower2 % 2 != 0){
      return true;
    }else if (flower2 % 2 == 0 && flower1 % 2 != 0){
      return true;
    }else {
      return false;
    }
  }
  
}
```

# Simple multiplication kyu 8 / 16

```java
public class Sid {
    public static int simpleMultiplication(int n) {
        //your code here
        if(n % 2 == 0){
          return n * 8;
        }else{
          return n * 9;
        }
    }
}
```

# MakeUpperCase kyu 8 / 17

```java
class Upper {
    public static String makeUpperCase(String str) {
    
        return str.toUpperCase();
    }
}
```

# Convert a string to an array kyu 8 / 18

```java
public class Solution {
    public static String[] stringToArray(String s) {
      return s.split(" ");
    }
}
```

#  Rock Paper Scissors! kyu 8 / 19

```java
public class Kata {
  public static String rps(String p1, String p2) {
    if(p1 == "rock" && p2 == "scissors"){
      return "Player 1 won!";
    }else if (p2 == "rock" && p1 == "scissors"){
      return "Player 2 won!";
    }else if (p1 == "scissors" && p2 == "paper"){
      return "Player 1 won!";
    }else if (p2 == "scissors" && p1 == "paper"){
      return "Player 2 won!";
    }else if (p1 == "paper" && p2 == "rock"){
      return "Player 1 won!";
    }else if (p2 == "paper" && p1 == "rock"){
      return "Player 2 won!";
    }else {
      return "Draw!";
    }
  }
}
```

# Jenny's secret message kyu 8 / 20

```java
public class Greeter {
  public static String greet(String name) {
    
    
    
    if(name == "Johnny"){
      return "Hello, my love!";
    }else {
      return "Hello, "+ name+ "!";
    }
  }
}
```

# Remove exclamation marks kyu 8 /21

```java
class Solution {
    static String removeExclamationMarks(String s) {
        return s.replace("!", "");
    }
}
```

# Grasshopper - Messi goals function kyu 8 / 22

```java
public class Goals {
    public static int goals(int laLigaGoals, int copaDelReyGoals, int championsLeagueGoals) {
        int totalGoals = laLigaGoals + copaDelReyGoals + championsLeagueGoals;
      
      return totalGoals;
    }
}
```

# Get the Middle Character kyu 8 / 23

```java
class Kata {
  public static String getMiddle(String word) {
    
    int longueur = word.length();
    int debut = (longueur - 1) / 2;
    int fin = longueur / 2 + 1;
    return word.substring(debut, fin);
  }
}
```

# You Can't Code Under Pressure #1 kyu 8 / 24

```java
class Java {
  public static int doubleInteger(int i) {
    
    return i + i;
  }
}
```

# Isograms kyu 7 /25

```java
public class isogram {
    public static boolean  isIsogram(String str) {
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++){
          
          char charactere = str.charAt(i);
          
          if (str.indexOf(charactere) != str.lastIndexOf(charactere)){
            return false;
          }
       }
              return true;
    }
}
```

# Sum Arrays kyu 8 / 26

```java
public class SumArray {

  public static double sum(double[] numbers) {
    double resultat = 0.0;
    
    for(double number : numbers) {
      resultat += number;
    }
    return resultat;
  }
}
```

# Will you make it? kyu 8 / 27

```java
public class Kata {
  
  public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
    return mpg * fuelLeft >= distanceToPump;
  }
  
}
```

# Calculate BMI kyu 8 / 28

```java
public class Calculate {
  public static String bmi(double weight, double height) {
    double bmi = weight / (height * height);
      if (bmi <= 18.5) {
            return "Underweight";
        } else if (bmi <= 25.0) {
            return "Normal";
        } else if (bmi <= 30.0) {
            return "Overweight";
        } else {
            return "Obese";
        }
  }
}
```

# Count by x kyu 8 / 29

```java
public class Kata{
  public static int[] countBy(int x, int n){
    int[] resultat = new int[n];
    for (int i = 0; i < n; i++){
      resultat[i] = x *  (i+1);
    }
    return resultat;
  }
}
```

# Strings end with? kyu 7 / 30

```java
public class Kata {
  public static boolean solution(String str, String ending) {
    return str.endsWith(ending);
  }
}
```

# Grasshopper - Check for factor kyu 8 /31

```java
public class Kata {
    public static boolean checkForFactor(int base, int factor) {
        if (base % factor == 0){
          return true;
        }else {
          return false;
        }
    }
}
```

# Is it even? kyu 8 / 32

```java
public class Number {

  public boolean isEven(double n) {
      if(n % 2 == 0){
        return true; 
      }else{
        return false;
      }
      
  }
}
```

# I love you, a little , a lot, passionately ... not at all kyu 8 / 33

```java
public class Sid {
    public static String howMuchILoveYou(int nb_petals) {
        String[] phrases = {
            "I love you",
            "a little",
            "a lot",
            "passionately",
            "madly",
            "not at all"
        };
        return phrases[(nb_petals - 1) % phrases.length];
    }
}
```

# Keep Hydrated! kyu 8 / 34

```java
public class KeepHydrated  {
  public static int liters(double time)  {    
    //Your code goes here! Hint: You should change that -1
     return (int) Math.floor(time * 0.5);
  }
}
```
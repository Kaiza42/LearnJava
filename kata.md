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

# Switch it Up! / 23

```java
public class Kata
{
  public static String switchItUp(int number)
  {
    switch(number){
        case 1: 
        return "One";
        case 2: 
        return "Two";
        case 3: 
        return "Three";
        case 4: 
        return "Four";
        case 5: 
        return "Five";
        case 6: 
        return "Six";
        case 7: 
        return "Seven";
        case 8: 
        return "Eight";
        case 9: 
        return "Nine";
        default : 
        return "Zero";
    }
  }
}
```

# Quarter of the year kyu 8 /24

```java
public class Kata {
    public static int quarterOf(int month) {
        switch(month){
            case 1 :
            case 2:
            case 3:
            return 1;
            case 4:
            case 5: 
            case 6:
            return 2;
            case 7:
            case 8:
            case 9:
            return 3;
           default : 
            return 4;
              
        }
    }
}
```

# Get the Middle Character kyu 8 / 25

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

# You Can't Code Under Pressure #1 kyu 8 / 26

```java
class Java {
  public static int doubleInteger(int i) {
    
    return i + i;
  }
}
```

# Isograms kyu 7 /27

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

# Sum Arrays kyu 8 / 28

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

# Will you make it? kyu 8 / 29

```java
public class Kata {
  
  public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
    return mpg * fuelLeft >= distanceToPump;
  }
  
}
```

# Calculate BMI kyu 8 / 30

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

# Count by x kyu 8 / 31

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

# Strings end with? kyu 7 / 32

```java
public class Kata {
  public static boolean solution(String str, String ending) {
    return str.endsWith(ending);
  }
}
```

# Grasshopper - Check for factor kyu 8 /33

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

# Is it even? kyu 8 / 34

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

# I love you, a little , a lot, passionately ... not at all kyu 8 / 35

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

# Keep Hydrated! kyu 8 / 36

```java
public class KeepHydrated  {
  public static int liters(double time)  {    
     return (int) Math.floor(time * 0.5);
  }
}
```

# Grasshopper - Summation kyu 8 / 37

```java
public class GrassHopper {

    public static int summation(int n) {
        int resultat = 0;
        for(int i = 0; i <= n; i++){
          resultat += i;
        }
      return resultat;
    }
}
```

# Regexp Basics - is it a vowel? kyu 7 / 38

```java
public class StringUtils {
  
  public static boolean isVowel(String s) {
   
    return s.matches("[aeiouAEOUI]");
  }
}
```

# Grasshopper - If/else syntax debug kyu 8 / 39

```java 
public class Solution {
  public static boolean checkAlive(int health) {
    if(health <= 0){
      return false;
    }else {
      return true;
    }
  }
}
```

# Grasshopper - Combine strings kyu 8 / 40

```java
public class StringCombiner {
    
    public static String combineNames(String first,String last) {

        return first +" "+ last;
    }
}
```

# Regex Password Validation kyu 5 / 41

```java
class PasswordRegex {
// asssign your pattern string to REGEX, it will be
// compiled to a Pattern and matched with matches()
    static final String REGEX = "^(?=.*[a-z])(?=.*[A-Z])(?=.*[1-9])[A-Za-z0-9]{6,}$";
}
```

# Simple validation of a username with regex kyu 8 /42

```java
public class ZywOo {
  public static boolean validateUsr(String s) {
    return s.matches("^[abcdefghijklmnopqrstuvwxyz\\d_]{4,16}$");
  }
}
```

# Exclamation marks series #11: Replace all vowel to exclamation mark in the sentence kyu 8 / 43

```java
public class Solution {
    public static String replace(final String s) {
        return s.replaceAll("[aeiouAEIOU]", "!");
    }
}
```

# FIXME: Replace all dots kyu 8 / 44

```java
public class Dinglemouse {

  public static String replaceDots(final String str) {
    return str.replace(".", "-");
  }
  
} 
```

# Regexp Basics - is it a digit? kyu 8 / 45

```java
public class StringUtils {
  
  public static boolean isDigit(String s) {
    return s.matches("[0-9]");
  }
}
```

# String cleaning kyu 8 / 46

```java
class StringCleaning {
    static String stringClean(final String text) {
        return text.replaceAll("[0-9]","");
    }
}
```

# Regexp Basics - is it a letter? kyu 7 / 47

```java
public class StringUtils {
  
  public static boolean isLetter(String s) {
    return s.matches("[a-zA-Z]");
  }
}
```

# Grasshopper - Grade book kyu 8 / 48

```java
public class GrassHopper {
    public static char getGrade(int s1, int s2, int s3) {
        int chiffre = (s1 + s2 + s3) /3 ;
      
      if ( chiffre >= 90){
        return 'A';
      }else if (chiffre >= 80){
        return 'B';
      }else if (chiffre >= 70) {
        return 'C';
      }else if( chiffre >= 60){
        return 'D';
      }else {
        return 'F';
      }
    }
}
```


# parseInt() reloaded kyu 4 / 49

```java
import java.util.Map;
public class Parser {
    
    public static int parseInt(String numStr) {
      Map<String, Integer> numbers = Map.ofEntries(
      Map.entry("zero",0), Map.entry("one",1),Map.entry("two",2),Map.entry("three",3),Map.entry("four",4), Map.entry("five",5),Map.entry("six",6),
        Map.entry("seven",7), Map.entry("eight", 8), Map.entry("nine", 9), Map.entry("ten", 10),Map.entry("eleven",11), Map.entry("twelve",12),
      Map.entry("thirteen",13), Map.entry("fourteen",14), Map.entry("fifteen",15),Map.entry("sixteen",16), Map.entry("seventeen",17),Map.entry("eighteen",18),
        Map.entry("nineteen",19), Map.entry("twenty",20),Map.entry("thirty",30),Map.entry("forty",40),Map.entry("fifty",50), Map.entry("sixty",60),
        Map.entry("seventy",70),Map.entry("eighty",80),Map.entry("ninety",90),Map.entry("hundred",100), Map.entry("thousand", 1000), Map.entry("million", 1_000_000)
        
      );
      
      numStr = numStr.toLowerCase().replaceAll(" and ", " ").replaceAll("-"," ");
      
      int total = 0;
      int actuel = 0;
      
      for (String numstreX : numStr.split(" ")) {
        int valeur = numbers.get(numstreX);
        if (valeur == 100){
          actuel *= 100;
        } else if (valeur >= 1000) {
          total += actuel * valeur;
          actuel =0;
        } else {
          actuel += valeur;
        }
          
      }
      return total + actuel;
    }
}
```

# Counting sheep... kyu 8 / 50

```java
public class Counter {
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int sheepCounter = 0;
    for(Boolean countSheep : arrayOfSheeps ) {
      if(Boolean.TRUE.equals(countSheep)) {
        sheepCounter++;
      }
    }
    return sheepCounter;
    }
}
```

# Multiples of 3 or 5 kyu 6 / 51

```java
public class Solution {

  public int solution(int number) {
    int total = 0;
    
    for (int i =0; i < number; i++){
      
      if (i % 3 == 0 || i % 5 == 0){
        
        total += i;
      }
    }
    return total;
  }
}
```

# Ex et Oh kyu 7 / 52

```java
public class XO {
  public static boolean getXO (String str) {
    str = str.toLowerCase();
    int compteX = 0;
    int compteO = 0;
    for (char XorO : str.toCharArray()){
      if (XorO == 'x'){
        compteX++;  
      }else if (XorO == 'o'){
        compteO++;
      }
    }
    return compteX == compteO;
  }
}
```

# Friend or Foe? kyu 7 / 53


```java
import java.util.List;
import java.util.stream.Collectors;
class Kata {
   public static List<String> friend(List<String> x){
     // Your code here
     return x.stream().filter(name -> name.length() == 4).collect(Collectors.toList());
   }
}
```

# Regex validate PIN code kyu 7 / 54

```java
public class Solution {

  public static boolean validatePin(String pin) {
     
    return pin.matches("^\\d{4}|^\\d{6}$");
  }

}
```

#  Remove anchor from URL kyu 7/ 55

```java
public class Kata {
    public static String removeUrlAnchor(String url) {
        int hashtag = url.indexOf("#");
      return (hashtag == -1) ? url : url.substring(0,hashtag);
    }
}
```

# Create Phone Number kyu 6 / 56

```java
public class Kata {
  public static String createPhoneNumber(int[] numbers) {
    String digits = "";
    for (int n : numbers){
      digits += n;
    }
    
    return digits.replaceFirst("(\\d{3})(\\d{3})(\\d{4})", "($1) $2-$3");
  }
}
```

#  Nickname Generator kyu 7 / 57

```java
class Generator {
      public static String nickname (String name) {
      if (name.length()< 4){
        return "Error: Name too short";
      }
        
        char troisiemeChar = Character.toLowerCase(name.charAt(2));
        boolean voyelle = "aeiouAEIOU".indexOf(troisiemeChar) >= 0;
        
        return voyelle ? name.substring(0,4) : name.substring(0,3);
      }
}
```

# Password maker kyu 7 / 58

```java
public class Kata {
   public static String makePassword(String phrase){
    return phrase.replaceAll("\\b([a-zA-Z])[^\\s]*","$1").replaceAll("(?i)i","1").replaceAll("(?i)o","0").replaceAll("(?i)s","5").replaceAll("\\s+","");
   }
}
```

# Regexp Basics - is it a eight bit unsigned number? kyu 7 / 59 

```java
class Kata {
  static boolean eightBitNumber(String n) {
    return n.matches("[1-9]?\\d|1\\d\\d|2[0-4]\\d|25[0-5]");
  }
}
```

# Regexp Basics - is it a six bit unsigned number? kyu 7 / 60

```java
public class Kata {
  public static boolean sixBitNumber(String n) {
    // Your code here
    return n.matches("^(0|[1-9]|[1-5][0-9]|6[0-3])$");
  }
}
```

# Sum of positive / 61

```java
public class Positive{
  public static int sum(int[] arr){
    int total =0;
    for (int i = 0; i < arr.length; i++){
      if (arr[i] > 0) {
        total += arr[i];
      }
    }
    return total;
  }
}
```

# Sum of positive / 62

```java 
public class Positive{

  public static int sum(int[] arr){
    int total =0;
    for (int i = 0; i < arr.length; i++){
      if (arr[i] > 0) {
        total += arr[i];
      }
    }
    return total;
  }

}
```

# Is the string uppercase? kyu 8 / 63

```java
public class Kata {
    public static boolean isUpperCase(String s) {
        for(int i = 0; i < s.length(); i++){
          char carac = s.charAt(i);
          if(Character.isLetter(carac)&& !Character.isUpperCase(carac)){
            return false;
          }
        }
      return true;
    }
}
```

# Multiplication table for number kyu 8 / 64

```java
class Kata {
    public static String multiTable(int num) {
      String result = "";
        for(int i = 1; i <= 10; i++){
           
          result += i + " * " + num + " = " + (i * num);
         if (i != 10){
           result += "\n";
         } 
        }
      return result;
    }
} 
```


#  No zeros for heroes kyu 8 / 65

```java
public class NoBoring {
    public static int noBoringZeros(int n) {
        if(n == 0) {
          return 0;
        }
      while(n % 10 == 0) {
        n/= 10;
      }
      return n;
    }
}
```

# The 'if' function / 66

```java
public class Kata {
  public static void _if(Boolean bool, Runnable func1, Runnable func2) {
    if (Boolean.TRUE.equals(bool)) {
      func1.run();
    } else {
      func2.run(); 
    }
  }
}
```

# Return the day kyu 8 / 67

```java 
public class DayOfWeek {

    public static String getDay(int n) {
        switch(n){
            case 1: 
            return "Sunday";
            case 2: 
            return "Monday";
            case 3: 
            return "Tuesday";
            case 4: 
            return "Wednesday";
            case 5: 
            return "Thursday";
            case 6: 
            return "Friday";
            case 7: 
            return "Saturday";
            default : 
            return "Wrong, please enter a number between 1 and 7";
        }
 }
  
} 
```

# 101 Dalmatians - squash the bugs, not the dogs! / 68

```java 
public class ZywOo {

  public static String howManyDalmatians(int number) {
    String[] dogs = {
            "Hardly any",
            "More than a handful!",
            "Woah that's a lot of dogs!",
            "101 DALMATIANS!!!"
        };
    return number <= 10 ? dogs[0] : number <= 50 ? dogs[1] : number == 101 ? dogs[3] : dogs[2];
 } 
}
```

# Reversed Strings kyu 8 / 69 

```java
public class Kata {

  public static String solution(String str) {
    // Your code here...
    StringBuilder sub = new StringBuilder(str);
    return sub.reverse().toString();
  }

}
```

# If you can't sleep, just count sheep!! kyu 8 / 70

```java 
class Kata {
  public static String countingSheep(int num) {
   String result = "";
    for(int i = 1; i <= num; i++){
      result += i + " sheep...";
    }
    return result;
  }
}
```

# Grasshopper - Personalized Message kyu 8 / 71

```java
class Kata {
    static String greet(String name, String owner) {
        if(owner.equals(name)){
          return "Hello boss";
          }else {
          return "Hello guest";
        }
    }
}
```

# L1: Set Alarm kyu 8 / 72

```java
public class Alarm {
  
  public static boolean setAlarm(boolean employed, boolean vacation) {
    if(employed == true && vacation == true){
      return false;
    }else if (employed == true && vacation == false){
      return true;
    }else if (employed == false && vacation == true){
      return false;
    }else {
      return false;
    }
  }

}
```

# Grasshopper - Debug sayHello kyu 8 / 73
```java
public class GrassHopper {

    public static String sayHello(String name) {

        return "Hello, " + name; 
    }
}
```

# Drink about kyu 8 / 74

```java
public class Drinks{
  
  public static String peopleWithAgeDrink(int age){
   if (age < 14){
    return "drink toddy";
  }else if (age < 18){
    return "drink coke";
  }else if (age < 21){
    return "drink beer";
  }else{
  return  "drink whisky";
  }
  }
}
```

# Grasshopper - Messi Goals kyu 8 / 75

```java
public class Goals {
    public static int laLigaGoals = 43;
    public static int championsLeagueGoals = 10;
    public static int copaDelReyGoals = 5;

    public static int totalGoals = laLigaGoals + championsLeagueGoals + copaDelReyGoals;
}
```

# Count Odd Numbers below n kyu 8 / 76

```java 
public class Kata {

  public static int oddCount(int n){

    return (int)Math.floor(n/2);
  }

}
```

#  Plural kyu 8 / 77

```java
public class Plural{
  public static boolean isPlural(float f){
    if(f == 1){
      return false;
    }else {
      return true;
    }
  }
}
```

# Price of Mangoes kyu 8 / 78

```java
public class Mango{
  public static int mango(int quantity, int price){
    int paidMangoes = quantity - (quantity / 3);
        return paidMangoes * price;
  }
}
```

# Odd or Even? kyu 7 / 79

```java
public class Codewars {
  public static String oddOrEven (int[] array) {
    int total = 0;
      for (int i : array){
         total += i;
  }
    return (total % 2 == 0) ? "even" : "odd";
  }
}
```

#  Simple Fun #176: Reverse Letter kyu 7 / 80

```java 
public class Kata {
    public static String reverseLetter(final String str) {
        StringBuilder sub = new StringBuilder();
      for (char phrases : str.toCharArray()){
        if (Character.isLetter(phrases)){
          sub.append(phrases);
        }
      }
    return sub.reverse().toString();
    }
}
```

# Fizz Buzz kyu 7 / 81

```java
public class FizzBuzzArray {
    public static String[] fizzBuzz(int n) {
        String[] result = new String[n];
        int index = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result[index++] = "FizzBuzz";
            } else if (i % 3 == 0) {
                result[index++] = "Fizz";
            } else if (i % 5 == 0) {
                result[index++] = "Buzz";
            } else {
                result[index++] = String.valueOf(i);
            }
        }
        return result;
    }
}
```

# Grasshopper - Summation kyu 8 / 82

```java 
public class GrassHopper {

    public static int summation(int n) {
      int resultat = 0;
      for(int somme = 1; somme <= n ;somme++ ){
        resultat += somme;
      }
      return resultat;
    }
}
```

# Highest and Lowest kyu 7 / 83

```java 
public class Kata {
  public static String highAndLow(String numbers) {
    // Code here or
    String[] test = numbers.split(" ");
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;   
    for (String nombre : test){
      int valeur  = Integer.parseInt(nombre);
      
      if (valeur < min)
       min = valeur; 
      if( valeur > max){
       max = valeur;
      }
    }
      return max + " " + min;
  }
}
```

# Shortest Word kyu 7 / 84

```java
public class Kata {
    public static int findShort(String s) {
           String[] texte = s.split(" ");
    int min = Integer.MAX_VALUE;
    
    for (String textes : texte){
      if(textes.length() < min){
        min = textes.length();
      }
    }
    return min;
    }
}
```

# Regexp Basics - is it a eight bit signed number? kyu 7 / 85

```java 
public class StringUtils {
  
  public static boolean isSignedEightBitNumber(String s) {
    return s.matches("(-128|-12[0-7]|-1[01][0-9]|-[1-9][0-9]?|0|[1-9][0-9]?|1[01][0-9]|12[0-7])");
  }
}
```

# Exclamation marks series #5: Remove all exclamation marks from the end of words kyu 7 / 86

```java
public class R {
  public static String removeBang(String str) {
    return str.replaceAll("\\b!+", "");
  }
}
```

# regex pattern to check if string has all characters kyu 6 / 87

```java 
class Kata {
  static String regexContainsAll(String str) {
    return str.replaceAll(".", "(?=.*$0)");
  }
}
```

# Without the letter 'E' kyu 7 / 88

```java
public class WithoutLetterE {
  public static String findE(String str){
    if(str == null){
      return null;
    }

    if (str.isEmpty()){
      return "";
    }

    int count = str.split("[eE]", -1).length - 1;
    if(count == 0){
      return "There is no \"e\".";
    }else {
      return String.valueOf(count);
    }
  }
}
```

# The old switcheroo kyu 7 / 89

```java
public class Kata {
  public static String vowel2Index(String s) {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < s.length(); i++) {
        if ("aeiouAEIOU".indexOf(s.charAt(i)) == -1) sb.append(s.charAt(i));
        else sb.append(i + 1);
      }
      return sb.toString();
  }
}
```

# You're a square ! kyu 7 / 90

```java
public class Square {    
    public static boolean isSquare(int n) {        
        if (n < 0){
          return false;
        }
      
      int carrer = (int) Math.sqrt(n);
      return carrer * carrer == n;
    }
}
```

# Are You Playing Banjo? kyu 8 / 91

```java
public class Banjo {
  public static String areYouPlayingBanjo(String name) {
    if(name.startsWith("r") || name.startsWith("R")){
      return name + " plays banjo";
    }else {
      return name + " does not play banjo";
    }
  }
}
```

# Find the next perfect square! kyu 7 / 92

```java 
public class NumberFun {
  public static long findNextSquare(long sq) {
      double carrer = Math.sqrt(sq);
    
    if (carrer == (long) carrer){
      long next = (long) carrer +1;
      return next * next;
    }else {
      return -1;
    }
  }
}
```

# Find the unique number kyu 6 / 93

```java 
public class Kata {
    public static double findUniq(double arr[]) {
      double doublon;
      
      if(arr[0] == arr[1]){
        doublon = arr[0];
      } else if (arr[0] == arr[2]) {
        return arr[1];
      }else {
        return arr[0];
      }    
      for( double arrr : arr) {
        if(arrr != doublon){
          return arrr;
        }
      }
      return -1;
    }
}
```

# Convert string to camel case kyu 6 / 94

```java 
import java.lang.StringBuilder;
import java.util.regex.*;
class Solution{

  static String toCamelCase(String s){
    Pattern pattern = Pattern.compile("[-_](\\p{L})");
    Matcher matcher = pattern.matcher(s);
    StringBuffer result = new StringBuffer();
    while (matcher.find()) {
      matcher.appendReplacement(result, matcher.group(1).toUpperCase());
    }
    matcher.appendTail(result);
    return result.toString();
  }
}
```

# Function 1 - hello world kyu 8 / 95

```java 
public class HelloWorld {
   public static String greet(){
     return "hello world!";
     }
}
```

# test 1-2-3 kyu 7 / 96

```java 
import java.util.*;

public class LineNumbering {
    public static List<String> number(List<String> lines) {
        List<String> resultat = new ArrayList<>();
      
      for (int i = 0; i < lines.size() ; i++){
        resultat.add((i+1 )+  ": " + lines.get(i));
      }
      return resultat;
    }
}
```

# Snail kyu 4 / 97 

```java 
import java.util.*;
public class Snail {

    public static int[] snail(int[][] array) {
     if (array == null || array.length == 0|| array[0].length == 0){
       return new int[0];
     }
      
      int n = array.length; 
      List<Integer> resultat = new ArrayList<>();
      
      int haut= 0;
      int bas = n - 1;
      int gauche = 0;
      int droite = n - 1;
      
      
      while (haut <= bas && gauche <= droite){
        
        for (int i = gauche; i <= droite; i++){
          
          resultat.add(array[haut][i]);
          
        }
        haut++;
        
        for (int i = haut; i <= bas; i++){
          resultat.add(array[i][droite]);
        }
        droite--;
        
        if (haut <= bas){
          for (int i = droite; i >= gauche; i--){  
            resultat.add(array[bas][i]);
          }
          bas--;
        }
        if (gauche <= droite){
          for(int i = bas; i >= haut; i--){
            resultat.add(array[i][gauche]);
          }
          gauche++;
        }
      }
      return resultat.stream().mapToInt(Integer::intValue).toArray();
   } 
}
```

# Do I get a bonus? kyu 8 / 98


```java 
public class Kata{
  public static String bonusTime(final int salary, final boolean bonus) {
    int resultat = bonus ? salary * 10 : salary;
      return "\u00A3" + resultat;
    
  }
}
```

# Get Planet Name By ID kyu 8 / 99

```java 
class Planet {
  static String getPlanetName(int id) {
    String name = null;
    switch (id) {
      case 1:
      return  name = "Mercury";
      case 2:
       return name = "Venus";
      case 3:
         return name = "Earth";
      case 4:
         return name = "Mars";
      case 5:
         return name = "Jupiter";
      case 6:
        return  name = "Saturn";
      case 7:
         return name = "Uranus";
      case 8:
         return name = "Neptune";
    }
    return name;
  }
}
```

# Human readable duration format kyu 4 / 100

```java
import java.util.List;
import java.util.ArrayList;
public class TimeFormatter {
    
    public static String formatDuration(int seconds) {
        if (seconds == 0){
          return "now";
        }
        int[] temp = {365 * 24 *3600, 24 * 3600, 3600,60,1};
        String[] temps = {"year", "day", "hour", "minute", "second" };
        List<String> list = new ArrayList<>();
      
        for(int i = 0; i < temp.length; i++){
          int value = seconds / temp[i];
          if(value > 0){
            list.add(value + " " + temps[i] + (value > 1 ? "s" : ""));
            seconds %= temp[i];
          }
        }
      
      if(list.size() == 1){
        return list.get(0);
      }
      return String.join(", ", list.subList(0, list.size() -1)) + " and " + list.get(list.size() - 1);
    }
}
```

# A Needle in the Haystack kyu 8 / 101

```java
public class Kata {
  public static String findNeedle(Object[] haystack) {
    // Your code here
      for (int i = 0; i < haystack.length; i++){
        if("needle".equals(haystack[i])){
          return "found the needle at position " + i;
        }
      }
    return "";
  }
}
```

# Switcheroo kyu 7 / 102

```java
public class Switch {
  public static String switcheroo(String x) {
    StringBuilder sb = new StringBuilder(x);
    for(int i = 0; i < x.length(); i++){
      if(sb.charAt(i) == 'a'){
         sb.setCharAt(i, 'b');
      }else if (sb.charAt(i) == 'b'){
        sb.setCharAt(i, 'a');
      }
    }
    return sb.toString();
  }
}
```

# Vowel Count kyu 7 / 103

```java
public class Vowels {

  public static int getCount(String str) {

        int count = 0;
      for(int i = 0; i < str.length() ; i++){
        char c = str.charAt(i);
        if (c == 'A' || c == 'E' || c == 'O' || c == 'U' || c == 'I' || c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ) {
                count++;
            }
      }
      return count;

  }

}
```

# Sum The Strings kyu 8 / 104

```java
public class Kata{
  
  public static String sumStr(String a, String b){ 
    if(a == ""){
      a = "0";
    }
    if(b == ""){
      b = "0";
    }
  int calcul = Integer.parseInt(a) + Integer.parseInt(b);
  String resultat = Integer.toString(calcul);
  return resultat;
    }
}
```

# A + B kyu 8 / 105

```java
public class FirstClass {
    public static int sum (int a, int b) {
        int c = (a + b);
        return c;
    }
}
```

# String incrementer / 106

```java
import java.math.BigInteger;
public class Kata {
  public static String incrementString(String str) {
      int i = str.length() - 1;
      while (i >= 0 && Character.isDigit(str.charAt(i))){
        i--;
      }
    
    String debut = str.substring(0, i +1);
    String chiffre = str.substring(i+1);
    
    if (chiffre.isEmpty()){
      return str + "1";
    }
    
    BigInteger nombre = new BigInteger(chiffre);
    nombre = nombre.add(BigInteger.ONE);
    
    String nouveauNombre = nombre.toString();
    int zerosInitiaux = chiffre.length() - nouveauNombre.length();
    if (zerosInitiaux  > 0) {
      nouveauNombre = "0".repeat(zerosInitiaux) + nouveauNombre;
    }
    
    
    return debut + nouveauNombre;
  }
}
```

# / 107

```java
class Swapper{

  public Object[] arguments;
  
  public Swapper(final Object[] args){
    arguments=args;
  }
  
  public void swapValues() {
   
    Object temp = arguments[0];
    arguments[0] = arguments[1];
    arguments[1] = temp;
  }
}
```

# Grasshopper - Debug kyu 8 / 108

```java
public class GrassHopper {

    public static String weatherInfo(int temp) {
        double c = convertToCelsius(temp);
        if (c <= 0)
            return (c + " is freezing temperature");
        else
            return (c + " is above freezing temperature");
    }

    public static double convertToCelsius(int temperature) {
        return (temperature -32) * 5.0 / 9;
    }
}
```

# Ghost code?! kyu 8 / 109

```java
public class GhostCode{
  public static String helloName(String name){
    if( name == null || name.isEmpty()){
      return "Hello world!";
    }else{
      return "Hello my name is " + name;
    }
  }
}
```

# Unexpected parsing kyu 8 / 110

```java 
import java.util.HashMap;

public class Kata {

    public static HashMap <String, String> getStatus(boolean isBusy) {
        HashMap<String, String> status = new HashMap<>();
      
        if (isBusy) {
          status.put("status", "busy");
        } else {
          status.put("status","available");
        }

        return status;
    }
  
}
```

# FIXME: Get Full Name kyu 7 / 111

```java
public class Dinglemouse {

  private String firstName;
  private String lastName;
  
  public Dinglemouse(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }
  
  public String getFullName() { 
    if(firstName.isEmpty()){
      return lastName;
    }
    if(lastName.isEmpty()){
      return firstName;
    }
    return firstName + " " + lastName;
  }
  
}
```


# How do I compare numbers? kyu 8 / 112

```java
public class HowDoICompare {
    public static String whatIs(Integer x) {
        for (Object[] p : specialNumbers) {
            if (p[0].equals(x))
              return (String) p[1];
            
                
        }
        return "nothing";
    }
    
    static final Object[][] specialNumbers = {
        {42, "everything"},
        {42 * 42, "everything squared"},
    };
}
```

# Debug Sum of Digits of a Number kyu 8 / 113

```java 
public class Solution {
  public static int sumOfDigits(int n) {
    int sum = 0;
    String digits = n + "";
    for (int i = 0; i < digits.length(); i++) {
      sum += digits.charAt(i) -  '0';
    }
    return sum;
  }
}
```

# How do I compare numbers? kyu 8 / 114

```java
import java.util.*;
public class DescendingOrder {
  public static int sortDesc(final int num) {
    char[] chiffre = String.valueOf(num).toCharArray();
    
    Arrays.sort(chiffre);
    
    StringBuilder sb = new StringBuilder(new String(chiffre));
    sb.reverse();
    
    return Integer.parseInt(sb.toString());
  }
}
```


# Is he gonna survive? kyu 8 / 115 

```java
class Solution {
  public static boolean hero(int bullets, int dragons) {
    return (long)bullets >= (long)dragons * 2;
  }
}
```

# Binary Addition kyu 7 / 116

```java
public class Kata{
  
  public static String binaryAddition(int a, int b){
    int sum = a + b;
    return Integer.toBinaryString(sum);
  }
}
```

# Area or Perimeter kyu 8 / 117

```java
public class Solution {
    public static int areaOrPerimeter (int l, int w) {
        if (l == w){
          return l * w;
        }else {
          return 2 * (l + w);
        }
    }
}
```

# The highest profit wins! kyu 7 / 118

```java
class MinMax {
    public static int[] minMax(int[] arr) {
        int min = arr[0];
      int max = arr[0];
      
      for(int num : arr){
        if (num < min){
          min = num;
        }
        if(num > max){
          max = num;
        }
      }
      return new int[]{min,max};
    }
}
```

# DNA to RNA Conversion kyu 8 / 119

```java
public class Bio {
    public String dnaToRna(String dna) {
        return dna.replace('T','U');
    } 
}
```

# Fake Binary kyu 8 / 120

```java
public class FakeBinary {
    public static String fakeBin(String numberString) {
        StringBuilder resultat = new StringBuilder();
      
      for(char c : numberString.toCharArray()){
        if( c < '5'){
          resultat.append('0');
        } else {
          resultat.append('1');
        }
      }
      return resultat.toString();
    }
}
```
# Basic variable assignment kyu 8 / 121

```java
public class Kata {
    public static String a = "code";
    public static String b = "wa.rs";
    public static String name = a+ b;
}
```

# Unfinished Loop - Bug Fixing #1 kyu 8 / 122

```java
import java.util.*;

class Kata {
    public static List<Integer> CreateList(int number) {
        List<Integer> list = new ArrayList<>();

        for (int count = 1; count <= number;count++) {
            list.add(count);
        }
        return list;
    }
}
```

# Thinkful - String Drills: Quotable kyu 7 / 123

```java
public class Kata{
  public static String quotable(String name, String quote){
    return name + " said: "+ '"' + quote + '"';
  }
}
```

# Jaden Casing Strings kyu 7 / 124

```java
public class JadenCase {

	public String toJadenCase(String phrase) {
  
    
     if(phrase == null || phrase.isEmpty()){
       return null;
     }
    StringBuilder sb = new StringBuilder();
    String[] mot = phrase.split(" ");
    for (String mots : mot){
      if(!mots.isEmpty()){
        sb.append(Character.toUpperCase(mots.charAt(0)));
        
        if(mots.length() > 1){
          sb.append(mots.substring(1).toLowerCase());
        }
        sb.append(" ");
      }
    }
    
    return sb.toString().trim();
	}

}
```

# Remove First and Last Character kyu 8 / 125

```java
public class RemoveChars {
    public static String remove(String str) {
        
        
      
        return str.substring(1,str.length() - 1);
      
    }
}
```

# Square Every Digit kyu 7 / 126

```java
public class SquareDigit {

  public int squareDigits(int n) {
    String resultat = "";
    
    for (char c : String.valueOf(n).toCharArray()) {
      int d = c - '0';
      resultat += (d * d);
    }
    return Integer.parseInt(resultat);
  }
}
```

# You only need one - Beginner kyu 8 / 127

```java
import java.util.*;
public class Solution {

    public static boolean check(Object[] a, Object x) {     
        return Arrays.asList(a).contains(x); 
    }
}
```

# Complementary DNA kyu 7 / 128

```java
public class DnaStrand {
  public static String makeComplement(String dna) {
    StringBuilder resultat = new StringBuilder();
    
    for (char lettre : dna.toCharArray()){
      switch(lettre){
          case 'A':
          resultat.append('T');
          break;
          case 'T':
          resultat.append('A');
          break;
          case 'C':
          resultat.append('G');
          break;
          case 'G':
          resultat.append('C');
          break;
      }
    }
    return resultat.toString();
  }
}
```

# Removing Elements kyu 8 / 129

```java 
import java.util.ArrayList;
import java.util.List;
public class Kata {
  
  public static Object[] removeEveryOther(Object[] arr) {
    List<Object> resultat = new ArrayList<>();
    
    for(int i = 0; i < arr.length; i +=2){
      resultat.add(arr[i]);
    }
    return resultat.toArray();
  }
}
```

# Credit Card Mask kyu 7 / 130

```java
public class Maskify {
    public static String maskify(String str) {
      int length = str.length();
      if (length <= 4){
        return str;
      }
      
      StringBuilder masque = new StringBuilder();
      for (int i = 0; i < length -4 ; i++){
        masque.append('#');
      }
      masque.append(str.substring(length - 4));
      
      return masque.toString();
    }
}
```

# More than Zero? kyu 7 / 131

```java
class MoreThanZero {
  public static String corrections(int x) {
    if(x > 0){
     return x + " is more than zero.";
    }else{
      return x + " is equal to or less than zero.";
    }
      
  }
}
```

# Swap pairs in Array kyu 7 / 132

```java
 public class Swappairs {

    public Object[][][] swapp(Object[][] input) {
    Object[][] outp = new Object [input.length][2]; 
    for(int i = 0; i < input.length; i++){
      Object[] pair = input[i];
      outp[i][0] = pair[1];
      outp[i][1] = pair[0];
      }
    Object[][][] res={input,outp};
        return res;
    }
}
```

# Calculate average kyu 8 / 133

```java
public class Kata {
    public static double findAverage(int[] array) {
         if (array == null || array.length == 0){
           return 0;
         }
      
      int sum = 0;
      for (int arrays : array){
        sum += arrays;
      }
      
      return (double) sum / array.length;
    }
}
```

# Sum of odd numbers kyu 7 / 134

```java
class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
        return n * n * n;
    }
}
```

# Remove the minimum kyu 7 / 135 

```java 
import java.util.*;
public class Remover {

  public static int[] removeSmallest(int[] numbers) {
    if (numbers.length == 0){
      return new int[0];
    }
    
    int min = numbers[0];
    
    int indexMin = 0;
    
    for (int i = 1; i < numbers.length; i++) {
      if (numbers[i] < min) {
        min = numbers[i];
        indexMin = i;
      }
    }
    int[] result = new int[numbers.length -1];
    int j = 0;
    
    for (int i = 0; i < numbers.length; i++) {
      if( i != indexMin) {
        result[j] = numbers[i];
        j++;
      }
    }
    return result;
  }
}
```

# Grasshopper - Terminal game move function / 136

```java 
public class Move {
    public static int move(int position, int roll) {
        return position + 2 * roll;
    }
}
```


# All Star Code Challenge #18 kyu 8 / 137

```java
public class CodeWars {
  public static int strCount(String str, char letter) {
    int compte = 0;
    
    for(int i = 0; i < str.length(); i++){
      if (str.charAt(i) == letter){
        compte++;
      }
    }
    return compte;
  }
}
```

# Square(n) Sum kyu 8 / 138

```java
public class Kata
 {
  public static int squareSum(int[] n)
  { 
   int resultat = 0; 
    for(int number : n){
      resultat += number * number;
    }
    return resultat;
  }
 }
```

# Volume of a Cuboid kyu 8 / 139

```java
public class Kata {

  public static double getVolumeOfCuboid(final double length, final double width, final double height) {
    // Your code here
    return length * width * height;
  }
  
}
```

# total amout of points kyu 8 / 140

```java
public class TotalPoints {
  
    public static int points(String[] games) {
      int point = 0; 
      
      for(String game : games){
        int x = Character.getNumericValue(game.charAt(0));
        int y = Character.getNumericValue(game.charAt(2));
        
        if(x > y){
          point += 3;
        } else if (x == y){
          point += 1;
        }
        
      }
      return point;
    }
}
```


# Transportation on vacation kyu 8 / 141

```java 
public class Kata {
  public static int rentalCarCost(int d) {
    int cost = d * 40;
    if (d >= 7){
      cost -= 50;
    } else if (d >= 3){
      cost -= 20;
    }
    return cost;
  }
}
```

# Reversed sequence kyu 8 / 142

```java
public class Sequence{

  public static int[] reverse(int n){
   
    int [] resultat = new int [n];
    
    for (int i = 0; i < n; i++){
      resultat[i] = n - i;
    }
    return resultat;
  }

}
```

# Is this a triangle? kyu 7 / 143

```java
class TriangleTester{
  public static boolean isTriangle(int a, int b, int c){
    return a > 0 && b> 0&& c > 0 && a+ b > c && a+ c > b && b +c > a;
  }
}
```

# Will there be enough space? kyu 8 / 144

```java
public class Bob {
  public static int enough(int cap, int on, int wait){
  int resultat = on + wait;
    return Math.max(0,resultat - cap);
  }
}
```

# The Feast of Many Beasts kyu 8 / 145

```java
public class Kata {

  public static boolean feast(String beast, String dish) {
    
    return beast.charAt(0) == dish.charAt(0) && beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1);
    
  }
  
}
```

# Array plus array kyu 8 / 146

```java
public class Sum {

  public static int arrayPlusArray(int[] arr1, int[] arr2) {
    int resultat = 0;
    
    for (int arr3 : arr1){
      resultat += arr3;
    }
    
    for (int arr4 : arr2){
      resultat += arr4;
    }
    return resultat;
  }

}
```   

# Reversed Words kyu 8 / 147

```java
public class ReverseWords{

 public static String reverseWords(String str){
     String[] mot = str.split(" ");
   StringBuilder reverse = new StringBuilder();
   
   for(int i = mot.length -1; i >= 0; i--){
     reverse.append(mot[i]);
     if (i > 0){
       reverse.append(" ");
     }
     
   }
   return reverse.toString();
 }
}
```

# Number of People in the Bus kyu 7 / 148

```java 
import java.util.ArrayList;
class Metro {
  public static int countPassengers(ArrayList<int[]> stops) {
    int people = 0;
  for(int[] stop : stops){
    people += stop[0];
    people -= stop[1];
  }
    return people;
  }
}
```

# Beginner Series #4 Cockroach kyu 8 / 149

```java
public class Cockroach{
  public int cockroachSpeed(double x){
    return (int) Math.floor(x * 100000 / 3600);
  }
}
```

# Function 2 - squaring an argument kyu 8 / 150

```java
public class Kata
 {
  public static int square(int n){
    return n* n;
  }
 }
 ```

# Sentence Smash kyu 8 / 151


```java
public class SmashWords {
	public static String smash(String... words) {
    return String.join(" ", words);
  }
}
```
# Find the smallest integer in the array kyu 8 / 152

```java 
import java.util.Arrays;
public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
     return Arrays.stream(args).min().getAsInt();
    }
}
```

# List Filtering kuy 7 / 153

```java
import java.util.List;
import java.util.ArrayList;
public class Kata {
  
  public static List<Object> filterList(final List<Object> list) {
    List<Object> resultat = new ArrayList<>();
    for (Object test : list){
      if (test instanceof Integer){
        resultat.add((Integer)test);
      }
    }
    return resultat;
  }
}
```
# Mumbling kyu 7 / 154


```java
public class Accumul {
    
    public static String accum(String s) {
     StringBuilder result = new StringBuilder();
      
      if (s == null || s.isEmpty()){
        return "";
      }

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
          result.append(Character.toUpperCase(c));
          for(int j = 0; j < i; j++){
            result.append(Character.toLowerCase(c));
          }
          if ( i != s.length() -1){
            result.append("-");
          }
        }
      return result.toString();
    }
}
```

# How good are you really? kyu 8 / 155

```java
public class Kata {
  public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    int total = 0;
    
    for(int scord : classPoints){
      total += scord;
    }
    
    double millieu = (double)total / classPoints.length;
    return yourPoints > millieu;
  }
}
```

# Find Maximum and Minimum Values of a List kyu 8 / 156

```java
public class Kata {

  public int min(int[] list) {
    int min = list[0];
    for(int numMin : list){
      if (numMin< min){
        min = numMin;
      }
    }
    return min;
  }
  
  public int max(int[] list) {
    int max = list[0];
    for(int numMax : list){
      if (numMax > max) {
        max = numMax;
      }
    }
    return max;
  }
}
```

# Is n divisible by x and y? kyu 8 / 157

```java 
public class DivisibleNb {
	public static boolean isDivisible(long n, long x, long y) {
		return n % x == 0 && n % y == 0;
	}
}
```

# Count the divisors of a number kyu 7 / 158

```java 
public class FindDivisor {

  public long numberOfDivisors(int n) {
    int compte = 0;
  
    for (int i = 1; i * i <= n; i++){
      if (n%i ==0){{
        compte++;
      }
        if(i != n / i){
          compte++;
        }
      }
    }
    return compte;
  }

}
```

# What is between? kyu 8 / 159

```java
public class Kata {

  public static int[] between(int a, int b) {
    int[] result = new int[b - a + 1];
    for(int i = a; i <= b; i++){
      result[i - a] = i;
    }
    return result;
  }
}
```

# Powers of 2 / 160

```java
public class Kata{
  public static long[] powersOfTwo(int n){
    
    long[]  resultat = new long[n + 1];
    for( int i = 0; i <= n; i++){
      resultat[i] = 1L <<i;
    }
    return resultat;
  }
}
```

# Cat years, Dog years / 161

```java
public class Dinglemouse {

  public static int[] humanYearsCatYearsDogYears(final int humanYears) {
    int catAnnee;
    int dogAnnee;
    
    if (humanYears == 1){
      catAnnee = 15;
      dogAnnee = 15;
    }else if (humanYears == 2){
      catAnnee = 15 +9;
      dogAnnee = 15 +9;
    }else {
      catAnnee = 15 +9 +(humanYears -2) * 4;
      dogAnnee = 15 +9 +(humanYears -2) * 5;
    }
    return new int[] {humanYears,catAnnee, dogAnnee};
  }

}
```

# Find the first non-consecutive number kyu 8 / 162

```java
class FirstNonConsecutive {
    static Integer find(final int[] array) {
        if (array == null || array.length < 2) {
          return null;
        }
      
      for(int i = 1; i < array.length; i++){
        if (array[i] != array[i -1] + 1){
          return array[i];
        }
      }
      return null;
    }
}
```

# Century From Year kyu 8 / 163

```java
public class Solution {
  public static int century(int number) {
    return (number +99) / 100;
     
    
  }
}
```

# Count the Monkeys! kyu 8 / 164

```java 
public class MonkeyCounter
{
  public static int[] monkeyCount(final int n){
    int[] result = new int[n];
    for(int i = 0; i < n ; i++){
      result[i] = i +1;
    }
    return result;
  }
}
```

# Find the stray number kyu 7 / 165

```java
class Solution {
  static int stray(int[] numbers) {
   int somme = 0;
    for(int num: numbers){
      somme ^= num;
      }
     return somme;
    }
    
  }
```

# 

```java

```


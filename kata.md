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
    //Your code goes here! Hint: You should change that -1
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

# 

```java 

```



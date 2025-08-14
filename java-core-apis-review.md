# Chapter 4 • Core APIs

## Review Questions

*The answers to the chapter review questions can be found in the Appendix.*

### 1. What is output by the following code? (Choose all that apply.)

```java
1: public class Fish {
2:     public static void main(String[] args) {
3:         int numFish = 4;
4:         String fishType = "tuna";
5:         String anotherFish = numFish + 1; // incompatibilité
6:         System.out.println(anotherFish + " " + fishType);
7:         System.out.println(numFish + " " + 1);
8:     }
}
```

**A.** 4 1  
**B.** 5  
**C.** 5 tuna  
**D.** 5tuna  
**E.** 51tuna  
**F.** The code does not compile.

F,

### 2. Which of these array declarations are not legal? (Choose all that apply.)

**A.** `int[][] scores = new int[5][];`  
**B.** `Object[][][] cubbies = new Object[3][0][5];`  
**C.** `String beans[] = new beans[6];`  
**D.** `java.util.Date[] dates[] = new java.util.Date[2][];`  
**E.** `int[][] types = new int[];`  
**F.** `int[][] java = new int[][];`

C, E, F


### 3. Note that March 13, 2022 is the weekend when we spring forward, and November 6, 2022 is when we fall back for daylight saving time. Which of the following can fill in the blank without the code throwing an exception? (Choose all that apply.)

```java
var zone = ZoneId.of("US/Eastern");
var date = _________________________;
var time = LocalTime.of(2, 15);
var z = ZonedDateTime.of(date, time, zone);
```

**A.** `LocalDate.of(2022, 3, 13)`  
**B.** `LocalDate.of(2022, 3, 40)`  
**C.** `LocalDate.of(2022, 11, 6)`  
**D.** `LocalDate.of(2022, 11, 7)`  
**E.** `LocalDate.of(2023, 2, 29)`  
**F.** `LocalDate.of(2022, MonthEnum.MARCH, 13);`

A, C, D, 

### 4. Which of the following are output by this code? (Choose all that apply.)

```java
3: var s = "Hello"; // littéral dans le string pool
4: var t = new String(s);  // nouvelle instance --> hors du pool

5: if ("Hello".equals(s)) System.out.println("one"); // true
6: if (t == s) System.out.println("two"); // false
7: if (t.intern() == s) System.out.println("three"); // true
8: if ("Hello" == s) System.out.println("four"); // True
9: if ("Hello".intern() == t) System.out.println("five"); // False
```

**A.** one  
**B.** two  
**C.** three  
**D.** four  
**E.** five  
**F.** The code does not compile.  
**G.** None of the above

A, C, D

### 5. What is the result of the following code?

```java
7: var sb = new StringBuilder();
8: sb.append("aaa").insert(1, "bb").insert(4, "ccc");
9: System.out.println(sb);
```

**A.** abbaaccc  
**B.** abbaccca  
**C.** bbaaaccc  
**D.** bbaaccca  
**E.** An empty line  
**F.** The code does not compile.

B

### 6. How many of these lines contain a compiler error? (Choose all that apply.)

```java
23: double one = Math.pow(1, 2);
24: int two = Math.round(1.0);
25: float three = Math.random();
26: var doubles = new double[] {one, two, three};
```

**A.** 0  
**B.** 1  
**C.** 2  
**D.** 3  
**E.** 4

3

### 7. Which of these statements is true of the two values? (Choose all that apply.)

```
2022-08-28T05:00 GMT-04:00
2022-08-28T09:00 GMT-06:00
```

**A.** The first date/time is earlier.  
**B.** The second date/time is earlier.  
**C.** Both date/times are the same.  
**D.** The date/times are two hours apart.  
**E.** The date/times are six hours apart.  
**F.** The date/times are 10 hours apart.

### 8. Which of the following return 5 when run independently? (Choose all that apply.)

```java
var string = "12345";
var builder = new StringBuilder("12345");
```

**A.** `builder.charAt(4)`  
**B.** `builder.replace(2, 4, "6").charAt(3)`  
**C.** `builder.replace(2, 5, "6").charAt(2)`  
**D.** `string.charAt(5)`  
**E.** `string.length`  
**F.** `string.replace("123", "1").charAt(2)`  
**G.** None of the above

D, E

### 9. Which of the following are true about arrays? (Choose all that apply.)

**A.** The first element is index 0.  
**B.** The first element is index 1.  
**C.** Arrays are fixed size.  
**D.** Arrays are immutable.  
**E.** Calling `equals()` on two different arrays containing the same primitive values always returns `true`.  
**F.** Calling `equals()` on two different arrays containing the same primitive values always returns `false`.  
**G.** Calling `equals()` on two different arrays containing the same primitive values can return `true` or `false`.

A, C, D

### 10. How many of these lines contain a compiler error? (Choose all that apply.)

```java
23: int one = Math.min(5, 3); // ok return un int
24: long two = Math.round(5.5); // ok return un long
25: double three = Math.floor(6.6); // ok return un double
26: var doubles = new double[] {one, two, three};
```

**A.** 0  
**B.** 1  
**C.** 2  
**D.** 3  
**E.** 4

A,


### 11. What is the output of the following code?

```java
var date = LocalDate.of(2022, 4, 3);
date.plusDays(2);
date.plusHours(3); // erreur
System.out.println(date.getYear() + " " + date.getMonth()
    + " " + date.getDayOfMonth());
```

**A.** 2022 MARCH 4  
**B.** 2022 MARCH 6  
**C.** 2022 APRIL 3  
**D.** 2022 APRIL 5  
**E.** The code does not compile.  
**F.** A runtime exception is thrown.

E,

### 12. What is output by the following code? (Choose all that apply.)

```java
var numbers = "012345678".indent(1);
numbers = numbers.stripLeading();
System.out.println(numbers.substring(1, 3));
System.out.println(numbers.substring(7, 7));
System.out.println(numbers.substring(7));
```

**A.** 12  
**B.** 123  
**C.** 7  
**D.** 78  
**E.** A blank line  
**F.** The code does not compile.  
**G.** An exception is thrown.

A, D
### 13. What is the result of the following code?

```java
public class Lion {
    public void roar(String roar1, StringBuilder roar2) {
        roar1.concat("!!!");
        roar2.append("!!!");
    }
    public static void main(String[] args) {
        var roar1 = "roar";
        var roar2 = new StringBuilder("roar");
        new Lion().roar(roar1, roar2);
        System.out.println(roar1 + " " + roar2);
    }
}
```

**A.** roar roar  
**B.** roar roar!!!  
**C.** roar!!! roar  
**D.** roar!!! roar!!!  
**E.** An exception is thrown.  
**F.** The code does not compile.

B,

### 14. Given the following, which can correctly fill in the blank? (Choose all that apply.)

```java
var date = LocalDate.now();
var time = LocalTime.now();
var dateTime = LocalDateTime.now();
var zoneId = ZoneId.systemDefault();
var zonedDateTime = ZonedDateTime.of(dateTime, zoneId);
Instant instant = _____________________________;
```

**A.** `Instant.now()`  
**B.** `new Instant()`  
**C.** `date.toInstant()`  
**D.** `dateTime.toInstant()`  
**E.** `time.toInstant()`  
**F.** `zonedDateTime.toInstant()`

A, 

### 15. What is the output of the following? (Choose all that apply.)

```java
var arr = new String[] { "PIG", "pig", "123"};
Arrays.sort(arr);
System.out.println(Arrays.toString(arr));
System.out.println(Arrays.binarySearch(arr, "Pippa"));
```

**A.** [pig, PIG, 123]  
**B.** [PIG, pig, 123]  
**C.** [123, PIG, pig]  
**D.** [123, pig, PIG]  
**E.** -3  
**F.** -2  
**G.** The results of binarySearch() are undefined in this example.

C, E

### 16. What is included in the output of the following code? (Choose all that apply.)

```java
var base = "ewe\nsheep\\t";
int length = base.length();
int indent = base.indent(2).length();
int translate = base.translateEscapes().length();

var formatted = "%s %s %s".formatted(length, indent, translate);
System.out.format(formatted);
```

**A.** 10  
**B.** 11  
**C.** 12  
**D.** 13  
**E.** 14  
**F.** 15  
**G.** 16

B, F, A

### 17. Which of these statements are true? (Choose all that apply.)

```java
var letters = new StringBuilder("abcdefg");
```

**A.** `letters.substring(1, 2)` returns a single-character String.  
**B.** `letters.substring(2, 2)` returns a single-character String.  
**C.** `letters.substring(6, 5)` returns a single-character String.  
**D.** `letters.substring(6, 6)` returns a single-character String.  
**E.** `letters.substring(1, 2)` throws an exception.  
**F.** `letters.substring(2, 2)` throws an exception.  
**G.** `letters.substring(6, 5)` throws an exception.  
**H.** `letters.substring(6, 6)` throws an exception.

A,G

### 18. What is the result of the following code? (Choose all that apply.)

```java
13: String s1 = """
14:     purr""";
15: String s2 = "";
16:
17: s1.toUpperCase();
18: s1.trim();
19: s1.substring(1, 3);
20: s1 += "two";
21:
22: s2 += 2;
23: s2 += 'c';
24: s2 += false;
25:
26: if ( s2 == "2cfalse") System.out.println("==");
27: if ( s2.equals("2cfalse")) System.out.println("equals");
28: System.out.println(s1.length());
```

**A.** 2  
**B.** 4  
**C.** 7  
**D.** 10  
**E.** ==  
**F.** equals  
**G.** An exception is thrown.  
**H.** The code does not compile.

C, F,

### 19. Which of the following fill in the blank to print a positive integer? (Choose all that apply.)

```java
String[] s1 = { "Camel", "Peacock", "Llama"};
String[] s2 = { "Camel", "Llama", "Peacock"};
String[] s3 = { "Camel"};
String[] s4 = { "Camel", null};
System.out.println(Arrays._____________________);
```

**A.** `compare(s1, s2)`  
**B.** `mismatch(s1, s2)`  
**C.** `compare(s3, s4)`  
**D.** `mismatch (s3, s4)`  
**E.** `compare(s4, s4)`  
**F.** `mismatch (s4, s4)`

A, B, D

### 20. Note that March 13, 2022 is the weekend that clocks spring ahead for daylight saving time. What is the output of the following? (Choose all that apply.)

```java
var date = LocalDate.of(2022, Month.MARCH, 13);
var time = LocalTime.of(1, 30);
var zone = ZoneId.of("US/Eastern");
var dateTime1 = ZonedDateTime.of(date, time, zone);
var dateTime2 = dateTime1.plus(1, ChronoUnit.HOURS);

long diff = ChronoUnit.HOURS.between(dateTime1, dateTime2);
int hour = dateTime2.getHour();
boolean offset = dateTime1.getOffset()
    == dateTime2.getOffset();
System.out.println("diff = " + diff);
System.out.println("hour = " + hour);
System.out.println("offset = " + offset);
```

**A.** diff = 1  
**B.** diff = 2  
**C.** hour = 2  
**D.** hour = 3  
**E.** offset = true  
**F.** The code does not compile.  
**G.** A runtime exception is thrown.

### 21. Which of the following can fill in the blank to print avaJ? (Choose all that apply.)

```java
3: var puzzle = new StringBuilder("Java");
4: puzzle._____________________;
5: System.out.println(puzzle);
```

**A.** `reverse()`  
**B.** `append("vaJ$").substring(0, 4)`  
**C.** `append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length() - 1)`  
**D.** `append("vaJ$").delete(0, 3).deleteCharAt(puzzle.length())`  
**E.** None of the above

A, C

### 22. What is the output of the following code?

```java
var date = LocalDate.of(2022, Month.APRIL, 30);
date.plusDays(2);
date.plusYears(3);
System.out.println(date.getYear() + " " + date.getMonth()
    + " " + date.getDayOfMonth());
```

**A.** 2022 APRIL 30  
**B.** 2022 MAY 2  
**C.** 2025 APRIL 2  
**D.** 2025 APRIL 30  
**E.** 2025 MAY 2  
**F.** The code does not compile.  
**G.** A runtime exception is thrown.

A,
# Lab 1.15 — String Manipulation

Seven parts and eight short methods in `StringLab.java`, most of them one
line. The instructions for each one are in the comment block directly above
the method, so read them there — this page is just the map.

Plan on 30 to 45 minutes.

## What you will practice

- Counting characters with `length()`.
- Joining values with `+`, strictly left to right, and watching a number turn
  into text on its own.
- Cutting a String with both forms of `substring`, where characters are
  numbered from 0 and the second argument is where you stop rather than the
  last character you keep.
- Searching with `indexOf`, including the `-1` it returns when the search
  fails.
- Comparing two Strings with `equals` and `compareTo` instead of `==`.
- Seeing that none of this ever changes the String you started with. A String
  object is immutable; every method hands back a new one.

## Getting started

1. Open this folder in your editor.
1. Open `src/main/java/StringLab.java`. That is the only file you change.
1. Work down the file. Each part is marked with a comment that starts with
   `TODO`; replace the placeholder line under it with your own code.

To run your program and see your output:

```sh
mvn -q compile exec:java
```

Your teacher will run a separate set of tests on your work when you turn it in.

## The parts

| Part | Method | What it is about |
| --- | --- | --- |
| 1 | `characterCount(String)` | `length()` |
| 2a | `pairLine(String, int, int)` | `+` joins left to right |
| 2b | `sumLine(String, int, int)` | parentheses change that order |
| 3 | `section(String, int, int)` | `substring(from, to)` stops before `to` |
| 4 | `ending(String, int)` | `substring(from)` runs to the end |
| 5 | `positionOf(String, String)` | `indexOf`, and `-1` for a miss |
| 6 | `alphabeticalOrder(String, String)` | the sign of `compareTo` |
| 7 | `sameText(String, String)` | `equals`, never `==` |

## Before you turn it in

- [ ] Every placeholder line under a `TODO` has been replaced with real code.
- [ ] `mvn -q compile exec:java` runs without errors.
- [ ] Parts 2a and 2b give different answers for the same three values. If they
      agree, check which one has the parentheses.
- [ ] Parts 3 and 4 return the value that `substring` gave back, not `text`.
      Calling `substring` and ignoring the result changes nothing, because a
      String can never be edited.
- [ ] Part 5 returns `-1` for a word that is not there, not `0`.
- [ ] Part 7 uses `equals`. Writing `==` can still print `true` for the
      literals in `main`, so check the code rather than trusting that output.
- [ ] You did not rename any method, change any parameter list, or change any
      return type. The grader compiles against those exact signatures, so a
      rename means a zero even if your logic is perfect.

`main` is not graded, so you may change it however you like.

## Optional extension, not graded

Add these to `main`, one at a time, and run them:

```java
String s = "hello";
System.out.println(s.substring(0, 5));
System.out.println(s.substring(0, 6));
```

The first line prints `hello`. The second one compiles, then crashes with
`StringIndexOutOfBoundsException`. Write one sentence saying what the largest
legal second argument is, and why that number is `length()` and not
`length() - 1`.

Then try this, and explain the two different answers in one more sentence:

```java
String a = "cat";
String b = new String("cat");
System.out.println(a == b);
System.out.println(a.equals(b));
```

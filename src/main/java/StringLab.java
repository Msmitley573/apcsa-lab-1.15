/**
 * AP CSA Lab 1.15 - String Manipulation
 *
 * Fill in the body of each method below. Do not rename anything, do not change
 * the parameter lists, and do not change the return types. The grader compiles
 * against these exact signatures.
 *
 * One idea runs through the whole lab: a String object is IMMUTABLE. Once it
 * exists, nothing can change the characters inside it. Every String method
 * hands you back a brand new String and leaves the original alone, so a method
 * call whose answer you do not store or return has done nothing at all.
 *
 * String s = "hello";
 * s.substring(0, 3); // builds "hel", then throws it away. s is "hello".
 * s = s.substring(0, 3); // now s refers to a different String: "hel"
 *
 * String lives in the package java.lang, which every program gets by default,
 * so nothing in this file needs an import statement.
 *
 * Run the program with: mvn -q compile exec:java
 * Or from your IDE, just run main.
 */
public class StringLab {
    // ---------------------------------------------------------------
    // PART 1: length() counts the characters
    //
    // Return the number of characters in text.
    //
    // length() is a METHOD, so it is always written with parentheses:
    // text.length(). It gives back an int.
    //
    // Example: characterCount("hello") is 5
    // Example: characterCount("GARDEN") is 6
    // Example: characterCount("") is 0, the empty String has no
    // characters in it
    //
    // Careful: spaces are characters too, so "Ada Lovelace" is 12, not 11.
    // ---------------------------------------------------------------
    public static int characterCount(String text)
    {
        // TODO Part 1: return the number of characters in text
        return text.length();
    }

    // ---------------------------------------------------------------
    // PART 2a: + joins left to right, one step at a time
    //
    // Return a String made of label, then a colon, then a space, then the two
    // numbers written one after the other.
    //
    // pairLine("total", 5, 2) is "total: 52"
    //
    // Yes, 52. Java works through a chain of + strictly LEFT TO RIGHT, and at
    // each + it asks one question: is either side already a String? If so the
    // two values are joined; if not, it is ordinary arithmetic.
    //
    // "total: " + 5 + 2 -> "total: 5" + 2 -> "total: 52"
    //
    // A number joined to a String is converted to a String for you. You never
    // write that conversion yourself; this is called implicit conversion.
    //
    // Example: pairLine("x" , 1, 2) is "x: 12"
    // Example: pairLine("sum", 10, 20) is "sum: 1020"
    // Example: pairLine("qty", 0, 0) is "qty: 00"
    //
    // Careful: write the colon and the single space exactly once, between the
    // label and the first number. Do not add parentheses around a + b here.
    // ---------------------------------------------------------------
    public static String pairLine(String label, int a, int b) {
        // TODO Part 2a: return label, then ": ", then a and b joined one
        // after the other
        return label + ": " + a + b;
    }

    // ---------------------------------------------------------------
    // PART 2b: parentheses are the only thing that changes the order
    //
    // Return a String made of label, then a colon, then a space, then the SUM
    // of the two numbers.
    //
    // sumLine("total", 5, 2) is "total: 7"
    //
    // Same label, same two numbers, same operator as Part 2a, and a different
    // answer. Parentheses force the addition to happen first, before anything
    // is joined to a String.
    //
    // "total: " + (5 + 2) -> "total: " + 7 -> "total: 7"
    //
    // Example: sumLine("x" , 1, 2) is "x: 3"
    // Example: sumLine("sum", 10, 20) is "sum: 30"
    // Example: sumLine("qty", 0, 0) is "qty: 0"
    //
    // Compare this with Part 2a. Same values, two different answers, and the
    // only difference is a pair of parentheses.
    // ---------------------------------------------------------------
    public static String sumLine(String label, int a, int b) {
        // TODO Part 2b: return label, then ": ", then the sum of a and b
        return label + ": " + (a + b);
    }

    // ---------------------------------------------------------------
    // PART 3: substring(from, to) stops BEFORE to
    //
    // Return the piece of text that begins at index from and stops just
    // before index to. That is exactly what substring(from, to) gives you.
    //
    // Characters in a String are numbered from 0, so the last character sits
    // at index length() - 1. Write the index line under the string before you
    // answer anything about it:
    //
    // h e l l o length() is 5
    // 0 1 2 3 4 the last index is 4
    //
    // The second argument is where you STOP, not the last character you keep,
    // so the result has to - from characters.
    //
    // Example: section("hello" , 1, 3) is "el", two characters, not three
    // Example: section("GARDEN", 0, 3) is "GAR"
    // Example: section("GARDEN", 2, 3) is "R", the single character at index 2
    // Example: section("GARDEN", 4, 4) is "", stopping where you started
    // gives the empty String
    //
    // Careful: substring returns a NEW String. Calling it and ignoring what
    // comes back leaves text exactly as it was, so make sure you return the
    // value of the call.
    // ---------------------------------------------------------------
    public static String section(String text, int from, int to) {
        // TODO Part 3: return the characters of text from index from up to
        // but not including index to
        return text.substring(from, to);
    }

    // ---------------------------------------------------------------
    // PART 4: substring(from) runs to the end
    //
    // Return everything in text from index from through the last character.
    //
    // The one-argument form is shorthand: substring(from) means exactly
    // substring(from, length()). You do not have to write the length yourself.
    //
    // Example: ending("hello" , 3) is "lo"
    // Example: ending("GARDEN", 3) is "DEN"
    // Example: ending("pencil", 5) is "l", the last character on its own
    // Example: ending("GARDEN", 6) is "", starting at length() is legal and
    // gives the empty String
    //
    // Careful: ending(text, 0) would hand back the whole String. If every one
    // of your answers is the whole String, you are returning text itself
    // instead of the value substring gave you.
    // ---------------------------------------------------------------
    public static String ending(String text, int from) {
        // TODO Part 4: return the characters of text from index from onward
        return text.substring(from);
    }

    // ---------------------------------------------------------------
    // PART 5: indexOf reports a position, and -1 for "not there"
    //
    // Return the index where target first appears inside text, or -1 if
    // target does not appear in text at all.
    //
    // text.indexOf(target) gives back an int: the index at which the FIRST
    // occurrence begins. It does not give back the matched text, and it is
    // not true or false. If the search fails it returns -1, which can never
    // be a real index, so there is no way to confuse a miss with a hit.
    //
    // Example: positionOf("abcabc" , "bc") is 1, only the first
    // occurrence is ever reported
    // Example: positionOf("hello" , "h") is 0, found at the very
    // front
    // Example: positionOf("Ada Lovelace", "Love") is 4
    // Example: positionOf("abcabc" , "z") is -1
    //
    // Careful: 0 and -1 mean opposite things. 0 means "found, right at the
    // start"; -1 means "not found anywhere". A miss is never 0.
    // ---------------------------------------------------------------
    public static int positionOf(String text, String target) {
        // TODO Part 5: return where target first appears in text, or -1
        return text.indexOf(target);
    }

    // ---------------------------------------------------------------
    // PART 6: compareTo, and reading only the SIGN
    //
    // Return the result of comparing a with b in alphabetical order, using
    // compareTo. Hand back what compareTo gives you, unchanged.
    //
    // compareTo returns an int, and only its sign is promised:
    //
    // negative a comes before b
    // zero a and b hold the same characters
    // positive a comes after b
    //
    // The exact size of the number is not something you should ever rely on,
    // so an answer that insists the result is exactly -1 or exactly 1 is
    // wrong. Read the sign.
    //
    // Example: alphabeticalOrder("apple" , "banana") is negative
    // Example: alphabeticalOrder("banana", "apple") is positive
    // Example: alphabeticalOrder("cat" , "cat") is zero
    // Example: alphabeticalOrder("cat" , "cats") is negative, the shorter
    // String comes first when one is the start of the other
    //
    // Careful: every uppercase letter comes before every lowercase letter, so
    // alphabeticalOrder("A", "a") is negative and alphabeticalOrder("Z", "a")
    // is negative too.
    // ---------------------------------------------------------------
    public static int alphabeticalOrder(String a, String b) {
        // TODO Part 6: return the comparison of a with b
        return a.compareTo(b);
    }

    // ---------------------------------------------------------------
    // PART 7: == is the wrong tool for Strings
    //
    // Return true when a and b hold the same characters in the same order,
    // and false otherwise.
    //
    // The method that answers that question is equals:
    //
    // a.equals(b)
    //
    // It compares the CHARACTERS, and it is case sensitive, so "red" and
    // "Red" are not equal.
    //
    // Do not write a == b. On two String variables, == asks a completely
    // different question: are these two variables pointing at the same one
    // object? Two separate String objects holding identical characters make
    // == false, so == can answer "different" about two Strings you can see
    // are the same. The rule for the whole course is absolute: compare
    // String content with equals, never with ==.
    //
    // Example: sameText("cat" , "cat") is true
    // Example: sameText("cat" , "dog") is false
    // Example: sameText("hello", "Hello") is false, equals is case sensitive
    // Example: sameText("abc" , "abcd") is false
    //
    // Careful: main will not catch this mistake for you. Both "cat" literals
    // in sameText("cat", "cat") are the same object, so even a == b prints
    // true there. Looking right on literals is exactly why == cannot be
    // trusted on Strings.
    // ---------------------------------------------------------------
    public static boolean sameText(String a, String b) {
        // TODO Part 7: return whether a and b hold the same characters
        return a.equals(b);
    }

    // ---------------------------------------------------------------
    // Run this to see your own work. The grader does not test main, so you
    // may change it freely while you experiment.
    // ---------------------------------------------------------------
    public static void main(String[] args) {
        System.out.println("characterCount(\"hello\")            = " + characterCount("hello"));
        System.out.println("pairLine(\"total\", 5, 2)            = " + pairLine("total", 5, 2));
        System.out.println("sumLine(\"total\", 5, 2)             = " + sumLine("total", 5, 2));
        System.out.println("section(\"hello\", 1, 3)             = " + section("hello", 1, 3));
        System.out.println("ending(\"GARDEN\", 3)                = " + ending("GARDEN", 3));
        System.out.println("positionOf(\"abcabc\", \"bc\")         = " + positionOf("abcabc", "bc"));
        System.out.println("positionOf(\"abcabc\", \"z\")          = " + positionOf("abcabc", "z"));
        System.out.println("alphabeticalOrder(\"apple\", \"pear\") = " + alphabeticalOrder("apple", "pear"));
        System.out.println("sameText(\"cat\", \"cat\")             = " + sameText("cat", "cat"));
    }
}

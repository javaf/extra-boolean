package io.github.javaf;
import java.util.regex.*;




/**
 * Boolean data type has two possible truth values to represent logic.<br>
 * 📦 <a href="https://search.maven.org/artifact/io.github.javaf/extra-boolean">Central</a>,
 * 📜 <a href="https://repo1.maven.org/maven2/io/github/javaf/extra-boolean/">Releases</a>,
 * 😺 <a href="https://github.com/javaf/hello-world/packages/579834">GitHub</a>,
 * 🐸 <a href="https://bintray.com/beta/#/bintray/jcenter/io.github.javaf:extra-boolean">Bintray</a>,
 * 🦚 <a href="https://mvnrepository.com/artifact/io.github.javaf/extra-boolean">MvnRepository</a>,
 * 📰 <a href="https://javaf.github.io/extra-boolean/">Javadoc</a>,
 * 📘 <a href="https://github.com/javaf/extra-boolean/wiki">Wiki</a>.
 */
public final class Boolean {

  // CONSTANTS
  private static final Pattern RFALSE =
    Pattern.compile("(negati|never|refus|wrong|fal|off)|\\b(f|n|0)\\b", Pattern.CASE_INSENSITIVE);

  private static final Pattern RNEGATE =
    Pattern.compile("\\b(nay|nah|no|dis|un|in)", Pattern.CASE_INSENSITIVE);



  // PARSE
  /**
   * Converts string to boolean.
   * <a href="https://github.com/javaf/extra-boolean/wiki/parse">📘</a>
   * @param s a string
   * @return result
   *<pre>{@code
   *parse("1")        == true
   *parse("truthy")   == true
   *parse("not off")  == true
   *parse("not true") == false
   *parse("inactive") == false
   *parse("disabled") == false
   *}</pre>
   */
  public static boolean parse(String s) {
    boolean f = RFALSE.matcher(s).find();
    boolean n = RNEGATE.matcher(s).results().count() % 2 == 1;
    return !(f ^ n);
  }




  // NOT, EQ, IMPLY, NIMPLY (FIXED)
  /**
   * Checks if value is false.
   * <a href="https://github.com/javaf/extra-boolean/wiki/not">📘</a>
   * @param a a boolean
   * @return result
   *<pre>{@code
   *not(false) == true
   *not(true)  == false
   *}</pre>
   */
  public static boolean not(boolean a) {
    return !a;
  }


  /**
   * Checks if antecedent ⇔ consequent (a ⇔ b).
   * <a href="https://github.com/javaf/extra-boolean/wiki/eq">📘</a>
   * @param a antecedent
   * @param b consequent
   * @return result
   *<pre>{@code
   *eq(true, true)   == true
   *eq(false, false) == true
   *eq(true, false)  == false
   *eq(false, true)  == false
   *}</pre>
   */
  public static boolean eq(boolean a, boolean b) {
    return a == b;
  }


  /**
   * Checks if antecedent ⇎ consequent (a ⇎ b).
   * <a href="https://github.com/javaf/extra-boolean/wiki/neq">📘</a>
   * @param a antecedent
   * @param b consequent
   * @return result
   *<pre>{@code
   *neq(true, false)  == true
   *neq(false, true)  == true
   *neq(true, true)   == false
   *neq(false, false) == false
   *}</pre>
   */
  public static boolean neq(boolean a, boolean b) {
    return !eq(a, b);
  }


  /**
   * Checks if antecedent ⇒ consequent (a ⇒ b).
   * <a href="https://github.com/javaf/extra-boolean/wiki/imply">📘</a>
   * @param a antecedent
   * @param b consequent
   * @return result
   *<pre>{@code
   *imply(true, true)   == true
   *imply(false, true)  == true
   *imply(false, false) == true
   *imply(true, false)  == false
   *}</pre>
   */
  public static boolean imply(boolean a, boolean b) {
    return !a || b;
  }


  /**
   * Checks if antecedent ⇏ consequent (a ⇏ b).
   * <a href="https://github.com/javaf/extra-boolean/wiki/nimply">📘</a>
   * @param a antecedent
   * @param b consequent
   * @return result
   *<pre>{@code
   *nimply(true, false)  == true
   *nimply(true, true)   == false
   *nimply(false, true)  == false
   *nimply(false, false) == false
   *}</pre>
   */
  public static boolean nimply(boolean a, boolean b) {
    return !imply(a, b);
  }




  // EQV, IMP (SHORTCUTS)
  /**
   * Checks if antecedent ⇔ consequent (a ⇔ b).
   * <a href="https://github.com/javaf/extra-boolean/wiki/eqv">📘</a>
   * @param a antecedent
   * @param b consequent
   * @return result
   *<pre>{@code
   *eqv(true, true)   == true
   *eqv(false, false) == true
   *eqv(true, false)  == false
   *eqv(false, true)  == false
   *}</pre>
   */
  public static boolean eqv(boolean a, boolean b) {
    return eq(a, b);
  }


  /**
   * Checks if antecedent ⇒ consequent (a ⇒ b).
   * <a href="https://github.com/javaf/extra-boolean/wiki/imp">📘</a>
   * @param a antecedent
   * @param b consequent
   * @return result
   *<pre>{@code
   *imp(true, true)   == true
   *imp(false, true)  == true
   *imp(false, false) == true
   *imp(true, false)  == false
   *}</pre>
   */
  public static boolean imp(boolean a, boolean b) {
    return imply(a, b);
  }




  // AND (VARIABLE)
  /**
   * Checks if all values are true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/and">📘</a>
   * @return result
   *<pre>{@code
   *and(true, true)              == true
   *and(true, false)             == false
   *and(true, true, true, true)  == true
   *and(true, false, true, true) == false
   *}</pre>
   */
  public static boolean and() {
    return true;
  }


  /**
   * Checks if all values are true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/and">📘</a>
   * @param a 1st boolean
   * @return result
   *<pre>{@code
   *and(true, true)              == true
   *and(true, false)             == false
   *and(true, true, true, true)  == true
   *and(true, false, true, true) == false
   *}</pre>
   */
  public static boolean and(boolean a) {
    return a;
  }


  /**
   * Checks if all values are true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/and">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @return result
   *<pre>{@code
   *and(true, true)              == true
   *and(true, false)             == false
   *and(true, true, true, true)  == true
   *and(true, false, true, true) == false
   *}</pre>
   */
  public static boolean and(boolean a, boolean b) {
    return a && b;
  }


  /**
   * Checks if all values are true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/and">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @return result
   *<pre>{@code
   *and(true, true)              == true
   *and(true, false)             == false
   *and(true, true, true, true)  == true
   *and(true, false, true, true) == false
   *}</pre>
   */
  public static boolean and(boolean a, boolean b, boolean c) {
    return a && b && c;
  }


  /**
   * Checks if all values are true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/and">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @return result
   *<pre>{@code
   *and(true, true)              == true
   *and(true, false)             == false
   *and(true, true, true, true)  == true
   *and(true, false, true, true) == false
   *}</pre>
   */
  public static boolean and(boolean a, boolean b, boolean c, boolean d) {
    return a && b && c && d;
  }


  /**
   * Checks if all values are true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/and">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @return result
   *<pre>{@code
   *and(true, true)              == true
   *and(true, false)             == false
   *and(true, true, true, true)  == true
   *and(true, false, true, true) == false
   *}</pre>
   */
  public static boolean and(boolean a, boolean b, boolean c, boolean d, boolean e) {
    return a && b && c && d && e;
  }


  /**
   * Checks if all values are true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/and">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @return result
   *<pre>{@code
   *and(true, true)              == true
   *and(true, false)             == false
   *and(true, true, true, true)  == true
   *and(true, false, true, true) == false
   *}</pre>
   */
  public static boolean and(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f) {
    return a && b && c && d && e && f;
  }


  /**
   * Checks if all values are true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/and">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @param g 7th boolean
   * @return result
   *<pre>{@code
   *and(true, true)              == true
   *and(true, false)             == false
   *and(true, true, true, true)  == true
   *and(true, false, true, true) == false
   *}</pre>
   */
  public static boolean and(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g) {
    return a && b && c && d && e && f && g;
  }


  /**
   * Checks if all values are true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/and">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @param g 7th boolean
   * @param h 8th boolean
   * @return result
   *<pre>{@code
   *and(true, true)              == true
   *and(true, false)             == false
   *and(true, true, true, true)  == true
   *and(true, false, true, true) == false
   *}</pre>
   */
  public static boolean and(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g, boolean h) {
    return a && b && c && d && e && f && g && h;
  }




  // OR (VARIABLE)
  /**
   * Checks if any value is true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/or">📘</a>
   * @return result
   *<pre>{@code
   *or(true, false)                == true
   *or(false, false)               == false
   *or(false, true, false, true)   == true
   *or(false, false, false, false) == false
   *}</pre>
   */
  public static boolean or() {
    return false;
  }


  /**
   * Checks if any value is true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/or">📘</a>
   * @param a 1st boolean
   * @return result
   *<pre>{@code
   *or(true, false)                == true
   *or(false, false)               == false
   *or(false, true, false, true)   == true
   *or(false, false, false, false) == false
   *}</pre>
   */
  public static boolean or(boolean a) {
    return a;
  }


  /**
   * Checks if any value is true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/or">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @return result
   *<pre>{@code
   *or(true, false)                == true
   *or(false, false)               == false
   *or(false, true, false, true)   == true
   *or(false, false, false, false) == false
   *}</pre>
   */
  public static boolean or(boolean a, boolean b) {
    return a || b;
  }


  /**
   * Checks if any value is true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/or">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @return result
   *<pre>{@code
   *or(true, false)                == true
   *or(false, false)               == false
   *or(false, true, false, true)   == true
   *or(false, false, false, false) == false
   *}</pre>
   */
  public static boolean or(boolean a, boolean b, boolean c) {
    return a || b || c;
  }


  /**
   * Checks if any value is true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/or">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @return result
   *<pre>{@code
   *or(true, false)                == true
   *or(false, false)               == false
   *or(false, true, false, true)   == true
   *or(false, false, false, false) == false
   *}</pre>
   */
  public static boolean or(boolean a, boolean b, boolean c, boolean d) {
    return a || b || c || d;
  }


  /**
   * Checks if any value is true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/or">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @return result
   *<pre>{@code
   *or(true, false)                == true
   *or(false, false)               == false
   *or(false, true, false, true)   == true
   *or(false, false, false, false) == false
   *}</pre>
   */
  public static boolean or(boolean a, boolean b, boolean c, boolean d, boolean e) {
    return a || b || c || d || e;
  }


  /**
   * Checks if any value is true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/or">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @return result
   *<pre>{@code
   *or(true, false)                == true
   *or(false, false)               == false
   *or(false, true, false, true)   == true
   *or(false, false, false, false) == false
   *}</pre>
   */
  public static boolean or(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f) {
    return a || b || c || d || e || f;
  }


  /**
   * Checks if any value is true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/or">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @param g 7th boolean
   * @return result
   *<pre>{@code
   *or(true, false)                == true
   *or(false, false)               == false
   *or(false, true, false, true)   == true
   *or(false, false, false, false) == false
   *}</pre>
   */
  public static boolean or(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g) {
    return a || b || c || d || e || f || g;
  }


  /**
   * Checks if any value is true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/or">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @param g 7th boolean
   * @param h 8th boolean
   * @return result
   *<pre>{@code
   *or(true, false)                == true
   *or(false, false)               == false
   *or(false, true, false, true)   == true
   *or(false, false, false, false) == false
   *}</pre>
   */
  public static boolean or(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g, boolean h) {
    return a || b || c || d || e || f || g || h;
  }




  // XOR (VARIABLE)
  /**
   * Checks if odd no. of values are true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/xor">📘</a>
   * @return result
   *<pre>{@code
   *xor(true, false)             == true
   *xor(true, true)              == false
   *xor(true, true, true, false) == true
   *xor(true, true, true, true)  == false
   *}</pre>
   */
  public static boolean xor() {
    return false;
  }


  /**
   * Checks if odd no. of values are true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/xor">📘</a>
   * @param a 1st boolean
   * @return result
   *<pre>{@code
   *xor(true, false)             == true
   *xor(true, true)              == false
   *xor(true, true, true, false) == true
   *xor(true, true, true, true)  == false
   *}</pre>
   */
  public static boolean xor(boolean a) {
    return a;
  }


  /**
   * Checks if odd no. of values are true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/xor">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @return result
   *<pre>{@code
   *xor(true, false)             == true
   *xor(true, true)              == false
   *xor(true, true, true, false) == true
   *xor(true, true, true, true)  == false
   *}</pre>
   */
  public static boolean xor(boolean a, boolean b) {
    return a ^ b;
  }


  /**
   * Checks if odd no. of values are true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/xor">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @return result
   *<pre>{@code
   *xor(true, false)             == true
   *xor(true, true)              == false
   *xor(true, true, true, false) == true
   *xor(true, true, true, true)  == false
   *}</pre>
   */
  public static boolean xor(boolean a, boolean b, boolean c) {
    return a ^ b ^ c;
  }


  /**
   * Checks if odd no. of values are true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/xor">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @return result
   *<pre>{@code
   *xor(true, false)             == true
   *xor(true, true)              == false
   *xor(true, true, true, false) == true
   *xor(true, true, true, true)  == false
   *}</pre>
   */
  public static boolean xor(boolean a, boolean b, boolean c, boolean d) {
    return a ^ b ^ c ^ d;
  }


  /**
   * Checks if odd no. of values are true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/xor">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @return result
   *<pre>{@code
   *xor(true, false)             == true
   *xor(true, true)              == false
   *xor(true, true, true, false) == true
   *xor(true, true, true, true)  == false
   *}</pre>
   */
  public static boolean xor(boolean a, boolean b, boolean c, boolean d, boolean e) {
    return a ^ b ^ c ^ d ^ e;
  }


  /**
   * Checks if odd no. of values are true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/xor">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @return result
   *<pre>{@code
   *xor(true, false)             == true
   *xor(true, true)              == false
   *xor(true, true, true, false) == true
   *xor(true, true, true, true)  == false
   *}</pre>
   */
  public static boolean xor(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f) {
    return a ^ b ^ c ^ d ^ e ^ f;
  }


  /**
   * Checks if odd no. of values are true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/xor">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @param g 7th boolean
   * @return result
   *<pre>{@code
   *xor(true, false)             == true
   *xor(true, true)              == false
   *xor(true, true, true, false) == true
   *xor(true, true, true, true)  == false
   *}</pre>
   */
  public static boolean xor(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g) {
    return a ^ b ^ c ^ d ^ e ^ f ^ g;
  }


  /**
   * Checks if odd no. of values are true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/xor">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @param g 7th boolean
   * @param h 8th boolean
   * @return result
   *<pre>{@code
   *xor(true, false)             == true
   *xor(true, true)              == false
   *xor(true, true, true, false) == true
   *xor(true, true, true, true)  == false
   *}</pre>
   */
  public static boolean xor(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g, boolean h) {
    return a ^ b ^ c ^ d ^ e ^ f ^ g ^ h;
  }




  // COUNT (VARIABLE)
  /**
   * Counts no. of true values.
   * <a href="https://github.com/javaf/extra-boolean/wiki/count">📘</a>
   * @return result
   *<pre>{@code
   *count(true, true)                == 2
   *count(true, false)               == 1
   *count(true, true, true, false)   == 3
   *count(false, true, false, false) == 1
   *}</pre>
   */
  public static int count() {
    return 0;
  }


  /**
   * Counts no. of true values.
   * <a href="https://github.com/javaf/extra-boolean/wiki/count">📘</a>
   * @param a 1st boolean
   * @return result
   *<pre>{@code
   *count(true, true)                == 2
   *count(true, false)               == 1
   *count(true, true, true, false)   == 3
   *count(false, true, false, false) == 1
   *}</pre>
   */
  public static int count(boolean a) {
    return a? 1 : 0;
  }


  /**
   * Counts no. of true values.
   * <a href="https://github.com/javaf/extra-boolean/wiki/count">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @return result
   *<pre>{@code
   *count(true, true)                == 2
   *count(true, false)               == 1
   *count(true, true, true, false)   == 3
   *count(false, true, false, false) == 1
   *}</pre>
   */
  public static int count(boolean a, boolean b) {
    return count(a) + count(b);
  }


  /**
   * Counts no. of true values.
   * <a href="https://github.com/javaf/extra-boolean/wiki/count">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @return result
   *<pre>{@code
   *count(true, true)                == 2
   *count(true, false)               == 1
   *count(true, true, true, false)   == 3
   *count(false, true, false, false) == 1
   *}</pre>
   */
  public static int count(boolean a, boolean b, boolean c) {
    return count(a, b) + count(c);
  }


  /**
   * Counts no. of true values.
   * <a href="https://github.com/javaf/extra-boolean/wiki/count">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @return result
   *<pre>{@code
   *count(true, true)                == 2
   *count(true, false)               == 1
   *count(true, true, true, false)   == 3
   *count(false, true, false, false) == 1
   *}</pre>
   */
  public static int count(boolean a, boolean b, boolean c, boolean d) {
    return count(a, b) + count(c, d);
  }


  /**
   * Counts no. of true values.
   * <a href="https://github.com/javaf/extra-boolean/wiki/count">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @return result
   *<pre>{@code
   *count(true, true)                == 2
   *count(true, false)               == 1
   *count(true, true, true, false)   == 3
   *count(false, true, false, false) == 1
   *}</pre>
   */
  public static int count(boolean a, boolean b, boolean c, boolean d, boolean e) {
    return count(a, b, c, d) + count(e);
  }


  /**
   * Counts no. of true values.
   * <a href="https://github.com/javaf/extra-boolean/wiki/count">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @return result
   *<pre>{@code
   *count(true, true)                == 2
   *count(true, false)               == 1
   *count(true, true, true, false)   == 3
   *count(false, true, false, false) == 1
   *}</pre>
   */
  public static int count(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f) {
    return count(a, b, c, d) + count(e, f);
  }


  /**
   * Counts no. of true values.
   * <a href="https://github.com/javaf/extra-boolean/wiki/count">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @param g 7th boolean
   * @return result
   *<pre>{@code
   *count(true, true)                == 2
   *count(true, false)               == 1
   *count(true, true, true, false)   == 3
   *count(false, true, false, false) == 1
   *}</pre>
   */
  public static int count(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g) {
    return count(a, b, c, d) + count(e, f, g);
  }


  /**
   * Counts no. of true values.
   * <a href="https://github.com/javaf/extra-boolean/wiki/count">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @param g 7th boolean
   * @param h 8th boolean
   * @return result
   *<pre>{@code
   *count(true, true)                == 2
   *count(true, false)               == 1
   *count(true, true, true, false)   == 3
   *count(false, true, false, false) == 1
   *}</pre>
   */
  public static int count(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g, boolean h) {
    return count(a, b, c, d) + count(e, f, g, h);
  }




  // NAND (VARIABLE)
  /**
   * Checks if any value is false.
   * <a href="https://github.com/javaf/extra-boolean/wiki/nand">📘</a>
   * @return result
   *<pre>{@code
   *nand(true, false)             == true
   *nand(true, true)              == false
   *nand(true, true, false, true) == true
   *nand(true, true, true, true)  == false
   *}</pre>
   */
  public static boolean nand() {
    return !and();
  }


  /**
   * Checks if any value is false.
   * <a href="https://github.com/javaf/extra-boolean/wiki/nand">📘</a>
   * @param a 1st boolean
   * @return result
   *<pre>{@code
   *nand(true, false)             == true
   *nand(true, true)              == false
   *nand(true, true, false, true) == true
   *nand(true, true, true, true)  == false
   *}</pre>
   */
  public static boolean nand(boolean a) {
    return !and(a);
  }


  /**
   * Checks if any value is false.
   * <a href="https://github.com/javaf/extra-boolean/wiki/nand">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @return result
   *<pre>{@code
   *nand(true, false)             == true
   *nand(true, true)              == false
   *nand(true, true, false, true) == true
   *nand(true, true, true, true)  == false
   *}</pre>
   */
  public static boolean nand(boolean a, boolean b) {
    return !and(a, b);
  }


  /**
   * Checks if any value is false.
   * <a href="https://github.com/javaf/extra-boolean/wiki/nand">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @return result
   *<pre>{@code
   *nand(true, false)             == true
   *nand(true, true)              == false
   *nand(true, true, false, true) == true
   *nand(true, true, true, true)  == false
   *}</pre>
   */
  public static boolean nand(boolean a, boolean b, boolean c) {
    return !and(a, b, c);
  }


  /**
   * Checks if any value is false.
   * <a href="https://github.com/javaf/extra-boolean/wiki/nand">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @return result
   *<pre>{@code
   *nand(true, false)             == true
   *nand(true, true)              == false
   *nand(true, true, false, true) == true
   *nand(true, true, true, true)  == false
   *}</pre>
   */
  public static boolean nand(boolean a, boolean b, boolean c, boolean d) {
    return !and(a, b, c, d);
  }


  /**
   * Checks if any value is false.
   * <a href="https://github.com/javaf/extra-boolean/wiki/nand">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @return result
   *<pre>{@code
   *nand(true, false)             == true
   *nand(true, true)              == false
   *nand(true, true, false, true) == true
   *nand(true, true, true, true)  == false
   *}</pre>
   */
  public static boolean nand(boolean a, boolean b, boolean c, boolean d, boolean e) {
    return !and(a, b, c, d, e);
  }


  /**
   * Checks if any value is false.
   * <a href="https://github.com/javaf/extra-boolean/wiki/nand">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @return result
   *<pre>{@code
   *nand(true, false)             == true
   *nand(true, true)              == false
   *nand(true, true, false, true) == true
   *nand(true, true, true, true)  == false
   *}</pre>
   */
  public static boolean nand(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f) {
    return !and(a, b, c, d, e, f);
  }


  /**
   * Checks if any value is false.
   * <a href="https://github.com/javaf/extra-boolean/wiki/nand">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @param g 7th boolean
   * @return result
   *<pre>{@code
   *nand(true, false)             == true
   *nand(true, true)              == false
   *nand(true, true, false, true) == true
   *nand(true, true, true, true)  == false
   *}</pre>
   */
  public static boolean nand(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g) {
    return !and(a, b, c, d, e, f, g);
  }


  /**
   * Checks if any value is false.
   * <a href="https://github.com/javaf/extra-boolean/wiki/nand">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @param g 7th boolean
   * @param h 8th boolean
   * @return result
   *<pre>{@code
   *nand(true, false)             == true
   *nand(true, true)              == false
   *nand(true, true, false, true) == true
   *nand(true, true, true, true)  == false
   *}</pre>
   */
  public static boolean nand(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g, boolean h) {
    return !and(a, b, c, d, e, f, g, h);
  }




  // NOR (VARIABLE)
  /**
   * Checks if all values are false.
   * <a href="https://github.com/javaf/extra-boolean/wiki/nor">📘</a>
   * @return result
   *<pre>{@code
   *nor(false, false)               == true
   *nor(true, false)                == false
   *nor(false, false, false, false) == true
   *nor(false, false, true, false)  == false
   *}</pre>
   */
  public static boolean nor() {
    return !or();
  }


  /**
   * Checks if all values are false.
   * <a href="https://github.com/javaf/extra-boolean/wiki/nor">📘</a>
   * @param a 1st boolean
   * @return result
   *<pre>{@code
   *nor(false, false)               == true
   *nor(true, false)                == false
   *nor(false, false, false, false) == true
   *nor(false, false, true, false)  == false
   *}</pre>
   */
  public static boolean nor(boolean a) {
    return !or(a);
  }


  /**
   * Checks if all values are false.
   * <a href="https://github.com/javaf/extra-boolean/wiki/nor">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @return result
   *<pre>{@code
   *nor(false, false)               == true
   *nor(true, false)                == false
   *nor(false, false, false, false) == true
   *nor(false, false, true, false)  == false
   *}</pre>
   */
  public static boolean nor(boolean a, boolean b) {
    return !or(a, b);
  }


  /**
   * Checks if all values are false.
   * <a href="https://github.com/javaf/extra-boolean/wiki/nor">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @return result
   *<pre>{@code
   *nor(false, false)               == true
   *nor(true, false)                == false
   *nor(false, false, false, false) == true
   *nor(false, false, true, false)  == false
   *}</pre>
   */
  public static boolean nor(boolean a, boolean b, boolean c) {
    return !or(a, b, c);
  }


  /**
   * Checks if all values are false.
   * <a href="https://github.com/javaf/extra-boolean/wiki/nor">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @return result
   *<pre>{@code
   *nor(false, false)               == true
   *nor(true, false)                == false
   *nor(false, false, false, false) == true
   *nor(false, false, true, false)  == false
   *}</pre>
   */
  public static boolean nor(boolean a, boolean b, boolean c, boolean d) {
    return !or(a, b, c, d);
  }


  /**
   * Checks if all values are false.
   * <a href="https://github.com/javaf/extra-boolean/wiki/nor">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @return result
   *<pre>{@code
   *nor(false, false)               == true
   *nor(true, false)                == false
   *nor(false, false, false, false) == true
   *nor(false, false, true, false)  == false
   *}</pre>
   */
  public static boolean nor(boolean a, boolean b, boolean c, boolean d, boolean e) {
    return !or(a, b, c, d, e);
  }


  /**
   * Checks if all values are false.
   * <a href="https://github.com/javaf/extra-boolean/wiki/nor">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @return result
   *<pre>{@code
   *nor(false, false)               == true
   *nor(true, false)                == false
   *nor(false, false, false, false) == true
   *nor(false, false, true, false)  == false
   *}</pre>
   */
  public static boolean nor(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f) {
    return !or(a, b, c, d, e, f);
  }


  /**
   * Checks if all values are false.
   * <a href="https://github.com/javaf/extra-boolean/wiki/nor">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @param g 7th boolean
   * @return result
   *<pre>{@code
   *nor(false, false)               == true
   *nor(true, false)                == false
   *nor(false, false, false, false) == true
   *nor(false, false, true, false)  == false
   *}</pre>
   */
  public static boolean nor(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g) {
    return !or(a, b, c, d, e, f, g);
  }


  /**
   * Checks if all values are false.
   * <a href="https://github.com/javaf/extra-boolean/wiki/nor">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @param g 7th boolean
   * @param h 8th boolean
   * @return result
   *<pre>{@code
   *nor(false, false)               == true
   *nor(true, false)                == false
   *nor(false, false, false, false) == true
   *nor(false, false, true, false)  == false
   *}</pre>
   */
  public static boolean nor(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g, boolean h) {
    return !or(a, b, c, d, e, f, g, h);
  }




  // XNOR (VARIABLE)
  /**
   * Checks if even no. of values are true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/xnor">📘</a>
   * @return result
   *<pre>{@code
   *xnor(true, true)               == true
   *xnor(false, true)              == false
   *xnor(true, true, false, false) == true
   *xnor(true, true, true, false)  == false
   *}</pre>
   */
  public static boolean xnor() {
    return !xor();
  }


  /**
   * Checks if even no. of values are true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/xnor">📘</a>
   * @param a 1st boolean
   * @return result
   *<pre>{@code
   *xnor(true, true)               == true
   *xnor(false, true)              == false
   *xnor(true, true, false, false) == true
   *xnor(true, true, true, false)  == false
   *}</pre>
   */
  public static boolean xnor(boolean a) {
    return !xor(a);
  }


  /**
   * Checks if even no. of values are true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/xnor">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @return result
   *<pre>{@code
   *xnor(true, true)               == true
   *xnor(false, true)              == false
   *xnor(true, true, false, false) == true
   *xnor(true, true, true, false)  == false
   *}</pre>
   */
  public static boolean xnor(boolean a, boolean b) {
    return !xor(a, b);
  }


  /**
   * Checks if even no. of values are true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/xnor">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @return result
   *<pre>{@code
   *xnor(true, true)               == true
   *xnor(false, true)              == false
   *xnor(true, true, false, false) == true
   *xnor(true, true, true, false)  == false
   *}</pre>
   */
  public static boolean xnor(boolean a, boolean b, boolean c) {
    return !xor(a, b, c);
  }


  /**
   * Checks if even no. of values are true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/xnor">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @return result
   *<pre>{@code
   *xnor(true, true)               == true
   *xnor(false, true)              == false
   *xnor(true, true, false, false) == true
   *xnor(true, true, true, false)  == false
   *}</pre>
   */
  public static boolean xnor(boolean a, boolean b, boolean c, boolean d) {
    return !xor(a, b, c, d);
  }


  /**
   * Checks if even no. of values are true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/xnor">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @return result
   *<pre>{@code
   *xnor(true, true)               == true
   *xnor(false, true)              == false
   *xnor(true, true, false, false) == true
   *xnor(true, true, true, false)  == false
   *}</pre>
   */
  public static boolean xnor(boolean a, boolean b, boolean c, boolean d, boolean e) {
    return !xor(a, b, c, d, e);
  }


  /**
   * Checks if even no. of values are true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/xnor">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @return result
   *<pre>{@code
   *xnor(true, true)               == true
   *xnor(false, true)              == false
   *xnor(true, true, false, false) == true
   *xnor(true, true, true, false)  == false
   *}</pre>
   */
  public static boolean xnor(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f) {
    return !xor(a, b, c, d, e, f);
  }


  /**
   * Checks if even no. of values are true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/xnor">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @param g 7th boolean
   * @return result
   *<pre>{@code
   *xnor(true, true)               == true
   *xnor(false, true)              == false
   *xnor(true, true, false, false) == true
   *xnor(true, true, true, false)  == false
   *}</pre>
   */
  public static boolean xnor(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g) {
    return !xor(a, b, c, d, e, f, g);
  }


  /**
   * Checks if even no. of values are true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/xnor">📘</a>
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @param g 7th boolean
   * @param h 8th boolean
   * @return result
   *<pre>{@code
   *xnor(true, true)               == true
   *xnor(false, true)              == false
   *xnor(true, true, false, false) == true
   *xnor(true, true, true, false)  == false
   *}</pre>
   */
  public static boolean xnor(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g, boolean h) {
    return !xor(a, b, c, d, e, f, g, h);
  }




  // SELECT (VARIABLE)
  /**
   * Checks if ith value is true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/select">📘</a>
   * @param i index
   * @return result
   *<pre>{@code
   *select(0, true, false)              == true
   *select(1, true, false)              == false
   *select(1, true, true, false, false) == true
   *select(2, true, true, false, false) == false
   *}</pre>
   */
  public static boolean select(int i) {
    return false;
  }


  /**
   * Checks if ith value is true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/select">📘</a>
   * @param i index
   * @param a 1st boolean
   * @return result
   *<pre>{@code
   *select(0, true, false)              == true
   *select(1, true, false)              == false
   *select(1, true, true, false, false) == true
   *select(2, true, true, false, false) == false
   *}</pre>
   */
  public static boolean select(int i, boolean a) {
    switch (i) {
      case 0: return a;
      default: return false;
    }
  }


  /**
   * Checks if ith value is true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/select">📘</a>
   * @param i index
   * @param a 1st boolean
   * @param b 2nd boolean
   * @return result
   *<pre>{@code
   *select(0, true, false)              == true
   *select(1, true, false)              == false
   *select(1, true, true, false, false) == true
   *select(2, true, true, false, false) == false
   *}</pre>
   */
  public static boolean select(int i, boolean a, boolean b) {
    switch (i) {
      case 0: return a;
      case 1: return b;
      default: return false;
    }
  }


  /**
   * Checks if ith value is true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/select">📘</a>
   * @param i index
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @return result
   *<pre>{@code
   *select(0, true, false)              == true
   *select(1, true, false)              == false
   *select(1, true, true, false, false) == true
   *select(2, true, true, false, false) == false
   *}</pre>
   */
  public static boolean select(int i, boolean a, boolean b, boolean c) {
    switch (i) {
      case 0: return a;
      case 1: return b;
      case 2: return c;
      default: return false;
    }
  }


  /**
   * Checks if ith value is true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/select">📘</a>
   * @param i index
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @return result
   *<pre>{@code
   *select(0, true, false)              == true
   *select(1, true, false)              == false
   *select(1, true, true, false, false) == true
   *select(2, true, true, false, false) == false
   *}</pre>
   */
  public static boolean select(int i, boolean a, boolean b, boolean c, boolean d) {
    switch (i) {
      case 0: return a;
      case 1: return b;
      case 2: return c;
      case 3: return d;
      default: return false;
    }
  }


  /**
   * Checks if ith value is true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/select">📘</a>
   * @param i index
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @return result
   *<pre>{@code
   *select(0, true, false)              == true
   *select(1, true, false)              == false
   *select(1, true, true, false, false) == true
   *select(2, true, true, false, false) == false
   *}</pre>
   */
  public static boolean select(int i, boolean a, boolean b, boolean c, boolean d, boolean e) {
    switch (i) {
      case 0: return a;
      case 1: return b;
      case 2: return c;
      case 3: return d;
      case 4: return e;
      default: return false;
    }
  }


  /**
   * Checks if ith value is true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/select">📘</a>
   * @param i index
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @return result
   *<pre>{@code
   *select(0, true, false)              == true
   *select(1, true, false)              == false
   *select(1, true, true, false, false) == true
   *select(2, true, true, false, false) == false
   *}</pre>
   */
  public static boolean select(int i, boolean a, boolean b, boolean c, boolean d, boolean e, boolean f) {
    switch (i) {
      case 0: return a;
      case 1: return b;
      case 2: return c;
      case 3: return d;
      case 4: return e;
      case 5: return f;
      default: return false;
    }
  }


  /**
   * Checks if ith value is true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/select">📘</a>
   * @param i index
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @param g 7th boolean
   * @return result
   *<pre>{@code
   *select(0, true, false)              == true
   *select(1, true, false)              == false
   *select(1, true, true, false, false) == true
   *select(2, true, true, false, false) == false
   *}</pre>
   */
  public static boolean select(int i, boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g) {
    switch (i) {
      case 0: return a;
      case 1: return b;
      case 2: return c;
      case 3: return d;
      case 4: return e;
      case 5: return f;
      case 6: return g;
      default: return false;
    }
  }


  /**
   * Checks if ith value is true.
   * <a href="https://github.com/javaf/extra-boolean/wiki/select">📘</a>
   * @param i index
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @param g 7th boolean
   * @param h 8th boolean
   * @return result
   *<pre>{@code
   *select(0, true, false)              == true
   *select(1, true, false)              == false
   *select(1, true, true, false, false) == true
   *select(2, true, true, false, false) == false
   *}</pre>
   */
  public static boolean select(int i, boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g, boolean h) {
    switch (i) {
      case 0: return a;
      case 1: return b;
      case 2: return c;
      case 3: return d;
      case 4: return e;
      case 5: return f;
      case 6: return g;
      case 7: return h;
      default: return false;
    }
  }
}

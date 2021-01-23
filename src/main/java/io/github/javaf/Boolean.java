package io.github.javaf;
import java.util.regex.*;




/**
 * Boolean data type has two possible truth values to represent logic.
 */
public final class Boolean {

  // CONSTANTS
  private static final Pattern RFALSE =
    Pattern.compile("(negati|never|refus|wrong|fal|off)|\\b(f|n|0)\\b", Pattern.CASE_INSENSITIVE);

  private static final Pattern RNEGATE =
    Pattern.compile("\\b(nay|nah|no|dis|un|in)", Pattern.CASE_INSENSITIVE);



  /**
   * Convert string to boolean.
   * @param s a string
   * @return boolean
   */
  public static boolean parse(String s) {
    boolean f = RFALSE.matcher(s).find();
    boolean n = RNEGATE.matcher(s).results().count() % 2 == 1;
    return !(f ^ n);
  }




  // NOT, EQ, IMPLY, NIMPLY (FIXED)
  /**
   * Check if value is false.
   * @param a a boolean
   * @return
   */
  public static boolean not(boolean a) {
    return !a;
  }


  /**
   * Check if antecedent ⇔ consequent (a ⇔ b).
   * @param a antecedent
   * @param b consequent
   * @return
   */
  public static boolean eq(boolean a, boolean b) {
    return xnor(a, b);
  }


  /**
   * Check if antecedent ⇒ consequent (a ⇒ b).
   * @param a antecedent
   * @param b consequent
   * @return
   */
  public static boolean imply(boolean a, boolean b) {
    return !a || b;
  }


  /**
   * Check if antecedent ⇏ consequent (a ⇏ b).
   * @param a antecedent
   * @param b consequent
   * @return
   */
  public static boolean nimply(boolean a, boolean b) {
    return !imply(a, b);
  }




  // EQV, IMP (SHORTCUTS)
  /**
   * Check if antecedent ⇔ consequent (a ⇔ b).
   * @param a antecedent
   * @param b consequent
   * @return
   */
  public static boolean eqv(boolean a, boolean b) {
    return eq(a, b);
  }


  /**
   * Check if antecedent ⇒ consequent (a ⇒ b).
   * @param a antecedent
   * @param b consequent
   * @return
   */
  public static boolean imp(boolean a, boolean b) {
    return imply(a, b);
  }




  // AND (VARIABLE)
  /**
   * Check if all values are true.
   * @return
   */
  public static boolean and() {
    return true;
  }


  /**
   * Check if all values are true.
   * @param a 1st boolean
   * @return
   */
  public static boolean and(boolean a) {
    return a;
  }


  /**
   * Check if all values are true.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @return
   */
  public static boolean and(boolean a, boolean b) {
    return a && b;
  }


  /**
   * Check if all values are true.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @return
   */
  public static boolean and(boolean a, boolean b, boolean c) {
    return a && b && c;
  }


  /**
   * Check if all values are true.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @return
   */
  public static boolean and(boolean a, boolean b, boolean c, boolean d) {
    return a && b && c && d;
  }


  /**
   * Check if all values are true.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @return
   */
  public static boolean and(boolean a, boolean b, boolean c, boolean d, boolean e) {
    return a && b && c && d && e;
  }


  /**
   * Check if all values are true.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @return
   */
  public static boolean and(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f) {
    return a && b && c && d && e && f;
  }


  /**
   * Check if all values are true.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @param g 7th boolean
   * @return
   */
  public static boolean and(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g) {
    return a && b && c && d && e && f && g;
  }


  /**
   * Check if all values are true.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @param g 7th boolean
   * @param h 8th boolean
   * @return
   */
  public static boolean and(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g, boolean h) {
    return a && b && c && d && e && f && g && h;
  }




  // OR (VARIABLE)
  /**
   * Check if any value is true.
   * @return
   */
  public static boolean or() {
    return false;
  }


  /**
   * Check if any value is true.
   * @param a 1st boolean
   * @return
   */
  public static boolean or(boolean a) {
    return a;
  }


  /**
   * Check if any value is true.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @return
   */
  public static boolean or(boolean a, boolean b) {
    return a || b;
  }


  /**
   * Check if any value is true.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @return
   */
  public static boolean or(boolean a, boolean b, boolean c) {
    return a || b || c;
  }


  /**
   * Check if any value is true.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @return
   */
  public static boolean or(boolean a, boolean b, boolean c, boolean d) {
    return a || b || c || d;
  }


  /**
   * Check if any value is true.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @return
   */
  public static boolean or(boolean a, boolean b, boolean c, boolean d, boolean e) {
    return a || b || c || d || e;
  }


  /**
   * Check if any value is true.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @return
   */
  public static boolean or(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f) {
    return a || b || c || d || e || f;
  }


  /**
   * Check if any value is true.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @param g 7th boolean
   * @return
   */
  public static boolean or(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g) {
    return a || b || c || d || e || f || g;
  }


  /**
   * Check if any value is true.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @param g 7th boolean
   * @param h 8th boolean
   * @return
   */
  public static boolean or(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g, boolean h) {
    return a || b || c || d || e || f || g || h;
  }




  // XOR (VARIABLE)
  /**
   * Check if odd no. of values are true.
   * @return
   */
  public static boolean xor() {
    return false;
  }


  /**
   * Check if odd no. of values are true.
   * @param a 1st boolean
   * @return
   */
  public static boolean xor(boolean a) {
    return a;
  }


  /**
   * Check if odd no. of values are true.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @return
   */
  public static boolean xor(boolean a, boolean b) {
    return a ^ b;
  }


  /**
   * Check if odd no. of values are true.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @return
   */
  public static boolean xor(boolean a, boolean b, boolean c) {
    return a ^ b ^ c;
  }


  /**
   * Check if odd no. of values are true.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @return
   */
  public static boolean xor(boolean a, boolean b, boolean c, boolean d) {
    return a ^ b ^ c ^ d;
  }


  /**
   * Check if odd no. of values are true.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @return
   */
  public static boolean xor(boolean a, boolean b, boolean c, boolean d, boolean e) {
    return a ^ b ^ c ^ d ^ e;
  }


  /**
   * Check if odd no. of values are true.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @return
   */
  public static boolean xor(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f) {
    return a ^ b ^ c ^ d ^ e ^ f;
  }


  /**
   * Check if odd no. of values are true.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @param g 7th boolean
   * @return
   */
  public static boolean xor(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g) {
    return a ^ b ^ c ^ d ^ e ^ f ^ g;
  }


  /**
   * Check if odd no. of values are true.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @param g 7th boolean
   * @param h 8th boolean
   * @return
   */
  public static boolean xor(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g, boolean h) {
    return a ^ b ^ c ^ d ^ e ^ f ^ g ^ h;
  }




  // COUNT (VARIABLE)
  /**
   * Count no. of true values.
   * @return
   */
  public static int count() {
    return 0;
  }


  /**
   * Count no. of true values.
   * @param a 1st boolean
   * @return
   */
  public static int count(boolean a) {
    return a? 1 : 0;
  }


  /**
   * Count no. of true values.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @return
   */
  public static int count(boolean a, boolean b) {
    return count(a) + count(b);
  }


  /**
   * Count no. of true values.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @return
   */
  public static int count(boolean a, boolean b, boolean c) {
    return count(a, b) + count(c);
  }


  /**
   * Count no. of true values.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @return
   */
  public static int count(boolean a, boolean b, boolean c, boolean d) {
    return count(a, b) + count(c, d);
  }


  /**
   * Count no. of true values.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @return
   */
  public static int count(boolean a, boolean b, boolean c, boolean d, boolean e) {
    return count(a, b, c, d) + count(e);
  }


  /**
   * Count no. of true values.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @return
   */
  public static int count(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f) {
    return count(a, b, c, d) + count(e, f);
  }


  /**
   * Count no. of true values.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @param g 7th boolean
   * @return
   */
  public static int count(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g) {
    return count(a, b, c, d) + count(e, f, g);
  }


  /**
   * Count no. of true values.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @param g 7th boolean
   * @param h 8th boolean
   * @return
   */
  public static int count(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g, boolean h) {
    return count(a, b, c, d) + count(e, f, g, h);
  }




  // NAND (VARIABLE)
  /**
   * Check if any value is false.
   * @return
   */
  public static boolean nand() {
    return !and();
  }


  /**
   * Check if any value is false.
   * @param a 1st boolean
   * @return
   */
  public static boolean nand(boolean a) {
    return !and(a);
  }


  /**
   * Check if any value is false.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @return
   */
  public static boolean nand(boolean a, boolean b) {
    return !and(a, b);
  }


  /**
   * Check if any value is false.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @return
   */
  public static boolean nand(boolean a, boolean b, boolean c) {
    return !and(a, b, c);
  }


  /**
   * Check if any value is false.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @return
   */
  public static boolean nand(boolean a, boolean b, boolean c, boolean d) {
    return !and(a, b, c, d);
  }


  /**
   * Check if any value is false.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @return
   */
  public static boolean nand(boolean a, boolean b, boolean c, boolean d, boolean e) {
    return !and(a, b, c, d, e);
  }


  /**
   * Check if any value is false.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @return
   */
  public static boolean nand(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f) {
    return !and(a, b, c, d, e, f);
  }


  /**
   * Check if any value is false.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @param g 7th boolean
   * @return
   */
  public static boolean nand(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g) {
    return !and(a, b, c, d, e, f, g);
  }


  /**
   * Check if any value is false.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @param g 7th boolean
   * @param h 8th boolean
   * @return
   */
  public static boolean nand(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g, boolean h) {
    return !and(a, b, c, d, e, f, g, h);
  }




  // NOR (VARIABLE)
  /**
   * Check if all values are false.
   * @return
   */
  public static boolean nor() {
    return !or();
  }


  /**
   * Check if all values are false.
   * @param a 1st boolean
   * @return
   */
  public static boolean nor(boolean a) {
    return !or(a);
  }


  /**
   * Check if all values are false.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @return
   */
  public static boolean nor(boolean a, boolean b) {
    return !or(a, b);
  }


  /**
   * Check if all values are false.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @return
   */
  public static boolean nor(boolean a, boolean b, boolean c) {
    return !or(a, b, c);
  }


  /**
   * Check if all values are false.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @return
   */
  public static boolean nor(boolean a, boolean b, boolean c, boolean d) {
    return !or(a, b, c, d);
  }


  /**
   * Check if all values are false.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @return
   */
  public static boolean nor(boolean a, boolean b, boolean c, boolean d, boolean e) {
    return !or(a, b, c, d, e);
  }


  /**
   * Check if all values are false.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @return
   */
  public static boolean nor(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f) {
    return !or(a, b, c, d, e, f);
  }


  /**
   * Check if all values are false.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @param g 7th boolean
   * @return
   */
  public static boolean nor(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g) {
    return !or(a, b, c, d, e, f, g);
  }


  /**
   * Check if all values are false.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @param g 7th boolean
   * @param h 8th boolean
   * @return
   */
  public static boolean nor(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g, boolean h) {
    return !or(a, b, c, d, e, f, g, h);
  }




  // XNOR (VARIABLE)
  /**
   * Check if even no. of values are true.
   * @return
   */
  public static boolean xnor() {
    return !xor();
  }


  /**
   * Check if even no. of values are true.
   * @param a 1st boolean
   * @return
   */
  public static boolean xnor(boolean a) {
    return !xor(a);
  }


  /**
   * Check if even no. of values are true.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @return
   */
  public static boolean xnor(boolean a, boolean b) {
    return !xor(a, b);
  }


  /**
   * Check if even no. of values are true.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @return
   */
  public static boolean xnor(boolean a, boolean b, boolean c) {
    return !xor(a, b, c);
  }


  /**
   * Check if even no. of values are true.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @return
   */
  public static boolean xnor(boolean a, boolean b, boolean c, boolean d) {
    return !xor(a, b, c, d);
  }


  /**
   * Check if even no. of values are true.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @return
   */
  public static boolean xnor(boolean a, boolean b, boolean c, boolean d, boolean e) {
    return !xor(a, b, c, d, e);
  }


  /**
   * Check if even no. of values are true.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @return
   */
  public static boolean xnor(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f) {
    return !xor(a, b, c, d, e, f);
  }


  /**
   * Check if even no. of values are true.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @param g 7th boolean
   * @return
   */
  public static boolean xnor(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g) {
    return !xor(a, b, c, d, e, f, g);
  }


  /**
   * Check if even no. of values are true.
   * @param a 1st boolean
   * @param b 2nd boolean
   * @param c 3rd boolean
   * @param d 4th boolean
   * @param e 5th boolean
   * @param f 6th boolean
   * @param g 7th boolean
   * @param h 8th boolean
   * @return
   */
  public static boolean xnor(boolean a, boolean b, boolean c, boolean d, boolean e, boolean f, boolean g, boolean h) {
    return !xor(a, b, c, d, e, f, g, h);
  }
}

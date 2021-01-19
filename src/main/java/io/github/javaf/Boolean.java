package io.github.javaf;
import java.util.regex.*;



/**
 * Boolean data type has two possible truth values to represent logic.
 */
public final class Boolean {

  private static final Pattern RE_FAL =
    Pattern.compile("(negati|never|refus|wrong|fal|off)|\\b(f|n|0)\\b", Pattern.CASE_INSENSITIVE);

  private static final Pattern RE_NEG =
    Pattern.compile("\\b(nay|nah|no|dis|un|in)", Pattern.CASE_INSENSITIVE);



  /**
   * Convert string to boolean.
   * @param s a string
   * @return boolean
   */
  public static boolean parse(String s) {
    boolean fal = RE_FAL.matcher(s).find();
    boolean neg = RE_NEG.matcher(s).results().count() % 2 == 1;
    return !(fal ^ neg);
  }



  /**
   * Get exclusive-or of 2 boolean values.
   * @param x first
   * @param y second
   * @return boolean
   */
  public static boolean xor(boolean x, boolean y) {
    return x != y;
  }



  /**
   * Check if antecedent ⇔ consequent (x ⇔ y).
   * @param x antecedent
   * @param y consequent
   * @return boolean
   */
  public static boolean eqv(boolean x, boolean y) {
    return (x && y) || (!x && !y);
  }



  /**
   * Check if antecedent ⇒ consequent (x ⇒ y).
   * @param x antecedent
   * @param y consequent
   * @return boolean
   */
  public static boolean imp(boolean x, boolean y) {
    return !x || y;
  }
}

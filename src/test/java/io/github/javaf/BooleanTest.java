package io.github.javaf;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;



/**
 * NOTE:
 * Programming does involve a lot of finger labor!
 * Survival instinct triggered.
 */
public class BooleanTest {

  public BooleanTest() {
  }

  @BeforeAll
  public static void setUpClass() {
  }

  @AfterAll
  public static void tearDownClass() {
  }

  @BeforeEach
  public void setUp() {
  }

  @AfterEach
  public void tearDown() {
  }



  @Test
  public void testParse() {
    System.out.println("parse(s)");
    boolean a;
    a = Boolean.parse("not true");
    assertEquals(false, a);
    // false

    a = Boolean.parse("inactive");
    assertEquals(false, a);
    // false

    a = Boolean.parse("not off");
    assertEquals(true, a);
    // true

    a = Boolean.parse("truthy");
    assertEquals(true, a);
    // true
  }



  @Test
  public void testXor() {
    System.out.println("xor(x, y)");
    boolean a;
    a = Boolean.xor(true, true);
    assertEquals(false, a);
    // false

    a = Boolean.xor(true, false);
    assertEquals(true, a);
    // true
  }



  @Test
  public void testEqv() {
    System.out.println("eqv(x, y)");
    boolean a;
    a = Boolean.eqv(false, false);
    assertEquals(true, a);
    // true

    a = Boolean.eqv(true, true);
    assertEquals(true, a);
    // true

    a = Boolean.eqv(false, true);
    assertEquals(false, a);
    // false

    a = Boolean.eqv(true, false);
    assertEquals(false, a);
    // false
  }



  @Test
  public void testImp() {
    System.out.println("imp");
    boolean a;
    a = Boolean.imp(false, false);
    assertEquals(true, a);
    // true

    a = Boolean.imp(false, true);
    assertEquals(true, a);
    // true

    a = Boolean.imp(true, true);
    assertEquals(true, a);
    // true

    a = Boolean.imp(true, false);
    assertEquals(false, a);
    // false
  }
}

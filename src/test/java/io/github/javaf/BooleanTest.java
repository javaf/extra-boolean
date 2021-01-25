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




  // PARSE
  public void testParse() {
    System.out.println("parse(s)");
    boolean x;
    // 1.t0
    x = Boolean.parse("1");
    assertEquals(true, x);
    // 1.t1
    x = Boolean.parse("truthy");
    assertEquals(true, x);
    // 1.t2
    x = Boolean.parse("not off");
    assertEquals(true, x);
    // 1.t3
    x = Boolean.parse("enabled");
    assertEquals(true, x);
    // 1.f0
    x = Boolean.parse("0");
    assertEquals(false, x);
    // 1.f1
    x = Boolean.parse("not true");
    assertEquals(false, x);
    // 1.f2
    x = Boolean.parse("inactive");
    assertEquals(false, x);
    // 1.f3
    x = Boolean.parse("disabled");
    assertEquals(false, x);
  }




  // NOT, EQ, IMPLY, NIMPLY (FIXED)
  public void testNot() {
    System.out.println("not(a)");
    boolean x;
    // 1.0
    x = Boolean.not(false);
    assertEquals(true, x);
    // 1.1
    x = Boolean.not(true);
    assertEquals(false, x);
  }


  public void testEq() {
    System.out.println("eq(a, b)");
    boolean x;
    // 2.3
    x = Boolean.eq(true, true);
    assertEquals(true, x);
    // 2.0
    x = Boolean.eq(false, false);
    assertEquals(true, x);
    // 2.2
    x = Boolean.eq(true, false);
    assertEquals(false, x);
    // 2.1
    x = Boolean.eq(false, true);
    assertEquals(false, x);
  }


  public void testImply() {
    System.out.println("imply(a, b)");
    boolean x;
    // 2.3
    x = Boolean.imply(true, true);
    assertEquals(true, x);
    // 2.1
    x = Boolean.imply(false, true);
    assertEquals(true, x);
    // 2.0
    x = Boolean.imply(false, false);
    assertEquals(true, x);
    // 2.2
    x = Boolean.imply(true, false);
    assertEquals(false, x);
  }


  public void testNimply() {
    System.out.println("nimply(a, b)");
    boolean x;
    // 2.2
    x = Boolean.nimply(true, false);
    assertEquals(true, x);
    // 2.3
    x = Boolean.nimply(true, true);
    assertEquals(false, x);
    // 2.1
    x = Boolean.nimply(false, true);
    assertEquals(false, x);
    // 2.0
    x = Boolean.nimply(false, false);
    assertEquals(false, x);
  }




  // EQV, IMP (SHORTCUTS)
  public void testEqv() {
    System.out.println("eqv(a, b)");
    boolean x;
    // 2.3
    x = Boolean.eqv(true, true);
    assertEquals(true, x);
    // 2.0
    x = Boolean.eqv(false, false);
    assertEquals(true, x);
    // 2.2
    x = Boolean.eqv(true, false);
    assertEquals(false, x);
    // 2.1
    x = Boolean.eqv(false, true);
    assertEquals(false, x);
  }


  public void testImp() {
    System.out.println("imp(a, b)");
    boolean x;
    // 2.3
    x = Boolean.imp(true, true);
    assertEquals(true, x);
    // 2.1
    x = Boolean.imp(false, true);
    assertEquals(true, x);
    // 2.0
    x = Boolean.imp(false, false);
    assertEquals(true, x);
    // 2.2
    x = Boolean.imp(true, false);
    assertEquals(false, x);
  }




  // AND (VARIABLE)
  public void testAnd() {
    System.out.println("and[n](a, b, ...)");
    boolean x;
    // 0.0
    x = Boolean.and();
    assertEquals(true, x);
    // 1.1
    x = Boolean.and(true);
    assertEquals(true, x);
    // 1.0
    x = Boolean.and(false);
    assertEquals(false, x);
    // 2.3
    x = Boolean.and(true, true);
    assertEquals(true, x);
    // 2.2
    x = Boolean.and(true, false);
    assertEquals(false, x);
    // 2.1
    x = Boolean.and(false, true);
    assertEquals(false, x);
    // 2.0
    x = Boolean.and(false, false);
    assertEquals(false, x);
    // 8.255
    x = Boolean.and(true, true, true, true, true, true, true, true);
    assertEquals(true, x);
    // 8.254
    x = Boolean.and(true, true, true, true, true, true, true, false);
    assertEquals(false, x);
  }




  // OR (VARIABLE)
  public void testOr() {
    System.out.println("or[n](a, b, ...)");
    boolean x;
    // 0.0
    x = Boolean.or();
    assertEquals(false, x);
    // 1.1
    x = Boolean.or(true);
    assertEquals(true, x);
    // 1.0
    x = Boolean.or(false);
    assertEquals(false, x);
    // 2.3
    x = Boolean.or(true, true);
    assertEquals(true, x);
    // 2.2
    x = Boolean.or(true, false);
    assertEquals(true, x);
    // 2.1
    x = Boolean.or(false, true);
    assertEquals(true, x);
    // 2.0
    x = Boolean.or(false, false);
    assertEquals(false, x);
    // 8.1
    x = Boolean.or(false, false, false, false, false, false, false, true);
    assertEquals(true, x);
    // 8.0
    x = Boolean.or(false, false, false, false, false, false, false, false);
    assertEquals(false, x);
  }




  // XOR (VARIABLE)
  public void testXor() {
    System.out.println("xor[n](a, b, ...)");
    boolean x;
    // 0.0
    x = Boolean.xor();
    assertEquals(false, x);
    // 1.1
    x = Boolean.xor(true);
    assertEquals(true, x);
    // 1.0
    x = Boolean.xor(false);
    assertEquals(false, x);
    // 2.2
    x = Boolean.xor(true, false);
    assertEquals(true, x);
    // 2.1
    x = Boolean.xor(false, true);
    assertEquals(true, x);
    // 2.3
    x = Boolean.xor(true, true);
    assertEquals(false, x);
    // 2.0
    x = Boolean.xor(false, false);
    assertEquals(false, x);
    // 8.1
    x = Boolean.xor(false, false, false, false, false, false, false, true);
    assertEquals(true, x);
    // 8.3
    x = Boolean.xor(false, false, false, false, false, false, true, true);
    assertEquals(false, x);
  }




  // COUNT (VARIABLE)
  public void testCount() {
    System.out.println("count[n](a, b, ...)");
    int x;
    // 0.0
    x = Boolean.count();
    assertEquals(0, x);
    // 1.1
    x = Boolean.count(true);
    assertEquals(1, x);
    // 1.0
    x = Boolean.count(false);
    assertEquals(0, x);
    // 2.3
    x = Boolean.count(true, true);
    assertEquals(2, x);
    // 2.2
    x = Boolean.count(true, false);
    assertEquals(1, x);
    // 2.1
    x = Boolean.count(false, true);
    assertEquals(1, x);
    // 2.0
    x = Boolean.count(false, false);
    assertEquals(0, x);
    // 8.1
    x = Boolean.count(false, false, false, false, false, false, false, true);
    assertEquals(1, x);
    // 8.7
    x = Boolean.count(false, false, false, false, false, true, true, true);
    assertEquals(3, x);
  }




  // NAND (VARIABLE)
  public void testNand() {
    System.out.println("nand[n](a, b, ...)");
    boolean x;
    // 0.0
    x = Boolean.nand();
    assertEquals(false, x);
    // 1.0
    x = Boolean.nand(false);
    assertEquals(true, x);
    // 1.1
    x = Boolean.nand(true);
    assertEquals(false, x);
    // 2.2
    x = Boolean.nand(true, false);
    assertEquals(true, x);
    // 2.1
    x = Boolean.nand(false, true);
    assertEquals(true, x);
    // 2.0
    x = Boolean.nand(false, false);
    assertEquals(true, x);
    // 2.3
    x = Boolean.nand(true, true);
    assertEquals(false, x);
    // 8.254
    x = Boolean.nand(true, true, true, true, true, true, true, false);
    assertEquals(true, x);
    // 8.255
    x = Boolean.nand(true, true, true, true, true, true, true, true);
    assertEquals(false, x);
  }




  // NOR (VARIABLE)
  public void testNor() {
    System.out.println("nor[n](a, b, ...)");
    boolean x;
    // 0.0
    x = Boolean.nor();
    assertEquals(true, x);
    // 1.0
    x = Boolean.nor(false);
    assertEquals(true, x);
    // 1.1
    x = Boolean.nor(true);
    assertEquals(false, x);
    // 2.0
    x = Boolean.nor(false, false);
    assertEquals(true, x);
    // 2.3
    x = Boolean.nor(true, true);
    assertEquals(false, x);
    // 2.2
    x = Boolean.nor(true, false);
    assertEquals(false, x);
    // 2.1
    x = Boolean.nor(false, true);
    assertEquals(false, x);
    // 8.0
    x = Boolean.nor(false, false, false, false, false, false, false, false);
    assertEquals(true, x);
    // 8.1
    x = Boolean.nor(false, false, false, false, false, false, false, true);
    assertEquals(false, x);
  }




  // XNOR (VARIABLE)
  public void testXnor() {
    System.out.println("xnor[n](a, b, ...)");
    boolean x;
    // 0.0
    x = Boolean.xnor();
    assertEquals(true, x);
    // 1.0
    x = Boolean.xnor(false);
    assertEquals(true, x);
    // 1.0
    x = Boolean.xnor(true);
    assertEquals(false, x);
    // 2.3
    x = Boolean.xnor(true, true);
    assertEquals(true, x);
    // 2.0
    x = Boolean.xnor(false, false);
    assertEquals(true, x);
    // 2.2
    x = Boolean.xnor(true, false);
    assertEquals(false, x);
    // 2.1
    x = Boolean.xnor(false, true);
    assertEquals(false, x);
    // 8.0
    x = Boolean.xnor(false, false, false, false, false, false, false, false);
    assertEquals(true, x);
    // 8.7
    x = Boolean.xnor(false, false, false, false, false, true, true, true);
    assertEquals(false, x);
  }




  // SELECT (VARIABLE)
  public void testSelect() {
    System.out.println("select[n](i, a, b, ...)");
    boolean x;
    // 0.0
    x = Boolean.select(0);
    assertEquals(false, x);
    // 1.0
    x = Boolean.select(0, true);
    assertEquals(true, x);
    // 1.0
    x = Boolean.select(1, true);
    assertEquals(false, x);
    // 2.3
    x = Boolean.select(0, true, false);
    assertEquals(true, x);
    // 2.1
    x = Boolean.select(1, true, false);
    assertEquals(false, x);
    // 8.0
    x = Boolean.select(0, true, false, false, false, false, false, false, false);
    assertEquals(true, x);
    // 8.7
    x = Boolean.select(7, true, false, false, false, false, false, false, false);
    assertEquals(false, x);
  }
}

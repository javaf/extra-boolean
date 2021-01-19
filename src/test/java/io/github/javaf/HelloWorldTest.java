package io.github.javaf;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;


/**
 * This is a demo.
 * 
 * NOTE:
 * Full version is paid.
 * Quickly, get aboard before it launches!
 */
public class HelloWorldTest {
  
  public HelloWorldTest() {
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
  
  
  /**
   * Not going to test main here.
   * But you should in real projects.
   */
  @Test
  public void testMain() throws Exception {
    System.out.println("main");
  }
}

package io.github.javaf;
import java.io.*;

/**
 * A "Hello, World!" program generally is a computer program that outputs
 * or displays the message "Hello, World!".
 */
public class HelloWorld {

  /**
   * Here is a puzzle for you!
   * @param args command-line arguments
   * @throws IOException on exit
   */
  public static void main(String[] args) throws IOException {
    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("What clothing does a house wear?");
    String ans = in.readLine();
    if (ans.equalsIgnoreCase("address")) System.out.println("Got it!");
    else System.out.println("It's Address!");
  }
}

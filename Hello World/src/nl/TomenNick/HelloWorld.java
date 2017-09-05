/**
 * @author Tom Houtekamer en Nick Aquina
 * @date 5 Sep 2017
 *
 * example to demonstrate console output
 */

package nl.TomenNick;

public class HelloWorld {
    //put message on console
    void show() {
        System.out.println("Hello world, this is a java program");
        System.out.println("");
        System.out.println("");
        System.out.println("Good luck, programmer!");
    }
    public static void main(String[] args) {
        (new HelloWorld()).show();
    }
}

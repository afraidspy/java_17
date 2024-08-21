/**
 *The Consumer<T> interface represents an operation that takes a single argument of type T and returns no result. 
 It's typically used for performing operations on each element of a collection.
 */

 import java.util.function.Consumer;

 public class ConsumerExample {
     public static void main(String[] args) {
         // Create a Consumer that prints a message
         Consumer<String> printMessage = message -> System.out.println("Message: " + message);
 
         // Apply the Consumer to a message
         printMessage.accept("Hello, World!");
     }
 }
 
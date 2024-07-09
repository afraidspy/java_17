public class StringBuilder {

    public static void main(String[] args) {
       // Create a java.lang.StringBuilder instance
       java.lang.StringBuilder sb = new java.lang.StringBuilder("Hello");

       // Append strings to the StringBuilder
       sb.append(" world!");
       sb.append(" GFG");

       // Display the content of the StringBuilder
       System.out.println(sb.toString());  // Output: "Hello 

       java.lang.StringBuilder sb2 = new java.lang.StringBuilder("Hello world!");
       sb2.setLength(5);
       System.out.println(sb.toString());  // Output: "Hello"

    }
}
    

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


       // Example of insert()
       sb.insert(6, "beautiful ");
       System.out.println("insert: " + sb.toString());  // Output: "Hello beautiful world!"

       // Example of replace()
       sb.replace(6, 16, "wonderful");
       System.out.println("replace: " + sb.toString());  // Output: "Hello wonderful world!"

       // Example of delete()
       sb.delete(6, 16);
       System.out.println("delete: " + sb.toString());  // Output: "Hello world!"

       // Example of deleteCharAt()
       sb.deleteCharAt(5);
       System.out.println("deleteCharAt: " + sb.toString());  // Output: "Helloworld!"

       // Example of reverse()
       sb.reverse();
       System.out.println("reverse: " + sb.toString());  // Output: "!dlrowolleH"

       // Reset StringBuilder for length and capacity examples

       // Example of length()
       System.out.println("length: " + sb.length());  // Output: 12

       // Example of capacity()
       System.out.println("capacity: " + sb.capacity());  // Output: 28 (initial capacity + length of "Hello world!")

       // Example of charAt()
       System.out.println("charAt: " + sb.charAt(1));  // Output: 'e'

       // Example of substring()
       String sub = sb.substring(6, 11);
       System.out.println("substring: " + sub);  // Output: "world"

       // Example of setCharAt()
       sb.setCharAt(6, 'W');
       System.out.println("setCharAt: " + sb.toString());  // Output: "Hello World!"

       // Example of setLength()
       sb.setLength(5);
       System.out.println("setLength: " + sb.toString());  // Output: "Hello"

       // Example of toString()
       sb.append(" world!");
       String result = sb.toString();
       System.out.println("toString: " + result);  // Output

    }
}
    

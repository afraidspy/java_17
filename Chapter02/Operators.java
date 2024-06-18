public class Operators {

    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10;
        int b = 20;
        int sum = a + b;            // sum = 30 (10 + 20)
        int difference = b - a;     // difference = 10 (20 - 10)
        int product = a * b;        // product = 200 (10 * 20)
        int quotient = b / a;       // quotient = 2 (20 / 10)
        int remainder = b % a;      // remainder = 0 (20 % 10)

        System.out.println("Arithmetic Operators:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.println();

        // Relational Operators
        boolean greater = a > b;            // greater = false (10 is not greater than 20)
        boolean lesser = a < b;             // lesser = true (10 is less than 20)
        boolean equalTo = a == b;           // equalTo = false (10 is not equal to 20)
        boolean notEqualTo = a != b;        // notEqualTo = true (10 is not equal to 20)

        System.out.println("Relational Operators:");
        System.out.println("Greater than: " + greater);
        System.out.println("Less than: " + lesser);
        System.out.println("Equal to: " + equalTo);
        System.out.println("Not equal to: " + notEqualTo);
        System.out.println();

        // Logical Operators
        boolean p = true;
        boolean q = false;
        boolean andResult = p && q;         // andResult = false (true AND false)
        boolean orResult = p || q;          // orResult = true (true OR false)
        boolean notP = !p;                  // notP = false (NOT true)

        System.out.println("Logical Operators:");
        System.out.println("Logical AND: " + andResult);
        System.out.println("Logical OR: " + orResult);
        System.out.println("Logical NOT of p: " + notP);
        System.out.println();

        // Bitwise Operators
        int m = 5;
        int n = 3;
        int bitwiseAnd = m & n;             // bitwiseAnd = 1 (5 & 3 = 0101 & 0011 = 0001)
        int bitwiseOr = m | n;              // bitwiseOr = 7 (5 | 3 = 0101 | 0011 = 0111)
        int bitwiseXor = m ^ n;             // bitwiseXor = 6 (5 ^ 3 = 0101 ^ 0011 = 0110)
        int bitwiseComplement = ~m;         // bitwiseComplement = -6 (~5 = 1111 1111 1111 1111 1111 1111 1111 1010 in 32-bit signed integer representation)

        System.out.println("Bitwise Operators:");
        System.out.println("Bitwise AND: " + bitwiseAnd);
        System.out.println("Bitwise OR: " + bitwiseOr);
        System.out.println("Bitwise XOR: " + bitwiseXor);
        System.out.println("Bitwise Complement of m: " + bitwiseComplement);
        System.out.println();

        // Assignment Operators
        int num = 10;
        num += 5;                           // num = 15 (10 + 5)
        num -= 3;                           // num = 12 (15 - 3)
        num *= 2;                           // num = 24 (12 * 2)
        num /= 4;                           // num = 6 (24 / 4)
        num %= 3;                           // num = 0 (6 % 3)

        System.out.println("Assignment Operators:");
        System.out.println("Value of num after operations: " + num);

        float x1 = 2;
        int x2 = 4;

        double div1 = x1 / x2;

        System.out.println("Div1: "+div1);
    }
}
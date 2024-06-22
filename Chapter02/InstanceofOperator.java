public class InstanceofOperator {

    public static void main (String [] args){

        Object obj = null;
        //If obj ==  null, always will be false the next condition 
        //System.out.println("Class: " + obj.getClass()); => java.lang.NullPointerException:
        if (obj instanceof Object) {
            System.out.println("This is an instance of Object");
        } else {
            System.out.println("This is NOT an instance of Object");
        }

        Object objStringObject = new String("Hello");

        if (objStringObject instanceof String) {
            //Casting to String
            String str = (String) objStringObject;
            // Work with object wich is an String
            System.out.println("Lenght: " + str.length());
        }

        System.out.println("Class: " + objStringObject.getClass());//Return:  class java.lang.String

        short height = 1, weight = 3;
        short zabra = (short) ((byte) weight * (byte) height);

        int a = 10; // 1010
        int b = ~a; // 11111111111111111111111111110101

        System.out.println("a: "+ a);
        System.out.println("Bin a: " + Integer.toBinaryString(a));
        System.out.println("b: "+ b);
        System.out.println("Bin b: "+Integer.toBinaryString(b));
        
    }
    
}

public class InstanceofOperator {

    public static void main (String [] args){

        Object obj = null;
        //If obj ==  null, always will be false the next condition 
        if (obj instanceof Object) {
            System.out.println("This is an instance of Object");

        } else {
            System.out.println("This is NOT an instance of Object");
        }

        Object objStringObject = new String("Hola");

        if (objStringObject instanceof String) {
            //Casting to String
            String str = (String) objStringObject;
            // Work with object wich is an String
            System.out.println("Longitud de la cadena: " + str.length());
        }


    }
    
}

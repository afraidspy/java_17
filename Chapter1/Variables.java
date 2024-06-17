
public class Variables {

    private static final void main (String params []){

        if(params.length > 0)
            System.out.println("First exam: " + params[0]);
        else 
            System.out.println("No parameters");

        // error: 'var' is not allowed in a compound declaration
        //var name = "Jessica", lastName = "López";
        var name = "Jessica";
        var lastName = "López";



        System.out.println("Names is " + name);

    }

    public void main(String [] args){
         System.out.println("Another method" );
    }

}
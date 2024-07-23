
public class OverloadExamples {
    
    public void print(int i) {
        System.out.println("Integer: " + i);
    }
    
    public void print(String s) {
        System.out.println("String: " + s);
    }

    public static void main (String [] args){

        OverloadExamples ov = new OverloadExamples();
        ov.print(1);
        ov.print("1S");
        
    }
}



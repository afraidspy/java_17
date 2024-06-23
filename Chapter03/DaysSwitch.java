import java.util.Scanner;

enum DAYS {
    MONDAY("Monday"),
    TUESDAY("Tuesday"),
    WEDNESDAY("Wednesday"),
    THURSDAY("Thursday"),
    FRIDAY("Friday"),
    SATURDAY("Saturday"),
    SUNDAY("Sunday");

    private final String displayName;

    DAYS(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }

    @Override
    public String toString() {
        return this.displayName;
    }
}


public class DaysSwitch {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a day: ");
        int option = sc.nextInt();
        String dayString = "";

        //Using Switch statement

        switch(option){
            case 1:
                dayString = DAYS.MONDAY.toString();
                break;
            case 2:
                dayString = DAYS.TUESDAY.toString();
                break;
            case 3:
                dayString  = DAYS.WEDNESDAY.toString();
                break;
            case 4:
                dayString = DAYS.THURSDAY.toString();
                break;
            case 5:
                dayString = DAYS.FRIDAY.toString();
                break;
            case 6:
                dayString = DAYS.SATURDAY.toString();
                break;
            case 7:
                dayString = DAYS.SUNDAY.toString();
                break;
              default: 
                dayString = "Invalid";
            
        };

        System.out.println("Day is: " + dayString);

        //Using Switch expression

        String dayResult = switch (option) {
            case 1 -> { yield DAYS.MONDAY.toString(); }
            case 2 -> { yield DAYS.TUESDAY.toString();}
            case 3 -> { yield DAYS.WEDNESDAY.toString();}
            case 4 -> { yield DAYS.THURSDAY.toString();}
            case 5 -> { yield DAYS.FRIDAY.toString();}
            case 6 -> { yield DAYS.SATURDAY.toString();}
            case 7 -> { yield DAYS.SUNDAY.toString();}
            /* for a switch expression in Java, it is mandatory to cover 
            all possible values of the switch expression. 
            If any potential value is not covered by an explicit case, 
            the compiler will raise an error.*/
            default ->{
                yield "Invalid";
            }
        };


        System.out.println("Day is: " + dayResult);

        

        
        

    }
}
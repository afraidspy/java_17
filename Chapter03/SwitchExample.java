public class SwitchExample {
    public static void main(String[] args) {
        String dayOfWeek = "Monday";
        int numLetters = switch (dayOfWeek) {
                 default -> {
                String msg = "Invalid day of the week: " + dayOfWeek;
                throw new IllegalStateException(msg);
            }
            case "Monday", "Friday", "Sunday" -> 6;
            case "Tuesday" -> 7;
            case "Thursday", "Saturday" -> 8;
        };
        System.out.println("Number of letters: " + numLetters);


        int dayOfWeekInt = 5;

        switch (dayOfWeekInt) {
            case 1:
                System.out.println("Monday");
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            default:
                System.out.println("Weekend or Invalid day");
        }

        int dayWeek = 3;

        switch (dayWeek) {
            case 1:
                System.out.println("Monday");
                // No hay break aquí
            case 2:
                System.out.println("Tuesday");
                // No hay break aquí
            case 3:
                System.out.println("Wednesday");
                // No hay break aquí
            case 4:
                System.out.println("Thursday");
                
            case 5:
                System.out.println("Friday");
                
            default:
                System.out.println("Weekend or Invalid day");
        }


    }
}

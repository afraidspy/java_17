import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZonedDateTime;
import java.time.Duration;

public class DateTimes {
    public static void main(String[] args) {

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());
        System.out.println(ZonedDateTime.now());

             // Period entre dos fechas
        LocalDate startDate = LocalDate.of(2024, 7, 1);
        LocalDate endDate = LocalDate.of(2024, 7, 7);
        Period period = Period.between(startDate, endDate);

        System.out.println("Período entre " + startDate + " y " + endDate + ": " + period.getDays() + " días");

        // Duration entre dos horas
        LocalTime startTime = LocalTime.of(10, 30);
        LocalTime endTime = LocalTime.of(12, 45);
        Duration duration = Duration.between(startTime, endTime);

        System.out.println("Duración entre " + startTime + " y " + endTime + ": " + duration.toHours() + " horas y " + duration.toMinutesPart() + " minutos");
    }
    
}

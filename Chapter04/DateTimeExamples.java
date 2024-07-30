import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Locale;

public class DateTimeExamples {

    public static void main(String[] args) {
        // Ejemplo de Locale
        Locale locale = Locale.US;

        // Ejemplo de ZoneId
        ZoneId zoneId = ZoneId.of("America/New_York");

        // Obtener la fecha y hora actual en la zona horaria predeterminada del sistema
        // 2024-07-22T07:07:04.952083-06:00[America/Mexico_City]
        ZonedDateTime nowInDefaultZone = ZonedDateTime.now();

        // Obtener la fecha y hora actual en una zona horaria específica
        //2024-07-22T09:07:04.952117-04:00[America/New_York]
        ZonedDateTime nowInNewYork = ZonedDateTime.now(zoneId);

        // Obtener la fecha y hora local (sin zona horaria)
        // 2024-07-22T07:07:04.955081
        LocalDateTime localDateTime = LocalDateTime.now();

        // Mostrar resultados
        System.out.println("Fecha y hora actual en zona horaria predeterminada: " + nowInDefaultZone);
        System.out.println("Fecha y hora actual en zona horaria de New York: " + nowInNewYork);
        System.out.println("Fecha y hora local (sin zona horaria): " + localDateTime);
    }


}

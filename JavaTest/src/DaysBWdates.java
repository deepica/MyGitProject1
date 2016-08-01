import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DaysBWdates {
    public static void main(String[] args) throws IOException {
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        final String firstInput = reader.readLine();
        final String secondInput = reader.readLine();
        final LocalDate firstDate = LocalDate.parse(firstInput, formatter);
        final LocalDate secondDate = LocalDate.parse(secondInput, formatter);
        final long days = ChronoUnit.DAYS.between(firstDate, secondDate);
        System.out.println("No. of Days between two dates is: " + days);
    }
}
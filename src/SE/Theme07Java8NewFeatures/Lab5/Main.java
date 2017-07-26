package SE.Theme07Java8NewFeatures.Lab5;

import java.time.*;

/**
 * Create a class Main with a main() method, which:
 *
 * 1) Determine and output the current date and the date of birth, and then define and output the number of your years;
 *
 * 2) Determine in which day of the week you were born and what day of the week will be the birthday of this year,
 *    then determine was whether this year's birthday;
 *
 * 3) Define a new date and time format (example, "dd.MM.yyyy, HH-mm-ss").
 *    Then determine the current date and time for the multiple time-zones and output them in a new format.
 */

public class Main {
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        LocalDate birthDate  = LocalDate.of(1990, 8, 27);
        //LocalDate birthDate  = LocalDate.of(1990, Month.AUGUST, 27);

        Period myYears = Period.between(birthDate, currentDate);

        System.out.println("Current date: " + currentDate);
        System.out.println("Date of birth: " + birthDate);
        System.out.println("My years: " + myYears.getYears());
        System.out.println("I was born in: " + birthDate.getDayOfWeek());
        System.out.println("Birthday will be this year: " + LocalDate.of(2017,8,27).getDayOfWeek() + '\n');


        if (currentDate.isAfter(LocalDate.of(2017,8,27)))
            System.out.println("Birthday this year was" + '\n');
        else System.out.println("Birthday this year will be" + '\n');


        LocalDateTime currentDateAndTime = LocalDateTime.now();
        System.out.println("Current date and time: " + currentDateAndTime + '\n');

        ZoneId kiev = ZoneId.of("Europe/Kiev");
        ZoneId berlin = ZoneId.of("Europe/Berlin");

        LocalDateTime dateTime = LocalDateTime.now();
        ZonedDateTime kievDateTime = ZonedDateTime.of(dateTime, kiev);
        ZonedDateTime berlinDateTime = kievDateTime.withZoneSameInstant(berlin);

        System.out.println(kievDateTime);
        System.out.println(berlinDateTime);

    }
}

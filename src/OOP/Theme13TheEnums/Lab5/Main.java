package OOP.Theme13TheEnums.Lab5;

import java.io.IOException;

/**
 * Created by DELL on 14.03.2017.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        TrainSchedule trainSchedule = new TrainSchedule();
        trainSchedule.addTrain();
        trainSchedule.printTrains();
        trainSchedule.searchTrain("Vinnitsa","Odessa", DayOfWeek.MONDAY);
    }
}
//Vinnitsa  Odessa  Kyiv
//MONDAY    TUESDAY   WEDNESDAY    THURSDAY    FRIDAY  SATURDAY    SUNDAY

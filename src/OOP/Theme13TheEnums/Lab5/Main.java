package OOP.Theme13TheEnums.Lab5;

import java.io.IOException;

/**
 * Create a class TrainSchedule which contains inner class Train.<p>
 * 1) Add to class Train six fields: number (of int type), stationDispatch (of String type),
 * stationArrival (of String type), timeDispatch (оf String type), timeArrival (of String type)
 * and days (array of enum type DayOfWeek, containing a list of days of the week),
 * constructor with one parameter (number train) and getters/setter for each class field.<p>
 * Override the toString() method in Train to return all information about train.<p>
 * 2) Add to class TrainSchedule private field trains as array of Train and constructor
 * with one parameter to allocate memory to the schedule.<p>
 * 3) Add to class TrainSchedule public method addTrain() without parameters,
 * which read from console (using System.in and Scanner) all information on train,
 * then to create new Train object and pass it to next available array element.<p>
 * 4) Add to class TrainSchedule public method printTrains() which iterates over trains array in loop
 * and print all information of each train to console.<p>
 * 5) Add to class TrainSchedule public method searchTrain(...) with three parameters,
 * of String type (stationDispatch, stationArrival ) and of DayOfWeek enum type,
 * which searches and print all trains that go to the destination after a specified day of the week.<p>
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

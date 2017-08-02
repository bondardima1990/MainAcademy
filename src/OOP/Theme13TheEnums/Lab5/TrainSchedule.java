package OOP.Theme13TheEnums.Lab5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrainSchedule {
    public class Train {
        int number;
        String stationDispatch;
        String stationArrival;
        String timeDispatch;
        String timeArrival;
        DayOfWeek days;

        public Train(int number, String stationDispatch, String stationArrival, String timeDispatch, String timeArrival, DayOfWeek days) {
            this.number = number;
            this.stationDispatch = stationDispatch;
            this.stationArrival = stationArrival;
            this.timeDispatch = timeDispatch;
            this.timeArrival = timeArrival;
            this.days = days;
        }

        public Train(int number) {
            this.number = number;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getStationDispatch() {
            return stationDispatch;
        }

        public void setStationDispatch(String stationDispatch) {
            this.stationDispatch = stationDispatch;
        }

        public String getStationArrival() {
            return stationArrival;
        }

        public void setStationArrival(String stationArrival) {
            this.stationArrival = stationArrival;
        }

        public String getTimeDispatch() {
            return timeDispatch;
        }

        public void setTimeDispatch(String timeDispatch) {
            this.timeDispatch = timeDispatch;
        }

        public String getTimeArrival() {
            return timeArrival;
        }

        public void setTimeArrival(String timeArrival) {
            this.timeArrival = timeArrival;
        }

        public DayOfWeek getDays() {
            return days;
        }

        public void setDays(DayOfWeek days) {
            this.days = days;
        }

        @Override
        public String toString() {
            return "Train number = " + number +
                    ", Station Dispatch = " + stationDispatch +
                    ", Station Arrival = " + stationArrival +
                    ", Time Dispatch = " + timeDispatch +
                    ", Time Arrival = '" + timeArrival +
                    ", Day = " + days;
        }
    }

    private Train[] trains;
    private int count;
    private BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public TrainSchedule() throws IOException {
        System.out.print("Add trains: ");
        this.trains = new Train[Integer.parseInt(bufferedReader.readLine())];
    }

    public void addTrain() throws IOException {
        int number;
        String stationDispatch;
        String stationArrival;
        String timeDispatch;
        String timeArrival;
        DayOfWeek days;

        while (count < trains.length){
            System.out.print("Number: ");
            number = Integer.parseInt(bufferedReader.readLine());

            System.out.print("Station Dispatch: ");
            stationDispatch = bufferedReader.readLine();

            System.out.print("Station Arrival: ");
            stationArrival = bufferedReader.readLine();

            System.out.print("Time Dispatch: ");
            timeDispatch = bufferedReader.readLine();

            System.out.print("Time Arrival: ");
            timeArrival = bufferedReader.readLine();

            System.out.print("Day: ");
            days = DayOfWeek.valueOf(bufferedReader.readLine().toUpperCase());

            trains[count] = new Train(number, stationDispatch, stationArrival, timeDispatch, timeArrival, days);
            count++;
        }

    }

    public void printTrains(){
        System.out.println("All trains:");
        for (Train train : trains) {
            System.out.println(train.toString());
        }
    }

    public void searchTrain(String stationDispatch, String stationArrival, DayOfWeek day){
        for (int i = 0; i < trains.length; i++) {
            if (trains[i].stationDispatch.equalsIgnoreCase(stationDispatch) &&
                trains[i].stationArrival.equalsIgnoreCase(stationArrival) &&
                trains[i].days.equals(day)) {
                    System.out.println("Found Trains");
                    System.out.println(trains[i]);
            }
        }
    }
}

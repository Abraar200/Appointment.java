import java.util.Scanner;
public class appointmentMaker extends Appointment{
    public Scanner Appoint = new Scanner(System.in);
    public appointmentMaker() {
        System.out.println("Welcome to School Counselor Appointment center. If you like to make schedules, then type the appointment Number in the following available schedules below. If all of the appointment is unavailable, then please try next time because a lot of people might book these appointment before. If you want to quit, type Quit");
        System.out.println();
        System.out.println("+------------------------------------------------------------------------------+");
        for (java.util.ArrayList<String> strings : appointmentBlock) {
            System.out.println(strings);
            System.out.println("+------------------------------------------------------------------------------+");
        }
        String userResponse = "Appointment ID: " + Appoint.nextLine();
        if (userResponse.equalsIgnoreCase("Appointment ID: " + "Quit")){
            System.exit(0);
        }
        for (int i = 0; i < appointmentBlock.size(); i++) {
            for (int j = 0; j < appointmentBlock.get(i).size(); j++) {
                if (userResponse.equals(appointmentBlock.get(i).get(j))) {
                    System.out.println("Your schedule have been booked!");
                    appointmentBlock.remove(i);
                }
            }
        }
        for (java.util.ArrayList<String> strings : appointmentBlock) {
            System.out.println(strings);
            System.out.println("+------------------------------------------------------------------------------+");
        }
    }
}

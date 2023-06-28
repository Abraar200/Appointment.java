import java.util.ArrayList;

public class Appointment {
    ArrayList<ArrayList<String>> appointmentBlock = new ArrayList<>();
    ArrayList<Integer> duration = new ArrayList<>();
    ArrayList<String> codeNumID = new ArrayList<>();
    ArrayList<Boolean> isAvailable = new ArrayList<>();

    public Appointment() {
        appointmentBlock(15,"A1", true);
        appointmentBlock(35,"A2", true);
        appointmentBlock(20,"AA2", true);
        appointmentBlock(20,"AA3", true);
        appointmentBlock(20,"T2", true);
        appointmentBlock(20,"TA2", true);
        appointmentBlock(50,"ZA5", true);

    }
    public void appointmentBlock(int dura, String ID, boolean isTrue){
        this.duration.add(dura);
        this.codeNumID.add(ID);
        this.isAvailable.add(true);
        ArrayList<String> block = new ArrayList<>();
        block.add("Appointment ID: " + ID);
        block.add("Appointment Duration: " + Integer.toString(dura));
        block.add("Is Appointment Available: " + String.valueOf(isTrue));
        appointmentBlock.add(block);
    }
}
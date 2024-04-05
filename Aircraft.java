import java.util.ArrayList;

public class Aircraft {

    static ArrayList<Aircraft> aircrafts = new ArrayList<Aircraft>();
    static int iterator = 0;
    public boolean isReady2Land;
    public boolean isApprovedForLanding;
    public boolean isReady2Takeoff;
    public boolean isApprovedForTakeoff;
    public String ID;

    public Aircraft(String name){
        this.ID = name;
        this.isReady2Land = true;
        this.isApprovedForLanding = false;
        this.isReady2Takeoff = false;
        this.isApprovedForTakeoff = false;
        aircrafts.add(this);
    }

    int approveLanding(){
        this.isApprovedForLanding = true;
        this.isReady2Takeoff = true;
        this.isReady2Land = false;
        return 1;
    }
    int approveTakeoff(){
        this.isApprovedForTakeoff = true;
        this.isReady2Takeoff = false;
        return 1;
    }


//    TEST CASE
//    public static void main(String[] args){
//        Aircraft KD29 = new Aircraft("KD29");
//        Aircraft KD30 = new Aircraft("KD30");
//        Aircraft KD40 = new Aircraft("KD40");
//
//        for (int i = 0; i < iterator; i++) {
//
//            System.out.println(Aircraft.aircrafts[i].ID + Aircraft.aircrafts[i].isReady2Land + Aircraft.aircrafts[i].isApprovedForLanding + Aircraft.aircrafts[i].isReady2Takeoff + Aircraft.aircrafts[i].isApprovedForTakeoff);
//        }
//
//    }
//
}


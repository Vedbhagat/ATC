import java.util.ArrayList;

public class Runway {

    private boolean isOccupOrAssign;
    public String ID;
    static ArrayList<Runway> runways = new ArrayList<Runway>();

    public Runway(String name){
        this.isOccupOrAssign = false;
        this.ID = name;
        runways.add(this);
    }

    public static Runway getAvailRunway(){
        for (int i = 0; i < runways.size(); i++) {
            if(runways.get(i).isOccupOrAssign==false){
                return runways.get(i);
            }
        }
        return null;
    }

    public static void main(String[] args){

    }

    int RwStatusFlip(){
        if (this.isOccupOrAssign){
            this.isOccupOrAssign = false;
        }
        else {
            this.isOccupOrAssign = true;
        }
        return 1;
    }
}

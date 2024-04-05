

public class ControlTower {
    void createTestTraffic(){
        Aircraft KD29 = new Aircraft("KD29");
        Aircraft KD30 = new Aircraft("KD30");
        Aircraft KD40 = new Aircraft("KD40");
        Aircraft UK40 = new Aircraft("UK40");
        Aircraft NI40 = new Aircraft("NI40");
        Aircraft JP40 = new Aircraft("JP40");
        Aircraft AI40 = new Aircraft("AI40");
        Aircraft BG40 = new Aircraft("BG40");
    }
    void createTestRW(){
        Runway RW90 = new Runway("RW90");
        Runway RW45 = new Runway("RW45");
    }

    void Start(){
        for (int i = 0; i < Aircraft.aircrafts.size(); i++) {
            if(Aircraft.aircrafts.get(i).isReady2Land){
                Runway rny = Runway.getAvailRunway();

                if(rny!=null){
                    Aircraft.aircrafts.get(i).approveLanding();
                    rny.RwStatusFlip();
                    System.out.println("Aircraft '"+ Aircraft.aircrafts.get(i).ID +"' is APPROVED for landing on Runway " + rny.ID);

                }
                else {
                    System.out.println("Aircraft '"+ Aircraft.aircrafts.get(i).ID +"' is NOTAPPROVED for landing on Runway.");
                }
            }
        }

    }
}

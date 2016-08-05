package herittage.exp;

public class AirFranceApp {

    public static void main(String[] args) {
        
        Pilote piloteLowCost1 = new Pilote("François","Georges", "A01", 100, 20);
        Hotesse hotesse1 = new Hotesse("Charleen", "Aurélie", "H01", 3000);
        
        piloteLowCost1.annoncerSalaire();
        hotesse1.annoncerSalaire();

    }

}

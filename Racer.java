public class Racer extends Motorbike {
    public int RacerbasePrice;
    
    


    public int getCost(){
        RacerbasePrice=super.basePrice+60000;
        return (RacerbasePrice);
    }

    public String toString(){
        return "Racer "+super.toString();

    }
}

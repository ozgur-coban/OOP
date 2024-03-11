public class Scooter extends Motorbike {
    public int ScooterbasePrice;
    

    

    public int getCost(){
        ScooterbasePrice=super.basePrice+20000;
        return (ScooterbasePrice);
    }

    public String toString(){
        return "Scooter "+super.toString();

    }
    
}

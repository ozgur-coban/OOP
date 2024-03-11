public class Sivic extends Car {
    public int SivicbasePrice;
    


    


    public int getCost(){
        SivicbasePrice=super.basePrice+50000;
        return (SivicbasePrice);
    }

    public String toString(){
        return "Sivic "+super.toString();

    }


}

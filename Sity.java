public class Sity extends Car {
    public int SitybasePrice;
    
    public int getCost(){
        SitybasePrice=super.basePrice+40000;
        return (SitybasePrice);
    }

    public String toString(){
        return "Sity "+super.toString();

    }
    
}

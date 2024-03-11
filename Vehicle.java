public abstract class Vehicle {
    public String Status = " with";

    // public int Cost


    public abstract int getCost();

public String toString(){
        if (Status == " with"){
            return Status + " no optional, total price of " + getCost() + "TL";
        }
        else{
            return Status + " optional having a total price of " + getCost() + "TL";
        }
    }



    
}

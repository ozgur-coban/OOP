import java.util.ArrayList;

public class Inventory {
    
    public ArrayList<Vehicle> Inventory = new ArrayList();
    



    public void add(Vehicle vehicle){
        this.Inventory.add(vehicle);
    }

    public String toString(){
        String VehicleInventory="";
        int TotalPrice=0;
        int NumberOfCars=0;
        int NumberOfMotorbikes=0;
        for (Vehicle v: Inventory){
            VehicleInventory+=v.toString()+"\n";
            TotalPrice=v.getCost()+TotalPrice;
            if (v instanceof Car){
                NumberOfCars=NumberOfCars+1;
            }
            if(v instanceof Motorbike){
                NumberOfMotorbikes=NumberOfMotorbikes+1;
            }
        }

        return VehicleInventory+"\n"+"Total: "+ Inventory.size() + " Vehicles including " + NumberOfCars + " Cars " + " and " + NumberOfMotorbikes + " Motorbikes having a total price of " + TotalPrice + "TL";
    }

}

public class Motorbike extends Vehicle { 

    public int basePrice;
    

    public Motorbike(){
        basePrice=this.basePrice;
        Status=super.Status;
    }

    public void setAbs(Boolean Boolean){ 
        if (Boolean == true){
            Status = this.Status+","+"ABS";
            basePrice = this.basePrice+5000;
        }
        else{
            Status= this.Status;
            basePrice=this.basePrice;
        }
    }

    public void setSeatHeating(Boolean Boolean){
        if(Boolean == true){
            Status = this.Status+","+"SeatHeating";
            basePrice = this.basePrice+2000;
        }
        else{
            Status= this.Status;
            basePrice=this.basePrice;
        }
    }




    
    
    
    
    
    
    public int getCost(){
        int finalPrice = this.basePrice;
        return (finalPrice);








        
    }
    public String toString(){
        return super.toString();
    }
    
}

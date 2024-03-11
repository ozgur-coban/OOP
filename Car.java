public  class Car extends Vehicle { // maybe abstact

    public int basePrice;
    
    public Car(){
        basePrice=this.basePrice;
        Status=super.Status;
    }

    

    public void setAirBag(Boolean Boolean){ 

        if (Boolean==true){
            
            
            Status=this.Status+","+"Air Bag";
            basePrice=this.basePrice+3000;
            //return (this.basePrice+3000);
        }
        else{
            Status = this.Status;
            basePrice=this.basePrice;
            //return (this.basePrice);
        } 

    }

    public void setMusicSystem(Boolean Boolean){
        if (Boolean == true){
            Status = this.Status+","+"Music System";
            basePrice = this.basePrice+1000;
            //return (this.basePrice+1000);
            
        }
        else{
            Status= this.Status;
            basePrice=this.basePrice;
            //return (this.basePrice);
        }
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

    public void setSunRoof(Boolean Boolean ){
        if(Boolean == true){
            Status = this.Status+","+"SunRoof";
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


    // public String toString(){
    //     if (Status == ""){
    //         return Status + "with no optional, total price of " + getCost() + "TL";
    //     }
    //     else{
    //         return Status + "optional having a total price of " + getCost() + "TL";
    //     }
    // }
    public String toString(){
        return super.toString();
    }

    
    
}

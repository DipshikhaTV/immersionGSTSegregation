package main;

public class Product {
	
	String name;
	double price;
	double gstValue;
	
    public Product(String name,double price, double gstValue){
    	this.name = name;	
        this.price=price;
        this.gstValue=gstValue;
     }

    public String getName() {
    	return name;
    }
    
    public double getPrice() {
       return price;
    }

    public double getGSTValue() {
    	return gstValue;
    }
  
   public boolean isGSTEligible() {
	   if(gstValue > 0) {
			  return true;
			  }
	   else {
		  return false;
	   }
    }
   
    public double calculateTotalPrice(){
	   return price+(price*gstValue)/100;
    }
}

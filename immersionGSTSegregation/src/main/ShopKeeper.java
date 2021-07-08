package main;

import java.util.ArrayList;
import java.util.List;

public class ShopKeeper {
        
	    
       public List<Product> allProduct;
       public List<Product>  gstProductWithPriceMoreThan2000 ;
       
       public ShopKeeper() {
    		  allProduct = new ArrayList<Product>();
       }
       
       public void addProduct(Product product) {
    	   allProduct.add(product);
    	    
       }
       
    	public List<Product> getAllProduct() {
    		    return allProduct;
        }
    	  

    	public List<Product> getGSTProductWithPriceGreater2000(double thresholdAmount ) {
    		 gstProductWithPriceMoreThan2000 = new ArrayList<Product>();
    		 for ( Product gstProduct1 : getAllProduct()) {
    			 if(gstProduct1.isGSTEligible()) {
        			 if(gstProduct1.calculateTotalPrice()>thresholdAmount) {
        		      gstProductWithPriceMoreThan2000.add(gstProduct1);
        		     }
        	     }
             }
    	     return gstProductWithPriceMoreThan2000;
    	  }
 

}

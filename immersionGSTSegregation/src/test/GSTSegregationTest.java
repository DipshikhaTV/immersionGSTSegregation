package test;

import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;

import main.*;

public class GSTSegregationTest {
	
	ShopKeeper products;
	 
	  
	     @Test
	     public void verifyAllProduct() {
	     //Arrange
	     products= new ShopKeeper();
	     Product laptop  = new Laptop("Laptop",60000.00,18);
	     Product mobile  = new Mobile("Mobile",6000.00,18);
	 	 Product mouse   = new Mouse("Mouse",500,18);
	     Product charger = new Charger("Charger",500,0);
	 	 //Act
	 	 products.addProduct( laptop);
	 	 products.addProduct( mobile);
	 	 products.addProduct(mouse);
	     products.addProduct(charger);
	 	 //Assertion
	  	 List<Product> product =  products.getAllProduct();
	  	 for ( Product product1 : product) {
	  		  
	  		  Assert.assertTrue(product1  instanceof Laptop || product1 instanceof Mobile || 
	  				product1 instanceof Mouse || product1 instanceof Charger);
	  		  
	  	     }
	    }
  

       @Test
       public void verifyGSTProductWithPriceGreater2000Size() {
    	   
    	 products= new ShopKeeper();
    	 Product laptop  = new Laptop("Laptop",60000.00,18);
 		 Product mobile  = new Mobile("Mobile",6000.00,18);
 		 Product mouse   = new Mouse("Mouse",500,18);
 		 Product charger = new Charger("Charger",500,0);
		 
		 products.addProduct( laptop);
		 products.addProduct( mobile);
		 products.addProduct(mouse);
		 products.addProduct(charger);
		 
		 Assert.assertEquals(products.getGSTProductWithPriceGreater2000(2000).size(),2);
      }
   
      @Test
      public void verifyGSTProductWithPriceGreaterThan2000() {
    	  
    	 products= new ShopKeeper();
 		 Product laptop  = new Laptop("Laptop",60000.00,18);
 		 Product mobile  = new Mobile("Mobile",6000.00,18);
 		 Product mouse   = new Mouse("Mouse",500,18);
 		 Product charger = new Charger("Charger",500,0);
 		 
 		 products.addProduct( laptop);
 		 products.addProduct( mobile);
 		 products.addProduct(mouse);
 		 products.addProduct(charger);
 		 
 		for (Product product : products.getGSTProductWithPriceGreater2000(2000)) {
 			Assert.assertTrue(product.getName().equals("Laptop") || product.getName().equals("Mobile"));
 		}
      }
    
  
}

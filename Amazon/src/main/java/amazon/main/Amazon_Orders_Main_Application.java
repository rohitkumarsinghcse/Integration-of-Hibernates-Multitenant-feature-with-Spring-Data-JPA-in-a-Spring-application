package amazon.main;

import java.util.ArrayList;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import amazon.entityclass.Amazon_Orders;
import amazon.operation.Amazon_Orders_Operation;

public class Amazon_Orders_Main_Application
{

//							public static void main(String[] args)
//							{
//								 AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//								 context.scan("amazon.*");
//								 context.refresh();
//								 
//								 
////								 Amazon_Orders product1 =new Amazon_Orders();
////								 product1.setProductId(102);
////								 product1.setProductName("Water");
////								 product1.setProductCategory("Beverages");
////								 product1.setProductPrice(20);
////								 product1.setProductQTY(2);
////								 product1.setProductRating(5);
////								 product1.setProductTotalAmount(40);
////								 
////								 Amazon_Orders product2 =new Amazon_Orders();
////								 product2.setProductId(103);
////								 product2.setProductName("Sprite");
////								 product2.setProductCategory("Beverages");
////								 product2.setProductPrice(40);
////								 product2.setProductQTY(2);
////								 product2.setProductRating(5);
////								 product2.setProductTotalAmount(80);
//								 
////								 ArrayList<Amazon_Orders> al = new ArrayList<Amazon_Orders>();
////								 al.add(product1);
////								 al.add(product2);
//								 
//								 //Update Record 
//								 
//								 Amazon_Orders product = new Amazon_Orders();
//								 product.setProductId(103);
//								 product.setProductName("Sprite");
//								 product.setProductCategory("Beverages");
//								 product.setProductPrice(40);
//								 product.setProductQTY(2);
//								 product.setProductRating(5);
//								 product.setProductTotalAmount(80);
//								 
//								 
//								 
//								 Amazon_Orders_Operation task = context.getBean(Amazon_Orders_Operation.class);
//								 
//								 // Adding Single Record 
//								// task.addProductDetails(product1);
//								 
//								 
//								 //Adding Multiple Record 
//								// task.addMultipleProductDetails(al);
//								 
//								 //Update Record
//								 task.updateProductDetails(product);
//								 
//								 
//							}

}

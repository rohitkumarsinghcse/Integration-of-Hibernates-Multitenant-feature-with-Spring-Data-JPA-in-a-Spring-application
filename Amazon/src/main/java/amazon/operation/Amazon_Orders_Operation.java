package amazon.operation;

import java.net.ResponseCache;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import amazon.entityclass.Amazon_Orders;
import amazon.repository.Amazon_Orders_Repository;
 
@Component
public class Amazon_Orders_Operation 
{
						@Autowired
						Amazon_Orders_Repository    repository;
						
						public void addProductDetails(Amazon_Orders  order)
						{
							repository.save(order);
							System.out.println("1 Row Updated Successfully ......................................");
						}
						
						
						public void addMultipleProductDetails(ArrayList<Amazon_Orders> orders,int count) 
						{
							repository.saveAll(orders);
							System.out.println(count+"  Row Updated Successfully ......................................");
						}
			
						public void updateProductDetails(Amazon_Orders  order)
						{
							repository.save(order);
							System.out.println("1 Row Updated Successfully ......................................");
						}
						
						// Base on Product Id Primary Key
						public Amazon_Orders  fetchByProductId(int productId)
						{
							Amazon_Orders amazon_Orders = repository.findById(productId).get();
							 
							return amazon_Orders;
						}
						
						//Non Primary Key Column ProductCategory
						public  List<Amazon_Orders>  fetchByCategory(String category)
						{
							List<Amazon_Orders> findByCategory = repository.findByProductCategory(category);
							return  findByCategory;
						}
						
						//Non Primary Key Column ProductRating
						public List<Amazon_Orders> fetchByRating(int rate)
						{
							List<Amazon_Orders> findByProductRating = repository.findByProductRating(rate);
							
							return findByProductRating;
						}
						
						//Non Primary Key Column ProductCategory + ProductRating
						public List<Amazon_Orders> fetchByCategoryAndRating(String category,int rate)
						{
							List<Amazon_Orders> findByProductCategoryAndProductRating = repository.findByProductCategoryAndProductRating(category,rate);
							
							return findByProductCategoryAndProductRating;
						}
						
						//Find The All Record 
						public Iterable<Amazon_Orders> fetchAllProductDetails()
						{
							 Iterable<Amazon_Orders> findAll = repository.findAll();
							 return findAll;
						}
						
						//Delete Record Using Product Id Primary Key
						public void deleteProductWithId(int id)
						{
							repository.deleteById(id);
							System.out.println("1 Row Deleted Successfully ..................................");
						}
						
						public void deleteAllProduct()
						{
							repository.deleteAll();
							System.out.println("All Row Deleted Successfully .................................");
						}
}

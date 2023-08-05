package amazon.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import amazon.entityclass.Amazon_Orders;
import amazon.operation.Amazon_Orders_Operation;

public class Amazon_Application
{

									public static void main(String[] args) 
									{
										
										AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
										context.scan("amazon.*");
										context.refresh();
										
										Scanner sc = new Scanner(System.in);
			                        	backToMainMenu :
										      while(true)
										      {
										    	  System.out.println("------------------------------------------- Option -------------------------------------------");
										    	  System.out.println(String.format("%70s", "[01] INSERT THE PRODUCT DETAILS")+"\n\n"+String.format("%70s", "[02] UPDATE THE PRODUCT DETAILS")+"\n\n"+
										    	  String.format("%72s", "[03] RETRIEVE THE PRODUCT DETAILS")+"\n\n"+String.format("%70s", "[04] DELETE THE PRODUCT DETAILS")+"\n\n"+
										    	  String.format("%57s", "[05] CODER DETAILS")+"\n\n"+String.format("%48s", "[06] EXIT")+"\n");
										    	  System.out.println("-------------------------------------------------------------------------------------------------");
										    	  System.out.print("Enter The Option To Perform The Task : ");
										    	  switch(Integer.parseInt(sc.next()))
										    	  {
										    	  case 1:
										    		  while(true)
										    		  {
										    			  System.out.println("------------------------------------------- Option -------------------------------------------");
										    			  System.out.println(String.format("%80s", "[A] Insert Single Product Details")+"\n"+
										    			  String.format("%83s", "[B] Insert Multipule Product Details")+"\n"+String.format("%68s", "[C] Back To Main Menu"));
												    	  System.out.println("-------------------------------------------------------------------------------------------------");
										    			  System.out.print("Enter The Option To Perform The Task : ");
										    			  switch(sc.next().toUpperCase().charAt(0))
										    			  {
										    			  case 'A':
										    				                Amazon_Orders order = new Amazon_Orders();
										    				               
										    				                System.out.print("Enter The Product ID : ");
										    				                order.setProductId(Integer.parseInt(sc.next()));
										    				                System.out.print("Enter The Product Name : ");
										    				                order.setProductName(sc.next());
										    				                System.out.print("Enter The Product Category : ");
										    				                order.setProductCategory(sc.next());
										    				                System.out.print("Enter The Product Price : ");
										    				                order.setProductPrice(Integer.parseInt(sc.next()));
										    				                System.out.print("Enter The Product Qty : ");
										    				                order.setProductQTY(Integer.parseInt(sc.next()));
										    				                System.out.print("Enter The Product Rating : ");
										    				                order.setProductRating(Integer.parseInt(sc.next()));
										    				                System.out.print("Enter The Product Total Amount : ");
										    				                order.setProductTotalAmount(Integer.parseInt(sc.next()));
										    				                
										    				                Amazon_Orders_Operation task = context.getBean(Amazon_Orders_Operation.class);
										    				                task.addProductDetails(order);
										    				  break;
										    			  case 'B':
										    				              System.out.print("How Many Product Details You Want To Insert : ");
										    				              int productCount =Integer.parseInt(sc.next());
										    				              
										    				              ArrayList<Amazon_Orders> al = new ArrayList<Amazon_Orders>();
										    				              for(int i=1;i<=productCount;i++)
										    				              {
																	    	  	System.out.println("-------------------------------------------------------------------------------------------------");
																	    	  	System.out.println("Enter The "+i+"Product Details");
																	    	  	Amazon_Orders multiOrder = new Amazon_Orders();
										    				            	  
										    				            	   System.out.print("Enter The Product ID : ");
										    				            	   multiOrder.setProductId(Integer.parseInt(sc.next()));
											    				                System.out.print("Enter The Product Name : ");
											    				                multiOrder.setProductName(sc.next());
											    				                System.out.print("Enter The Product Category : ");
											    				                multiOrder.setProductCategory(sc.next());
											    				                System.out.print("Enter The Product Price : ");
											    				                multiOrder.setProductPrice(Integer.parseInt(sc.next()));
											    				                System.out.print("Enter The Product Qty : ");
											    				                multiOrder.setProductQTY(Integer.parseInt(sc.next()));
											    				                System.out.print("Enter The Product Rating : ");
											    				                multiOrder.setProductRating(Integer.parseInt(sc.next()));
											    				                System.out.print("Enter The Product Total Amount : ");
											    				                multiOrder.setProductTotalAmount(Integer.parseInt(sc.next()));
											    				                
											    				                al.add(multiOrder);
										    				            	  
										    				              }
										    				              
										    				              Amazon_Orders_Operation multiTask = context.getBean(Amazon_Orders_Operation.class);
										    				              multiTask.addMultipleProductDetails(al,productCount);
										    				  break;
										    			  case 'C':
										    				  continue backToMainMenu;
										    			  default:
											    				 System.out.println("Invalid Option !!!!!!!!!!!!!!!!!!!!");
													    		 System.out.println("Plz Select Right Option...........................");
										    			  }
										    		  }
										    		 
										    	  case 2: 
										    		  while(true)
									    		  {
									    			  System.out.println("------------------------------------------- Option -------------------------------------------");
									    			  System.out.println(String.format("%75s", "[A] Update The Details")+"\n"+
									    			  String.format("%74s", "[B] Back To Main Menu"));
											    	  System.out.println("-------------------------------------------------------------------------------------------------");
									    			  System.out.print("Enter The Option To Perform The Task : ");
									    			  switch(sc.next().toUpperCase().charAt(0))
									    			  {
									    			  case 'A':
									    				  	Amazon_Orders update = new Amazon_Orders();
						    				               
						    				                System.out.print("Enter The Product ID : ");
						    				                update.setProductId(Integer.parseInt(sc.next()));
						    				                System.out.print("Enter The Product Name : ");
						    				                update.setProductName(sc.next());
						    				                System.out.print("Enter The Product Category : ");
						    				                update.setProductCategory(sc.next());
						    				                System.out.print("Enter The Product Price : ");
						    				                update.setProductPrice(Integer.parseInt(sc.next()));
						    				                System.out.print("Enter The Product Qty : ");
						    				                update.setProductQTY(Integer.parseInt(sc.next()));
						    				                System.out.print("Enter The Product Rating : ");
						    				                update.setProductRating(Integer.parseInt(sc.next()));
						    				                System.out.print("Enter The Product Total Amount : ");
						    				                update.setProductTotalAmount(Integer.parseInt(sc.next()));
						    				                
						    				                Amazon_Orders_Operation updateTask = context.getBean(Amazon_Orders_Operation.class);	
						    				                updateTask.updateProductDetails(update);
						    				                
						    				                break;
									    			  case 'B':
									    				  continue backToMainMenu;
									    			  default:
										    				 System.out.println("Invalid Option !!!!!!!!!!!!!!!!!!!!");
												    		 System.out.println("Plz Select Right Option...........................");
									    			  }
									    		  }
									    		 
										    	  case 3:
										    		  while(true)
										    		  {
										    			  System.out.println("------------------------------------------- Option -------------------------------------------");
										    			  System.out.println(String.format("%75s", "[A] Retrieve Product Details by Using Product ID ")+"\n"+
										    			  String.format("%81s", "[B] Retrieve Product Details by Using Product Category ")+"\n"+
										    			  String.format("%79s", "[C] Retrieve Product Details by Using Product Rating ")+"\n"+
										    			  String.format("%92s", "[D] Retrieve Product Details by Using Product Category And Rating ")+"\n"+
										    			  String.format("%59s", "[E] Retrieve All Product Details ")+"\n"+
										    			  String.format("%47s", "[F] Back To Main Menu"));
												    	  System.out.println("-------------------------------------------------------------------------------------------------");
										    			  System.out.print("Enter The Option To Perform The Task : ");
										    			  switch(sc.next().toUpperCase().charAt(0))
										    			  {
										    			  case 'A':
										    				    System.out.print("Enter The Product Id : ");
										    				   Amazon_Orders_Operation findById = context.getBean(Amazon_Orders_Operation.class);
										    				   Amazon_Orders fetchByProductId = findById.fetchByProductId(Integer.parseInt(sc.next()));
										    				   System.out.println(fetchByProductId);
 										    				   break;
										    			  case 'B':
										    				  System.out.print("Enter The Product Category Name : ");
										    				  Amazon_Orders_Operation findByCategory = context.getBean(Amazon_Orders_Operation.class);
										    				  List<Amazon_Orders> fetchByCategory = findByCategory.fetchByCategory(sc.next());
										    				  for(Amazon_Orders order: fetchByCategory)
										    				  {
										    					  System.out.println(order);
										    				  }
										    				  break;
										    			  case 'C':
										    				  System.out.print("Enter The Product Rating  : ");
										    				  Amazon_Orders_Operation findByRating = context.getBean(Amazon_Orders_Operation.class);
										    				  List<Amazon_Orders> fetchByRating = findByRating.fetchByRating(Integer.parseInt(sc.next()));
										    				  for(Amazon_Orders order : fetchByRating)
										    				  {
										    					  System.out.println(order);
										    				  }
										    				  break;
										    			  case 'D':
										    				   System.out.print("Enter The Product Category : ");
										    				   String cat = sc.next();
										    				   System.out.print("Enter The Product Rating : ");
										    				   int rate = Integer.parseInt(sc.next());
										    				   Amazon_Orders_Operation fetchByCategoryAndRating = context.getBean(Amazon_Orders_Operation.class);
										    				   List<Amazon_Orders> fetchByCategoryAndRating2 = fetchByCategoryAndRating.fetchByCategoryAndRating(cat, rate);
										    				   for(Amazon_Orders order : fetchByCategoryAndRating2)
										    				   {
										    					   System.out.println(order);
										    				   }
										    				   break;
										    			  case 'E':
										    				   Amazon_Orders_Operation findAll = context.getBean(Amazon_Orders_Operation.class);
										    				   Iterable<Amazon_Orders> fetchAllProductDetails = findAll.fetchAllProductDetails();	
										    				   for(Amazon_Orders order: fetchAllProductDetails)
										    				   {
										    					   System.out.println(order);
										    				   }
										    				   break;
										    			  case 'F':
										    				  continue backToMainMenu;
										    			  default :
										    				  System.out.println("Invalid Option !!!!!!!!!!!!!!!!!!!!");
													    	  System.out.println("Plz Select Right Option...........................");
										    			  }
										    		  }
										    	  
										    	  case 4:
										    		  while(true)
										    		  {
										    			  System.out.println("------------------------------------------- Option -------------------------------------------");
										    			  System.out.println(String.format("%75s", "[A] Delete The Product Details By Product ID ")+"\n"+
										    			  String.format("%65s", "[B] Delete All The Product Details ")+"\n"+
										    			  String.format("%51s", "[C] Back To Main Menu"));
												    	  System.out.println("-------------------------------------------------------------------------------------------------");
										    			  System.out.print("Enter The Option To Perform The Task : ");
										    			  switch(sc.next().toUpperCase().charAt(0))
										    			  {
										    			  case 'A':
										    				    System.out.println("Enter The Product Id : ");
										    				    context.getBean(Amazon_Orders_Operation.class).deleteProductWithId(Integer.parseInt(sc.next()));
										    				    
										    				  break;
										    			  case 'B':
										    				  context.getBean(Amazon_Orders_Operation.class).deleteAllProduct();
										    				  break;
										    			  case 'C':
										    				  continue backToMainMenu;
										    				   
										    			default:
										    				 System.out.println("Invalid Option !!!!!!!!!!!!!!!!!!!!");
												    		 System.out.println("Plz Select Right Option...........................");
										    			  }
										    		  }
										    		 
										    	  case 5:
										    		  while(true)
										    		  {
										    			  System.out.println("------------------------------------------- Option -------------------------------------------");
										    			  System.out.println(String.format("%75s", "[A] Show The Details")+"\n"+
										    			  String.format("%76s", "[B] Back To Main Menu"));
												    	  System.out.println("-------------------------------------------------------------------------------------------------");
										    			  System.out.print("Enter The Option To Perform The Task : ");
										    			  switch(sc.next().toUpperCase().charAt(0))
										    			  {
										    			  case 'A':
										    				   System.out.println("Name : Rohit Kumar Singh ");
												    		   System.out.println("Role : Full Stack Java Developer ");
												    		   System.out.println("Qualification : Master of Computer Appliction ");
												    		   System.out.println("Contact No : 740807652 ");
												    		   System.out.println("Gmail  : rohitkumarsinghcse@gmail.com ");
												    		   System.out.println("Github : https://github.com/rohitkumarsinghcse ");
												    		   System.out.println("Linkedln : https://www.linkedin.com/in/rohitkumarsinghcse/ ");
												    		   System.out.println("Hacker Rank : https://www.hackerrank.com/rohitkumarsinghx ");
										    				  break;
										    			  case 'B':
										    				  continue backToMainMenu;
										    				   
										    			default:
										    				 System.out.println("Invalid Option !!!!!!!!!!!!!!!!!!!!");
												    		 System.out.println("Plz Select Right Option...........................");
										    			  }
										    		  }
										    	  case 6:
										    		  System.out.println("Logout Successfully ..........................................");
											    	  System.out.println("-------------------------------------------------------------------------------------------------");
										    		  System.exit(0);
										    		  break;
										    		  
										    	  default:
										    		  System.out.println("Invalid Option !!!!!!!!!!!!!!!!!!!!");
										    		  System.out.println("Plz Select Right Option...........................");
										    		  
										    	  }
										      }


									}

}

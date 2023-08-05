package amazon.repository;

 import java.util.List;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Component;

import amazon.entityclass.Amazon_Orders;
 
@Component
public interface Amazon_Orders_Repository extends CrudRepository<Amazon_Orders, Integer> 
{
						List<Amazon_Orders> findByProductCategory(String category);
						
						List<Amazon_Orders>findByProductRating(int rate);
						
						List<Amazon_Orders> findByProductCategoryAndProductRating(String category,int rate);
}

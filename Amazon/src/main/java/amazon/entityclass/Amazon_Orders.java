package amazon.entityclass;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Amazon_Orders 
{
					@Id
					@Column
	   				private int productId;
					
					@Column
	   				private String productName ;
					
					@Column
	   				private String productCategory ;
					
					@Column
	   				private int productQTY ;
					
					@Column
	   				private int productPrice ;
					
					@Column
	   				private int productRating ;
					
					@Column
	   				private int productTotalAmount ;
					
	   				public Amazon_Orders() {
						 System.out.println("Amazon_Orders.Amazon_Orders()");
					}

					public int getProductId() {
						return productId;
					}

					public void setProductId(int productId) {
						this.productId = productId;
					}

					public String getProductName() {
						return productName;
					}

					public void setProductName(String productName) {
						this.productName = productName;
					}

					public String getProductCategory() {
						return productCategory;
					}

					public void setProductCategory(String productCategory) {
						this.productCategory = productCategory;
					}

					public int getProductQTY() {
						return productQTY;
					}

					public void setProductQTY(int productQTY) {
						this.productQTY = productQTY;
					}

					public int getProductPrice() {
						return productPrice;
					}

					public void setProductPrice(int productPrice) {
						this.productPrice = productPrice;
					}

					public int getProductRating() {
						return productRating;
					}

					public void setProductRating(int productRating) {
						this.productRating = productRating;
					}

					public int getProductTotalAmount() {
						return productTotalAmount;
					}

					public void setProductTotalAmount(int productTotalAmount) {
						this.productTotalAmount = productTotalAmount;
					}

					@Override
					public String toString() {
						return "Amazon_Orders [productId=" + productId + ", productName=" + productName
								+ ", productCategory=" + productCategory + ", productQTY=" + productQTY
								+ ", productPrice=" + productPrice + ", productRating=" + productRating
								+ ", productTotalAmount=" + productTotalAmount + "]";
					}
	   				
	   				  				
	   
}


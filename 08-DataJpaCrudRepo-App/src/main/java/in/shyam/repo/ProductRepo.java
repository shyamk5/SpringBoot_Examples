package in.shyam.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import in.shyam.entity.ProductEntity;

@Repository
public interface ProductRepo extends CrudRepository<ProductEntity, Integer> {
	
	//Find the Product info whose prices are more than >2000
	public List<ProductEntity> findByProductPriceGreaterThan(double productPrice);
	
	//Find the Product info whose prices are more than equal to >=2000
	public  List<ProductEntity> findByProductPriceGreaterThanEqual(double productPrice);
	
	//FInd the Product List whose name starts with 'S'
	public List<ProductEntity> findByProductNameStartsWith(String letter);
	
	
	//custom Queries :: SQL Native Query
	//Execute the Custom Query (select * from product_entity)
	@Query(value = "select * from product_entity", nativeQuery = true)
	public List<ProductEntity> getAllProds();
	
	
	//custom Queries :: HQL Query
	//Execute the Custom Query (select * from product_entity) - HQL Query (Hibernate Query Language)
	@Query(value = "from ProductEntity")
	public List<ProductEntity> getProducts();
	
	
	//custom Queries :: SQL Native Query
	//Execute the Custom Query (select * from product_entity)
	@Query(value = "select * from product_entity where product_price=2500", nativeQuery = true)
	public List<ProductEntity> getProdByPrice();


	//custom Queries :: HQL Query
	//Execute the Custom Query (select * from product_entity) - HQL Query (Hibernate Query Language)
	@Query(value = "from ProductEntity where productPrice=2500")
	public List<ProductEntity> getProductsByPrice();
	
	
	//custom Queries :: SQL Native Query
	//Execute the Custom Query (select product_name from product_entity)
	@Query(value = "select product_name from product_entity", nativeQuery = true)
	public List<String> getProdName();


	//custom Queries :: HQL Query
	//Execute the Custom Query (select productName from ProductEntity) - HQL Query (Hibernate Query Language)
	@Query(value = "select productName from ProductEntity")
	public List<String> getProductsByName();
	
	
	
	
}

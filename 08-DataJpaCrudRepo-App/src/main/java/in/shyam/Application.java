package in.shyam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.shyam.entity.ProductEntity;
import in.shyam.repo.ProductRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(Application.class, args);
		
		ProductRepo repo = ctx.getBean(ProductRepo.class);
		
		ProductEntity p2 = new ProductEntity();
		
		p2.setProductId(1004);
		p2.setProductName("Watch");
		p2.setProductPrice(2500);
		
		//repo.save(p1);
		
		ProductEntity p3 = new ProductEntity();
		p3.setProductId(1005);
		p3.setProductName("Smart Phones");
		p3.setProductPrice(24000);
		
		/*
		List<ProductEntity> proList = new ArrayList<ProductEntity>();
		proList.add(p2);
		proList.add(p3);
		*/
		
		//repo.saveAll(Arrays.asList(p2,p3));
		
		//boolean status = repo.existsById(1005);
		
		//System.out.println("Number of records in Product Table:: "+repo.count());
		
		//Optional<ProductEntity> findId = repo.findById(1005);
		/*
		if(findId.isPresent()) {
			System.out.println(findId.get());
		}
		*/
		
		/*
		Iterable<ProductEntity> findAll = repo.findAllById(Arrays.asList(1001,1005,1003));
		
		for(ProductEntity p:findAll) {
			System.out.println(p);
		}
		*/
		
		/*
		Iterable<ProductEntity> findAll = repo.findAll();
		for(ProductEntity p1:findAll) {
			System.out.println(p1);
		}
		*/
		
		/*
		if(repo.existsById(2001)) {
			repo.deleteById(2001);
		} else {
			System.out.println("No record found");
		}
		*/
		
		
		/*
		//Find the Product info whose prices are more than >2000
		List<ProductEntity> prodList = repo.findByProductPriceGreaterThan(4000);
		
		for(ProductEntity p:prodList) {
			System.out.println(p);
		}
		*/
		
		/*
		//Find the Product info whose prices are more than equal to >=2000
		List<ProductEntity> prodList = repo.findByProductPriceGreaterThanEqual(45000);
		for(ProductEntity p:prodList) {
			System.out.println(p);
		}
		*/
		
		
		/*
		//FInd the Product List whose name starts with 'S'
		List<ProductEntity> prodList = repo.findByProductNameStartsWith("S");
		for(ProductEntity p:prodList) {
			System.out.println(p);
		}
		*/
		
		
		/*
		//Execute the Custom Query (select * from product_entity)
		List<ProductEntity> allProdList = repo.getAllProds();
		for(ProductEntity p:allProdList) {
			System.out.println(p);
		}
		*/
		
		/*
		//Execute the Custom Query (select * from product_entity)
		List<ProductEntity> allProdList = repo.getProducts();
		for(ProductEntity p:allProdList) {
			System.out.println(p);
		}
		*/
		
		/*
		//Execute the Custom Query (select * from product_entity where product_price=2500)
		List<ProductEntity> allProdList = repo.getProdByPrice();
		for(ProductEntity p:allProdList) {
			System.out.println(p);
		}
		*/
		
		/*
		//Execute the Custom Query (from ProductEntity where productPrice=2500)
		List<ProductEntity> allProdList = repo.getProductsByPrice();
		for(ProductEntity p:allProdList) {
			System.out.println(p);
		}
		*/
		
		/*
		//Execute the Custom Query (select product_name from product_entity)
		List<String> allProdList = repo.getProdName();
		for(String p:allProdList) {
			System.out.println(p);
		}
		*/
		
		/*
		//Execute the Custom Query (select productName from ProductEntity) - HQL Query (Hibernate Query Language)
		List<String> allProdList = repo.getProdName();
		for(String p:allProdList) {
			System.out.println(p);
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

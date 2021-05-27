package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer>
{
	// CRUD böylelikle hazır oldu.
	// Product @Entity ile işaretlenmiş olmalı, integer olan ise id nin veri tipi

	// getby yada findby kullanılabilir. isim önemli!!

	Product getByProductName(String productName);

	Product getByProductNameAndCategory_CategoryId(String productName, int categoryId);

	List<Product> getByProductNameOrCategory_CategoryId(String productName, int categoryId);

	List<Product> getByCategory_CategoryIdIn(List<Integer> categories);

	List<Product> getByProductNameContains(String productName);

	List<Product> getByProductNameStartsWith(String productName);

	// jpql linq nun az gelişmişi
	// ilki alan ikinci metoddaki parametre olan değer (product name)
	@Query("From Product where productName=:productName and category.categoryId=:categoryId")
	List<Product> getByNameAndCategory(String productName, int categoryId);

	// select * from products where product_name=bişey and categoryId=bişey
}

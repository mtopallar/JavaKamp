package kodlamaio.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer> {
	// CRUD böylelikle hazır oldu.
	// Product @Entity ile işaretlenmiş olmalı, integer olan ise id nin veri tipi
}

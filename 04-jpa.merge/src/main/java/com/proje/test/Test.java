package com.proje.test;





import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.proje.model.Product;

public class Test {

	public static void main(String[] args) {
		
 		EntityManagerFactory factory = Persistence.createEntityManagerFactory("persistence-unit");
		
		EntityManager entityManager = factory.createEntityManager();
		
		EntityTransaction transaction = entityManager.getTransaction();
		
		Product product = entityManager.find(Product.class, 1);
		
		product.setUnitPrice(2500);
		product.setUpdateDate(new Date());
		
		transaction.begin();
		
		entityManager.merge(product);
		
		transaction.commit();
		
		
	}
}

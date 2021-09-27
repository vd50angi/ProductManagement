package com.cogent.productmanagement;

import com.cogent.productmanagement.model.Product;
import com.cogent.productmanagement.service.ProductService;
import com.cogent.productmanagement.service.ProductServiceImpl;
import com.cogent.productmanagement.repository.ProductRepositoryImpl;


public class Main {
	
	public static void main(String[] args) {
			// TODO Auto-generated method stub
		//variables
		String Id ="ang001";
		String name = "Angie";
		float productPrice;
		long qty;
		Date createdDate;
		Date expiryDate;
		String batchNo;
		//ProductService productService = ProductServiceImpl.getInstance();
		ProductService productService = ProductServiceImpl.getInstance();
		Product product1 = new Product(Id, name, productPrice, qty, null,null,batchNo);
		Product[] products = productService.getProducts();
		Product productId = productService.getProductById(Id);
		
		//Update am record
		productService.updateProduct(Id,product1);
		
		//delete a product record
		productService.deleteProductById(Id);
		
		//print out the products listed
		
		for (Product p : products) {
			System.out.println(p);
			
		}
	}
		
		
		
}
		
			
		

	
	
	
	
	
	


package oopIntro;


import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(); //Örnek, referans, instance
		product1.setId(1);
		product1.setName("Lenovo V14");
		product1.setUnitPrice(15000);
		product1.setDetail("16 GB Ram");
		product1.setDiscount(10);
		
		Product product2 = new Product(2,"Lenovo V15", 16000, "32 GB Ram",10);
		
		Product product3 = new Product();
		product3.setId(3);
		product3.setName("HP 5");
		product3.setUnitPrice(10000);
		product3.setDetail("8 GB Ram");
		product1.setDiscount(10);
		
		Product[] products = {
				product1,
				product2,
				product3
		};
		
		for (Product product : products) {
			System.out.println(product.getName());
			System.out.println(product.getUnitPriceAfterDiscount());
		}
		
		System.out.println(products.length);
		
		Category category1 = new Category();
		category1.setId(1);;
		category1.setName("Bilgisayar");
		
		Category category2 = new Category();
		category2.setId(2);;
		category2.setName("Ev/Bahçe");
		
		ProductManager productManager = new ProductManager();
		
		productManager.addToCart(product3);
		
		productManager.addToCart(product2);
		
		productManager.addToCart(product1);
		
	}

}

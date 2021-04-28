package oopIntro;

public class ProductManager {
	public void addToCart(Product product) {
		System.out.println("Sepete ekleme kodu çaðrýldý");
		System.out.println(product.getId() + ". Ürün sepete eklendi: " + product.getName());
	}
}

package oopIntro;

public class ProductManager {
	public void addToCart(Product product) {
		System.out.println("Sepete ekleme kodu �a�r�ld�");
		System.out.println(product.getId() + ". �r�n sepete eklendi: " + product.getName());
	}
}

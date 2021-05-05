package nLayeredDemo;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.business.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.AbcProductDao;
import nLayeredDemo.dataAccess.concretes.HibernateProductDao;
import nLayeredDemo.entities.concretes.Product;

public class Main {

	public static void main(String[] args) {
		// TODO IoC ile çözülecek
		ProductService productService = new ProductManager(new HibernateProductDao(), new JLoggerManagerAdapter());
		
		Product product = new Product(1, 2, "Elma", 12, 52);
		productService.add(product);
		
		productService = new ProductManager(new AbcProductDao(),new JLoggerManagerAdapter());

		product = new Product(1, 2, "Armut", 12, 52);
		productService.add(product);
	}

}

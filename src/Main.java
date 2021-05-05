import Business.Abstracts.ProductService;
import Business.Concretes.ProductManager;
import Core.JLoggerManagerAdapter;
import DataAccess.Concretes.AbcProductDao;
import DataAccess.Concretes.HibernateProductDao;
import Entities.Concretes.Product;

public class Main {

    public static void main(String[] args) {

        ProductService productService = new ProductManager(new AbcProductDao(), new JLoggerManagerAdapter());
        Product product1 = new Product(1, 1, "Elma", 12, 50);
        Product product2 = new Product(2, 3, "Armut", 20, 40);

        Product[] products = {product1, product2};
        for (Product product : products) {
            productService.add(product);
        }
    }
}